package com.whty.cms.tspm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.tspm.pojo.TokenInfo;
import com.whty.cms.tspm.pojo.TokenInfoExample;
import com.whty.cms.tspm.pojo.TokenInfoKey;

public interface TokenInfoService {

	int countByExample(TokenInfoExample example);
	int deleteByPrimaryKey(TokenInfoKey key);
	int insertSelective(TokenInfo record);
	List<TokenInfo> selectByExample(TokenInfoExample example);
	PageList<TokenInfo> selectByExamplePaging(TokenInfoExample example, PageBounds pageBounds);
	TokenInfo selectByPrimaryKey(TokenInfoKey key);
	int updateByExampleSelective(@Param("record") TokenInfo record,
			@Param("example") TokenInfoExample example);
	int updateByPrimaryKey(TokenInfo record);
}
