package com.whty.cms.network.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.network.pojo.User;
import com.whty.cms.network.pojo.UserExample;

public interface UserService {

	int countByExample(UserExample example);
	int deleteByPrimaryKey(String columnId);
	int insertSelective(User record);
	List<User> selectByExample(UserExample example);
//	PageList<User> selectByExamplePaging(UserExample example, PageBounds pageBounds);
	User selectByPrimaryKey(String columnId);
	int updateByExampleSelective(@Param("record") User record,
			@Param("example") UserExample example);
	int updateByPrimaryKey(User record);
}
