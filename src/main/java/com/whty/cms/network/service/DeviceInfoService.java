package com.whty.cms.network.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.network.pojo.Device;
import com.whty.cms.network.pojo.DeviceExample;

public interface DeviceInfoService {

	int countByExample(DeviceExample example);
	int deleteByPrimaryKey(String columnId);
	int insertSelective(Device record);
	List<Device> selectByExample(DeviceExample example);
	PageList<Device> selectByExamplePaging(DeviceExample example, PageBounds pageBounds);
	Device selectByPrimaryKey(String columnId);
	int updateByExampleSelective(@Param("record") Device record,
			@Param("example") DeviceExample example);
	int updateByPrimaryKey(Device record);
}
