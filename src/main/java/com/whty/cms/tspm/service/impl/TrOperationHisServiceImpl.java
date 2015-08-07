package com.whty.cms.tspm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.tspm.pojo.TrOperationHis;
import com.whty.cms.tspm.pojo.TrOperationHisExample;
import com.whty.cms.tspm.pojo.TrOperationHisKey;
import com.whty.cms.tspm.service.TrOperationHisService;
import com.whty.cms.tspm.dao.TrOperationHisMapper;
@Service
@Transactional
public class TrOperationHisServiceImpl implements TrOperationHisService{
	@Autowired
	private TrOperationHisMapper trOperationHisMapper;

	@Override
	public int countByExample(TrOperationHisExample example) {
		return trOperationHisMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(TrOperationHisKey key) {
		return trOperationHisMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insertSelective(TrOperationHis record) {
		return trOperationHisMapper.insertSelective(record);
	}

	@Override
	public List<TrOperationHis> selectByExample(TrOperationHisExample example) {
		return trOperationHisMapper.selectByExample(example);
	}

	@Override
	public PageList<TrOperationHis> selectByExamplePaging(TrOperationHisExample example,
			PageBounds pageBounds) {
		return trOperationHisMapper.selectByExamplePaging(example, pageBounds);
	}

	@Override
	public TrOperationHis selectByPrimaryKey(TrOperationHisKey key) {
		return trOperationHisMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByExampleSelective(TrOperationHis record,
			TrOperationHisExample example) {
		return trOperationHisMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKey(TrOperationHis record) {
		return trOperationHisMapper.updateByPrimaryKey(record);
	}
	
}
