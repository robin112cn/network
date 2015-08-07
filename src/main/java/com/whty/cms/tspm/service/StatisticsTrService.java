package com.whty.cms.tspm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.tspm.pojo.StatisticsTr;
import com.whty.cms.tspm.pojo.StatisticsTrExample;

public interface StatisticsTrService {

	int countByExample(StatisticsTrExample example);

	int deleteByPrimaryKey(String columnId);

	int insertSelective(StatisticsTr record);

	List<StatisticsTr> selectByExample(StatisticsTrExample example);

	StatisticsTr selectByPrimaryKey(String columnId);

	int updateByExampleSelective(@Param("record") StatisticsTr record, @Param("example") StatisticsTrExample example);

	int updateByPrimaryKey(StatisticsTr record);

	PageList<StatisticsTr> selectByExamplePaging(StatisticsTrExample example, PageBounds pageBounds);

	public PageList<StatisticsTr> selectByExamplePagingMonth(StatisticsTrExample example, PageBounds pageBounds);

	public PageList<StatisticsTr> selectByExamplePagingQuarter(StatisticsTrExample example, PageBounds pageBounds);

	public PageList<StatisticsTr> selectByExamplePagingYear(StatisticsTrExample example, PageBounds pageBounds);

	List<StatisticsTr> selectByExampleMonth(StatisticsTrExample example);

	List<StatisticsTr> selectByExampleQuarter(StatisticsTrExample example);

	List<StatisticsTr> selectByExampleYear(StatisticsTrExample example);
}
