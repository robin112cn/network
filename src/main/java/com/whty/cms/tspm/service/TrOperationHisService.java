package com.whty.cms.tspm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.tspm.pojo.TrOperationHis;
import com.whty.cms.tspm.pojo.TrOperationHisExample;
import com.whty.cms.tspm.pojo.TrOperationHisKey;

public interface TrOperationHisService {

	int countByExample(TrOperationHisExample example);
	int deleteByPrimaryKey(TrOperationHisKey key);
	int insertSelective(TrOperationHis record);
	List<TrOperationHis> selectByExample(TrOperationHisExample example);
	PageList<TrOperationHis> selectByExamplePaging(TrOperationHisExample example, PageBounds pageBounds);
	TrOperationHis selectByPrimaryKey(TrOperationHisKey key);
	int updateByExampleSelective(@Param("record") TrOperationHis record,
			@Param("example") TrOperationHisExample example);
	int updateByPrimaryKey(TrOperationHis record);
}
