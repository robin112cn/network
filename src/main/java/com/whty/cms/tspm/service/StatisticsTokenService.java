package com.whty.cms.tspm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.tspm.pojo.StatisticsToken;
import com.whty.cms.tspm.pojo.StatisticsTokenExample;

public interface StatisticsTokenService {

	int countByExample(StatisticsTokenExample example);

	int deleteByPrimaryKey(String columnId);

	int insertSelective(StatisticsToken record);

	List<StatisticsToken> selectByExample(StatisticsTokenExample example);

	PageList<StatisticsToken> selectByExamplePaging(StatisticsTokenExample example, PageBounds pageBounds);

	StatisticsToken selectByPrimaryKey(String columnId);

	int updateByExampleSelective(@Param("record") StatisticsToken record, @Param("example") StatisticsTokenExample example);

	int updateByPrimaryKey(StatisticsToken record);

	public PageList<StatisticsToken> selectByExamplePagingMonth(StatisticsTokenExample example, PageBounds pageBounds);

	public PageList<StatisticsToken> selectByExamplePagingQuarter(StatisticsTokenExample example, PageBounds pageBounds);

	public PageList<StatisticsToken> selectByExamplePagingYear(StatisticsTokenExample example, PageBounds pageBounds);

	List<StatisticsToken> selectByExampleMonth(StatisticsTokenExample example);

	List<StatisticsToken> selectByExampleQuarter(StatisticsTokenExample example);

	List<StatisticsToken> selectByExampleYear(StatisticsTokenExample example);
}
