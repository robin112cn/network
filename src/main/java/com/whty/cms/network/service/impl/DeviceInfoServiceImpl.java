package com.whty.cms.network.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.network.dao.DeviceMapper;
import com.whty.cms.network.pojo.Device;
import com.whty.cms.network.pojo.DeviceExample;
import com.whty.cms.network.service.DeviceInfoService;
@Service
@Transactional
public class DeviceInfoServiceImpl implements DeviceInfoService {
	@Autowired
	private DeviceMapper deviceMapper;
	
	@Override
	public int countByExample(DeviceExample example) {
		return deviceMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(int columnId) {
		return deviceMapper.deleteByPrimaryKey(columnId);
	}

	@Override
	public int insertSelective(Device record) {
		return deviceMapper.insertSelective(record);
	}

	@Override
	public List<Device> selectByExample(DeviceExample example) {
		return deviceMapper.selectByExample(example);
	}

	@Override
	public PageList<Device> selectByExamplePaging(DeviceExample example,
			PageBounds pageBounds) {
		return deviceMapper.selectByExamplePaging(example, pageBounds);
	}

	@Override
	public Device selectByPrimaryKey(int columnId) {
		return deviceMapper.selectByPrimaryKey(columnId);
	}

	@Override
	public int updateByExampleSelective(Device record, DeviceExample example) {
		return deviceMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKey(Device record) {
		return deviceMapper.updateByPrimaryKey(record);
	}
}
