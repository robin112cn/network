package com.whty.cms.tspm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.tspm.pojo.TokenInfo;
import com.whty.cms.tspm.pojo.TokenInfoExample;
import com.whty.cms.tspm.pojo.TokenInfoKey;
import com.whty.cms.tspm.service.TokenInfoService;
import com.whty.cms.tspm.dao.TokenInfoMapper;
@Service
@Transactional
public class TokenInfoServiceImpl implements TokenInfoService{
	@Autowired
	private TokenInfoMapper tokenInfoMapper;

	@Override
	public int countByExample(TokenInfoExample example) {
		return tokenInfoMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(TokenInfoKey key) {
		return tokenInfoMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insertSelective(TokenInfo record) {
		return tokenInfoMapper.insertSelective(record);
	}

	@Override
	public List<TokenInfo> selectByExample(TokenInfoExample example) {
		return tokenInfoMapper.selectByExample(example);
	}

	@Override
	public PageList<TokenInfo> selectByExamplePaging(TokenInfoExample example,
			PageBounds pageBounds) {
		return tokenInfoMapper.selectByExamplePaging(example, pageBounds);
	}

	@Override
	public TokenInfo selectByPrimaryKey(TokenInfoKey key) {
		return tokenInfoMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByExampleSelective(TokenInfo record,
			TokenInfoExample example) {
		return tokenInfoMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKey(TokenInfo record) {
		return tokenInfoMapper.updateByPrimaryKey(record);
	}
	
}
