package com.whty.cms.network.pojo;

import java.util.ArrayList;
import java.util.List;

public class ApplyInfoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	public ApplyInfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
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

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNull() {
			addCriterion("user_name is null");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNotNull() {
			addCriterion("user_name is not null");
			return (Criteria) this;
		}

		public Criteria andUserNameEqualTo(String value) {
			addCriterion("user_name =", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotEqualTo(String value) {
			addCriterion("user_name <>", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThan(String value) {
			addCriterion("user_name >", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThanOrEqualTo(String value) {
			addCriterion("user_name >=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThan(String value) {
			addCriterion("user_name <", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThanOrEqualTo(String value) {
			addCriterion("user_name <=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLike(String value) {
			addCriterion("user_name like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotLike(String value) {
			addCriterion("user_name not like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameIn(List<String> values) {
			addCriterion("user_name in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotIn(List<String> values) {
			addCriterion("user_name not in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameBetween(String value1, String value2) {
			addCriterion("user_name between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotBetween(String value1, String value2) {
			addCriterion("user_name not between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserEmailIsNull() {
			addCriterion("user_email is null");
			return (Criteria) this;
		}

		public Criteria andUserEmailIsNotNull() {
			addCriterion("user_email is not null");
			return (Criteria) this;
		}

		public Criteria andUserEmailEqualTo(String value) {
			addCriterion("user_email =", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotEqualTo(String value) {
			addCriterion("user_email <>", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailGreaterThan(String value) {
			addCriterion("user_email >", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
			addCriterion("user_email >=", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailLessThan(String value) {
			addCriterion("user_email <", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailLessThanOrEqualTo(String value) {
			addCriterion("user_email <=", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailLike(String value) {
			addCriterion("user_email like", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotLike(String value) {
			addCriterion("user_email not like", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailIn(List<String> values) {
			addCriterion("user_email in", values, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotIn(List<String> values) {
			addCriterion("user_email not in", values, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailBetween(String value1, String value2) {
			addCriterion("user_email between", value1, value2, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotBetween(String value1, String value2) {
			addCriterion("user_email not between", value1, value2, "userEmail");
			return (Criteria) this;
		}

		public Criteria andDeviceNameIsNull() {
			addCriterion("device_name is null");
			return (Criteria) this;
		}

		public Criteria andDeviceNameIsNotNull() {
			addCriterion("device_name is not null");
			return (Criteria) this;
		}

		public Criteria andDeviceNameEqualTo(String value) {
			addCriterion("device_name =", value, "deviceName");
			return (Criteria) this;
		}

		public Criteria andDeviceNameNotEqualTo(String value) {
			addCriterion("device_name <>", value, "deviceName");
			return (Criteria) this;
		}

		public Criteria andDeviceNameGreaterThan(String value) {
			addCriterion("device_name >", value, "deviceName");
			return (Criteria) this;
		}

		public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
			addCriterion("device_name >=", value, "deviceName");
			return (Criteria) this;
		}

		public Criteria andDeviceNameLessThan(String value) {
			addCriterion("device_name <", value, "deviceName");
			return (Criteria) this;
		}

		public Criteria andDeviceNameLessThanOrEqualTo(String value) {
			addCriterion("device_name <=", value, "deviceName");
			return (Criteria) this;
		}

		public Criteria andDeviceNameLike(String value) {
			addCriterion("device_name like", value, "deviceName");
			return (Criteria) this;
		}

		public Criteria andDeviceNameNotLike(String value) {
			addCriterion("device_name not like", value, "deviceName");
			return (Criteria) this;
		}

		public Criteria andDeviceNameIn(List<String> values) {
			addCriterion("device_name in", values, "deviceName");
			return (Criteria) this;
		}

		public Criteria andDeviceNameNotIn(List<String> values) {
			addCriterion("device_name not in", values, "deviceName");
			return (Criteria) this;
		}

		public Criteria andDeviceNameBetween(String value1, String value2) {
			addCriterion("device_name between", value1, value2, "deviceName");
			return (Criteria) this;
		}

		public Criteria andDeviceNameNotBetween(String value1, String value2) {
			addCriterion("device_name not between", value1, value2,
					"deviceName");
			return (Criteria) this;
		}

		public Criteria andDeviceUseIsNull() {
			addCriterion("device_use is null");
			return (Criteria) this;
		}

		public Criteria andDeviceUseIsNotNull() {
			addCriterion("device_use is not null");
			return (Criteria) this;
		}

		public Criteria andDeviceUseEqualTo(String value) {
			addCriterion("device_use =", value, "deviceUse");
			return (Criteria) this;
		}

		public Criteria andDeviceUseNotEqualTo(String value) {
			addCriterion("device_use <>", value, "deviceUse");
			return (Criteria) this;
		}

		public Criteria andDeviceUseGreaterThan(String value) {
			addCriterion("device_use >", value, "deviceUse");
			return (Criteria) this;
		}

		public Criteria andDeviceUseGreaterThanOrEqualTo(String value) {
			addCriterion("device_use >=", value, "deviceUse");
			return (Criteria) this;
		}

		public Criteria andDeviceUseLessThan(String value) {
			addCriterion("device_use <", value, "deviceUse");
			return (Criteria) this;
		}

		public Criteria andDeviceUseLessThanOrEqualTo(String value) {
			addCriterion("device_use <=", value, "deviceUse");
			return (Criteria) this;
		}

		public Criteria andDeviceUseLike(String value) {
			addCriterion("device_use like", value, "deviceUse");
			return (Criteria) this;
		}

		public Criteria andDeviceUseNotLike(String value) {
			addCriterion("device_use not like", value, "deviceUse");
			return (Criteria) this;
		}

		public Criteria andDeviceUseIn(List<String> values) {
			addCriterion("device_use in", values, "deviceUse");
			return (Criteria) this;
		}

		public Criteria andDeviceUseNotIn(List<String> values) {
			addCriterion("device_use not in", values, "deviceUse");
			return (Criteria) this;
		}

		public Criteria andDeviceUseBetween(String value1, String value2) {
			addCriterion("device_use between", value1, value2, "deviceUse");
			return (Criteria) this;
		}

		public Criteria andDeviceUseNotBetween(String value1, String value2) {
			addCriterion("device_use not between", value1, value2, "deviceUse");
			return (Criteria) this;
		}

		public Criteria andOperOsIsNull() {
			addCriterion("oper_os is null");
			return (Criteria) this;
		}

		public Criteria andOperOsIsNotNull() {
			addCriterion("oper_os is not null");
			return (Criteria) this;
		}

		public Criteria andOperOsEqualTo(String value) {
			addCriterion("oper_os =", value, "operOs");
			return (Criteria) this;
		}

		public Criteria andOperOsNotEqualTo(String value) {
			addCriterion("oper_os <>", value, "operOs");
			return (Criteria) this;
		}

		public Criteria andOperOsGreaterThan(String value) {
			addCriterion("oper_os >", value, "operOs");
			return (Criteria) this;
		}

		public Criteria andOperOsGreaterThanOrEqualTo(String value) {
			addCriterion("oper_os >=", value, "operOs");
			return (Criteria) this;
		}

		public Criteria andOperOsLessThan(String value) {
			addCriterion("oper_os <", value, "operOs");
			return (Criteria) this;
		}

		public Criteria andOperOsLessThanOrEqualTo(String value) {
			addCriterion("oper_os <=", value, "operOs");
			return (Criteria) this;
		}

		public Criteria andOperOsLike(String value) {
			addCriterion("oper_os like", value, "operOs");
			return (Criteria) this;
		}

		public Criteria andOperOsNotLike(String value) {
			addCriterion("oper_os not like", value, "operOs");
			return (Criteria) this;
		}

		public Criteria andOperOsIn(List<String> values) {
			addCriterion("oper_os in", values, "operOs");
			return (Criteria) this;
		}

		public Criteria andOperOsNotIn(List<String> values) {
			addCriterion("oper_os not in", values, "operOs");
			return (Criteria) this;
		}

		public Criteria andOperOsBetween(String value1, String value2) {
			addCriterion("oper_os between", value1, value2, "operOs");
			return (Criteria) this;
		}

		public Criteria andOperOsNotBetween(String value1, String value2) {
			addCriterion("oper_os not between", value1, value2, "operOs");
			return (Criteria) this;
		}

		public Criteria andDeviceMacIsNull() {
			addCriterion("device_mac is null");
			return (Criteria) this;
		}

		public Criteria andDeviceMacIsNotNull() {
			addCriterion("device_mac is not null");
			return (Criteria) this;
		}

		public Criteria andDeviceMacEqualTo(String value) {
			addCriterion("device_mac =", value, "deviceMac");
			return (Criteria) this;
		}

		public Criteria andDeviceMacNotEqualTo(String value) {
			addCriterion("device_mac <>", value, "deviceMac");
			return (Criteria) this;
		}

		public Criteria andDeviceMacGreaterThan(String value) {
			addCriterion("device_mac >", value, "deviceMac");
			return (Criteria) this;
		}

		public Criteria andDeviceMacGreaterThanOrEqualTo(String value) {
			addCriterion("device_mac >=", value, "deviceMac");
			return (Criteria) this;
		}

		public Criteria andDeviceMacLessThan(String value) {
			addCriterion("device_mac <", value, "deviceMac");
			return (Criteria) this;
		}

		public Criteria andDeviceMacLessThanOrEqualTo(String value) {
			addCriterion("device_mac <=", value, "deviceMac");
			return (Criteria) this;
		}

		public Criteria andDeviceMacLike(String value) {
			addCriterion("device_mac like", value, "deviceMac");
			return (Criteria) this;
		}

		public Criteria andDeviceMacNotLike(String value) {
			addCriterion("device_mac not like", value, "deviceMac");
			return (Criteria) this;
		}

		public Criteria andDeviceMacIn(List<String> values) {
			addCriterion("device_mac in", values, "deviceMac");
			return (Criteria) this;
		}

		public Criteria andDeviceMacNotIn(List<String> values) {
			addCriterion("device_mac not in", values, "deviceMac");
			return (Criteria) this;
		}

		public Criteria andDeviceMacBetween(String value1, String value2) {
			addCriterion("device_mac between", value1, value2, "deviceMac");
			return (Criteria) this;
		}

		public Criteria andDeviceMacNotBetween(String value1, String value2) {
			addCriterion("device_mac not between", value1, value2, "deviceMac");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeIsNull() {
			addCriterion("device_type is null");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeIsNotNull() {
			addCriterion("device_type is not null");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeEqualTo(String value) {
			addCriterion("device_type =", value, "deviceType");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeNotEqualTo(String value) {
			addCriterion("device_type <>", value, "deviceType");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeGreaterThan(String value) {
			addCriterion("device_type >", value, "deviceType");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
			addCriterion("device_type >=", value, "deviceType");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeLessThan(String value) {
			addCriterion("device_type <", value, "deviceType");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
			addCriterion("device_type <=", value, "deviceType");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeLike(String value) {
			addCriterion("device_type like", value, "deviceType");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeNotLike(String value) {
			addCriterion("device_type not like", value, "deviceType");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeIn(List<String> values) {
			addCriterion("device_type in", values, "deviceType");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeNotIn(List<String> values) {
			addCriterion("device_type not in", values, "deviceType");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeBetween(String value1, String value2) {
			addCriterion("device_type between", value1, value2, "deviceType");
			return (Criteria) this;
		}

		public Criteria andDeviceTypeNotBetween(String value1, String value2) {
			addCriterion("device_type not between", value1, value2,
					"deviceType");
			return (Criteria) this;
		}

		public Criteria andUntiTimeIsNull() {
			addCriterion("unti_time is null");
			return (Criteria) this;
		}

		public Criteria andUntiTimeIsNotNull() {
			addCriterion("unti_time is not null");
			return (Criteria) this;
		}

		public Criteria andUntiTimeEqualTo(String value) {
			addCriterion("unti_time =", value, "untiTime");
			return (Criteria) this;
		}

		public Criteria andUntiTimeNotEqualTo(String value) {
			addCriterion("unti_time <>", value, "untiTime");
			return (Criteria) this;
		}

		public Criteria andUntiTimeGreaterThan(String value) {
			addCriterion("unti_time >", value, "untiTime");
			return (Criteria) this;
		}

		public Criteria andUntiTimeGreaterThanOrEqualTo(String value) {
			addCriterion("unti_time >=", value, "untiTime");
			return (Criteria) this;
		}

		public Criteria andUntiTimeLessThan(String value) {
			addCriterion("unti_time <", value, "untiTime");
			return (Criteria) this;
		}

		public Criteria andUntiTimeLessThanOrEqualTo(String value) {
			addCriterion("unti_time <=", value, "untiTime");
			return (Criteria) this;
		}

		public Criteria andUntiTimeLike(String value) {
			addCriterion("unti_time like", value, "untiTime");
			return (Criteria) this;
		}

		public Criteria andUntiTimeNotLike(String value) {
			addCriterion("unti_time not like", value, "untiTime");
			return (Criteria) this;
		}

		public Criteria andUntiTimeIn(List<String> values) {
			addCriterion("unti_time in", values, "untiTime");
			return (Criteria) this;
		}

		public Criteria andUntiTimeNotIn(List<String> values) {
			addCriterion("unti_time not in", values, "untiTime");
			return (Criteria) this;
		}

		public Criteria andUntiTimeBetween(String value1, String value2) {
			addCriterion("unti_time between", value1, value2, "untiTime");
			return (Criteria) this;
		}

		public Criteria andUntiTimeNotBetween(String value1, String value2) {
			addCriterion("unti_time not between", value1, value2, "untiTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table apply_info
	 * @mbggenerated  Thu Jul 30 09:21:33 CST 2015
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
     * This class corresponds to the database table apply_info
     *
     * @mbggenerated do_not_delete_during_merge Wed Jul 29 18:57:03 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}