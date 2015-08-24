package com.whty.cms.network.controller;

import java.io.IOException;
import java.util.HashMap;
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
import com.whty.cms.common.base.BaseController;
import com.whty.cms.common.base.DataTableQuery;
import com.whty.cms.common.util.DateUtil;
import com.whty.cms.network.dto.DeviceDto;
import com.whty.cms.network.pojo.ApplyInfo;
import com.whty.cms.network.pojo.Device;
import com.whty.cms.network.pojo.DeviceExample;
import com.whty.cms.network.pojo.User;
import com.whty.cms.network.service.ApplyInfoService;
import com.whty.cms.network.service.DeviceInfoService;
import com.whty.cms.network.service.NetworkAdapterInfoService;
import com.whty.cms.network.service.UserService;

@Controller
@RequestMapping("/applyManage")
public class ApplyManageController extends BaseController {

	
	
	@Autowired
	private ApplyInfoService applyInfoService;

	
	@Autowired
	private DeviceInfoService deviceInfoService;
	
	@Autowired
	private NetworkAdapterInfoService networkAdapterInfoService;
	
	@Autowired
	private UserService userService;
	
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
	public void find(HttpServletRequest request, HttpServletResponse response, Device trInfo) throws IOException {
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
	public void pass(HttpServletRequest request, HttpServletResponse response, ApplyInfo trInfo, String tag) {
		
	}

	/**
	 * 不通过
	 * 
	 * @param response
	 * @param trInfo
	 * @param tag
	 */
	@RequestMapping(value = "/notpass", method = RequestMethod.POST)
	public void notpass(HttpServletRequest request, HttpServletResponse response, ApplyInfo trInfo, String tag) {
		
	}

	@RequestMapping(value = { "/view" })
	@ResponseBody
	public void view(HttpServletResponse response, String pk) {
//		ApplyInfo trInfo = this.applyInfoService.selectByPrimaryKey(pk);
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
		PageList<DeviceDto> infos = buildDto(trInfos);
		records.put("data", infos);
		records.put("draw", dt.getPageDraw());
		records.put("recordsTotal", trInfos.getPaginator().getTotalCount());
		records.put("recordsFiltered", trInfos.getPaginator().getTotalCount());
		return records;
	}

	private PageList<DeviceDto> buildDto(PageList<Device> trInfos) {
		PageList<DeviceDto> infos = new PageList<DeviceDto>();
		for(int i=0;i<trInfos.size();i++){
			DeviceDto dto = new DeviceDto();
			Device d = trInfos.get(i);
			dto.setDeviceId(d.getDeviceId());
			dto.setDeviceName(d.getDeviceName());
			dto.setDeviceOs(d.getDeviceOs());
			dto.setDevicePurpose(d.getDevicePurpose());
			dto.setDeviceType(d.getDeviceType());
			dto.setUserId(d.getUserId());
			dto.setAuthStat(d.getAuthStat());
			dto.setDeviceFlag(d.getDeviceFlag());
			
			//查询用户信息
			User u = userService.selectByPrimaryKey(d.getUserId());
			dto.setUserDepartment(u.getUserDepartment());
			dto.setUserLeader(u.getUserLeader());
			dto.setUserName(u.getUserName());
			dto.setUserPhone(u.getUserPhone());
			dto.setUserType(u.getUserType());
			infos.add(dto);
		}
		return infos;
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
		//审核通过的
		criteria.andAuthStatEqualTo("1");
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
