package com.whty.cms.tspm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TokenOperationHisExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	public TokenOperationHisExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
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

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andOperationTimeIsNull() {
			addCriterion("OPERATION_TIME is null");
			return (Criteria) this;
		}

		public Criteria andOperationTimeIsNotNull() {
			addCriterion("OPERATION_TIME is not null");
			return (Criteria) this;
		}

		public Criteria andOperationTimeEqualTo(Date value) {
			addCriterion("OPERATION_TIME =", value, "operationTime");
			return (Criteria) this;
		}

		public Criteria andOperationTimeNotEqualTo(Date value) {
			addCriterion("OPERATION_TIME <>", value, "operationTime");
			return (Criteria) this;
		}

		public Criteria andOperationTimeGreaterThan(Date value) {
			addCriterion("OPERATION_TIME >", value, "operationTime");
			return (Criteria) this;
		}

		public Criteria andOperationTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("OPERATION_TIME >=", value, "operationTime");
			return (Criteria) this;
		}

		public Criteria andOperationTimeLessThan(Date value) {
			addCriterion("OPERATION_TIME <", value, "operationTime");
			return (Criteria) this;
		}

		public Criteria andOperationTimeLessThanOrEqualTo(Date value) {
			addCriterion("OPERATION_TIME <=", value, "operationTime");
			return (Criteria) this;
		}

		public Criteria andOperationTimeIn(List<Date> values) {
			addCriterion("OPERATION_TIME in", values, "operationTime");
			return (Criteria) this;
		}

		public Criteria andOperationTimeNotIn(List<Date> values) {
			addCriterion("OPERATION_TIME not in", values, "operationTime");
			return (Criteria) this;
		}

		public Criteria andOperationTimeBetween(Date value1, Date value2) {
			addCriterion("OPERATION_TIME between", value1, value2, "operationTime");
			return (Criteria) this;
		}

		public Criteria andOperationTimeNotBetween(Date value1, Date value2) {
			addCriterion("OPERATION_TIME not between", value1, value2, "operationTime");
			return (Criteria) this;
		}

		public Criteria andTokenIdIsNull() {
			addCriterion("TOKEN_ID is null");
			return (Criteria) this;
		}

		public Criteria andTokenIdIsNotNull() {
			addCriterion("TOKEN_ID is not null");
			return (Criteria) this;
		}

		public Criteria andTokenIdEqualTo(String value) {
			addCriterion("TOKEN_ID =", value, "tokenId");
			return (Criteria) this;
		}

		public Criteria andTokenIdNotEqualTo(String value) {
			addCriterion("TOKEN_ID <>", value, "tokenId");
			return (Criteria) this;
		}

		public Criteria andTokenIdGreaterThan(String value) {
			addCriterion("TOKEN_ID >", value, "tokenId");
			return (Criteria) this;
		}

		public Criteria andTokenIdGreaterThanOrEqualTo(String value) {
			addCriterion("TOKEN_ID >=", value, "tokenId");
			return (Criteria) this;
		}

		public Criteria andTokenIdLessThan(String value) {
			addCriterion("TOKEN_ID <", value, "tokenId");
			return (Criteria) this;
		}

		public Criteria andTokenIdLessThanOrEqualTo(String value) {
			addCriterion("TOKEN_ID <=", value, "tokenId");
			return (Criteria) this;
		}

		public Criteria andTokenIdLike(String value) {
			addCriterion("TOKEN_ID like", value, "tokenId");
			return (Criteria) this;
		}

		public Criteria andTokenIdNotLike(String value) {
			addCriterion("TOKEN_ID not like", value, "tokenId");
			return (Criteria) this;
		}

		public Criteria andTokenIdIn(List<String> values) {
			addCriterion("TOKEN_ID in", values, "tokenId");
			return (Criteria) this;
		}

		public Criteria andTokenIdNotIn(List<String> values) {
			addCriterion("TOKEN_ID not in", values, "tokenId");
			return (Criteria) this;
		}

		public Criteria andTokenIdBetween(String value1, String value2) {
			addCriterion("TOKEN_ID between", value1, value2, "tokenId");
			return (Criteria) this;
		}

		public Criteria andTokenIdNotBetween(String value1, String value2) {
			addCriterion("TOKEN_ID not between", value1, value2, "tokenId");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeIsNull() {
			addCriterion("TR_OPERATION_TYPE is null");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeIsNotNull() {
			addCriterion("TR_OPERATION_TYPE is not null");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeEqualTo(String value) {
			addCriterion("TR_OPERATION_TYPE =", value, "trOperationType");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeNotEqualTo(String value) {
			addCriterion("TR_OPERATION_TYPE <>", value, "trOperationType");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeGreaterThan(String value) {
			addCriterion("TR_OPERATION_TYPE >", value, "trOperationType");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeGreaterThanOrEqualTo(String value) {
			addCriterion("TR_OPERATION_TYPE >=", value, "trOperationType");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeLessThan(String value) {
			addCriterion("TR_OPERATION_TYPE <", value, "trOperationType");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeLessThanOrEqualTo(String value) {
			addCriterion("TR_OPERATION_TYPE <=", value, "trOperationType");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeLike(String value) {
			addCriterion("TR_OPERATION_TYPE like", value, "trOperationType");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeNotLike(String value) {
			addCriterion("TR_OPERATION_TYPE not like", value, "trOperationType");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeIn(List<String> values) {
			addCriterion("TR_OPERATION_TYPE in", values, "trOperationType");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeNotIn(List<String> values) {
			addCriterion("TR_OPERATION_TYPE not in", values, "trOperationType");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeBetween(String value1, String value2) {
			addCriterion("TR_OPERATION_TYPE between", value1, value2, "trOperationType");
			return (Criteria) this;
		}

		public Criteria andTrOperationTypeNotBetween(String value1, String value2) {
			addCriterion("TR_OPERATION_TYPE not between", value1, value2, "trOperationType");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table TOKEN_OPERATION_HIS
	 * @mbggenerated  Mon Jun 08 10:17:37 CST 2015
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

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
     * This class corresponds to the database table TOKEN_OPERATION_HIS
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 04 09:32:20 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}