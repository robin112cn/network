package com.whty.cms.tspm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.tspm.pojo.TokenOperationHis;
import com.whty.cms.tspm.pojo.TokenOperationHisExample;
import com.whty.cms.tspm.pojo.TokenOperationHisKey;
import com.whty.cms.tspm.service.TokenOperationHisService;
import com.whty.cms.tspm.dao.TokenOperationHisMapper;
@Service
@Transactional
public class TokenOperationHisServiceImpl implements TokenOperationHisService{
	@Autowired
	private TokenOperationHisMapper tokenOperationHisMapper;

	@Override
	public int countByExample(TokenOperationHisExample example) {
		return tokenOperationHisMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(TokenOperationHisKey key) {
		return tokenOperationHisMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insertSelective(TokenOperationHis record) {
		return tokenOperationHisMapper.insertSelective(record);
	}

	@Override
	public List<TokenOperationHis> selectByExample(TokenOperationHisExample example) {
		return tokenOperationHisMapper.selectByExample(example);
	}

	@Override
	public PageList<TokenOperationHis> selectByExamplePaging(TokenOperationHisExample example,
			PageBounds pageBounds) {
		return tokenOperationHisMapper.selectByExamplePaging(example, pageBounds);
	}

	@Override
	public TokenOperationHis selectByPrimaryKey(TokenOperationHisKey key) {
		return tokenOperationHisMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByExampleSelective(TokenOperationHis record,
			TokenOperationHisExample example) {
		return tokenOperationHisMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKey(TokenOperationHis record) {
		return tokenOperationHisMapper.updateByPrimaryKey(record);
	}
	
}
