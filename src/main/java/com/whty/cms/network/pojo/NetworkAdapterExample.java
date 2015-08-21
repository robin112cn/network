package com.whty.cms.network.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NetworkAdapterExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	public NetworkAdapterExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andNetworkadapterIdIsNull() {
			addCriterion("networkadapter_id is null");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterIdIsNotNull() {
			addCriterion("networkadapter_id is not null");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterIdEqualTo(Integer value) {
			addCriterion("networkadapter_id =", value, "networkadapterId");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterIdNotEqualTo(Integer value) {
			addCriterion("networkadapter_id <>", value, "networkadapterId");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterIdGreaterThan(Integer value) {
			addCriterion("networkadapter_id >", value, "networkadapterId");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("networkadapter_id >=", value, "networkadapterId");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterIdLessThan(Integer value) {
			addCriterion("networkadapter_id <", value, "networkadapterId");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterIdLessThanOrEqualTo(Integer value) {
			addCriterion("networkadapter_id <=", value, "networkadapterId");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterIdIn(List<Integer> values) {
			addCriterion("networkadapter_id in", values, "networkadapterId");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterIdNotIn(List<Integer> values) {
			addCriterion("networkadapter_id not in", values, "networkadapterId");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterIdBetween(Integer value1,
				Integer value2) {
			addCriterion("networkadapter_id between", value1, value2,
					"networkadapterId");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("networkadapter_id not between", value1, value2,
					"networkadapterId");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterTypeIsNull() {
			addCriterion("networkadapter_type is null");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterTypeIsNotNull() {
			addCriterion("networkadapter_type is not null");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterTypeEqualTo(Integer value) {
			addCriterion("networkadapter_type =", value, "networkadapterType");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterTypeNotEqualTo(Integer value) {
			addCriterion("networkadapter_type <>", value, "networkadapterType");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterTypeGreaterThan(Integer value) {
			addCriterion("networkadapter_type >", value, "networkadapterType");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("networkadapter_type >=", value, "networkadapterType");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterTypeLessThan(Integer value) {
			addCriterion("networkadapter_type <", value, "networkadapterType");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterTypeLessThanOrEqualTo(Integer value) {
			addCriterion("networkadapter_type <=", value, "networkadapterType");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterTypeIn(List<Integer> values) {
			addCriterion("networkadapter_type in", values, "networkadapterType");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterTypeNotIn(List<Integer> values) {
			addCriterion("networkadapter_type not in", values,
					"networkadapterType");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterTypeBetween(Integer value1,
				Integer value2) {
			addCriterion("networkadapter_type between", value1, value2,
					"networkadapterType");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterTypeNotBetween(Integer value1,
				Integer value2) {
			addCriterion("networkadapter_type not between", value1, value2,
					"networkadapterType");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacIsNull() {
			addCriterion("networkadapter_mac is null");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacIsNotNull() {
			addCriterion("networkadapter_mac is not null");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacEqualTo(String value) {
			addCriterion("networkadapter_mac =", value, "networkadapterMac");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacNotEqualTo(String value) {
			addCriterion("networkadapter_mac <>", value, "networkadapterMac");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacGreaterThan(String value) {
			addCriterion("networkadapter_mac >", value, "networkadapterMac");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacGreaterThanOrEqualTo(String value) {
			addCriterion("networkadapter_mac >=", value, "networkadapterMac");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacLessThan(String value) {
			addCriterion("networkadapter_mac <", value, "networkadapterMac");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacLessThanOrEqualTo(String value) {
			addCriterion("networkadapter_mac <=", value, "networkadapterMac");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacLike(String value) {
			addCriterion("networkadapter_mac like", value, "networkadapterMac");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacNotLike(String value) {
			addCriterion("networkadapter_mac not like", value,
					"networkadapterMac");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacIn(List<String> values) {
			addCriterion("networkadapter_mac in", values, "networkadapterMac");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacNotIn(List<String> values) {
			addCriterion("networkadapter_mac not in", values,
					"networkadapterMac");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacBetween(String value1, String value2) {
			addCriterion("networkadapter_mac between", value1, value2,
					"networkadapterMac");
			return (Criteria) this;
		}

		public Criteria andNetworkadapterMacNotBetween(String value1,
				String value2) {
			addCriterion("networkadapter_mac not between", value1, value2,
					"networkadapterMac");
			return (Criteria) this;
		}

		public Criteria andDeviceIdIsNull() {
			addCriterion("device_id is null");
			return (Criteria) this;
		}

		public Criteria andDeviceIdIsNotNull() {
			addCriterion("device_id is not null");
			return (Criteria) this;
		}

		public Criteria andDeviceIdEqualTo(Integer value) {
			addCriterion("device_id =", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdNotEqualTo(Integer value) {
			addCriterion("device_id <>", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdGreaterThan(Integer value) {
			addCriterion("device_id >", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("device_id >=", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdLessThan(Integer value) {
			addCriterion("device_id <", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
			addCriterion("device_id <=", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdIn(List<Integer> values) {
			addCriterion("device_id in", values, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdNotIn(List<Integer> values) {
			addCriterion("device_id not in", values, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
			addCriterion("device_id between", value1, value2, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
			addCriterion("device_id not between", value1, value2, "deviceId");
			return (Criteria) this;
		}

		public Criteria andCableIdIsNull() {
			addCriterion("cable_id is null");
			return (Criteria) this;
		}

		public Criteria andCableIdIsNotNull() {
			addCriterion("cable_id is not null");
			return (Criteria) this;
		}

		public Criteria andCableIdEqualTo(Integer value) {
			addCriterion("cable_id =", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdNotEqualTo(Integer value) {
			addCriterion("cable_id <>", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdGreaterThan(Integer value) {
			addCriterion("cable_id >", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("cable_id >=", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdLessThan(Integer value) {
			addCriterion("cable_id <", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdLessThanOrEqualTo(Integer value) {
			addCriterion("cable_id <=", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdIn(List<Integer> values) {
			addCriterion("cable_id in", values, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdNotIn(List<Integer> values) {
			addCriterion("cable_id not in", values, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdBetween(Integer value1, Integer value2) {
			addCriterion("cable_id between", value1, value2, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdNotBetween(Integer value1, Integer value2) {
			addCriterion("cable_id not between", value1, value2, "cableId");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeIsNull() {
			addCriterion("conference_code is null");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeIsNotNull() {
			addCriterion("conference_code is not null");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeEqualTo(String value) {
			addCriterion("conference_code =", value, "conferenceCode");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeNotEqualTo(String value) {
			addCriterion("conference_code <>", value, "conferenceCode");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeGreaterThan(String value) {
			addCriterion("conference_code >", value, "conferenceCode");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeGreaterThanOrEqualTo(String value) {
			addCriterion("conference_code >=", value, "conferenceCode");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeLessThan(String value) {
			addCriterion("conference_code <", value, "conferenceCode");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeLessThanOrEqualTo(String value) {
			addCriterion("conference_code <=", value, "conferenceCode");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeLike(String value) {
			addCriterion("conference_code like", value, "conferenceCode");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeNotLike(String value) {
			addCriterion("conference_code not like", value, "conferenceCode");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeIn(List<String> values) {
			addCriterion("conference_code in", values, "conferenceCode");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeNotIn(List<String> values) {
			addCriterion("conference_code not in", values, "conferenceCode");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeBetween(String value1, String value2) {
			addCriterion("conference_code between", value1, value2,
					"conferenceCode");
			return (Criteria) this;
		}

		public Criteria andConferenceCodeNotBetween(String value1, String value2) {
			addCriterion("conference_code not between", value1, value2,
					"conferenceCode");
			return (Criteria) this;
		}

		public Criteria andIpIsNull() {
			addCriterion("ip is null");
			return (Criteria) this;
		}

		public Criteria andIpIsNotNull() {
			addCriterion("ip is not null");
			return (Criteria) this;
		}

		public Criteria andIpEqualTo(String value) {
			addCriterion("ip =", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotEqualTo(String value) {
			addCriterion("ip <>", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpGreaterThan(String value) {
			addCriterion("ip >", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpGreaterThanOrEqualTo(String value) {
			addCriterion("ip >=", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLessThan(String value) {
			addCriterion("ip <", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLessThanOrEqualTo(String value) {
			addCriterion("ip <=", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLike(String value) {
			addCriterion("ip like", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotLike(String value) {
			addCriterion("ip not like", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpIn(List<String> values) {
			addCriterion("ip in", values, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotIn(List<String> values) {
			addCriterion("ip not in", values, "ip");
			return (Criteria) this;
		}

		public Criteria andIpBetween(String value1, String value2) {
			addCriterion("ip between", value1, value2, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotBetween(String value1, String value2) {
			addCriterion("ip not between", value1, value2, "ip");
			return (Criteria) this;
		}

		public Criteria andDeadlineIsNull() {
			addCriterion("deadline is null");
			return (Criteria) this;
		}

		public Criteria andDeadlineIsNotNull() {
			addCriterion("deadline is not null");
			return (Criteria) this;
		}

		public Criteria andDeadlineEqualTo(Date value) {
			addCriterion("deadline =", value, "deadline");
			return (Criteria) this;
		}

		public Criteria andDeadlineNotEqualTo(Date value) {
			addCriterion("deadline <>", value, "deadline");
			return (Criteria) this;
		}

		public Criteria andDeadlineGreaterThan(Date value) {
			addCriterion("deadline >", value, "deadline");
			return (Criteria) this;
		}

		public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
			addCriterion("deadline >=", value, "deadline");
			return (Criteria) this;
		}

		public Criteria andDeadlineLessThan(Date value) {
			addCriterion("deadline <", value, "deadline");
			return (Criteria) this;
		}

		public Criteria andDeadlineLessThanOrEqualTo(Date value) {
			addCriterion("deadline <=", value, "deadline");
			return (Criteria) this;
		}

		public Criteria andDeadlineIn(List<Date> values) {
			addCriterion("deadline in", values, "deadline");
			return (Criteria) this;
		}

		public Criteria andDeadlineNotIn(List<Date> values) {
			addCriterion("deadline not in", values, "deadline");
			return (Criteria) this;
		}

		public Criteria andDeadlineBetween(Date value1, Date value2) {
			addCriterion("deadline between", value1, value2, "deadline");
			return (Criteria) this;
		}

		public Criteria andDeadlineNotBetween(Date value1, Date value2) {
			addCriterion("deadline not between", value1, value2, "deadline");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table networkadapter
	 * @mbggenerated  Thu Aug 20 13:37:45 CST 2015
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table networkadapter
     *
     * @mbggenerated do_not_delete_during_merge Wed Jul 29 14:45:13 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}