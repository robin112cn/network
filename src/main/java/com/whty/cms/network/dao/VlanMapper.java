package com.whty.cms.network.dao;

import com.whty.cms.network.pojo.Vlan;
import com.whty.cms.network.pojo.VlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VlanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vlan
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    int countByExample(VlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vlan
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    int deleteByExample(VlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vlan
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    int deleteByPrimaryKey(Integer vlanId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vlan
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    int insert(Vlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vlan
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    int insertSelective(Vlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vlan
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    List<Vlan> selectByExample(VlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vlan
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    Vlan selectByPrimaryKey(Integer vlanId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vlan
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    int updateByExampleSelective(@Param("record") Vlan record, @Param("example") VlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vlan
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    int updateByExample(@Param("record") Vlan record, @Param("example") VlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vlan
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    int updateByPrimaryKeySelective(Vlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vlan
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    int updateByPrimaryKey(Vlan record);
}