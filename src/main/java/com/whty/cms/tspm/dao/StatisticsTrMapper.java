package com.whty.cms.tspm.dao;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.tspm.pojo.StatisticsTr;
import com.whty.cms.tspm.pojo.StatisticsTrExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StatisticsTrMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table STATISTICS_TR
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	int countByExample(StatisticsTrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table STATISTICS_TR
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	int deleteByExample(StatisticsTrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table STATISTICS_TR
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	int deleteByPrimaryKey(String statisticsTime);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table STATISTICS_TR
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	int insert(StatisticsTr record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table STATISTICS_TR
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	int insertSelective(StatisticsTr record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table STATISTICS_TR
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	List<StatisticsTr> selectByExample(StatisticsTrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table STATISTICS_TR
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	StatisticsTr selectByPrimaryKey(String statisticsTime);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table STATISTICS_TR
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	int updateByExampleSelective(@Param("record") StatisticsTr record, @Param("example") StatisticsTrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table STATISTICS_TR
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	int updateByExample(@Param("record") StatisticsTr record, @Param("example") StatisticsTrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table STATISTICS_TR
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	int updateByPrimaryKeySelective(StatisticsTr record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table STATISTICS_TR
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	int updateByPrimaryKey(StatisticsTr record);

	PageList<StatisticsTr> selectByExamplePaging(StatisticsTrExample example, PageBounds pageBounds);

	PageList<StatisticsTr> selectByExamplePagingMonth(StatisticsTrExample example, PageBounds pageBounds);

	PageList<StatisticsTr> selectByExamplePagingQuarter(StatisticsTrExample example, PageBounds pageBounds);

	PageList<StatisticsTr> selectByExamplePagingYear(StatisticsTrExample example, PageBounds pageBounds);

	List<StatisticsTr> selectByExamplePagingMonth(StatisticsTrExample example);
	
	List<StatisticsTr> selectByExamplePagingQuarter(StatisticsTrExample example);
	
	List<StatisticsTr> selectByExamplePagingYear(StatisticsTrExample example);
}