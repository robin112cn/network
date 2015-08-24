package com.whty.cms.network.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.network.dao.UserMapper;
import com.whty.cms.network.pojo.User;
import com.whty.cms.network.pojo.UserExample;
import com.whty.cms.network.service.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int countByExample(UserExample example) {
		return userMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String columnId) {
		return userMapper.deleteByPrimaryKey(columnId);
	}

	@Override
	public int insertSelective(User record) {
		return userMapper.insertSelective(record);
	}

	@Override
	public List<User> selectByExample(UserExample example) {
		return userMapper.selectByExample(example);
	}

	@Override
	public User selectByPrimaryKey(String columnId) {
		return userMapper.selectByPrimaryKey(columnId);
	}

	@Override
	public int updateByExampleSelective(User record, UserExample example) {
		return userMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}
}
