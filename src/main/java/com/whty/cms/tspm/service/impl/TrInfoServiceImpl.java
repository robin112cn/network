package com.whty.cms.tspm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.tspm.pojo.TrInfo;
import com.whty.cms.tspm.pojo.TrInfoExample;
import com.whty.cms.tspm.service.TrInfoService;
import com.whty.cms.tspm.dao.TrInfoMapper;
@Service
@Transactional
public class TrInfoServiceImpl implements TrInfoService{
	@Autowired
	private TrInfoMapper trInfoMapper;

	@Override
	public int countByExample(TrInfoExample example) {
		return trInfoMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String columnId) {
		return trInfoMapper.deleteByPrimaryKey(columnId);
	}

	@Override
	public int insertSelective(TrInfo record) {
		return trInfoMapper.insertSelective(record);
	}

	@Override
	public List<TrInfo> selectByExample(TrInfoExample example) {
		return trInfoMapper.selectByExample(example);
	}

	@Override
	public PageList<TrInfo> selectByExamplePaging(TrInfoExample example,
			PageBounds pageBounds) {
		return trInfoMapper.selectByExamplePaging(example, pageBounds);
	}

	@Override
	public TrInfo selectByPrimaryKey(String columnId) {
		return trInfoMapper.selectByPrimaryKey(columnId);
	}

	@Override
	public int updateByExampleSelective(TrInfo record,
			TrInfoExample example) {
		return trInfoMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKey(TrInfo record) {
		return trInfoMapper.updateByPrimaryKey(record);
	}
	
}
