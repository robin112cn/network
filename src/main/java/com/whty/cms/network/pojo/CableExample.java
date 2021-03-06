package com.whty.cms.network.pojo;

import java.util.ArrayList;
import java.util.List;

public class CableExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public CableExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
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

		public Criteria andCableIdIsNull() {
			addCriterion("cable_id is null");
			return (Criteria) this;
		}

		public Criteria andCableIdIsNotNull() {
			addCriterion("cable_id is not null");
			return (Criteria) this;
		}

		public Criteria andCableIdEqualTo(String value) {
			addCriterion("cable_id =", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdNotEqualTo(String value) {
			addCriterion("cable_id <>", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdGreaterThan(String value) {
			addCriterion("cable_id >", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdGreaterThanOrEqualTo(String value) {
			addCriterion("cable_id >=", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdLessThan(String value) {
			addCriterion("cable_id <", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdLessThanOrEqualTo(String value) {
			addCriterion("cable_id <=", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdLike(String value) {
			addCriterion("cable_id like", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdNotLike(String value) {
			addCriterion("cable_id not like", value, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdIn(List<String> values) {
			addCriterion("cable_id in", values, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdNotIn(List<String> values) {
			addCriterion("cable_id not in", values, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdBetween(String value1, String value2) {
			addCriterion("cable_id between", value1, value2, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableIdNotBetween(String value1, String value2) {
			addCriterion("cable_id not between", value1, value2, "cableId");
			return (Criteria) this;
		}

		public Criteria andCableNameIsNull() {
			addCriterion("cable_name is null");
			return (Criteria) this;
		}

		public Criteria andCableNameIsNotNull() {
			addCriterion("cable_name is not null");
			return (Criteria) this;
		}

		public Criteria andCableNameEqualTo(String value) {
			addCriterion("cable_name =", value, "cableName");
			return (Criteria) this;
		}

		public Criteria andCableNameNotEqualTo(String value) {
			addCriterion("cable_name <>", value, "cableName");
			return (Criteria) this;
		}

		public Criteria andCableNameGreaterThan(String value) {
			addCriterion("cable_name >", value, "cableName");
			return (Criteria) this;
		}

		public Criteria andCableNameGreaterThanOrEqualTo(String value) {
			addCriterion("cable_name >=", value, "cableName");
			return (Criteria) this;
		}

		public Criteria andCableNameLessThan(String value) {
			addCriterion("cable_name <", value, "cableName");
			return (Criteria) this;
		}

		public Criteria andCableNameLessThanOrEqualTo(String value) {
			addCriterion("cable_name <=", value, "cableName");
			return (Criteria) this;
		}

		public Criteria andCableNameLike(String value) {
			addCriterion("cable_name like", value, "cableName");
			return (Criteria) this;
		}

		public Criteria andCableNameNotLike(String value) {
			addCriterion("cable_name not like", value, "cableName");
			return (Criteria) this;
		}

		public Criteria andCableNameIn(List<String> values) {
			addCriterion("cable_name in", values, "cableName");
			return (Criteria) this;
		}

		public Criteria andCableNameNotIn(List<String> values) {
			addCriterion("cable_name not in", values, "cableName");
			return (Criteria) this;
		}

		public Criteria andCableNameBetween(String value1, String value2) {
			addCriterion("cable_name between", value1, value2, "cableName");
			return (Criteria) this;
		}

		public Criteria andCableNameNotBetween(String value1, String value2) {
			addCriterion("cable_name not between", value1, value2, "cableName");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdIsNull() {
			addCriterion("switch_port__id is null");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdIsNotNull() {
			addCriterion("switch_port__id is not null");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdEqualTo(String value) {
			addCriterion("switch_port__id =", value, "switchPortId");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdNotEqualTo(String value) {
			addCriterion("switch_port__id <>", value, "switchPortId");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdGreaterThan(String value) {
			addCriterion("switch_port__id >", value, "switchPortId");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdGreaterThanOrEqualTo(String value) {
			addCriterion("switch_port__id >=", value, "switchPortId");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdLessThan(String value) {
			addCriterion("switch_port__id <", value, "switchPortId");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdLessThanOrEqualTo(String value) {
			addCriterion("switch_port__id <=", value, "switchPortId");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdLike(String value) {
			addCriterion("switch_port__id like", value, "switchPortId");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdNotLike(String value) {
			addCriterion("switch_port__id not like", value, "switchPortId");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdIn(List<String> values) {
			addCriterion("switch_port__id in", values, "switchPortId");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdNotIn(List<String> values) {
			addCriterion("switch_port__id not in", values, "switchPortId");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdBetween(String value1, String value2) {
			addCriterion("switch_port__id between", value1, value2,
					"switchPortId");
			return (Criteria) this;
		}

		public Criteria andSwitchPortIdNotBetween(String value1, String value2) {
			addCriterion("switch_port__id not between", value1, value2,
					"switchPortId");
			return (Criteria) this;
		}

		public Criteria andIsUseIsNull() {
			addCriterion("is_use is null");
			return (Criteria) this;
		}

		public Criteria andIsUseIsNotNull() {
			addCriterion("is_use is not null");
			return (Criteria) this;
		}

		public Criteria andIsUseEqualTo(String value) {
			addCriterion("is_use =", value, "isUse");
			return (Criteria) this;
		}

		public Criteria andIsUseNotEqualTo(String value) {
			addCriterion("is_use <>", value, "isUse");
			return (Criteria) this;
		}

		public Criteria andIsUseGreaterThan(String value) {
			addCriterion("is_use >", value, "isUse");
			return (Criteria) this;
		}

		public Criteria andIsUseGreaterThanOrEqualTo(String value) {
			addCriterion("is_use >=", value, "isUse");
			return (Criteria) this;
		}

		public Criteria andIsUseLessThan(String value) {
			addCriterion("is_use <", value, "isUse");
			return (Criteria) this;
		}

		public Criteria andIsUseLessThanOrEqualTo(String value) {
			addCriterion("is_use <=", value, "isUse");
			return (Criteria) this;
		}

		public Criteria andIsUseLike(String value) {
			addCriterion("is_use like", value, "isUse");
			return (Criteria) this;
		}

		public Criteria andIsUseNotLike(String value) {
			addCriterion("is_use not like", value, "isUse");
			return (Criteria) this;
		}

		public Criteria andIsUseIn(List<String> values) {
			addCriterion("is_use in", values, "isUse");
			return (Criteria) this;
		}

		public Criteria andIsUseNotIn(List<String> values) {
			addCriterion("is_use not in", values, "isUse");
			return (Criteria) this;
		}

		public Criteria andIsUseBetween(String value1, String value2) {
			addCriterion("is_use between", value1, value2, "isUse");
			return (Criteria) this;
		}

		public Criteria andIsUseNotBetween(String value1, String value2) {
			addCriterion("is_use not between", value1, value2, "isUse");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table cable
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
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
     * This class corresponds to the database table cable
     *
     * @mbggenerated do_not_delete_during_merge Wed Jul 29 14:45:13 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}