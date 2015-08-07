package com.whty.cms.tspm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.tspm.pojo.StatisticsToken;
import com.whty.cms.tspm.pojo.StatisticsTokenExample;
import com.whty.cms.tspm.service.StatisticsTokenService;
import com.whty.cms.tspm.dao.StatisticsTokenMapper;
@Service
@Transactional
public class StatisticsTokenServiceImpl implements StatisticsTokenService{
	@Autowired
	private StatisticsTokenMapper statisticsTokenMapper;

	@Override
	public int countByExample(StatisticsTokenExample example) {
		return statisticsTokenMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String columnId) {
		return statisticsTokenMapper.deleteByPrimaryKey(columnId);
	}

	@Override
	public int insertSelective(StatisticsToken record) {
		return statisticsTokenMapper.insertSelective(record);
	}

	@Override
	public List<StatisticsToken> selectByExample(StatisticsTokenExample example) {
		return statisticsTokenMapper.selectByExample(example);
	}

	@Override
	public PageList<StatisticsToken> selectByExamplePaging(StatisticsTokenExample example,
			PageBounds pageBounds) {
		return statisticsTokenMapper.selectByExamplePaging(example, pageBounds);
	}

	@Override
	public StatisticsToken selectByPrimaryKey(String columnId) {
		return statisticsTokenMapper.selectByPrimaryKey(columnId);
	}

	@Override
	public int updateByExampleSelective(StatisticsToken record,
			StatisticsTokenExample example) {
		return statisticsTokenMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKey(StatisticsToken record) {
		return statisticsTokenMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public PageList<StatisticsToken> selectByExamplePagingMonth(StatisticsTokenExample example,
			PageBounds pageBounds) {
		return statisticsTokenMapper.selectByExamplePagingMonth(example, pageBounds);
	}
	
	@Override
	public PageList<StatisticsToken> selectByExamplePagingQuarter(StatisticsTokenExample example,
			PageBounds pageBounds) {
		return statisticsTokenMapper.selectByExamplePagingQuarter(example, pageBounds);
	}
	
	@Override
	public PageList<StatisticsToken> selectByExamplePagingYear(StatisticsTokenExample example,
			PageBounds pageBounds) {
		return statisticsTokenMapper.selectByExamplePagingYear(example, pageBounds);
	}
	
	@Override
	public List<StatisticsToken> selectByExampleMonth(StatisticsTokenExample example) {
		return statisticsTokenMapper.selectByExamplePagingMonth(example);
	}
	
	@Override
	public List<StatisticsToken> selectByExampleQuarter(StatisticsTokenExample example) {
		return statisticsTokenMapper.selectByExamplePagingQuarter(example);
	}
	
	@Override
	public List<StatisticsToken> selectByExampleYear(StatisticsTokenExample example) {
		return statisticsTokenMapper.selectByExamplePagingYear(example);
	}
	
}
