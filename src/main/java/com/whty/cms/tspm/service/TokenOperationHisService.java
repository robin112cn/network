package com.whty.cms.tspm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.tspm.pojo.TokenOperationHis;
import com.whty.cms.tspm.pojo.TokenOperationHisExample;
import com.whty.cms.tspm.pojo.TokenOperationHisKey;

public interface TokenOperationHisService {

	int countByExample(TokenOperationHisExample example);
	int deleteByPrimaryKey(TokenOperationHisKey key);
	int insertSelective(TokenOperationHis record);
	List<TokenOperationHis> selectByExample(TokenOperationHisExample example);
	PageList<TokenOperationHis> selectByExamplePaging(TokenOperationHisExample example, PageBounds pageBounds);
	TokenOperationHis selectByPrimaryKey(TokenOperationHisKey key);
	int updateByExampleSelective(@Param("record") TokenOperationHis record,
			@Param("example") TokenOperationHisExample example);
	int updateByPrimaryKey(TokenOperationHis record);
}
