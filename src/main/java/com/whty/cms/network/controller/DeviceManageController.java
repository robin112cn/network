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
import com.whty.cms.common.base.BaseController;
import com.whty.cms.common.base.DataTableQuery;
import com.whty.cms.common.util.CheckEmpty;
import com.whty.cms.common.util.DateUtil;
import com.whty.cms.common.util.UUIDUtil;
import com.whty.cms.network.dto.DeviceDto;
import com.whty.cms.network.pojo.Device;
import com.whty.cms.network.pojo.DeviceExample;
import com.whty.cms.network.pojo.NetworkAdapter;
import com.whty.cms.network.pojo.NetworkAdapterExample;
import com.whty.cms.network.pojo.User;
import com.whty.cms.network.service.DeviceInfoService;
import com.whty.cms.network.service.NetworkAdapterInfoService;
import com.whty.cms.network.service.UserService;

@Controller
@RequestMapping("/deviceManage")
public class DeviceManageController extends BaseController {

	
	
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
	public ModelAndView show(HttpServletRequest request, HttpServletResponse response) {
		String action= request.getParameter("ac");
		ModelAndView mv =null;
		if (action == null){
			mv = new ModelAndView("/network/device/deviceUI");
		}else if ("add".equals(action)){
			mv = new ModelAndView("/network/device/deviceAddPage");
		}else if ("edit".equals(action)){
			mv = new ModelAndView("/network/device/deviceEditPage");
		}
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
			HttpServletResponse response, DeviceDto deviceDto)
			throws IOException {
		response.setCharacterEncoding("utf-8");
		int flag = 0;
		String msg = "";
		List<Object> list = new ArrayList<Object>();
		String tag = deviceDto.getTag();
		if("add".equals(tag)){
			String userId = UUIDUtil.getUuidString();//request.getSession().getAttribute(Constant.BaseUsersConstant.USERID).toString();
			User userInfo = new User();
			userInfo.setUserId(userId);
			userInfo.setUserDepartment(deviceDto.getUserDepartment());
			userInfo.setUserLeader(deviceDto.getUserLeader());
			userInfo.setUserName(deviceDto.getUserName());
			userInfo.setUserPhone(deviceDto.getUserPhone());
			userInfo.setUserType(1);
			userService.insertSelective(userInfo);
			//新增
			String deviceId = UUIDUtil.getUuidString();
			Device device = new Device();
			device.setDeviceId(deviceId);
			device.setDeviceName(deviceDto.getDeviceName());
			device.setDeviceOs(deviceDto.getDeviceOs());
			device.setDevicePurpose(deviceDto.getDevicePurpose());
			device.setDeviceType(deviceDto.getDeviceType());
			device.setUserId(userId);
			//默认审核通过
			device.setAuthStat("1");
			//未分配IP
			device.setDeviceFlag("0");
			
			flag = deviceInfoService.insertSelective(device);
			
			String[] npTypes = request.getParameterValues("npType");
			String[] npMacs = request.getParameterValues("npMac");
			
			if(npTypes != null ) {
				int i= 0;
				for(String tp :npTypes){
					NetworkAdapter adapter = new NetworkAdapter();
					adapter.setNetworkadapterId(UUIDUtil.getUuidString());
					adapter.setDeviceId(deviceId);
					adapter.setNetworkadapterMac(npMacs[i]);
					adapter.setNetworkadapterType(tp);
					networkAdapterInfoService.insertSelective(adapter);
					i++;
				}
			}
			//网卡信息
//			NetworkAdapter adapter1 = new NetworkAdapter();
//			NetworkAdapter adapter2 = new NetworkAdapter();
//			NetworkAdapter adapter3 = new NetworkAdapter();
//			if(CheckEmpty.isNotEmpty(deviceDto.getNp1Mac()) && CheckEmpty.isNotEmpty(deviceDto.getNp1Type())){
//				adapter1.setNetworkadapterId(UUIDUtil.getUuidString());
//				adapter1.setDeviceId(deviceId);
//				adapter1.setNetworkadapterMac(deviceDto.getNp1Mac());
//				adapter1.setNetworkadapterType(deviceDto.getNp1Type());
//				networkAdapterInfoService.insertSelective(adapter1);
//			}
//			
//			if(CheckEmpty.isNotEmpty(deviceDto.getNp2Mac()) && CheckEmpty.isNotEmpty(deviceDto.getNp2Type())){
//				adapter2.setNetworkadapterId(UUIDUtil.getUuidString());
//				adapter2.setDeviceId(deviceId);
//				adapter2.setNetworkadapterMac(deviceDto.getNp2Mac());
//				adapter2.setNetworkadapterType(deviceDto.getNp2Type());
//				networkAdapterInfoService.insertSelective(adapter2);
//			}
//			
//			if(CheckEmpty.isNotEmpty(deviceDto.getNp3Mac()) && CheckEmpty.isNotEmpty(deviceDto.getNp3Type())){
//				adapter3.setNetworkadapterId(UUIDUtil.getUuidString());
//				adapter3.setDeviceId(deviceId);
//				adapter3.setNetworkadapterMac(deviceDto.getNp3Mac());
//				adapter3.setNetworkadapterType(deviceDto.getNp3Type());
//				networkAdapterInfoService.insertSelective(adapter3);
//			}
//			
			if (flag > 0) {
				msg = "添加设备成功，已发送邮件给审核人员";
			} else {
				msg = "添加设备失败，请联系管理员";
			}
			
		}else if("update".equals(tag)){
			//修改
		}
		
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
	public void view(HttpServletResponse response, String deviceId) {
		Device deviceInfo = deviceInfoService.selectByPrimaryKey(deviceId);
		NetworkAdapterExample adapterExample = new NetworkAdapterExample();
		NetworkAdapterExample.Criteria criteria = adapterExample
				.createCriteria();
		criteria.andDeviceIdEqualTo(deviceId);
		List<NetworkAdapter> naList = networkAdapterInfoService.selectByExample(adapterExample);
		DeviceDto deviceDto = new DeviceDto();
		deviceDto.setDeviceId(deviceId);
		deviceDto.setDeviceName(deviceInfo.getDeviceName());
		deviceDto.setDeviceOs(deviceInfo.getDeviceOs());
		deviceDto.setDevicePurpose(deviceInfo.getDevicePurpose());
		deviceDto.setDeviceType(deviceInfo.getDeviceType());
		
		if(naList!=null && naList.size()>0){
			for(int i=0;i<naList.size();i++){
				if(i==0){
					deviceDto.setNp1Mac(naList.get(0).getNetworkadapterMac());
					deviceDto.setNp1Type(naList.get(0).getNetworkadapterType());
				}
				if(i==1){
					deviceDto.setNp2Mac(naList.get(1).getNetworkadapterMac());
					deviceDto.setNp2Type(naList.get(1).getNetworkadapterType());
				}
				if(i==2){
					deviceDto.setNp3Mac(naList.get(2).getNetworkadapterMac());
					deviceDto.setNp3Type(naList.get(2).getNetworkadapterType());
				}
			}
		}
		writeJSONResult(deviceDto, response);
	}
	
	@RequestMapping(value = { "/viewIp" })
	@ResponseBody
	public void viewIp(HttpServletResponse response, String deviceId) {
		Device deviceInfo = deviceInfoService.selectByPrimaryKey(deviceId);
		NetworkAdapterExample adapterExample = new NetworkAdapterExample();
		NetworkAdapterExample.Criteria criteria = adapterExample
				.createCriteria();
		criteria.andDeviceIdEqualTo(deviceId);
		List<NetworkAdapter> naList = networkAdapterInfoService.selectByExample(adapterExample);
		DeviceDto deviceDto = new DeviceDto();
		deviceDto.setDeviceId(deviceId);
		deviceDto.setDeviceName(deviceInfo.getDeviceName());
		deviceDto.setDeviceOs(deviceInfo.getDeviceOs());
		deviceDto.setDevicePurpose(deviceInfo.getDevicePurpose());
		deviceDto.setDeviceType(deviceInfo.getDeviceType());
		if(naList!=null && naList.size()>0){
			for(int i=0;i<naList.size();i++){
				if(i==0){
					deviceDto.setNp1Mac(naList.get(0).getNetworkadapterMac());
					deviceDto.setNp1Type(naList.get(0).getNetworkadapterType());
					deviceDto.setNp1Ip(naList.get(0).getIp());
					deviceDto.setNp1Deadline(naList.get(0).getDeadline());
				}
				if(i==1){
					deviceDto.setNp2Mac(naList.get(1).getNetworkadapterMac());
					deviceDto.setNp2Type(naList.get(1).getNetworkadapterType());
					deviceDto.setNp2Ip(naList.get(1).getIp());
					deviceDto.setNp2Deadline(naList.get(1).getDeadline());
				}
				if(i==2){
					deviceDto.setNp3Mac(naList.get(2).getNetworkadapterMac());
					deviceDto.setNp3Type(naList.get(2).getNetworkadapterType());
					deviceDto.setNp3Ip(naList.get(2).getIp());
					deviceDto.setNp3Deadline(naList.get(2).getDeadline());
				}
			}
		}
		writeJSONResult(deviceDto, response);
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
		records.put("data", buildDto(trInfos));
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
			
			//查询网卡
			
			NetworkAdapterExample exmple = new NetworkAdapterExample();
			NetworkAdapterExample.Criteria criteria = exmple.createCriteria();
			criteria.andDeviceIdEqualTo(d.getDeviceId());
			int npnum = networkAdapterInfoService.countByExample(exmple);
			dto.setNpNum(npnum+"");
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
