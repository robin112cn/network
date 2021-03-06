package com.whty.cms.network.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeviceExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	public DeviceExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
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

		public Criteria andDeviceIdIsNull() {
			addCriterion("device_id is null");
			return (Criteria) this;
		}

		public Criteria andDeviceIdIsNotNull() {
			addCriterion("device_id is not null");
			return (Criteria) this;
		}

		public Criteria andDeviceIdEqualTo(String value) {
			addCriterion("device_id =", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdNotEqualTo(String value) {
			addCriterion("device_id <>", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdGreaterThan(String value) {
			addCriterion("device_id >", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
			addCriterion("device_id >=", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdLessThan(String value) {
			addCriterion("device_id <", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdLessThanOrEqualTo(String value) {
			addCriterion("device_id <=", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdLike(String value) {
			addCriterion("device_id like", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdNotLike(String value) {
			addCriterion("device_id not like", value, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdIn(List<String> values) {
			addCriterion("device_id in", values, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdNotIn(List<String> values) {
			addCriterion("device_id not in", values, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdBetween(String value1, String value2) {
			addCriterion("device_id between", value1, value2, "deviceId");
			return (Criteria) this;
		}

		public Criteria andDeviceIdNotBetween(String value1, String value2) {
			addCriterion("device_id not between", value1, value2, "deviceId");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(String value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(String value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLike(String value) {
			addCriterion("user_id like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotLike(String value) {
			addCriterion("user_id not like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<String> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<String> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			addCriterion("user_id not between", value1, value2, "userId");
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

		public Criteria andDeviceOsIsNull() {
			addCriterion("device_os is null");
			return (Criteria) this;
		}

		public Criteria andDeviceOsIsNotNull() {
			addCriterion("device_os is not null");
			return (Criteria) this;
		}

		public Criteria andDeviceOsEqualTo(String value) {
			addCriterion("device_os =", value, "deviceOs");
			return (Criteria) this;
		}

		public Criteria andDeviceOsNotEqualTo(String value) {
			addCriterion("device_os <>", value, "deviceOs");
			return (Criteria) this;
		}

		public Criteria andDeviceOsGreaterThan(String value) {
			addCriterion("device_os >", value, "deviceOs");
			return (Criteria) this;
		}

		public Criteria andDeviceOsGreaterThanOrEqualTo(String value) {
			addCriterion("device_os >=", value, "deviceOs");
			return (Criteria) this;
		}

		public Criteria andDeviceOsLessThan(String value) {
			addCriterion("device_os <", value, "deviceOs");
			return (Criteria) this;
		}

		public Criteria andDeviceOsLessThanOrEqualTo(String value) {
			addCriterion("device_os <=", value, "deviceOs");
			return (Criteria) this;
		}

		public Criteria andDeviceOsLike(String value) {
			addCriterion("device_os like", value, "deviceOs");
			return (Criteria) this;
		}

		public Criteria andDeviceOsNotLike(String value) {
			addCriterion("device_os not like", value, "deviceOs");
			return (Criteria) this;
		}

		public Criteria andDeviceOsIn(List<String> values) {
			addCriterion("device_os in", values, "deviceOs");
			return (Criteria) this;
		}

		public Criteria andDeviceOsNotIn(List<String> values) {
			addCriterion("device_os not in", values, "deviceOs");
			return (Criteria) this;
		}

		public Criteria andDeviceOsBetween(String value1, String value2) {
			addCriterion("device_os between", value1, value2, "deviceOs");
			return (Criteria) this;
		}

		public Criteria andDeviceOsNotBetween(String value1, String value2) {
			addCriterion("device_os not between", value1, value2, "deviceOs");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagIsNull() {
			addCriterion("device_flag is null");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagIsNotNull() {
			addCriterion("device_flag is not null");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagEqualTo(String value) {
			addCriterion("device_flag =", value, "deviceFlag");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagNotEqualTo(String value) {
			addCriterion("device_flag <>", value, "deviceFlag");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagGreaterThan(String value) {
			addCriterion("device_flag >", value, "deviceFlag");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagGreaterThanOrEqualTo(String value) {
			addCriterion("device_flag >=", value, "deviceFlag");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagLessThan(String value) {
			addCriterion("device_flag <", value, "deviceFlag");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagLessThanOrEqualTo(String value) {
			addCriterion("device_flag <=", value, "deviceFlag");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagLike(String value) {
			addCriterion("device_flag like", value, "deviceFlag");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagNotLike(String value) {
			addCriterion("device_flag not like", value, "deviceFlag");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagIn(List<String> values) {
			addCriterion("device_flag in", values, "deviceFlag");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagNotIn(List<String> values) {
			addCriterion("device_flag not in", values, "deviceFlag");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagBetween(String value1, String value2) {
			addCriterion("device_flag between", value1, value2, "deviceFlag");
			return (Criteria) this;
		}

		public Criteria andDeviceFlagNotBetween(String value1, String value2) {
			addCriterion("device_flag not between", value1, value2,
					"deviceFlag");
			return (Criteria) this;
		}

		public Criteria andAuthStatIsNull() {
			addCriterion("auth_stat is null");
			return (Criteria) this;
		}

		public Criteria andAuthStatIsNotNull() {
			addCriterion("auth_stat is not null");
			return (Criteria) this;
		}

		public Criteria andAuthStatEqualTo(String value) {
			addCriterion("auth_stat =", value, "authStat");
			return (Criteria) this;
		}

		public Criteria andAuthStatNotEqualTo(String value) {
			addCriterion("auth_stat <>", value, "authStat");
			return (Criteria) this;
		}

		public Criteria andAuthStatGreaterThan(String value) {
			addCriterion("auth_stat >", value, "authStat");
			return (Criteria) this;
		}

		public Criteria andAuthStatGreaterThanOrEqualTo(String value) {
			addCriterion("auth_stat >=", value, "authStat");
			return (Criteria) this;
		}

		public Criteria andAuthStatLessThan(String value) {
			addCriterion("auth_stat <", value, "authStat");
			return (Criteria) this;
		}

		public Criteria andAuthStatLessThanOrEqualTo(String value) {
			addCriterion("auth_stat <=", value, "authStat");
			return (Criteria) this;
		}

		public Criteria andAuthStatLike(String value) {
			addCriterion("auth_stat like", value, "authStat");
			return (Criteria) this;
		}

		public Criteria andAuthStatNotLike(String value) {
			addCriterion("auth_stat not like", value, "authStat");
			return (Criteria) this;
		}

		public Criteria andAuthStatIn(List<String> values) {
			addCriterion("auth_stat in", values, "authStat");
			return (Criteria) this;
		}

		public Criteria andAuthStatNotIn(List<String> values) {
			addCriterion("auth_stat not in", values, "authStat");
			return (Criteria) this;
		}

		public Criteria andAuthStatBetween(String value1, String value2) {
			addCriterion("auth_stat between", value1, value2, "authStat");
			return (Criteria) this;
		}

		public Criteria andAuthStatNotBetween(String value1, String value2) {
			addCriterion("auth_stat not between", value1, value2, "authStat");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeIsNull() {
			addCriterion("device_purpose is null");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeIsNotNull() {
			addCriterion("device_purpose is not null");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeEqualTo(String value) {
			addCriterion("device_purpose =", value, "devicePurpose");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeNotEqualTo(String value) {
			addCriterion("device_purpose <>", value, "devicePurpose");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeGreaterThan(String value) {
			addCriterion("device_purpose >", value, "devicePurpose");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeGreaterThanOrEqualTo(String value) {
			addCriterion("device_purpose >=", value, "devicePurpose");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeLessThan(String value) {
			addCriterion("device_purpose <", value, "devicePurpose");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeLessThanOrEqualTo(String value) {
			addCriterion("device_purpose <=", value, "devicePurpose");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeLike(String value) {
			addCriterion("device_purpose like", value, "devicePurpose");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeNotLike(String value) {
			addCriterion("device_purpose not like", value, "devicePurpose");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeIn(List<String> values) {
			addCriterion("device_purpose in", values, "devicePurpose");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeNotIn(List<String> values) {
			addCriterion("device_purpose not in", values, "devicePurpose");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeBetween(String value1, String value2) {
			addCriterion("device_purpose between", value1, value2,
					"devicePurpose");
			return (Criteria) this;
		}

		public Criteria andDevicePurposeNotBetween(String value1, String value2) {
			addCriterion("device_purpose not between", value1, value2,
					"devicePurpose");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table device
	 * @mbggenerated  Mon Aug 24 17:15:41 CST 2015
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
     * This class corresponds to the database table device
     *
     * @mbggenerated do_not_delete_during_merge Wed Jul 29 14:45:13 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}