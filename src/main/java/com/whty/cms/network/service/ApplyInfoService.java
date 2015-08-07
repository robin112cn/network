package com.whty.cms.network.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.network.pojo.ApplyInfo;
import com.whty.cms.network.pojo.ApplyInfoExample;

public interface ApplyInfoService {

	int countByExample(ApplyInfoExample example);
	int deleteByPrimaryKey(String columnId);
	int insertSelective(ApplyInfo record);
	List<ApplyInfo> selectByExample(ApplyInfoExample example);
	PageList<ApplyInfo> selectByExamplePaging(ApplyInfoExample example, PageBounds pageBounds);
	ApplyInfo selectByPrimaryKey(String columnId);
	int updateByExampleSelective(@Param("record") ApplyInfo record,
			@Param("example") ApplyInfoExample example);
	int updateByPrimaryKey(ApplyInfo record);
}
