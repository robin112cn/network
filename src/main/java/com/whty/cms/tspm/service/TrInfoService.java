package com.whty.cms.tspm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.tspm.pojo.TrInfo;
import com.whty.cms.tspm.pojo.TrInfoExample;

public interface TrInfoService {

	int countByExample(TrInfoExample example);
	int deleteByPrimaryKey(String columnId);
	int insertSelective(TrInfo record);
	List<TrInfo> selectByExample(TrInfoExample example);
	PageList<TrInfo> selectByExamplePaging(TrInfoExample example, PageBounds pageBounds);
	TrInfo selectByPrimaryKey(String columnId);
	int updateByExampleSelective(@Param("record") TrInfo record,
			@Param("example") TrInfoExample example);
	int updateByPrimaryKey(TrInfo record);
}
