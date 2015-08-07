package com.whty.cms.network.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.network.dao.ApplyInfoMapper;
import com.whty.cms.network.pojo.ApplyInfo;
import com.whty.cms.network.pojo.ApplyInfoExample;
import com.whty.cms.network.service.ApplyInfoService;
import com.whty.cms.tspm.dao.TrInfoMapper;
@Service
@Transactional
public class ApplyInfoServiceImpl implements ApplyInfoService {

	@Autowired
	private ApplyInfoMapper applyInfoMapper;

	@Override
	public int countByExample(ApplyInfoExample example) {
		return applyInfoMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String columnId) {
		return 0;
	}

	@Override
	public int insertSelective(ApplyInfo record) {
		return applyInfoMapper.insertSelective(record);
	}

	@Override
	public List<ApplyInfo> selectByExample(ApplyInfoExample example) {
		return applyInfoMapper.selectByExample(example);
	}

	@Override
	public PageList<ApplyInfo> selectByExamplePaging(ApplyInfoExample example,
			PageBounds pageBounds) {
		return applyInfoMapper.selectByExamplePaging(example, pageBounds);
	}

	@Override
	public ApplyInfo selectByPrimaryKey(String columnId) {
		return null;
	}

	@Override
	public int updateByExampleSelective(ApplyInfo record,
			ApplyInfoExample example) {
		return applyInfoMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKey(ApplyInfo record) {
		return 0;
	}

}
