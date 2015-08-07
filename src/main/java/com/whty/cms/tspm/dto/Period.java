package com.whty.cms.tspm.dto;

/**
 * 统计信息查询表单
 * @author zhanghang
 * 2015年6月10日
 *
 */
public class Period {

	/**
	 * 统计周期
	 */
	private String period;
	/**
	 * 起始时间
	 */
	private String startDate;
	/**
	 * 终止时间
	 */
	private String endDate;
	
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
