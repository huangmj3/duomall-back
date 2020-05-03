package com.huangmaojie.duomall.order.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpikeGoodsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    public SpikeGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andSpikeHoursIsNull() {
            addCriterion("spike_hours is null");
            return (Criteria) this;
        }

        public Criteria andSpikeHoursIsNotNull() {
            addCriterion("spike_hours is not null");
            return (Criteria) this;
        }

        public Criteria andSpikeHoursEqualTo(Integer value) {
            addCriterion("spike_hours =", value, "spikeHours");
            return (Criteria) this;
        }

        public Criteria andSpikeHoursNotEqualTo(Integer value) {
            addCriterion("spike_hours <>", value, "spikeHours");
            return (Criteria) this;
        }

        public Criteria andSpikeHoursGreaterThan(Integer value) {
            addCriterion("spike_hours >", value, "spikeHours");
            return (Criteria) this;
        }

        public Criteria andSpikeHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("spike_hours >=", value, "spikeHours");
            return (Criteria) this;
        }

        public Criteria andSpikeHoursLessThan(Integer value) {
            addCriterion("spike_hours <", value, "spikeHours");
            return (Criteria) this;
        }

        public Criteria andSpikeHoursLessThanOrEqualTo(Integer value) {
            addCriterion("spike_hours <=", value, "spikeHours");
            return (Criteria) this;
        }

        public Criteria andSpikeHoursIn(List<Integer> values) {
            addCriterion("spike_hours in", values, "spikeHours");
            return (Criteria) this;
        }

        public Criteria andSpikeHoursNotIn(List<Integer> values) {
            addCriterion("spike_hours not in", values, "spikeHours");
            return (Criteria) this;
        }

        public Criteria andSpikeHoursBetween(Integer value1, Integer value2) {
            addCriterion("spike_hours between", value1, value2, "spikeHours");
            return (Criteria) this;
        }

        public Criteria andSpikeHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("spike_hours not between", value1, value2, "spikeHours");
            return (Criteria) this;
        }

        public Criteria andSpikeMinutesIsNull() {
            addCriterion("spike_minutes is null");
            return (Criteria) this;
        }

        public Criteria andSpikeMinutesIsNotNull() {
            addCriterion("spike_minutes is not null");
            return (Criteria) this;
        }

        public Criteria andSpikeMinutesEqualTo(Integer value) {
            addCriterion("spike_minutes =", value, "spikeMinutes");
            return (Criteria) this;
        }

        public Criteria andSpikeMinutesNotEqualTo(Integer value) {
            addCriterion("spike_minutes <>", value, "spikeMinutes");
            return (Criteria) this;
        }

        public Criteria andSpikeMinutesGreaterThan(Integer value) {
            addCriterion("spike_minutes >", value, "spikeMinutes");
            return (Criteria) this;
        }

        public Criteria andSpikeMinutesGreaterThanOrEqualTo(Integer value) {
            addCriterion("spike_minutes >=", value, "spikeMinutes");
            return (Criteria) this;
        }

        public Criteria andSpikeMinutesLessThan(Integer value) {
            addCriterion("spike_minutes <", value, "spikeMinutes");
            return (Criteria) this;
        }

        public Criteria andSpikeMinutesLessThanOrEqualTo(Integer value) {
            addCriterion("spike_minutes <=", value, "spikeMinutes");
            return (Criteria) this;
        }

        public Criteria andSpikeMinutesIn(List<Integer> values) {
            addCriterion("spike_minutes in", values, "spikeMinutes");
            return (Criteria) this;
        }

        public Criteria andSpikeMinutesNotIn(List<Integer> values) {
            addCriterion("spike_minutes not in", values, "spikeMinutes");
            return (Criteria) this;
        }

        public Criteria andSpikeMinutesBetween(Integer value1, Integer value2) {
            addCriterion("spike_minutes between", value1, value2, "spikeMinutes");
            return (Criteria) this;
        }

        public Criteria andSpikeMinutesNotBetween(Integer value1, Integer value2) {
            addCriterion("spike_minutes not between", value1, value2, "spikeMinutes");
            return (Criteria) this;
        }

        public Criteria andSpikeSecondsIsNull() {
            addCriterion("spike_seconds is null");
            return (Criteria) this;
        }

        public Criteria andSpikeSecondsIsNotNull() {
            addCriterion("spike_seconds is not null");
            return (Criteria) this;
        }

        public Criteria andSpikeSecondsEqualTo(Integer value) {
            addCriterion("spike_seconds =", value, "spikeSeconds");
            return (Criteria) this;
        }

        public Criteria andSpikeSecondsNotEqualTo(Integer value) {
            addCriterion("spike_seconds <>", value, "spikeSeconds");
            return (Criteria) this;
        }

        public Criteria andSpikeSecondsGreaterThan(Integer value) {
            addCriterion("spike_seconds >", value, "spikeSeconds");
            return (Criteria) this;
        }

        public Criteria andSpikeSecondsGreaterThanOrEqualTo(Integer value) {
            addCriterion("spike_seconds >=", value, "spikeSeconds");
            return (Criteria) this;
        }

        public Criteria andSpikeSecondsLessThan(Integer value) {
            addCriterion("spike_seconds <", value, "spikeSeconds");
            return (Criteria) this;
        }

        public Criteria andSpikeSecondsLessThanOrEqualTo(Integer value) {
            addCriterion("spike_seconds <=", value, "spikeSeconds");
            return (Criteria) this;
        }

        public Criteria andSpikeSecondsIn(List<Integer> values) {
            addCriterion("spike_seconds in", values, "spikeSeconds");
            return (Criteria) this;
        }

        public Criteria andSpikeSecondsNotIn(List<Integer> values) {
            addCriterion("spike_seconds not in", values, "spikeSeconds");
            return (Criteria) this;
        }

        public Criteria andSpikeSecondsBetween(Integer value1, Integer value2) {
            addCriterion("spike_seconds between", value1, value2, "spikeSeconds");
            return (Criteria) this;
        }

        public Criteria andSpikeSecondsNotBetween(Integer value1, Integer value2) {
            addCriterion("spike_seconds not between", value1, value2, "spikeSeconds");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table spike_goods
     *
     * @mbg.generated do_not_delete_during_merge Sun May 03 11:29:26 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:26 CST 2020
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
}