package com.whty.cms.network.dao;

import com.whty.cms.network.pojo.Cable;
import com.whty.cms.network.pojo.CableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CableMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	int countByExample(CableExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	int deleteByExample(CableExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	int deleteByPrimaryKey(String cableId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	int insert(Cable record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	int insertSelective(Cable record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	List<Cable> selectByExample(CableExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	Cable selectByPrimaryKey(String cableId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	int updateByExampleSelective(@Param("record") Cable record,
			@Param("example") CableExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	int updateByExample(@Param("record") Cable record,
			@Param("example") CableExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	int updateByPrimaryKeySelective(Cable record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	int updateByPrimaryKey(Cable record);
}