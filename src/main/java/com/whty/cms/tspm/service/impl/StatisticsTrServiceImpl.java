package com.whty.cms.tspm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.tspm.pojo.StatisticsTr;
import com.whty.cms.tspm.pojo.StatisticsTrExample;
import com.whty.cms.tspm.service.StatisticsTrService;
import com.whty.cms.tspm.dao.StatisticsTrMapper;
@Service
@Transactional
public class StatisticsTrServiceImpl implements StatisticsTrService{
	@Autowired
	private StatisticsTrMapper statisticsTrMapper;

	@Override
	public int countByExample(StatisticsTrExample example) {
		return statisticsTrMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String columnId) {
		return statisticsTrMapper.deleteByPrimaryKey(columnId);
	}

	@Override
	public int insertSelective(StatisticsTr record) {
		return statisticsTrMapper.insertSelective(record);
	}

	@Override
	public List<StatisticsTr> selectByExample(StatisticsTrExample example) {
		return statisticsTrMapper.selectByExample(example);
	}

	@Override
	public PageList<StatisticsTr> selectByExamplePaging(StatisticsTrExample example,
			PageBounds pageBounds) {
		return statisticsTrMapper.selectByExamplePaging(example, pageBounds);
	}

	@Override
	public StatisticsTr selectByPrimaryKey(String columnId) {
		return statisticsTrMapper.selectByPrimaryKey(columnId);
	}

	@Override
	public int updateByExampleSelective(StatisticsTr record,
			StatisticsTrExample example) {
		return statisticsTrMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKey(StatisticsTr record) {
		return statisticsTrMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public PageList<StatisticsTr> selectByExamplePagingMonth(StatisticsTrExample example,
			PageBounds pageBounds) {
		return statisticsTrMapper.selectByExamplePagingMonth(example, pageBounds);
	}
	
	@Override
	public PageList<StatisticsTr> selectByExamplePagingQuarter(StatisticsTrExample example,
			PageBounds pageBounds) {
		return statisticsTrMapper.selectByExamplePagingQuarter(example, pageBounds);
	}
	
	@Override
	public PageList<StatisticsTr> selectByExamplePagingYear(StatisticsTrExample example,
			PageBounds pageBounds) {
		return statisticsTrMapper.selectByExamplePagingYear(example, pageBounds);
	}
	
	@Override
	public List<StatisticsTr> selectByExampleMonth(StatisticsTrExample example) {
		return statisticsTrMapper.selectByExamplePagingMonth(example);
	}
	
	@Override
	public List<StatisticsTr> selectByExampleQuarter(StatisticsTrExample example) {
		return statisticsTrMapper.selectByExamplePagingQuarter(example);
	}
	
	@Override
	public List<StatisticsTr> selectByExampleYear(StatisticsTrExample example) {
		return statisticsTrMapper.selectByExamplePagingYear(example);
	}
	
}
