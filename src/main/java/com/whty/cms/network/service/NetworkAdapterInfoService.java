package com.whty.cms.network.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.network.pojo.NetworkAdapter;
import com.whty.cms.network.pojo.NetworkAdapterExample;

public interface NetworkAdapterInfoService {

	int countByExample(NetworkAdapterExample example);
	int deleteByPrimaryKey(String columnId);
	int insertSelective(NetworkAdapter record);
	List<NetworkAdapter> selectByExample(NetworkAdapterExample example);
	//PageList<NetworkAdapter> selectByExamplePaging(NetworkAdapterExample example, PageBounds pageBounds);
	NetworkAdapter selectByPrimaryKey(String columnId);
	int updateByExampleSelective(@Param("record") NetworkAdapter record,
			@Param("example") NetworkAdapterExample example);
	int updateByPrimaryKey(NetworkAdapter record);
}
