package com.whty.cms.tspm.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.base.common.DataTableQueryMySQL;
import com.whty.cms.common.base.BaseController;
import com.whty.cms.common.base.BaseResponseDto;
import com.whty.cms.common.base.DataTableQuery;
import com.whty.cms.common.util.CheckEmpty;
import com.whty.cms.common.util.DateUtil;
import com.whty.cms.tspm.common.Constant;
import com.whty.cms.tspm.pojo.TrInfo;
import com.whty.cms.tspm.pojo.TrInfoExample;
import com.whty.cms.tspm.pojo.TrOperationHis;
import com.whty.cms.tspm.service.SequenceService;
import com.whty.cms.tspm.service.TrInfoService;
import com.whty.cms.tspm.service.TrOperationHisService;

@Controller
@RequestMapping("/trManage")
public class TrManageController extends BaseController {

	
	@Value("${tsp_code}")
	private String tsp_code;
	
	@Autowired
	private TrInfoService trInfoService;

	@Autowired
	private TrOperationHisService trOperationHisService;

	@Autowired
	private SequenceService sequenceService;

	/**
	 * 显示主列表页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView show() {
		ModelAndView mv = new ModelAndView("/tspm/trManage/trInfoUI");
		return mv;
	}

	/**
	 * 查询
	 * 
	 * @param request
	 * @param response
	 * @param trInfo
	 * @throws IOException
	 */
	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public void find(HttpServletRequest request, HttpServletResponse response, TrInfo trInfo) throws IOException {
		DataTableQuery dt = new DataTableQueryMySQL(request);
		Map<String, Object> result = buildTableData(dt, trInfo);
		writeJSONResult(result, response, DateUtil.yyyy_MM_dd_HH_mm_ss_EN);

	}

	/**
	 * 通过
	 * 
	 * @param response
	 * @param trInfo
	 * @param tag
	 */
	@RequestMapping(value = "/pass", method = RequestMethod.POST)
	public void pass(HttpServletRequest request, HttpServletResponse response, TrInfo trInfo, String tag) {
		int flag = 0;
		BaseResponseDto baseResponseDto = null;
		String userName = (String) request.getSession().getAttribute("userName");
		//更新TR状态为通过,生成TR编号
		TrInfo oldTrInfo = this.trInfoService.selectByPrimaryKey(trInfo.getPk());
		
		//注册中才能审批
		if (Constant.TrStatus.REGISTERING.equals(oldTrInfo.getTrFlag())) {
			int next = sequenceService.nextVal(Constant.SeqName.TR_ID);
			String nextVal = String.format("%08d", next);// 补0满8位
			oldTrInfo.setTrId(tsp_code + nextVal);// 三位tsp+8位序列号
			oldTrInfo.setTrFlag(Constant.TrStatus.NORMAL);
			oldTrInfo.setTrTime(new Date());
			oldTrInfo.setRemark(trInfo.getRemark());
			flag = trInfoService.updateByPrimaryKey(oldTrInfo);
			// 更新TR记录表
			TrOperationHis his = new TrOperationHis();
			his.setTrId(oldTrInfo.getTrId());
			his.setTrOperationType(Constant.Operation.REGISTER);
			his.setOperationTime(new Date());
			trOperationHisService.insertSelective(his);

			baseResponseDto = flag > 0 ? new BaseResponseDto(true, "审批TR信息成功！") : new BaseResponseDto(false, "审批TR信息失败！");
		} else {
			baseResponseDto = new BaseResponseDto(false, "TR信息状态必须为注册中才能审批！");
		}
		writeJSONResult(baseResponseDto, response);
	}

	/**
	 * 不通过
	 * 
	 * @param response
	 * @param trInfo
	 * @param tag
	 */
	@RequestMapping(value = "/notpass", method = RequestMethod.POST)
	public void notpass(HttpServletRequest request, HttpServletResponse response, TrInfo trInfo, String tag) {
		int flag = 0;
		BaseResponseDto baseResponseDto = null;
		String userName = (String) request.getSession().getAttribute("userName");
		
		TrInfo oldTrInfo = this.trInfoService.selectByPrimaryKey(trInfo.getPk());

		//注册中才能审批
		if (Constant.TrStatus.REGISTERING.equals(oldTrInfo.getTrFlag())) {
			oldTrInfo.setTrFlag(Constant.TrStatus.NOTPASS);
			oldTrInfo.setRemark(trInfo.getRemark());
			flag = trInfoService.updateByPrimaryKey(oldTrInfo);
			baseResponseDto = flag > 0 ? new BaseResponseDto(true, "审批TR信息成功！") : new BaseResponseDto(false, "审批TR信息失败！");
		} else {
			baseResponseDto = new BaseResponseDto(false, "TR信息状态必须为注册中才能审批！");
		}
		writeJSONResult(baseResponseDto, response);
	}

	@RequestMapping(value = { "/view" })
	@ResponseBody
	public void view(HttpServletResponse response, String pk) {
		TrInfo trInfo = this.trInfoService.selectByPrimaryKey(pk);
		writeJSONResult(trInfo, response);
	}

	/**
	 * 构建数据
	 * 
	 * @param length
	 * @param start
	 * @param draw
	 * @param modules
	 * @return
	 * @throws IOException
	 */
	private Map<String, Object> buildTableData(DataTableQuery dt, TrInfo trInfo) throws IOException {
		// 当前页数
		int currentNumber = dt.getPageStart() / dt.getPageLength() + 1;
		PageBounds pageBounds = new PageBounds(currentNumber, dt.getPageLength());
		TrInfoExample exmple = buildExample(dt, trInfo);
		PageList<TrInfo> trInfos = trInfoService.selectByExamplePaging(exmple, pageBounds);
		Map<String, Object> records = new HashMap<String, Object>();
		records.put("data", trInfos);
		records.put("draw", dt.getPageDraw());
		records.put("recordsTotal", trInfos.getPaginator().getTotalCount());
		records.put("recordsFiltered", trInfos.getPaginator().getTotalCount());
		return records;
	}

	/**
	 * 构建查询条件
	 * 
	 * @param dt
	 * @param trInfo
	 * @return
	 */
	private TrInfoExample buildExample(DataTableQuery dt, TrInfo trInfo) {
		TrInfoExample exmple = new TrInfoExample();
		TrInfoExample.Criteria criteria = exmple.createCriteria();
		// 查询条件
		if (CheckEmpty.isNotEmpty(trInfo.getTrId())) {
			criteria.andTrIdLike("%" + trInfo.getTrId() + "%");
		}
		if (CheckEmpty.isNotEmpty(trInfo.getTrFlag())) {
			criteria.andTrFlagEqualTo(trInfo.getTrFlag());
		}
		// if (trInfo.getColumnId() != null
		// && !trInfo.getColumnId().equalsIgnoreCase("")
		// && !trInfo.getColumnId().equals(
		// tathing_portal_column_root)) {
		// criteria.andColumnIdEqualTo(trInfo.getColumnId());
		// }
		// 排序条件
		if (CheckEmpty.isNotEmpty(dt.getOrderBy()) && CheckEmpty.isNotEmpty(dt.getOrderParam())) {
			//
			StringBuilder orderByClause = new StringBuilder("");
			orderByClause.append(dt.getOrderParam()).append(" ").append(dt.getOrderBy());
			exmple.setOrderByClause(orderByClause.toString());
		}
		return exmple;
	}

}
