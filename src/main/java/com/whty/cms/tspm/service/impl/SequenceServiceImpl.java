package com.whty.cms.tspm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whty.cms.tspm.dao.SequenceMapper;
import com.whty.cms.tspm.pojo.Sequence;
import com.whty.cms.tspm.service.SequenceService;

@Service
@Transactional
public class SequenceServiceImpl implements SequenceService {

	@Autowired
	private SequenceMapper sequenceMapper;
	
	@Override
	public int currentVal(String seqName) {
		Sequence seq = sequenceMapper.selectByPrimaryKey(seqName);
		return seq.getCurrentVal();
	}

	@Override
	public int nextVal(String seqName) {
		Sequence seq = sequenceMapper.selectByPrimaryKey(seqName);
		int next = seq.getCurrentVal()+seq.getIncrementVal();
		seq.setCurrentVal(next);
		sequenceMapper.updateByPrimaryKey(seq);
		return next;
	}

	@Override
	public void setVal(String seqName, int val) {
		Sequence seq = sequenceMapper.selectByPrimaryKey(seqName);
		seq.setCurrentVal(val);
	}

}
