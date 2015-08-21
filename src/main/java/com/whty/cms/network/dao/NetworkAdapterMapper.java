package com.whty.cms.network.dao;

import com.whty.cms.network.pojo.NetworkAdapter;
import com.whty.cms.network.pojo.NetworkAdapterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetworkAdapterMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	int countByExample(NetworkAdapterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	int deleteByExample(NetworkAdapterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	int deleteByPrimaryKey(Integer networkadapterId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	int insert(NetworkAdapter record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	int insertSelective(NetworkAdapter record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	List<NetworkAdapter> selectByExample(NetworkAdapterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	NetworkAdapter selectByPrimaryKey(Integer networkadapterId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	int updateByExampleSelective(@Param("record") NetworkAdapter record,
			@Param("example") NetworkAdapterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	int updateByExample(@Param("record") NetworkAdapter record,
			@Param("example") NetworkAdapterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	int updateByPrimaryKeySelective(NetworkAdapter record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	int updateByPrimaryKey(NetworkAdapter record);
}