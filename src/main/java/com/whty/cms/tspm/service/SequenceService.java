package com.whty.cms.tspm.service;

public interface SequenceService {

	/**
	 * 获取当前序列值
	 * @param seqName 序列名
	 * @return 当前序列值
	 */
	int currentVal(String seqName);
	
	/**
	 * 获取下一个序列值
	 * @param seqName 序列名
	 * @return 下一个序列值
	 */
	int nextVal(String seqName);
	
	/**
	 * 修改序列值
	 * @param seqName 序列名
	 * @param val 序列值
	 */
	void setVal(String seqName, int val);
}
