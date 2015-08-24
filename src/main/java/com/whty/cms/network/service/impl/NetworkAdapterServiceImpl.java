package com.whty.cms.network.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.network.dao.NetworkAdapterMapper;
import com.whty.cms.network.pojo.NetworkAdapter;
import com.whty.cms.network.pojo.NetworkAdapterExample;
import com.whty.cms.network.service.NetworkAdapterInfoService;
@Service
@Transactional
public class NetworkAdapterServiceImpl implements NetworkAdapterInfoService {
	@Autowired
	private NetworkAdapterMapper networkAdapterMapper;
	
	@Override
	public int countByExample(NetworkAdapterExample example) {
		return networkAdapterMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String columnId) {
		return networkAdapterMapper.deleteByPrimaryKey(columnId);
	}

	@Override
	public int insertSelective(NetworkAdapter record) {
		return networkAdapterMapper.insertSelective(record);
	}

	@Override
	public List<NetworkAdapter> selectByExample(NetworkAdapterExample example) {
		return networkAdapterMapper.selectByExample(example);
	}

	@Override
	public PageList<NetworkAdapter> selectByExamplePaging(NetworkAdapterExample example,
			PageBounds pageBounds) {
		return networkAdapterMapper.selectByExamplePaging(example, pageBounds);
	}

	@Override
	public NetworkAdapter selectByPrimaryKey(String columnId) {
		return networkAdapterMapper.selectByPrimaryKey(columnId);
	}

	@Override
	public int updateByExampleSelective(NetworkAdapter record, NetworkAdapterExample example) {
		return networkAdapterMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKey(NetworkAdapter record) {
		return networkAdapterMapper.updateByPrimaryKey(record);
	}
}
