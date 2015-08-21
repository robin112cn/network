package com.whty.cms.network.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.base.common.DataTableQueryMySQL;
import com.whty.cms.base.pojo.BaseUserRoleExample;
import com.whty.cms.base.pojo.BaseUserRoleKey;
import com.whty.cms.base.pojo.BaseUsers;
import com.whty.cms.base.pojo.BaseUsersExample;
import com.whty.cms.base.pojo.BaseUsersExample.Criteria;
import com.whty.cms.base.ucenter.ResponseResult;
import com.whty.cms.base.ucenter.UCenterClient;
import com.whty.cms.common.base.BaseController;
import com.whty.cms.common.base.DataTableQuery;
import com.whty.cms.common.util.CheckEmpty;
import com.whty.cms.common.util.DateUtil;
import com.whty.cms.network.pojo.Device;
import com.whty.cms.network.pojo.DeviceExample;
import com.whty.cms.network.service.DeviceInfoService;

@Controller
@RequestMapping("/deviceManage")
public class DeviceManageController extends BaseController {

	
	
	@Autowired
	private DeviceInfoService deviceInfoService;

	/**
	 * 显示主列表页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView show() {
		ModelAndView mv = new ModelAndView("/network/device/deviceUI");
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
	public void find(HttpServletRequest request, HttpServletResponse response, Device trInfo) throws IOException {
		DataTableQuery dt = new DataTableQueryMySQL(request);
		Map<String, Object> result = buildTableData(dt, trInfo);
		writeJSONResult(result, response, DateUtil.yyyy_MM_dd_HH_mm_ss_EN);

	}
	
	/**
	 * 新增/编辑用戶
	 *
	 * @param request
	 * @param response
	 * @param user
	 * @throws IOException
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void addDevice(HttpServletRequest request,
			HttpServletResponse response, Device device)
			throws IOException {
		response.setCharacterEncoding("utf-8");
		int flag = 0;
		String msg = "";
		List<Object> list = new ArrayList<Object>();
		list.add(flag);
		list.add(msg);
		writeJSONArrayResult(list, response);
	}

	/**
	 * 通过
	 * 
	 * @param response
	 * @param trInfo
	 * @param tag
	 */
	@RequestMapping(value = "/pass", method = RequestMethod.POST)
	public void pass(HttpServletRequest request, HttpServletResponse response, Device trInfo, String tag) {
		
	}

	/**
	 * 不通过
	 * 
	 * @param response
	 * @param trInfo
	 * @param tag
	 */
	@RequestMapping(value = "/notpass", method = RequestMethod.POST)
	public void notpass(HttpServletRequest request, HttpServletResponse response, Device trInfo, String tag) {
		
	}

	@RequestMapping(value = { "/view" })
	@ResponseBody
	public void view(HttpServletResponse response, String pk) {
//		Device trInfo = this.applyInfoService.selectByPrimaryKey(pk);
//		writeJSONResult(trInfo, response);
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
	private Map<String, Object> buildTableData(DataTableQuery dt, Device trInfo) throws IOException {
		// 当前页数
		int currentNumber = dt.getPageStart() / dt.getPageLength() + 1;
		PageBounds pageBounds = new PageBounds(currentNumber, dt.getPageLength());
		DeviceExample example = buildExample(dt, trInfo);
		PageList<Device> trInfos = deviceInfoService.selectByExamplePaging(example, pageBounds);
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
	private DeviceExample buildExample(DataTableQuery dt, Device trInfo) {
		DeviceExample exmple = new DeviceExample();
		DeviceExample.Criteria criteria = exmple.createCriteria();
		// 查询条件
//		if (CheckEmpty.isNotEmpty(trInfo.getTrId())) {
//			criteria.andTrIdLike("%" + trInfo.getTrId() + "%");
//		}
//		if (CheckEmpty.isNotEmpty(trInfo.getTrFlag())) {
//			criteria.andTrFlagEqualTo(trInfo.getTrFlag());
//		}
		// if (trInfo.getColumnId() != null
		// && !trInfo.getColumnId().equalsIgnoreCase("")
		// && !trInfo.getColumnId().equals(
		// tathing_portal_column_root)) {
		// criteria.andColumnIdEqualTo(trInfo.getColumnId());
		// }
		// 排序条件
//		if (CheckEmpty.isNotEmpty(dt.getOrderBy()) && CheckEmpty.isNotEmpty(dt.getOrderParam())) {
//			//
//			StringBuilder orderByClause = new StringBuilder("");
//			orderByClause.append(dt.getOrderParam()).append(" ").append(dt.getOrderBy());
//			exmple.setOrderByClause(orderByClause.toString());
//		}
		return exmple;
	}

}
