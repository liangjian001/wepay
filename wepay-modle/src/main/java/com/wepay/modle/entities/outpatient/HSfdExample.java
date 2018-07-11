package com.wepay.modle.entities.outpatient;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HSfdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HSfdExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andDjhIsNull() {
            addCriterion("djh is null");
            return (Criteria) this;
        }

        public Criteria andDjhIsNotNull() {
            addCriterion("djh is not null");
            return (Criteria) this;
        }

        public Criteria andDjhEqualTo(String value) {
            addCriterion("djh =", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhNotEqualTo(String value) {
            addCriterion("djh <>", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhGreaterThan(String value) {
            addCriterion("djh >", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhGreaterThanOrEqualTo(String value) {
            addCriterion("djh >=", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhLessThan(String value) {
            addCriterion("djh <", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhLessThanOrEqualTo(String value) {
            addCriterion("djh <=", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhLike(String value) {
            addCriterion("djh like", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhNotLike(String value) {
            addCriterion("djh not like", value, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhIn(List<String> values) {
            addCriterion("djh in", values, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhNotIn(List<String> values) {
            addCriterion("djh not in", values, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhBetween(String value1, String value2) {
            addCriterion("djh between", value1, value2, "djh");
            return (Criteria) this;
        }

        public Criteria andDjhNotBetween(String value1, String value2) {
            addCriterion("djh not between", value1, value2, "djh");
            return (Criteria) this;
        }

        public Criteria andDjh0IsNull() {
            addCriterion("djh0 is null");
            return (Criteria) this;
        }

        public Criteria andDjh0IsNotNull() {
            addCriterion("djh0 is not null");
            return (Criteria) this;
        }

        public Criteria andDjh0EqualTo(String value) {
            addCriterion("djh0 =", value, "djh0");
            return (Criteria) this;
        }

        public Criteria andDjh0NotEqualTo(String value) {
            addCriterion("djh0 <>", value, "djh0");
            return (Criteria) this;
        }

        public Criteria andDjh0GreaterThan(String value) {
            addCriterion("djh0 >", value, "djh0");
            return (Criteria) this;
        }

        public Criteria andDjh0GreaterThanOrEqualTo(String value) {
            addCriterion("djh0 >=", value, "djh0");
            return (Criteria) this;
        }

        public Criteria andDjh0LessThan(String value) {
            addCriterion("djh0 <", value, "djh0");
            return (Criteria) this;
        }

        public Criteria andDjh0LessThanOrEqualTo(String value) {
            addCriterion("djh0 <=", value, "djh0");
            return (Criteria) this;
        }

        public Criteria andDjh0Like(String value) {
            addCriterion("djh0 like", value, "djh0");
            return (Criteria) this;
        }

        public Criteria andDjh0NotLike(String value) {
            addCriterion("djh0 not like", value, "djh0");
            return (Criteria) this;
        }

        public Criteria andDjh0In(List<String> values) {
            addCriterion("djh0 in", values, "djh0");
            return (Criteria) this;
        }

        public Criteria andDjh0NotIn(List<String> values) {
            addCriterion("djh0 not in", values, "djh0");
            return (Criteria) this;
        }

        public Criteria andDjh0Between(String value1, String value2) {
            addCriterion("djh0 between", value1, value2, "djh0");
            return (Criteria) this;
        }

        public Criteria andDjh0NotBetween(String value1, String value2) {
            addCriterion("djh0 not between", value1, value2, "djh0");
            return (Criteria) this;
        }

        public Criteria andYwlxIsNull() {
            addCriterion("ywlx is null");
            return (Criteria) this;
        }

        public Criteria andYwlxIsNotNull() {
            addCriterion("ywlx is not null");
            return (Criteria) this;
        }

        public Criteria andYwlxEqualTo(String value) {
            addCriterion("ywlx =", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotEqualTo(String value) {
            addCriterion("ywlx <>", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxGreaterThan(String value) {
            addCriterion("ywlx >", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxGreaterThanOrEqualTo(String value) {
            addCriterion("ywlx >=", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxLessThan(String value) {
            addCriterion("ywlx <", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxLessThanOrEqualTo(String value) {
            addCriterion("ywlx <=", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxLike(String value) {
            addCriterion("ywlx like", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotLike(String value) {
            addCriterion("ywlx not like", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxIn(List<String> values) {
            addCriterion("ywlx in", values, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotIn(List<String> values) {
            addCriterion("ywlx not in", values, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxBetween(String value1, String value2) {
            addCriterion("ywlx between", value1, value2, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotBetween(String value1, String value2) {
            addCriterion("ywlx not between", value1, value2, "ywlx");
            return (Criteria) this;
        }

        public Criteria andRqIsNull() {
            addCriterion("rq is null");
            return (Criteria) this;
        }

        public Criteria andRqIsNotNull() {
            addCriterion("rq is not null");
            return (Criteria) this;
        }

        public Criteria andRqEqualTo(Date value) {
            addCriterion("rq =", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotEqualTo(Date value) {
            addCriterion("rq <>", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqGreaterThan(Date value) {
            addCriterion("rq >", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqGreaterThanOrEqualTo(Date value) {
            addCriterion("rq >=", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqLessThan(Date value) {
            addCriterion("rq <", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqLessThanOrEqualTo(Date value) {
            addCriterion("rq <=", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqIn(List<Date> values) {
            addCriterion("rq in", values, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotIn(List<Date> values) {
            addCriterion("rq not in", values, "rq");
            return (Criteria) this;
        }

        public Criteria andRqBetween(Date value1, Date value2) {
            addCriterion("rq between", value1, value2, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotBetween(Date value1, Date value2) {
            addCriterion("rq not between", value1, value2, "rq");
            return (Criteria) this;
        }

        public Criteria andGhdIdIsNull() {
            addCriterion("ghd_id is null");
            return (Criteria) this;
        }

        public Criteria andGhdIdIsNotNull() {
            addCriterion("ghd_id is not null");
            return (Criteria) this;
        }

        public Criteria andGhdIdEqualTo(String value) {
            addCriterion("ghd_id =", value, "ghdId");
            return (Criteria) this;
        }

        public Criteria andGhdIdNotEqualTo(String value) {
            addCriterion("ghd_id <>", value, "ghdId");
            return (Criteria) this;
        }

        public Criteria andGhdIdGreaterThan(String value) {
            addCriterion("ghd_id >", value, "ghdId");
            return (Criteria) this;
        }

        public Criteria andGhdIdGreaterThanOrEqualTo(String value) {
            addCriterion("ghd_id >=", value, "ghdId");
            return (Criteria) this;
        }

        public Criteria andGhdIdLessThan(String value) {
            addCriterion("ghd_id <", value, "ghdId");
            return (Criteria) this;
        }

        public Criteria andGhdIdLessThanOrEqualTo(String value) {
            addCriterion("ghd_id <=", value, "ghdId");
            return (Criteria) this;
        }

        public Criteria andGhdIdLike(String value) {
            addCriterion("ghd_id like", value, "ghdId");
            return (Criteria) this;
        }

        public Criteria andGhdIdNotLike(String value) {
            addCriterion("ghd_id not like", value, "ghdId");
            return (Criteria) this;
        }

        public Criteria andGhdIdIn(List<String> values) {
            addCriterion("ghd_id in", values, "ghdId");
            return (Criteria) this;
        }

        public Criteria andGhdIdNotIn(List<String> values) {
            addCriterion("ghd_id not in", values, "ghdId");
            return (Criteria) this;
        }

        public Criteria andGhdIdBetween(String value1, String value2) {
            addCriterion("ghd_id between", value1, value2, "ghdId");
            return (Criteria) this;
        }

        public Criteria andGhdIdNotBetween(String value1, String value2) {
            addCriterion("ghd_id not between", value1, value2, "ghdId");
            return (Criteria) this;
        }

        public Criteria andJsfsdmIsNull() {
            addCriterion("jsfsdm is null");
            return (Criteria) this;
        }

        public Criteria andJsfsdmIsNotNull() {
            addCriterion("jsfsdm is not null");
            return (Criteria) this;
        }

        public Criteria andJsfsdmEqualTo(String value) {
            addCriterion("jsfsdm =", value, "jsfsdm");
            return (Criteria) this;
        }

        public Criteria andJsfsdmNotEqualTo(String value) {
            addCriterion("jsfsdm <>", value, "jsfsdm");
            return (Criteria) this;
        }

        public Criteria andJsfsdmGreaterThan(String value) {
            addCriterion("jsfsdm >", value, "jsfsdm");
            return (Criteria) this;
        }

        public Criteria andJsfsdmGreaterThanOrEqualTo(String value) {
            addCriterion("jsfsdm >=", value, "jsfsdm");
            return (Criteria) this;
        }

        public Criteria andJsfsdmLessThan(String value) {
            addCriterion("jsfsdm <", value, "jsfsdm");
            return (Criteria) this;
        }

        public Criteria andJsfsdmLessThanOrEqualTo(String value) {
            addCriterion("jsfsdm <=", value, "jsfsdm");
            return (Criteria) this;
        }

        public Criteria andJsfsdmLike(String value) {
            addCriterion("jsfsdm like", value, "jsfsdm");
            return (Criteria) this;
        }

        public Criteria andJsfsdmNotLike(String value) {
            addCriterion("jsfsdm not like", value, "jsfsdm");
            return (Criteria) this;
        }

        public Criteria andJsfsdmIn(List<String> values) {
            addCriterion("jsfsdm in", values, "jsfsdm");
            return (Criteria) this;
        }

        public Criteria andJsfsdmNotIn(List<String> values) {
            addCriterion("jsfsdm not in", values, "jsfsdm");
            return (Criteria) this;
        }

        public Criteria andJsfsdmBetween(String value1, String value2) {
            addCriterion("jsfsdm between", value1, value2, "jsfsdm");
            return (Criteria) this;
        }

        public Criteria andJsfsdmNotBetween(String value1, String value2) {
            addCriterion("jsfsdm not between", value1, value2, "jsfsdm");
            return (Criteria) this;
        }

        public Criteria andKsIdIsNull() {
            addCriterion("ks_id is null");
            return (Criteria) this;
        }

        public Criteria andKsIdIsNotNull() {
            addCriterion("ks_id is not null");
            return (Criteria) this;
        }

        public Criteria andKsIdEqualTo(String value) {
            addCriterion("ks_id =", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdNotEqualTo(String value) {
            addCriterion("ks_id <>", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdGreaterThan(String value) {
            addCriterion("ks_id >", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ks_id >=", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdLessThan(String value) {
            addCriterion("ks_id <", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdLessThanOrEqualTo(String value) {
            addCriterion("ks_id <=", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdLike(String value) {
            addCriterion("ks_id like", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdNotLike(String value) {
            addCriterion("ks_id not like", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdIn(List<String> values) {
            addCriterion("ks_id in", values, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdNotIn(List<String> values) {
            addCriterion("ks_id not in", values, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdBetween(String value1, String value2) {
            addCriterion("ks_id between", value1, value2, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdNotBetween(String value1, String value2) {
            addCriterion("ks_id not between", value1, value2, "ksId");
            return (Criteria) this;
        }

        public Criteria andYsIdIsNull() {
            addCriterion("ys_id is null");
            return (Criteria) this;
        }

        public Criteria andYsIdIsNotNull() {
            addCriterion("ys_id is not null");
            return (Criteria) this;
        }

        public Criteria andYsIdEqualTo(String value) {
            addCriterion("ys_id =", value, "ysId");
            return (Criteria) this;
        }

        public Criteria andYsIdNotEqualTo(String value) {
            addCriterion("ys_id <>", value, "ysId");
            return (Criteria) this;
        }

        public Criteria andYsIdGreaterThan(String value) {
            addCriterion("ys_id >", value, "ysId");
            return (Criteria) this;
        }

        public Criteria andYsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ys_id >=", value, "ysId");
            return (Criteria) this;
        }

        public Criteria andYsIdLessThan(String value) {
            addCriterion("ys_id <", value, "ysId");
            return (Criteria) this;
        }

        public Criteria andYsIdLessThanOrEqualTo(String value) {
            addCriterion("ys_id <=", value, "ysId");
            return (Criteria) this;
        }

        public Criteria andYsIdLike(String value) {
            addCriterion("ys_id like", value, "ysId");
            return (Criteria) this;
        }

        public Criteria andYsIdNotLike(String value) {
            addCriterion("ys_id not like", value, "ysId");
            return (Criteria) this;
        }

        public Criteria andYsIdIn(List<String> values) {
            addCriterion("ys_id in", values, "ysId");
            return (Criteria) this;
        }

        public Criteria andYsIdNotIn(List<String> values) {
            addCriterion("ys_id not in", values, "ysId");
            return (Criteria) this;
        }

        public Criteria andYsIdBetween(String value1, String value2) {
            addCriterion("ys_id between", value1, value2, "ysId");
            return (Criteria) this;
        }

        public Criteria andYsIdNotBetween(String value1, String value2) {
            addCriterion("ys_id not between", value1, value2, "ysId");
            return (Criteria) this;
        }

        public Criteria andJeIsNull() {
            addCriterion("je is null");
            return (Criteria) this;
        }

        public Criteria andJeIsNotNull() {
            addCriterion("je is not null");
            return (Criteria) this;
        }

        public Criteria andJeEqualTo(BigDecimal value) {
            addCriterion("je =", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotEqualTo(BigDecimal value) {
            addCriterion("je <>", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeGreaterThan(BigDecimal value) {
            addCriterion("je >", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("je >=", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeLessThan(BigDecimal value) {
            addCriterion("je <", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("je <=", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeIn(List<BigDecimal> values) {
            addCriterion("je in", values, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotIn(List<BigDecimal> values) {
            addCriterion("je not in", values, "je");
            return (Criteria) this;
        }

        public Criteria andJeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("je between", value1, value2, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("je not between", value1, value2, "je");
            return (Criteria) this;
        }

        public Criteria andZqzjeIsNull() {
            addCriterion("zqzje is null");
            return (Criteria) this;
        }

        public Criteria andZqzjeIsNotNull() {
            addCriterion("zqzje is not null");
            return (Criteria) this;
        }

        public Criteria andZqzjeEqualTo(BigDecimal value) {
            addCriterion("zqzje =", value, "zqzje");
            return (Criteria) this;
        }

        public Criteria andZqzjeNotEqualTo(BigDecimal value) {
            addCriterion("zqzje <>", value, "zqzje");
            return (Criteria) this;
        }

        public Criteria andZqzjeGreaterThan(BigDecimal value) {
            addCriterion("zqzje >", value, "zqzje");
            return (Criteria) this;
        }

        public Criteria andZqzjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zqzje >=", value, "zqzje");
            return (Criteria) this;
        }

        public Criteria andZqzjeLessThan(BigDecimal value) {
            addCriterion("zqzje <", value, "zqzje");
            return (Criteria) this;
        }

        public Criteria andZqzjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zqzje <=", value, "zqzje");
            return (Criteria) this;
        }

        public Criteria andZqzjeIn(List<BigDecimal> values) {
            addCriterion("zqzje in", values, "zqzje");
            return (Criteria) this;
        }

        public Criteria andZqzjeNotIn(List<BigDecimal> values) {
            addCriterion("zqzje not in", values, "zqzje");
            return (Criteria) this;
        }

        public Criteria andZqzjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zqzje between", value1, value2, "zqzje");
            return (Criteria) this;
        }

        public Criteria andZqzjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zqzje not between", value1, value2, "zqzje");
            return (Criteria) this;
        }

        public Criteria andSsjeIsNull() {
            addCriterion("ssje is null");
            return (Criteria) this;
        }

        public Criteria andSsjeIsNotNull() {
            addCriterion("ssje is not null");
            return (Criteria) this;
        }

        public Criteria andSsjeEqualTo(BigDecimal value) {
            addCriterion("ssje =", value, "ssje");
            return (Criteria) this;
        }

        public Criteria andSsjeNotEqualTo(BigDecimal value) {
            addCriterion("ssje <>", value, "ssje");
            return (Criteria) this;
        }

        public Criteria andSsjeGreaterThan(BigDecimal value) {
            addCriterion("ssje >", value, "ssje");
            return (Criteria) this;
        }

        public Criteria andSsjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ssje >=", value, "ssje");
            return (Criteria) this;
        }

        public Criteria andSsjeLessThan(BigDecimal value) {
            addCriterion("ssje <", value, "ssje");
            return (Criteria) this;
        }

        public Criteria andSsjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ssje <=", value, "ssje");
            return (Criteria) this;
        }

        public Criteria andSsjeIn(List<BigDecimal> values) {
            addCriterion("ssje in", values, "ssje");
            return (Criteria) this;
        }

        public Criteria andSsjeNotIn(List<BigDecimal> values) {
            addCriterion("ssje not in", values, "ssje");
            return (Criteria) this;
        }

        public Criteria andSsjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ssje between", value1, value2, "ssje");
            return (Criteria) this;
        }

        public Criteria andSsjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ssje not between", value1, value2, "ssje");
            return (Criteria) this;
        }

        public Criteria andSghjIsNull() {
            addCriterion("sghj is null");
            return (Criteria) this;
        }

        public Criteria andSghjIsNotNull() {
            addCriterion("sghj is not null");
            return (Criteria) this;
        }

        public Criteria andSghjEqualTo(String value) {
            addCriterion("sghj =", value, "sghj");
            return (Criteria) this;
        }

        public Criteria andSghjNotEqualTo(String value) {
            addCriterion("sghj <>", value, "sghj");
            return (Criteria) this;
        }

        public Criteria andSghjGreaterThan(String value) {
            addCriterion("sghj >", value, "sghj");
            return (Criteria) this;
        }

        public Criteria andSghjGreaterThanOrEqualTo(String value) {
            addCriterion("sghj >=", value, "sghj");
            return (Criteria) this;
        }

        public Criteria andSghjLessThan(String value) {
            addCriterion("sghj <", value, "sghj");
            return (Criteria) this;
        }

        public Criteria andSghjLessThanOrEqualTo(String value) {
            addCriterion("sghj <=", value, "sghj");
            return (Criteria) this;
        }

        public Criteria andSghjLike(String value) {
            addCriterion("sghj like", value, "sghj");
            return (Criteria) this;
        }

        public Criteria andSghjNotLike(String value) {
            addCriterion("sghj not like", value, "sghj");
            return (Criteria) this;
        }

        public Criteria andSghjIn(List<String> values) {
            addCriterion("sghj in", values, "sghj");
            return (Criteria) this;
        }

        public Criteria andSghjNotIn(List<String> values) {
            addCriterion("sghj not in", values, "sghj");
            return (Criteria) this;
        }

        public Criteria andSghjBetween(String value1, String value2) {
            addCriterion("sghj between", value1, value2, "sghj");
            return (Criteria) this;
        }

        public Criteria andSghjNotBetween(String value1, String value2) {
            addCriterion("sghj not between", value1, value2, "sghj");
            return (Criteria) this;
        }

        public Criteria andSfyIsNull() {
            addCriterion("sfy is null");
            return (Criteria) this;
        }

        public Criteria andSfyIsNotNull() {
            addCriterion("sfy is not null");
            return (Criteria) this;
        }

        public Criteria andSfyEqualTo(String value) {
            addCriterion("sfy =", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyNotEqualTo(String value) {
            addCriterion("sfy <>", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyGreaterThan(String value) {
            addCriterion("sfy >", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyGreaterThanOrEqualTo(String value) {
            addCriterion("sfy >=", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyLessThan(String value) {
            addCriterion("sfy <", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyLessThanOrEqualTo(String value) {
            addCriterion("sfy <=", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyLike(String value) {
            addCriterion("sfy like", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyNotLike(String value) {
            addCriterion("sfy not like", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyIn(List<String> values) {
            addCriterion("sfy in", values, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyNotIn(List<String> values) {
            addCriterion("sfy not in", values, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyBetween(String value1, String value2) {
            addCriterion("sfy between", value1, value2, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyNotBetween(String value1, String value2) {
            addCriterion("sfy not between", value1, value2, "sfy");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andFyyIsNull() {
            addCriterion("fyy is null");
            return (Criteria) this;
        }

        public Criteria andFyyIsNotNull() {
            addCriterion("fyy is not null");
            return (Criteria) this;
        }

        public Criteria andFyyEqualTo(String value) {
            addCriterion("fyy =", value, "fyy");
            return (Criteria) this;
        }

        public Criteria andFyyNotEqualTo(String value) {
            addCriterion("fyy <>", value, "fyy");
            return (Criteria) this;
        }

        public Criteria andFyyGreaterThan(String value) {
            addCriterion("fyy >", value, "fyy");
            return (Criteria) this;
        }

        public Criteria andFyyGreaterThanOrEqualTo(String value) {
            addCriterion("fyy >=", value, "fyy");
            return (Criteria) this;
        }

        public Criteria andFyyLessThan(String value) {
            addCriterion("fyy <", value, "fyy");
            return (Criteria) this;
        }

        public Criteria andFyyLessThanOrEqualTo(String value) {
            addCriterion("fyy <=", value, "fyy");
            return (Criteria) this;
        }

        public Criteria andFyyLike(String value) {
            addCriterion("fyy like", value, "fyy");
            return (Criteria) this;
        }

        public Criteria andFyyNotLike(String value) {
            addCriterion("fyy not like", value, "fyy");
            return (Criteria) this;
        }

        public Criteria andFyyIn(List<String> values) {
            addCriterion("fyy in", values, "fyy");
            return (Criteria) this;
        }

        public Criteria andFyyNotIn(List<String> values) {
            addCriterion("fyy not in", values, "fyy");
            return (Criteria) this;
        }

        public Criteria andFyyBetween(String value1, String value2) {
            addCriterion("fyy between", value1, value2, "fyy");
            return (Criteria) this;
        }

        public Criteria andFyyNotBetween(String value1, String value2) {
            addCriterion("fyy not between", value1, value2, "fyy");
            return (Criteria) this;
        }

        public Criteria andPyyIsNull() {
            addCriterion("pyy is null");
            return (Criteria) this;
        }

        public Criteria andPyyIsNotNull() {
            addCriterion("pyy is not null");
            return (Criteria) this;
        }

        public Criteria andPyyEqualTo(String value) {
            addCriterion("pyy =", value, "pyy");
            return (Criteria) this;
        }

        public Criteria andPyyNotEqualTo(String value) {
            addCriterion("pyy <>", value, "pyy");
            return (Criteria) this;
        }

        public Criteria andPyyGreaterThan(String value) {
            addCriterion("pyy >", value, "pyy");
            return (Criteria) this;
        }

        public Criteria andPyyGreaterThanOrEqualTo(String value) {
            addCriterion("pyy >=", value, "pyy");
            return (Criteria) this;
        }

        public Criteria andPyyLessThan(String value) {
            addCriterion("pyy <", value, "pyy");
            return (Criteria) this;
        }

        public Criteria andPyyLessThanOrEqualTo(String value) {
            addCriterion("pyy <=", value, "pyy");
            return (Criteria) this;
        }

        public Criteria andPyyLike(String value) {
            addCriterion("pyy like", value, "pyy");
            return (Criteria) this;
        }

        public Criteria andPyyNotLike(String value) {
            addCriterion("pyy not like", value, "pyy");
            return (Criteria) this;
        }

        public Criteria andPyyIn(List<String> values) {
            addCriterion("pyy in", values, "pyy");
            return (Criteria) this;
        }

        public Criteria andPyyNotIn(List<String> values) {
            addCriterion("pyy not in", values, "pyy");
            return (Criteria) this;
        }

        public Criteria andPyyBetween(String value1, String value2) {
            addCriterion("pyy between", value1, value2, "pyy");
            return (Criteria) this;
        }

        public Criteria andPyyNotBetween(String value1, String value2) {
            addCriterion("pyy not between", value1, value2, "pyy");
            return (Criteria) this;
        }

        public Criteria andTsbzbzIsNull() {
            addCriterion("tsbzbz is null");
            return (Criteria) this;
        }

        public Criteria andTsbzbzIsNotNull() {
            addCriterion("tsbzbz is not null");
            return (Criteria) this;
        }

        public Criteria andTsbzbzEqualTo(String value) {
            addCriterion("tsbzbz =", value, "tsbzbz");
            return (Criteria) this;
        }

        public Criteria andTsbzbzNotEqualTo(String value) {
            addCriterion("tsbzbz <>", value, "tsbzbz");
            return (Criteria) this;
        }

        public Criteria andTsbzbzGreaterThan(String value) {
            addCriterion("tsbzbz >", value, "tsbzbz");
            return (Criteria) this;
        }

        public Criteria andTsbzbzGreaterThanOrEqualTo(String value) {
            addCriterion("tsbzbz >=", value, "tsbzbz");
            return (Criteria) this;
        }

        public Criteria andTsbzbzLessThan(String value) {
            addCriterion("tsbzbz <", value, "tsbzbz");
            return (Criteria) this;
        }

        public Criteria andTsbzbzLessThanOrEqualTo(String value) {
            addCriterion("tsbzbz <=", value, "tsbzbz");
            return (Criteria) this;
        }

        public Criteria andTsbzbzLike(String value) {
            addCriterion("tsbzbz like", value, "tsbzbz");
            return (Criteria) this;
        }

        public Criteria andTsbzbzNotLike(String value) {
            addCriterion("tsbzbz not like", value, "tsbzbz");
            return (Criteria) this;
        }

        public Criteria andTsbzbzIn(List<String> values) {
            addCriterion("tsbzbz in", values, "tsbzbz");
            return (Criteria) this;
        }

        public Criteria andTsbzbzNotIn(List<String> values) {
            addCriterion("tsbzbz not in", values, "tsbzbz");
            return (Criteria) this;
        }

        public Criteria andTsbzbzBetween(String value1, String value2) {
            addCriterion("tsbzbz between", value1, value2, "tsbzbz");
            return (Criteria) this;
        }

        public Criteria andTsbzbzNotBetween(String value1, String value2) {
            addCriterion("tsbzbz not between", value1, value2, "tsbzbz");
            return (Criteria) this;
        }

        public Criteria andJlypJeIsNull() {
            addCriterion("jlyp_je is null");
            return (Criteria) this;
        }

        public Criteria andJlypJeIsNotNull() {
            addCriterion("jlyp_je is not null");
            return (Criteria) this;
        }

        public Criteria andJlypJeEqualTo(BigDecimal value) {
            addCriterion("jlyp_je =", value, "jlypJe");
            return (Criteria) this;
        }

        public Criteria andJlypJeNotEqualTo(BigDecimal value) {
            addCriterion("jlyp_je <>", value, "jlypJe");
            return (Criteria) this;
        }

        public Criteria andJlypJeGreaterThan(BigDecimal value) {
            addCriterion("jlyp_je >", value, "jlypJe");
            return (Criteria) this;
        }

        public Criteria andJlypJeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jlyp_je >=", value, "jlypJe");
            return (Criteria) this;
        }

        public Criteria andJlypJeLessThan(BigDecimal value) {
            addCriterion("jlyp_je <", value, "jlypJe");
            return (Criteria) this;
        }

        public Criteria andJlypJeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jlyp_je <=", value, "jlypJe");
            return (Criteria) this;
        }

        public Criteria andJlypJeIn(List<BigDecimal> values) {
            addCriterion("jlyp_je in", values, "jlypJe");
            return (Criteria) this;
        }

        public Criteria andJlypJeNotIn(List<BigDecimal> values) {
            addCriterion("jlyp_je not in", values, "jlypJe");
            return (Criteria) this;
        }

        public Criteria andJlypJeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jlyp_je between", value1, value2, "jlypJe");
            return (Criteria) this;
        }

        public Criteria andJlypJeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jlyp_je not between", value1, value2, "jlypJe");
            return (Criteria) this;
        }

        public Criteria andYlypJeIsNull() {
            addCriterion("ylyp_je is null");
            return (Criteria) this;
        }

        public Criteria andYlypJeIsNotNull() {
            addCriterion("ylyp_je is not null");
            return (Criteria) this;
        }

        public Criteria andYlypJeEqualTo(BigDecimal value) {
            addCriterion("ylyp_je =", value, "ylypJe");
            return (Criteria) this;
        }

        public Criteria andYlypJeNotEqualTo(BigDecimal value) {
            addCriterion("ylyp_je <>", value, "ylypJe");
            return (Criteria) this;
        }

        public Criteria andYlypJeGreaterThan(BigDecimal value) {
            addCriterion("ylyp_je >", value, "ylypJe");
            return (Criteria) this;
        }

        public Criteria andYlypJeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ylyp_je >=", value, "ylypJe");
            return (Criteria) this;
        }

        public Criteria andYlypJeLessThan(BigDecimal value) {
            addCriterion("ylyp_je <", value, "ylypJe");
            return (Criteria) this;
        }

        public Criteria andYlypJeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ylyp_je <=", value, "ylypJe");
            return (Criteria) this;
        }

        public Criteria andYlypJeIn(List<BigDecimal> values) {
            addCriterion("ylyp_je in", values, "ylypJe");
            return (Criteria) this;
        }

        public Criteria andYlypJeNotIn(List<BigDecimal> values) {
            addCriterion("ylyp_je not in", values, "ylypJe");
            return (Criteria) this;
        }

        public Criteria andYlypJeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ylyp_je between", value1, value2, "ylypJe");
            return (Criteria) this;
        }

        public Criteria andYlypJeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ylyp_je not between", value1, value2, "ylypJe");
            return (Criteria) this;
        }

        public Criteria andBlypJeIsNull() {
            addCriterion("blyp_je is null");
            return (Criteria) this;
        }

        public Criteria andBlypJeIsNotNull() {
            addCriterion("blyp_je is not null");
            return (Criteria) this;
        }

        public Criteria andBlypJeEqualTo(BigDecimal value) {
            addCriterion("blyp_je =", value, "blypJe");
            return (Criteria) this;
        }

        public Criteria andBlypJeNotEqualTo(BigDecimal value) {
            addCriterion("blyp_je <>", value, "blypJe");
            return (Criteria) this;
        }

        public Criteria andBlypJeGreaterThan(BigDecimal value) {
            addCriterion("blyp_je >", value, "blypJe");
            return (Criteria) this;
        }

        public Criteria andBlypJeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("blyp_je >=", value, "blypJe");
            return (Criteria) this;
        }

        public Criteria andBlypJeLessThan(BigDecimal value) {
            addCriterion("blyp_je <", value, "blypJe");
            return (Criteria) this;
        }

        public Criteria andBlypJeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("blyp_je <=", value, "blypJe");
            return (Criteria) this;
        }

        public Criteria andBlypJeIn(List<BigDecimal> values) {
            addCriterion("blyp_je in", values, "blypJe");
            return (Criteria) this;
        }

        public Criteria andBlypJeNotIn(List<BigDecimal> values) {
            addCriterion("blyp_je not in", values, "blypJe");
            return (Criteria) this;
        }

        public Criteria andBlypJeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("blyp_je between", value1, value2, "blypJe");
            return (Criteria) this;
        }

        public Criteria andBlypJeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("blyp_je not between", value1, value2, "blypJe");
            return (Criteria) this;
        }

        public Criteria andYbZtbzIsNull() {
            addCriterion("yb_ztbz is null");
            return (Criteria) this;
        }

        public Criteria andYbZtbzIsNotNull() {
            addCriterion("yb_ztbz is not null");
            return (Criteria) this;
        }

        public Criteria andYbZtbzEqualTo(String value) {
            addCriterion("yb_ztbz =", value, "ybZtbz");
            return (Criteria) this;
        }

        public Criteria andYbZtbzNotEqualTo(String value) {
            addCriterion("yb_ztbz <>", value, "ybZtbz");
            return (Criteria) this;
        }

        public Criteria andYbZtbzGreaterThan(String value) {
            addCriterion("yb_ztbz >", value, "ybZtbz");
            return (Criteria) this;
        }

        public Criteria andYbZtbzGreaterThanOrEqualTo(String value) {
            addCriterion("yb_ztbz >=", value, "ybZtbz");
            return (Criteria) this;
        }

        public Criteria andYbZtbzLessThan(String value) {
            addCriterion("yb_ztbz <", value, "ybZtbz");
            return (Criteria) this;
        }

        public Criteria andYbZtbzLessThanOrEqualTo(String value) {
            addCriterion("yb_ztbz <=", value, "ybZtbz");
            return (Criteria) this;
        }

        public Criteria andYbZtbzLike(String value) {
            addCriterion("yb_ztbz like", value, "ybZtbz");
            return (Criteria) this;
        }

        public Criteria andYbZtbzNotLike(String value) {
            addCriterion("yb_ztbz not like", value, "ybZtbz");
            return (Criteria) this;
        }

        public Criteria andYbZtbzIn(List<String> values) {
            addCriterion("yb_ztbz in", values, "ybZtbz");
            return (Criteria) this;
        }

        public Criteria andYbZtbzNotIn(List<String> values) {
            addCriterion("yb_ztbz not in", values, "ybZtbz");
            return (Criteria) this;
        }

        public Criteria andYbZtbzBetween(String value1, String value2) {
            addCriterion("yb_ztbz between", value1, value2, "ybZtbz");
            return (Criteria) this;
        }

        public Criteria andYbZtbzNotBetween(String value1, String value2) {
            addCriterion("yb_ztbz not between", value1, value2, "ybZtbz");
            return (Criteria) this;
        }

        public Criteria andFydmIsNull() {
            addCriterion("fydm is null");
            return (Criteria) this;
        }

        public Criteria andFydmIsNotNull() {
            addCriterion("fydm is not null");
            return (Criteria) this;
        }

        public Criteria andFydmEqualTo(String value) {
            addCriterion("fydm =", value, "fydm");
            return (Criteria) this;
        }

        public Criteria andFydmNotEqualTo(String value) {
            addCriterion("fydm <>", value, "fydm");
            return (Criteria) this;
        }

        public Criteria andFydmGreaterThan(String value) {
            addCriterion("fydm >", value, "fydm");
            return (Criteria) this;
        }

        public Criteria andFydmGreaterThanOrEqualTo(String value) {
            addCriterion("fydm >=", value, "fydm");
            return (Criteria) this;
        }

        public Criteria andFydmLessThan(String value) {
            addCriterion("fydm <", value, "fydm");
            return (Criteria) this;
        }

        public Criteria andFydmLessThanOrEqualTo(String value) {
            addCriterion("fydm <=", value, "fydm");
            return (Criteria) this;
        }

        public Criteria andFydmLike(String value) {
            addCriterion("fydm like", value, "fydm");
            return (Criteria) this;
        }

        public Criteria andFydmNotLike(String value) {
            addCriterion("fydm not like", value, "fydm");
            return (Criteria) this;
        }

        public Criteria andFydmIn(List<String> values) {
            addCriterion("fydm in", values, "fydm");
            return (Criteria) this;
        }

        public Criteria andFydmNotIn(List<String> values) {
            addCriterion("fydm not in", values, "fydm");
            return (Criteria) this;
        }

        public Criteria andFydmBetween(String value1, String value2) {
            addCriterion("fydm between", value1, value2, "fydm");
            return (Criteria) this;
        }

        public Criteria andFydmNotBetween(String value1, String value2) {
            addCriterion("fydm not between", value1, value2, "fydm");
            return (Criteria) this;
        }

        public Criteria andCwIdIsNull() {
            addCriterion("cw_id is null");
            return (Criteria) this;
        }

        public Criteria andCwIdIsNotNull() {
            addCriterion("cw_id is not null");
            return (Criteria) this;
        }

        public Criteria andCwIdEqualTo(String value) {
            addCriterion("cw_id =", value, "cwId");
            return (Criteria) this;
        }

        public Criteria andCwIdNotEqualTo(String value) {
            addCriterion("cw_id <>", value, "cwId");
            return (Criteria) this;
        }

        public Criteria andCwIdGreaterThan(String value) {
            addCriterion("cw_id >", value, "cwId");
            return (Criteria) this;
        }

        public Criteria andCwIdGreaterThanOrEqualTo(String value) {
            addCriterion("cw_id >=", value, "cwId");
            return (Criteria) this;
        }

        public Criteria andCwIdLessThan(String value) {
            addCriterion("cw_id <", value, "cwId");
            return (Criteria) this;
        }

        public Criteria andCwIdLessThanOrEqualTo(String value) {
            addCriterion("cw_id <=", value, "cwId");
            return (Criteria) this;
        }

        public Criteria andCwIdLike(String value) {
            addCriterion("cw_id like", value, "cwId");
            return (Criteria) this;
        }

        public Criteria andCwIdNotLike(String value) {
            addCriterion("cw_id not like", value, "cwId");
            return (Criteria) this;
        }

        public Criteria andCwIdIn(List<String> values) {
            addCriterion("cw_id in", values, "cwId");
            return (Criteria) this;
        }

        public Criteria andCwIdNotIn(List<String> values) {
            addCriterion("cw_id not in", values, "cwId");
            return (Criteria) this;
        }

        public Criteria andCwIdBetween(String value1, String value2) {
            addCriterion("cw_id between", value1, value2, "cwId");
            return (Criteria) this;
        }

        public Criteria andCwIdNotBetween(String value1, String value2) {
            addCriterion("cw_id not between", value1, value2, "cwId");
            return (Criteria) this;
        }

        public Criteria andBqIdIsNull() {
            addCriterion("bq_id is null");
            return (Criteria) this;
        }

        public Criteria andBqIdIsNotNull() {
            addCriterion("bq_id is not null");
            return (Criteria) this;
        }

        public Criteria andBqIdEqualTo(String value) {
            addCriterion("bq_id =", value, "bqId");
            return (Criteria) this;
        }

        public Criteria andBqIdNotEqualTo(String value) {
            addCriterion("bq_id <>", value, "bqId");
            return (Criteria) this;
        }

        public Criteria andBqIdGreaterThan(String value) {
            addCriterion("bq_id >", value, "bqId");
            return (Criteria) this;
        }

        public Criteria andBqIdGreaterThanOrEqualTo(String value) {
            addCriterion("bq_id >=", value, "bqId");
            return (Criteria) this;
        }

        public Criteria andBqIdLessThan(String value) {
            addCriterion("bq_id <", value, "bqId");
            return (Criteria) this;
        }

        public Criteria andBqIdLessThanOrEqualTo(String value) {
            addCriterion("bq_id <=", value, "bqId");
            return (Criteria) this;
        }

        public Criteria andBqIdLike(String value) {
            addCriterion("bq_id like", value, "bqId");
            return (Criteria) this;
        }

        public Criteria andBqIdNotLike(String value) {
            addCriterion("bq_id not like", value, "bqId");
            return (Criteria) this;
        }

        public Criteria andBqIdIn(List<String> values) {
            addCriterion("bq_id in", values, "bqId");
            return (Criteria) this;
        }

        public Criteria andBqIdNotIn(List<String> values) {
            addCriterion("bq_id not in", values, "bqId");
            return (Criteria) this;
        }

        public Criteria andBqIdBetween(String value1, String value2) {
            addCriterion("bq_id between", value1, value2, "bqId");
            return (Criteria) this;
        }

        public Criteria andBqIdNotBetween(String value1, String value2) {
            addCriterion("bq_id not between", value1, value2, "bqId");
            return (Criteria) this;
        }

        public Criteria andZyIdIsNull() {
            addCriterion("zy_id is null");
            return (Criteria) this;
        }

        public Criteria andZyIdIsNotNull() {
            addCriterion("zy_id is not null");
            return (Criteria) this;
        }

        public Criteria andZyIdEqualTo(String value) {
            addCriterion("zy_id =", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdNotEqualTo(String value) {
            addCriterion("zy_id <>", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdGreaterThan(String value) {
            addCriterion("zy_id >", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdGreaterThanOrEqualTo(String value) {
            addCriterion("zy_id >=", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdLessThan(String value) {
            addCriterion("zy_id <", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdLessThanOrEqualTo(String value) {
            addCriterion("zy_id <=", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdLike(String value) {
            addCriterion("zy_id like", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdNotLike(String value) {
            addCriterion("zy_id not like", value, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdIn(List<String> values) {
            addCriterion("zy_id in", values, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdNotIn(List<String> values) {
            addCriterion("zy_id not in", values, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdBetween(String value1, String value2) {
            addCriterion("zy_id between", value1, value2, "zyId");
            return (Criteria) this;
        }

        public Criteria andZyIdNotBetween(String value1, String value2) {
            addCriterion("zy_id not between", value1, value2, "zyId");
            return (Criteria) this;
        }

        public Criteria andCfdxIsNull() {
            addCriterion("cfdx is null");
            return (Criteria) this;
        }

        public Criteria andCfdxIsNotNull() {
            addCriterion("cfdx is not null");
            return (Criteria) this;
        }

        public Criteria andCfdxEqualTo(String value) {
            addCriterion("cfdx =", value, "cfdx");
            return (Criteria) this;
        }

        public Criteria andCfdxNotEqualTo(String value) {
            addCriterion("cfdx <>", value, "cfdx");
            return (Criteria) this;
        }

        public Criteria andCfdxGreaterThan(String value) {
            addCriterion("cfdx >", value, "cfdx");
            return (Criteria) this;
        }

        public Criteria andCfdxGreaterThanOrEqualTo(String value) {
            addCriterion("cfdx >=", value, "cfdx");
            return (Criteria) this;
        }

        public Criteria andCfdxLessThan(String value) {
            addCriterion("cfdx <", value, "cfdx");
            return (Criteria) this;
        }

        public Criteria andCfdxLessThanOrEqualTo(String value) {
            addCriterion("cfdx <=", value, "cfdx");
            return (Criteria) this;
        }

        public Criteria andCfdxLike(String value) {
            addCriterion("cfdx like", value, "cfdx");
            return (Criteria) this;
        }

        public Criteria andCfdxNotLike(String value) {
            addCriterion("cfdx not like", value, "cfdx");
            return (Criteria) this;
        }

        public Criteria andCfdxIn(List<String> values) {
            addCriterion("cfdx in", values, "cfdx");
            return (Criteria) this;
        }

        public Criteria andCfdxNotIn(List<String> values) {
            addCriterion("cfdx not in", values, "cfdx");
            return (Criteria) this;
        }

        public Criteria andCfdxBetween(String value1, String value2) {
            addCriterion("cfdx between", value1, value2, "cfdx");
            return (Criteria) this;
        }

        public Criteria andCfdxNotBetween(String value1, String value2) {
            addCriterion("cfdx not between", value1, value2, "cfdx");
            return (Criteria) this;
        }

        public Criteria andSfbzIsNull() {
            addCriterion("sfbz is null");
            return (Criteria) this;
        }

        public Criteria andSfbzIsNotNull() {
            addCriterion("sfbz is not null");
            return (Criteria) this;
        }

        public Criteria andSfbzEqualTo(String value) {
            addCriterion("sfbz =", value, "sfbz");
            return (Criteria) this;
        }

        public Criteria andSfbzNotEqualTo(String value) {
            addCriterion("sfbz <>", value, "sfbz");
            return (Criteria) this;
        }

        public Criteria andSfbzGreaterThan(String value) {
            addCriterion("sfbz >", value, "sfbz");
            return (Criteria) this;
        }

        public Criteria andSfbzGreaterThanOrEqualTo(String value) {
            addCriterion("sfbz >=", value, "sfbz");
            return (Criteria) this;
        }

        public Criteria andSfbzLessThan(String value) {
            addCriterion("sfbz <", value, "sfbz");
            return (Criteria) this;
        }

        public Criteria andSfbzLessThanOrEqualTo(String value) {
            addCriterion("sfbz <=", value, "sfbz");
            return (Criteria) this;
        }

        public Criteria andSfbzLike(String value) {
            addCriterion("sfbz like", value, "sfbz");
            return (Criteria) this;
        }

        public Criteria andSfbzNotLike(String value) {
            addCriterion("sfbz not like", value, "sfbz");
            return (Criteria) this;
        }

        public Criteria andSfbzIn(List<String> values) {
            addCriterion("sfbz in", values, "sfbz");
            return (Criteria) this;
        }

        public Criteria andSfbzNotIn(List<String> values) {
            addCriterion("sfbz not in", values, "sfbz");
            return (Criteria) this;
        }

        public Criteria andSfbzBetween(String value1, String value2) {
            addCriterion("sfbz between", value1, value2, "sfbz");
            return (Criteria) this;
        }

        public Criteria andSfbzNotBetween(String value1, String value2) {
            addCriterion("sfbz not between", value1, value2, "sfbz");
            return (Criteria) this;
        }

        public Criteria andCfbzIsNull() {
            addCriterion("cfbz is null");
            return (Criteria) this;
        }

        public Criteria andCfbzIsNotNull() {
            addCriterion("cfbz is not null");
            return (Criteria) this;
        }

        public Criteria andCfbzEqualTo(String value) {
            addCriterion("cfbz =", value, "cfbz");
            return (Criteria) this;
        }

        public Criteria andCfbzNotEqualTo(String value) {
            addCriterion("cfbz <>", value, "cfbz");
            return (Criteria) this;
        }

        public Criteria andCfbzGreaterThan(String value) {
            addCriterion("cfbz >", value, "cfbz");
            return (Criteria) this;
        }

        public Criteria andCfbzGreaterThanOrEqualTo(String value) {
            addCriterion("cfbz >=", value, "cfbz");
            return (Criteria) this;
        }

        public Criteria andCfbzLessThan(String value) {
            addCriterion("cfbz <", value, "cfbz");
            return (Criteria) this;
        }

        public Criteria andCfbzLessThanOrEqualTo(String value) {
            addCriterion("cfbz <=", value, "cfbz");
            return (Criteria) this;
        }

        public Criteria andCfbzLike(String value) {
            addCriterion("cfbz like", value, "cfbz");
            return (Criteria) this;
        }

        public Criteria andCfbzNotLike(String value) {
            addCriterion("cfbz not like", value, "cfbz");
            return (Criteria) this;
        }

        public Criteria andCfbzIn(List<String> values) {
            addCriterion("cfbz in", values, "cfbz");
            return (Criteria) this;
        }

        public Criteria andCfbzNotIn(List<String> values) {
            addCriterion("cfbz not in", values, "cfbz");
            return (Criteria) this;
        }

        public Criteria andCfbzBetween(String value1, String value2) {
            addCriterion("cfbz between", value1, value2, "cfbz");
            return (Criteria) this;
        }

        public Criteria andCfbzNotBetween(String value1, String value2) {
            addCriterion("cfbz not between", value1, value2, "cfbz");
            return (Criteria) this;
        }

        public Criteria andZybzIsNull() {
            addCriterion("zybz is null");
            return (Criteria) this;
        }

        public Criteria andZybzIsNotNull() {
            addCriterion("zybz is not null");
            return (Criteria) this;
        }

        public Criteria andZybzEqualTo(String value) {
            addCriterion("zybz =", value, "zybz");
            return (Criteria) this;
        }

        public Criteria andZybzNotEqualTo(String value) {
            addCriterion("zybz <>", value, "zybz");
            return (Criteria) this;
        }

        public Criteria andZybzGreaterThan(String value) {
            addCriterion("zybz >", value, "zybz");
            return (Criteria) this;
        }

        public Criteria andZybzGreaterThanOrEqualTo(String value) {
            addCriterion("zybz >=", value, "zybz");
            return (Criteria) this;
        }

        public Criteria andZybzLessThan(String value) {
            addCriterion("zybz <", value, "zybz");
            return (Criteria) this;
        }

        public Criteria andZybzLessThanOrEqualTo(String value) {
            addCriterion("zybz <=", value, "zybz");
            return (Criteria) this;
        }

        public Criteria andZybzLike(String value) {
            addCriterion("zybz like", value, "zybz");
            return (Criteria) this;
        }

        public Criteria andZybzNotLike(String value) {
            addCriterion("zybz not like", value, "zybz");
            return (Criteria) this;
        }

        public Criteria andZybzIn(List<String> values) {
            addCriterion("zybz in", values, "zybz");
            return (Criteria) this;
        }

        public Criteria andZybzNotIn(List<String> values) {
            addCriterion("zybz not in", values, "zybz");
            return (Criteria) this;
        }

        public Criteria andZybzBetween(String value1, String value2) {
            addCriterion("zybz between", value1, value2, "zybz");
            return (Criteria) this;
        }

        public Criteria andZybzNotBetween(String value1, String value2) {
            addCriterion("zybz not between", value1, value2, "zybz");
            return (Criteria) this;
        }

        public Criteria andZtbzIsNull() {
            addCriterion("ztbz is null");
            return (Criteria) this;
        }

        public Criteria andZtbzIsNotNull() {
            addCriterion("ztbz is not null");
            return (Criteria) this;
        }

        public Criteria andZtbzEqualTo(String value) {
            addCriterion("ztbz =", value, "ztbz");
            return (Criteria) this;
        }

        public Criteria andZtbzNotEqualTo(String value) {
            addCriterion("ztbz <>", value, "ztbz");
            return (Criteria) this;
        }

        public Criteria andZtbzGreaterThan(String value) {
            addCriterion("ztbz >", value, "ztbz");
            return (Criteria) this;
        }

        public Criteria andZtbzGreaterThanOrEqualTo(String value) {
            addCriterion("ztbz >=", value, "ztbz");
            return (Criteria) this;
        }

        public Criteria andZtbzLessThan(String value) {
            addCriterion("ztbz <", value, "ztbz");
            return (Criteria) this;
        }

        public Criteria andZtbzLessThanOrEqualTo(String value) {
            addCriterion("ztbz <=", value, "ztbz");
            return (Criteria) this;
        }

        public Criteria andZtbzLike(String value) {
            addCriterion("ztbz like", value, "ztbz");
            return (Criteria) this;
        }

        public Criteria andZtbzNotLike(String value) {
            addCriterion("ztbz not like", value, "ztbz");
            return (Criteria) this;
        }

        public Criteria andZtbzIn(List<String> values) {
            addCriterion("ztbz in", values, "ztbz");
            return (Criteria) this;
        }

        public Criteria andZtbzNotIn(List<String> values) {
            addCriterion("ztbz not in", values, "ztbz");
            return (Criteria) this;
        }

        public Criteria andZtbzBetween(String value1, String value2) {
            addCriterion("ztbz between", value1, value2, "ztbz");
            return (Criteria) this;
        }

        public Criteria andZtbzNotBetween(String value1, String value2) {
            addCriterion("ztbz not between", value1, value2, "ztbz");
            return (Criteria) this;
        }

        public Criteria andHzIdIsNull() {
            addCriterion("hz_id is null");
            return (Criteria) this;
        }

        public Criteria andHzIdIsNotNull() {
            addCriterion("hz_id is not null");
            return (Criteria) this;
        }

        public Criteria andHzIdEqualTo(String value) {
            addCriterion("hz_id =", value, "hzId");
            return (Criteria) this;
        }

        public Criteria andHzIdNotEqualTo(String value) {
            addCriterion("hz_id <>", value, "hzId");
            return (Criteria) this;
        }

        public Criteria andHzIdGreaterThan(String value) {
            addCriterion("hz_id >", value, "hzId");
            return (Criteria) this;
        }

        public Criteria andHzIdGreaterThanOrEqualTo(String value) {
            addCriterion("hz_id >=", value, "hzId");
            return (Criteria) this;
        }

        public Criteria andHzIdLessThan(String value) {
            addCriterion("hz_id <", value, "hzId");
            return (Criteria) this;
        }

        public Criteria andHzIdLessThanOrEqualTo(String value) {
            addCriterion("hz_id <=", value, "hzId");
            return (Criteria) this;
        }

        public Criteria andHzIdLike(String value) {
            addCriterion("hz_id like", value, "hzId");
            return (Criteria) this;
        }

        public Criteria andHzIdNotLike(String value) {
            addCriterion("hz_id not like", value, "hzId");
            return (Criteria) this;
        }

        public Criteria andHzIdIn(List<String> values) {
            addCriterion("hz_id in", values, "hzId");
            return (Criteria) this;
        }

        public Criteria andHzIdNotIn(List<String> values) {
            addCriterion("hz_id not in", values, "hzId");
            return (Criteria) this;
        }

        public Criteria andHzIdBetween(String value1, String value2) {
            addCriterion("hz_id between", value1, value2, "hzId");
            return (Criteria) this;
        }

        public Criteria andHzIdNotBetween(String value1, String value2) {
            addCriterion("hz_id not between", value1, value2, "hzId");
            return (Criteria) this;
        }

        public Criteria andBzIdIsNull() {
            addCriterion("bz_id is null");
            return (Criteria) this;
        }

        public Criteria andBzIdIsNotNull() {
            addCriterion("bz_id is not null");
            return (Criteria) this;
        }

        public Criteria andBzIdEqualTo(String value) {
            addCriterion("bz_id =", value, "bzId");
            return (Criteria) this;
        }

        public Criteria andBzIdNotEqualTo(String value) {
            addCriterion("bz_id <>", value, "bzId");
            return (Criteria) this;
        }

        public Criteria andBzIdGreaterThan(String value) {
            addCriterion("bz_id >", value, "bzId");
            return (Criteria) this;
        }

        public Criteria andBzIdGreaterThanOrEqualTo(String value) {
            addCriterion("bz_id >=", value, "bzId");
            return (Criteria) this;
        }

        public Criteria andBzIdLessThan(String value) {
            addCriterion("bz_id <", value, "bzId");
            return (Criteria) this;
        }

        public Criteria andBzIdLessThanOrEqualTo(String value) {
            addCriterion("bz_id <=", value, "bzId");
            return (Criteria) this;
        }

        public Criteria andBzIdLike(String value) {
            addCriterion("bz_id like", value, "bzId");
            return (Criteria) this;
        }

        public Criteria andBzIdNotLike(String value) {
            addCriterion("bz_id not like", value, "bzId");
            return (Criteria) this;
        }

        public Criteria andBzIdIn(List<String> values) {
            addCriterion("bz_id in", values, "bzId");
            return (Criteria) this;
        }

        public Criteria andBzIdNotIn(List<String> values) {
            addCriterion("bz_id not in", values, "bzId");
            return (Criteria) this;
        }

        public Criteria andBzIdBetween(String value1, String value2) {
            addCriterion("bz_id between", value1, value2, "bzId");
            return (Criteria) this;
        }

        public Criteria andBzIdNotBetween(String value1, String value2) {
            addCriterion("bz_id not between", value1, value2, "bzId");
            return (Criteria) this;
        }

        public Criteria andYfIdIsNull() {
            addCriterion("yf_id is null");
            return (Criteria) this;
        }

        public Criteria andYfIdIsNotNull() {
            addCriterion("yf_id is not null");
            return (Criteria) this;
        }

        public Criteria andYfIdEqualTo(String value) {
            addCriterion("yf_id =", value, "yfId");
            return (Criteria) this;
        }

        public Criteria andYfIdNotEqualTo(String value) {
            addCriterion("yf_id <>", value, "yfId");
            return (Criteria) this;
        }

        public Criteria andYfIdGreaterThan(String value) {
            addCriterion("yf_id >", value, "yfId");
            return (Criteria) this;
        }

        public Criteria andYfIdGreaterThanOrEqualTo(String value) {
            addCriterion("yf_id >=", value, "yfId");
            return (Criteria) this;
        }

        public Criteria andYfIdLessThan(String value) {
            addCriterion("yf_id <", value, "yfId");
            return (Criteria) this;
        }

        public Criteria andYfIdLessThanOrEqualTo(String value) {
            addCriterion("yf_id <=", value, "yfId");
            return (Criteria) this;
        }

        public Criteria andYfIdLike(String value) {
            addCriterion("yf_id like", value, "yfId");
            return (Criteria) this;
        }

        public Criteria andYfIdNotLike(String value) {
            addCriterion("yf_id not like", value, "yfId");
            return (Criteria) this;
        }

        public Criteria andYfIdIn(List<String> values) {
            addCriterion("yf_id in", values, "yfId");
            return (Criteria) this;
        }

        public Criteria andYfIdNotIn(List<String> values) {
            addCriterion("yf_id not in", values, "yfId");
            return (Criteria) this;
        }

        public Criteria andYfIdBetween(String value1, String value2) {
            addCriterion("yf_id between", value1, value2, "yfId");
            return (Criteria) this;
        }

        public Criteria andYfIdNotBetween(String value1, String value2) {
            addCriterion("yf_id not between", value1, value2, "yfId");
            return (Criteria) this;
        }

        public Criteria andSfdhIsNull() {
            addCriterion("sfdh is null");
            return (Criteria) this;
        }

        public Criteria andSfdhIsNotNull() {
            addCriterion("sfdh is not null");
            return (Criteria) this;
        }

        public Criteria andSfdhEqualTo(String value) {
            addCriterion("sfdh =", value, "sfdh");
            return (Criteria) this;
        }

        public Criteria andSfdhNotEqualTo(String value) {
            addCriterion("sfdh <>", value, "sfdh");
            return (Criteria) this;
        }

        public Criteria andSfdhGreaterThan(String value) {
            addCriterion("sfdh >", value, "sfdh");
            return (Criteria) this;
        }

        public Criteria andSfdhGreaterThanOrEqualTo(String value) {
            addCriterion("sfdh >=", value, "sfdh");
            return (Criteria) this;
        }

        public Criteria andSfdhLessThan(String value) {
            addCriterion("sfdh <", value, "sfdh");
            return (Criteria) this;
        }

        public Criteria andSfdhLessThanOrEqualTo(String value) {
            addCriterion("sfdh <=", value, "sfdh");
            return (Criteria) this;
        }

        public Criteria andSfdhLike(String value) {
            addCriterion("sfdh like", value, "sfdh");
            return (Criteria) this;
        }

        public Criteria andSfdhNotLike(String value) {
            addCriterion("sfdh not like", value, "sfdh");
            return (Criteria) this;
        }

        public Criteria andSfdhIn(List<String> values) {
            addCriterion("sfdh in", values, "sfdh");
            return (Criteria) this;
        }

        public Criteria andSfdhNotIn(List<String> values) {
            addCriterion("sfdh not in", values, "sfdh");
            return (Criteria) this;
        }

        public Criteria andSfdhBetween(String value1, String value2) {
            addCriterion("sfdh between", value1, value2, "sfdh");
            return (Criteria) this;
        }

        public Criteria andSfdhNotBetween(String value1, String value2) {
            addCriterion("sfdh not between", value1, value2, "sfdh");
            return (Criteria) this;
        }

        public Criteria andYsfbzIsNull() {
            addCriterion("ysfbz is null");
            return (Criteria) this;
        }

        public Criteria andYsfbzIsNotNull() {
            addCriterion("ysfbz is not null");
            return (Criteria) this;
        }

        public Criteria andYsfbzEqualTo(String value) {
            addCriterion("ysfbz =", value, "ysfbz");
            return (Criteria) this;
        }

        public Criteria andYsfbzNotEqualTo(String value) {
            addCriterion("ysfbz <>", value, "ysfbz");
            return (Criteria) this;
        }

        public Criteria andYsfbzGreaterThan(String value) {
            addCriterion("ysfbz >", value, "ysfbz");
            return (Criteria) this;
        }

        public Criteria andYsfbzGreaterThanOrEqualTo(String value) {
            addCriterion("ysfbz >=", value, "ysfbz");
            return (Criteria) this;
        }

        public Criteria andYsfbzLessThan(String value) {
            addCriterion("ysfbz <", value, "ysfbz");
            return (Criteria) this;
        }

        public Criteria andYsfbzLessThanOrEqualTo(String value) {
            addCriterion("ysfbz <=", value, "ysfbz");
            return (Criteria) this;
        }

        public Criteria andYsfbzLike(String value) {
            addCriterion("ysfbz like", value, "ysfbz");
            return (Criteria) this;
        }

        public Criteria andYsfbzNotLike(String value) {
            addCriterion("ysfbz not like", value, "ysfbz");
            return (Criteria) this;
        }

        public Criteria andYsfbzIn(List<String> values) {
            addCriterion("ysfbz in", values, "ysfbz");
            return (Criteria) this;
        }

        public Criteria andYsfbzNotIn(List<String> values) {
            addCriterion("ysfbz not in", values, "ysfbz");
            return (Criteria) this;
        }

        public Criteria andYsfbzBetween(String value1, String value2) {
            addCriterion("ysfbz between", value1, value2, "ysfbz");
            return (Criteria) this;
        }

        public Criteria andYsfbzNotBetween(String value1, String value2) {
            addCriterion("ysfbz not between", value1, value2, "ysfbz");
            return (Criteria) this;
        }

        public Criteria andShrqIsNull() {
            addCriterion("shrq is null");
            return (Criteria) this;
        }

        public Criteria andShrqIsNotNull() {
            addCriterion("shrq is not null");
            return (Criteria) this;
        }

        public Criteria andShrqEqualTo(Date value) {
            addCriterion("shrq =", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotEqualTo(Date value) {
            addCriterion("shrq <>", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqGreaterThan(Date value) {
            addCriterion("shrq >", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqGreaterThanOrEqualTo(Date value) {
            addCriterion("shrq >=", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqLessThan(Date value) {
            addCriterion("shrq <", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqLessThanOrEqualTo(Date value) {
            addCriterion("shrq <=", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqIn(List<Date> values) {
            addCriterion("shrq in", values, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotIn(List<Date> values) {
            addCriterion("shrq not in", values, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqBetween(Date value1, Date value2) {
            addCriterion("shrq between", value1, value2, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotBetween(Date value1, Date value2) {
            addCriterion("shrq not between", value1, value2, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrIsNull() {
            addCriterion("shr is null");
            return (Criteria) this;
        }

        public Criteria andShrIsNotNull() {
            addCriterion("shr is not null");
            return (Criteria) this;
        }

        public Criteria andShrEqualTo(String value) {
            addCriterion("shr =", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotEqualTo(String value) {
            addCriterion("shr <>", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrGreaterThan(String value) {
            addCriterion("shr >", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrGreaterThanOrEqualTo(String value) {
            addCriterion("shr >=", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLessThan(String value) {
            addCriterion("shr <", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLessThanOrEqualTo(String value) {
            addCriterion("shr <=", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLike(String value) {
            addCriterion("shr like", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotLike(String value) {
            addCriterion("shr not like", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrIn(List<String> values) {
            addCriterion("shr in", values, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotIn(List<String> values) {
            addCriterion("shr not in", values, "shr");
            return (Criteria) this;
        }

        public Criteria andShrBetween(String value1, String value2) {
            addCriterion("shr between", value1, value2, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotBetween(String value1, String value2) {
            addCriterion("shr not between", value1, value2, "shr");
            return (Criteria) this;
        }

        public Criteria andNbblIsNull() {
            addCriterion("nbbl is null");
            return (Criteria) this;
        }

        public Criteria andNbblIsNotNull() {
            addCriterion("nbbl is not null");
            return (Criteria) this;
        }

        public Criteria andNbblEqualTo(String value) {
            addCriterion("nbbl =", value, "nbbl");
            return (Criteria) this;
        }

        public Criteria andNbblNotEqualTo(String value) {
            addCriterion("nbbl <>", value, "nbbl");
            return (Criteria) this;
        }

        public Criteria andNbblGreaterThan(String value) {
            addCriterion("nbbl >", value, "nbbl");
            return (Criteria) this;
        }

        public Criteria andNbblGreaterThanOrEqualTo(String value) {
            addCriterion("nbbl >=", value, "nbbl");
            return (Criteria) this;
        }

        public Criteria andNbblLessThan(String value) {
            addCriterion("nbbl <", value, "nbbl");
            return (Criteria) this;
        }

        public Criteria andNbblLessThanOrEqualTo(String value) {
            addCriterion("nbbl <=", value, "nbbl");
            return (Criteria) this;
        }

        public Criteria andNbblLike(String value) {
            addCriterion("nbbl like", value, "nbbl");
            return (Criteria) this;
        }

        public Criteria andNbblNotLike(String value) {
            addCriterion("nbbl not like", value, "nbbl");
            return (Criteria) this;
        }

        public Criteria andNbblIn(List<String> values) {
            addCriterion("nbbl in", values, "nbbl");
            return (Criteria) this;
        }

        public Criteria andNbblNotIn(List<String> values) {
            addCriterion("nbbl not in", values, "nbbl");
            return (Criteria) this;
        }

        public Criteria andNbblBetween(String value1, String value2) {
            addCriterion("nbbl between", value1, value2, "nbbl");
            return (Criteria) this;
        }

        public Criteria andNbblNotBetween(String value1, String value2) {
            addCriterion("nbbl not between", value1, value2, "nbbl");
            return (Criteria) this;
        }

        public Criteria andYblshIsNull() {
            addCriterion("yblsh is null");
            return (Criteria) this;
        }

        public Criteria andYblshIsNotNull() {
            addCriterion("yblsh is not null");
            return (Criteria) this;
        }

        public Criteria andYblshEqualTo(String value) {
            addCriterion("yblsh =", value, "yblsh");
            return (Criteria) this;
        }

        public Criteria andYblshNotEqualTo(String value) {
            addCriterion("yblsh <>", value, "yblsh");
            return (Criteria) this;
        }

        public Criteria andYblshGreaterThan(String value) {
            addCriterion("yblsh >", value, "yblsh");
            return (Criteria) this;
        }

        public Criteria andYblshGreaterThanOrEqualTo(String value) {
            addCriterion("yblsh >=", value, "yblsh");
            return (Criteria) this;
        }

        public Criteria andYblshLessThan(String value) {
            addCriterion("yblsh <", value, "yblsh");
            return (Criteria) this;
        }

        public Criteria andYblshLessThanOrEqualTo(String value) {
            addCriterion("yblsh <=", value, "yblsh");
            return (Criteria) this;
        }

        public Criteria andYblshLike(String value) {
            addCriterion("yblsh like", value, "yblsh");
            return (Criteria) this;
        }

        public Criteria andYblshNotLike(String value) {
            addCriterion("yblsh not like", value, "yblsh");
            return (Criteria) this;
        }

        public Criteria andYblshIn(List<String> values) {
            addCriterion("yblsh in", values, "yblsh");
            return (Criteria) this;
        }

        public Criteria andYblshNotIn(List<String> values) {
            addCriterion("yblsh not in", values, "yblsh");
            return (Criteria) this;
        }

        public Criteria andYblshBetween(String value1, String value2) {
            addCriterion("yblsh between", value1, value2, "yblsh");
            return (Criteria) this;
        }

        public Criteria andYblshNotBetween(String value1, String value2) {
            addCriterion("yblsh not between", value1, value2, "yblsh");
            return (Criteria) this;
        }

        public Criteria andYizIdIsNull() {
            addCriterion("yiz_id is null");
            return (Criteria) this;
        }

        public Criteria andYizIdIsNotNull() {
            addCriterion("yiz_id is not null");
            return (Criteria) this;
        }

        public Criteria andYizIdEqualTo(String value) {
            addCriterion("yiz_id =", value, "yizId");
            return (Criteria) this;
        }

        public Criteria andYizIdNotEqualTo(String value) {
            addCriterion("yiz_id <>", value, "yizId");
            return (Criteria) this;
        }

        public Criteria andYizIdGreaterThan(String value) {
            addCriterion("yiz_id >", value, "yizId");
            return (Criteria) this;
        }

        public Criteria andYizIdGreaterThanOrEqualTo(String value) {
            addCriterion("yiz_id >=", value, "yizId");
            return (Criteria) this;
        }

        public Criteria andYizIdLessThan(String value) {
            addCriterion("yiz_id <", value, "yizId");
            return (Criteria) this;
        }

        public Criteria andYizIdLessThanOrEqualTo(String value) {
            addCriterion("yiz_id <=", value, "yizId");
            return (Criteria) this;
        }

        public Criteria andYizIdLike(String value) {
            addCriterion("yiz_id like", value, "yizId");
            return (Criteria) this;
        }

        public Criteria andYizIdNotLike(String value) {
            addCriterion("yiz_id not like", value, "yizId");
            return (Criteria) this;
        }

        public Criteria andYizIdIn(List<String> values) {
            addCriterion("yiz_id in", values, "yizId");
            return (Criteria) this;
        }

        public Criteria andYizIdNotIn(List<String> values) {
            addCriterion("yiz_id not in", values, "yizId");
            return (Criteria) this;
        }

        public Criteria andYizIdBetween(String value1, String value2) {
            addCriterion("yiz_id between", value1, value2, "yizId");
            return (Criteria) this;
        }

        public Criteria andYizIdNotBetween(String value1, String value2) {
            addCriterion("yiz_id not between", value1, value2, "yizId");
            return (Criteria) this;
        }

        public Criteria andYjjeIsNull() {
            addCriterion("yjje is null");
            return (Criteria) this;
        }

        public Criteria andYjjeIsNotNull() {
            addCriterion("yjje is not null");
            return (Criteria) this;
        }

        public Criteria andYjjeEqualTo(BigDecimal value) {
            addCriterion("yjje =", value, "yjje");
            return (Criteria) this;
        }

        public Criteria andYjjeNotEqualTo(BigDecimal value) {
            addCriterion("yjje <>", value, "yjje");
            return (Criteria) this;
        }

        public Criteria andYjjeGreaterThan(BigDecimal value) {
            addCriterion("yjje >", value, "yjje");
            return (Criteria) this;
        }

        public Criteria andYjjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yjje >=", value, "yjje");
            return (Criteria) this;
        }

        public Criteria andYjjeLessThan(BigDecimal value) {
            addCriterion("yjje <", value, "yjje");
            return (Criteria) this;
        }

        public Criteria andYjjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yjje <=", value, "yjje");
            return (Criteria) this;
        }

        public Criteria andYjjeIn(List<BigDecimal> values) {
            addCriterion("yjje in", values, "yjje");
            return (Criteria) this;
        }

        public Criteria andYjjeNotIn(List<BigDecimal> values) {
            addCriterion("yjje not in", values, "yjje");
            return (Criteria) this;
        }

        public Criteria andYjjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yjje between", value1, value2, "yjje");
            return (Criteria) this;
        }

        public Criteria andYjjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yjje not between", value1, value2, "yjje");
            return (Criteria) this;
        }

        public Criteria andYjyeIsNull() {
            addCriterion("yjye is null");
            return (Criteria) this;
        }

        public Criteria andYjyeIsNotNull() {
            addCriterion("yjye is not null");
            return (Criteria) this;
        }

        public Criteria andYjyeEqualTo(BigDecimal value) {
            addCriterion("yjye =", value, "yjye");
            return (Criteria) this;
        }

        public Criteria andYjyeNotEqualTo(BigDecimal value) {
            addCriterion("yjye <>", value, "yjye");
            return (Criteria) this;
        }

        public Criteria andYjyeGreaterThan(BigDecimal value) {
            addCriterion("yjye >", value, "yjye");
            return (Criteria) this;
        }

        public Criteria andYjyeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yjye >=", value, "yjye");
            return (Criteria) this;
        }

        public Criteria andYjyeLessThan(BigDecimal value) {
            addCriterion("yjye <", value, "yjye");
            return (Criteria) this;
        }

        public Criteria andYjyeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yjye <=", value, "yjye");
            return (Criteria) this;
        }

        public Criteria andYjyeIn(List<BigDecimal> values) {
            addCriterion("yjye in", values, "yjye");
            return (Criteria) this;
        }

        public Criteria andYjyeNotIn(List<BigDecimal> values) {
            addCriterion("yjye not in", values, "yjye");
            return (Criteria) this;
        }

        public Criteria andYjyeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yjye between", value1, value2, "yjye");
            return (Criteria) this;
        }

        public Criteria andYjyeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yjye not between", value1, value2, "yjye");
            return (Criteria) this;
        }

        public Criteria andPrtIsNull() {
            addCriterion("prt is null");
            return (Criteria) this;
        }

        public Criteria andPrtIsNotNull() {
            addCriterion("prt is not null");
            return (Criteria) this;
        }

        public Criteria andPrtEqualTo(String value) {
            addCriterion("prt =", value, "prt");
            return (Criteria) this;
        }

        public Criteria andPrtNotEqualTo(String value) {
            addCriterion("prt <>", value, "prt");
            return (Criteria) this;
        }

        public Criteria andPrtGreaterThan(String value) {
            addCriterion("prt >", value, "prt");
            return (Criteria) this;
        }

        public Criteria andPrtGreaterThanOrEqualTo(String value) {
            addCriterion("prt >=", value, "prt");
            return (Criteria) this;
        }

        public Criteria andPrtLessThan(String value) {
            addCriterion("prt <", value, "prt");
            return (Criteria) this;
        }

        public Criteria andPrtLessThanOrEqualTo(String value) {
            addCriterion("prt <=", value, "prt");
            return (Criteria) this;
        }

        public Criteria andPrtLike(String value) {
            addCriterion("prt like", value, "prt");
            return (Criteria) this;
        }

        public Criteria andPrtNotLike(String value) {
            addCriterion("prt not like", value, "prt");
            return (Criteria) this;
        }

        public Criteria andPrtIn(List<String> values) {
            addCriterion("prt in", values, "prt");
            return (Criteria) this;
        }

        public Criteria andPrtNotIn(List<String> values) {
            addCriterion("prt not in", values, "prt");
            return (Criteria) this;
        }

        public Criteria andPrtBetween(String value1, String value2) {
            addCriterion("prt between", value1, value2, "prt");
            return (Criteria) this;
        }

        public Criteria andPrtNotBetween(String value1, String value2) {
            addCriterion("prt not between", value1, value2, "prt");
            return (Criteria) this;
        }

        public Criteria andYfckdIsNull() {
            addCriterion("yfckd is null");
            return (Criteria) this;
        }

        public Criteria andYfckdIsNotNull() {
            addCriterion("yfckd is not null");
            return (Criteria) this;
        }

        public Criteria andYfckdEqualTo(String value) {
            addCriterion("yfckd =", value, "yfckd");
            return (Criteria) this;
        }

        public Criteria andYfckdNotEqualTo(String value) {
            addCriterion("yfckd <>", value, "yfckd");
            return (Criteria) this;
        }

        public Criteria andYfckdGreaterThan(String value) {
            addCriterion("yfckd >", value, "yfckd");
            return (Criteria) this;
        }

        public Criteria andYfckdGreaterThanOrEqualTo(String value) {
            addCriterion("yfckd >=", value, "yfckd");
            return (Criteria) this;
        }

        public Criteria andYfckdLessThan(String value) {
            addCriterion("yfckd <", value, "yfckd");
            return (Criteria) this;
        }

        public Criteria andYfckdLessThanOrEqualTo(String value) {
            addCriterion("yfckd <=", value, "yfckd");
            return (Criteria) this;
        }

        public Criteria andYfckdLike(String value) {
            addCriterion("yfckd like", value, "yfckd");
            return (Criteria) this;
        }

        public Criteria andYfckdNotLike(String value) {
            addCriterion("yfckd not like", value, "yfckd");
            return (Criteria) this;
        }

        public Criteria andYfckdIn(List<String> values) {
            addCriterion("yfckd in", values, "yfckd");
            return (Criteria) this;
        }

        public Criteria andYfckdNotIn(List<String> values) {
            addCriterion("yfckd not in", values, "yfckd");
            return (Criteria) this;
        }

        public Criteria andYfckdBetween(String value1, String value2) {
            addCriterion("yfckd between", value1, value2, "yfckd");
            return (Criteria) this;
        }

        public Criteria andYfckdNotBetween(String value1, String value2) {
            addCriterion("yfckd not between", value1, value2, "yfckd");
            return (Criteria) this;
        }

        public Criteria andZyzdsfIsNull() {
            addCriterion("zyzdsf is null");
            return (Criteria) this;
        }

        public Criteria andZyzdsfIsNotNull() {
            addCriterion("zyzdsf is not null");
            return (Criteria) this;
        }

        public Criteria andZyzdsfEqualTo(String value) {
            addCriterion("zyzdsf =", value, "zyzdsf");
            return (Criteria) this;
        }

        public Criteria andZyzdsfNotEqualTo(String value) {
            addCriterion("zyzdsf <>", value, "zyzdsf");
            return (Criteria) this;
        }

        public Criteria andZyzdsfGreaterThan(String value) {
            addCriterion("zyzdsf >", value, "zyzdsf");
            return (Criteria) this;
        }

        public Criteria andZyzdsfGreaterThanOrEqualTo(String value) {
            addCriterion("zyzdsf >=", value, "zyzdsf");
            return (Criteria) this;
        }

        public Criteria andZyzdsfLessThan(String value) {
            addCriterion("zyzdsf <", value, "zyzdsf");
            return (Criteria) this;
        }

        public Criteria andZyzdsfLessThanOrEqualTo(String value) {
            addCriterion("zyzdsf <=", value, "zyzdsf");
            return (Criteria) this;
        }

        public Criteria andZyzdsfLike(String value) {
            addCriterion("zyzdsf like", value, "zyzdsf");
            return (Criteria) this;
        }

        public Criteria andZyzdsfNotLike(String value) {
            addCriterion("zyzdsf not like", value, "zyzdsf");
            return (Criteria) this;
        }

        public Criteria andZyzdsfIn(List<String> values) {
            addCriterion("zyzdsf in", values, "zyzdsf");
            return (Criteria) this;
        }

        public Criteria andZyzdsfNotIn(List<String> values) {
            addCriterion("zyzdsf not in", values, "zyzdsf");
            return (Criteria) this;
        }

        public Criteria andZyzdsfBetween(String value1, String value2) {
            addCriterion("zyzdsf between", value1, value2, "zyzdsf");
            return (Criteria) this;
        }

        public Criteria andZyzdsfNotBetween(String value1, String value2) {
            addCriterion("zyzdsf not between", value1, value2, "zyzdsf");
            return (Criteria) this;
        }

        public Criteria andTaocCfIsNull() {
            addCriterion("taoc_cf is null");
            return (Criteria) this;
        }

        public Criteria andTaocCfIsNotNull() {
            addCriterion("taoc_cf is not null");
            return (Criteria) this;
        }

        public Criteria andTaocCfEqualTo(String value) {
            addCriterion("taoc_cf =", value, "taocCf");
            return (Criteria) this;
        }

        public Criteria andTaocCfNotEqualTo(String value) {
            addCriterion("taoc_cf <>", value, "taocCf");
            return (Criteria) this;
        }

        public Criteria andTaocCfGreaterThan(String value) {
            addCriterion("taoc_cf >", value, "taocCf");
            return (Criteria) this;
        }

        public Criteria andTaocCfGreaterThanOrEqualTo(String value) {
            addCriterion("taoc_cf >=", value, "taocCf");
            return (Criteria) this;
        }

        public Criteria andTaocCfLessThan(String value) {
            addCriterion("taoc_cf <", value, "taocCf");
            return (Criteria) this;
        }

        public Criteria andTaocCfLessThanOrEqualTo(String value) {
            addCriterion("taoc_cf <=", value, "taocCf");
            return (Criteria) this;
        }

        public Criteria andTaocCfLike(String value) {
            addCriterion("taoc_cf like", value, "taocCf");
            return (Criteria) this;
        }

        public Criteria andTaocCfNotLike(String value) {
            addCriterion("taoc_cf not like", value, "taocCf");
            return (Criteria) this;
        }

        public Criteria andTaocCfIn(List<String> values) {
            addCriterion("taoc_cf in", values, "taocCf");
            return (Criteria) this;
        }

        public Criteria andTaocCfNotIn(List<String> values) {
            addCriterion("taoc_cf not in", values, "taocCf");
            return (Criteria) this;
        }

        public Criteria andTaocCfBetween(String value1, String value2) {
            addCriterion("taoc_cf between", value1, value2, "taocCf");
            return (Criteria) this;
        }

        public Criteria andTaocCfNotBetween(String value1, String value2) {
            addCriterion("taoc_cf not between", value1, value2, "taocCf");
            return (Criteria) this;
        }

        public Criteria andZfbzIsNull() {
            addCriterion("zfbz is null");
            return (Criteria) this;
        }

        public Criteria andZfbzIsNotNull() {
            addCriterion("zfbz is not null");
            return (Criteria) this;
        }

        public Criteria andZfbzEqualTo(String value) {
            addCriterion("zfbz =", value, "zfbz");
            return (Criteria) this;
        }

        public Criteria andZfbzNotEqualTo(String value) {
            addCriterion("zfbz <>", value, "zfbz");
            return (Criteria) this;
        }

        public Criteria andZfbzGreaterThan(String value) {
            addCriterion("zfbz >", value, "zfbz");
            return (Criteria) this;
        }

        public Criteria andZfbzGreaterThanOrEqualTo(String value) {
            addCriterion("zfbz >=", value, "zfbz");
            return (Criteria) this;
        }

        public Criteria andZfbzLessThan(String value) {
            addCriterion("zfbz <", value, "zfbz");
            return (Criteria) this;
        }

        public Criteria andZfbzLessThanOrEqualTo(String value) {
            addCriterion("zfbz <=", value, "zfbz");
            return (Criteria) this;
        }

        public Criteria andZfbzLike(String value) {
            addCriterion("zfbz like", value, "zfbz");
            return (Criteria) this;
        }

        public Criteria andZfbzNotLike(String value) {
            addCriterion("zfbz not like", value, "zfbz");
            return (Criteria) this;
        }

        public Criteria andZfbzIn(List<String> values) {
            addCriterion("zfbz in", values, "zfbz");
            return (Criteria) this;
        }

        public Criteria andZfbzNotIn(List<String> values) {
            addCriterion("zfbz not in", values, "zfbz");
            return (Criteria) this;
        }

        public Criteria andZfbzBetween(String value1, String value2) {
            addCriterion("zfbz between", value1, value2, "zfbz");
            return (Criteria) this;
        }

        public Criteria andZfbzNotBetween(String value1, String value2) {
            addCriterion("zfbz not between", value1, value2, "zfbz");
            return (Criteria) this;
        }

        public Criteria andHjyIsNull() {
            addCriterion("hjy is null");
            return (Criteria) this;
        }

        public Criteria andHjyIsNotNull() {
            addCriterion("hjy is not null");
            return (Criteria) this;
        }

        public Criteria andHjyEqualTo(String value) {
            addCriterion("hjy =", value, "hjy");
            return (Criteria) this;
        }

        public Criteria andHjyNotEqualTo(String value) {
            addCriterion("hjy <>", value, "hjy");
            return (Criteria) this;
        }

        public Criteria andHjyGreaterThan(String value) {
            addCriterion("hjy >", value, "hjy");
            return (Criteria) this;
        }

        public Criteria andHjyGreaterThanOrEqualTo(String value) {
            addCriterion("hjy >=", value, "hjy");
            return (Criteria) this;
        }

        public Criteria andHjyLessThan(String value) {
            addCriterion("hjy <", value, "hjy");
            return (Criteria) this;
        }

        public Criteria andHjyLessThanOrEqualTo(String value) {
            addCriterion("hjy <=", value, "hjy");
            return (Criteria) this;
        }

        public Criteria andHjyLike(String value) {
            addCriterion("hjy like", value, "hjy");
            return (Criteria) this;
        }

        public Criteria andHjyNotLike(String value) {
            addCriterion("hjy not like", value, "hjy");
            return (Criteria) this;
        }

        public Criteria andHjyIn(List<String> values) {
            addCriterion("hjy in", values, "hjy");
            return (Criteria) this;
        }

        public Criteria andHjyNotIn(List<String> values) {
            addCriterion("hjy not in", values, "hjy");
            return (Criteria) this;
        }

        public Criteria andHjyBetween(String value1, String value2) {
            addCriterion("hjy between", value1, value2, "hjy");
            return (Criteria) this;
        }

        public Criteria andHjyNotBetween(String value1, String value2) {
            addCriterion("hjy not between", value1, value2, "hjy");
            return (Criteria) this;
        }

        public Criteria andJzrqIsNull() {
            addCriterion("jzrq is null");
            return (Criteria) this;
        }

        public Criteria andJzrqIsNotNull() {
            addCriterion("jzrq is not null");
            return (Criteria) this;
        }

        public Criteria andJzrqEqualTo(Date value) {
            addCriterion("jzrq =", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqNotEqualTo(Date value) {
            addCriterion("jzrq <>", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqGreaterThan(Date value) {
            addCriterion("jzrq >", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("jzrq >=", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqLessThan(Date value) {
            addCriterion("jzrq <", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqLessThanOrEqualTo(Date value) {
            addCriterion("jzrq <=", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqIn(List<Date> values) {
            addCriterion("jzrq in", values, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqNotIn(List<Date> values) {
            addCriterion("jzrq not in", values, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqBetween(Date value1, Date value2) {
            addCriterion("jzrq between", value1, value2, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqNotBetween(Date value1, Date value2) {
            addCriterion("jzrq not between", value1, value2, "jzrq");
            return (Criteria) this;
        }

        public Criteria andFphIsNull() {
            addCriterion("fph is null");
            return (Criteria) this;
        }

        public Criteria andFphIsNotNull() {
            addCriterion("fph is not null");
            return (Criteria) this;
        }

        public Criteria andFphEqualTo(String value) {
            addCriterion("fph =", value, "fph");
            return (Criteria) this;
        }

        public Criteria andFphNotEqualTo(String value) {
            addCriterion("fph <>", value, "fph");
            return (Criteria) this;
        }

        public Criteria andFphGreaterThan(String value) {
            addCriterion("fph >", value, "fph");
            return (Criteria) this;
        }

        public Criteria andFphGreaterThanOrEqualTo(String value) {
            addCriterion("fph >=", value, "fph");
            return (Criteria) this;
        }

        public Criteria andFphLessThan(String value) {
            addCriterion("fph <", value, "fph");
            return (Criteria) this;
        }

        public Criteria andFphLessThanOrEqualTo(String value) {
            addCriterion("fph <=", value, "fph");
            return (Criteria) this;
        }

        public Criteria andFphLike(String value) {
            addCriterion("fph like", value, "fph");
            return (Criteria) this;
        }

        public Criteria andFphNotLike(String value) {
            addCriterion("fph not like", value, "fph");
            return (Criteria) this;
        }

        public Criteria andFphIn(List<String> values) {
            addCriterion("fph in", values, "fph");
            return (Criteria) this;
        }

        public Criteria andFphNotIn(List<String> values) {
            addCriterion("fph not in", values, "fph");
            return (Criteria) this;
        }

        public Criteria andFphBetween(String value1, String value2) {
            addCriterion("fph between", value1, value2, "fph");
            return (Criteria) this;
        }

        public Criteria andFphNotBetween(String value1, String value2) {
            addCriterion("fph not between", value1, value2, "fph");
            return (Criteria) this;
        }

        public Criteria andSfdbzIsNull() {
            addCriterion("sfdbz is null");
            return (Criteria) this;
        }

        public Criteria andSfdbzIsNotNull() {
            addCriterion("sfdbz is not null");
            return (Criteria) this;
        }

        public Criteria andSfdbzEqualTo(String value) {
            addCriterion("sfdbz =", value, "sfdbz");
            return (Criteria) this;
        }

        public Criteria andSfdbzNotEqualTo(String value) {
            addCriterion("sfdbz <>", value, "sfdbz");
            return (Criteria) this;
        }

        public Criteria andSfdbzGreaterThan(String value) {
            addCriterion("sfdbz >", value, "sfdbz");
            return (Criteria) this;
        }

        public Criteria andSfdbzGreaterThanOrEqualTo(String value) {
            addCriterion("sfdbz >=", value, "sfdbz");
            return (Criteria) this;
        }

        public Criteria andSfdbzLessThan(String value) {
            addCriterion("sfdbz <", value, "sfdbz");
            return (Criteria) this;
        }

        public Criteria andSfdbzLessThanOrEqualTo(String value) {
            addCriterion("sfdbz <=", value, "sfdbz");
            return (Criteria) this;
        }

        public Criteria andSfdbzLike(String value) {
            addCriterion("sfdbz like", value, "sfdbz");
            return (Criteria) this;
        }

        public Criteria andSfdbzNotLike(String value) {
            addCriterion("sfdbz not like", value, "sfdbz");
            return (Criteria) this;
        }

        public Criteria andSfdbzIn(List<String> values) {
            addCriterion("sfdbz in", values, "sfdbz");
            return (Criteria) this;
        }

        public Criteria andSfdbzNotIn(List<String> values) {
            addCriterion("sfdbz not in", values, "sfdbz");
            return (Criteria) this;
        }

        public Criteria andSfdbzBetween(String value1, String value2) {
            addCriterion("sfdbz between", value1, value2, "sfdbz");
            return (Criteria) this;
        }

        public Criteria andSfdbzNotBetween(String value1, String value2) {
            addCriterion("sfdbz not between", value1, value2, "sfdbz");
            return (Criteria) this;
        }

        public Criteria andFylbIsNull() {
            addCriterion("fylb is null");
            return (Criteria) this;
        }

        public Criteria andFylbIsNotNull() {
            addCriterion("fylb is not null");
            return (Criteria) this;
        }

        public Criteria andFylbEqualTo(String value) {
            addCriterion("fylb =", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbNotEqualTo(String value) {
            addCriterion("fylb <>", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbGreaterThan(String value) {
            addCriterion("fylb >", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbGreaterThanOrEqualTo(String value) {
            addCriterion("fylb >=", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbLessThan(String value) {
            addCriterion("fylb <", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbLessThanOrEqualTo(String value) {
            addCriterion("fylb <=", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbLike(String value) {
            addCriterion("fylb like", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbNotLike(String value) {
            addCriterion("fylb not like", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbIn(List<String> values) {
            addCriterion("fylb in", values, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbNotIn(List<String> values) {
            addCriterion("fylb not in", values, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbBetween(String value1, String value2) {
            addCriterion("fylb between", value1, value2, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbNotBetween(String value1, String value2) {
            addCriterion("fylb not between", value1, value2, "fylb");
            return (Criteria) this;
        }

        public Criteria andYfId0IsNull() {
            addCriterion("yf_id0 is null");
            return (Criteria) this;
        }

        public Criteria andYfId0IsNotNull() {
            addCriterion("yf_id0 is not null");
            return (Criteria) this;
        }

        public Criteria andYfId0EqualTo(String value) {
            addCriterion("yf_id0 =", value, "yfId0");
            return (Criteria) this;
        }

        public Criteria andYfId0NotEqualTo(String value) {
            addCriterion("yf_id0 <>", value, "yfId0");
            return (Criteria) this;
        }

        public Criteria andYfId0GreaterThan(String value) {
            addCriterion("yf_id0 >", value, "yfId0");
            return (Criteria) this;
        }

        public Criteria andYfId0GreaterThanOrEqualTo(String value) {
            addCriterion("yf_id0 >=", value, "yfId0");
            return (Criteria) this;
        }

        public Criteria andYfId0LessThan(String value) {
            addCriterion("yf_id0 <", value, "yfId0");
            return (Criteria) this;
        }

        public Criteria andYfId0LessThanOrEqualTo(String value) {
            addCriterion("yf_id0 <=", value, "yfId0");
            return (Criteria) this;
        }

        public Criteria andYfId0Like(String value) {
            addCriterion("yf_id0 like", value, "yfId0");
            return (Criteria) this;
        }

        public Criteria andYfId0NotLike(String value) {
            addCriterion("yf_id0 not like", value, "yfId0");
            return (Criteria) this;
        }

        public Criteria andYfId0In(List<String> values) {
            addCriterion("yf_id0 in", values, "yfId0");
            return (Criteria) this;
        }

        public Criteria andYfId0NotIn(List<String> values) {
            addCriterion("yf_id0 not in", values, "yfId0");
            return (Criteria) this;
        }

        public Criteria andYfId0Between(String value1, String value2) {
            addCriterion("yf_id0 between", value1, value2, "yfId0");
            return (Criteria) this;
        }

        public Criteria andYfId0NotBetween(String value1, String value2) {
            addCriterion("yf_id0 not between", value1, value2, "yfId0");
            return (Criteria) this;
        }

        public Criteria andZjeIsNull() {
            addCriterion("zje is null");
            return (Criteria) this;
        }

        public Criteria andZjeIsNotNull() {
            addCriterion("zje is not null");
            return (Criteria) this;
        }

        public Criteria andZjeEqualTo(BigDecimal value) {
            addCriterion("zje =", value, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeNotEqualTo(BigDecimal value) {
            addCriterion("zje <>", value, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeGreaterThan(BigDecimal value) {
            addCriterion("zje >", value, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zje >=", value, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeLessThan(BigDecimal value) {
            addCriterion("zje <", value, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zje <=", value, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeIn(List<BigDecimal> values) {
            addCriterion("zje in", values, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeNotIn(List<BigDecimal> values) {
            addCriterion("zje not in", values, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zje between", value1, value2, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zje not between", value1, value2, "zje");
            return (Criteria) this;
        }

        public Criteria andSjeIsNull() {
            addCriterion("sje is null");
            return (Criteria) this;
        }

        public Criteria andSjeIsNotNull() {
            addCriterion("sje is not null");
            return (Criteria) this;
        }

        public Criteria andSjeEqualTo(BigDecimal value) {
            addCriterion("sje =", value, "sje");
            return (Criteria) this;
        }

        public Criteria andSjeNotEqualTo(BigDecimal value) {
            addCriterion("sje <>", value, "sje");
            return (Criteria) this;
        }

        public Criteria andSjeGreaterThan(BigDecimal value) {
            addCriterion("sje >", value, "sje");
            return (Criteria) this;
        }

        public Criteria andSjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sje >=", value, "sje");
            return (Criteria) this;
        }

        public Criteria andSjeLessThan(BigDecimal value) {
            addCriterion("sje <", value, "sje");
            return (Criteria) this;
        }

        public Criteria andSjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sje <=", value, "sje");
            return (Criteria) this;
        }

        public Criteria andSjeIn(List<BigDecimal> values) {
            addCriterion("sje in", values, "sje");
            return (Criteria) this;
        }

        public Criteria andSjeNotIn(List<BigDecimal> values) {
            addCriterion("sje not in", values, "sje");
            return (Criteria) this;
        }

        public Criteria andSjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sje between", value1, value2, "sje");
            return (Criteria) this;
        }

        public Criteria andSjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sje not between", value1, value2, "sje");
            return (Criteria) this;
        }

        public Criteria andYbIdIsNull() {
            addCriterion("yb_id is null");
            return (Criteria) this;
        }

        public Criteria andYbIdIsNotNull() {
            addCriterion("yb_id is not null");
            return (Criteria) this;
        }

        public Criteria andYbIdEqualTo(Integer value) {
            addCriterion("yb_id =", value, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdNotEqualTo(Integer value) {
            addCriterion("yb_id <>", value, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdGreaterThan(Integer value) {
            addCriterion("yb_id >", value, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yb_id >=", value, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdLessThan(Integer value) {
            addCriterion("yb_id <", value, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdLessThanOrEqualTo(Integer value) {
            addCriterion("yb_id <=", value, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdIn(List<Integer> values) {
            addCriterion("yb_id in", values, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdNotIn(List<Integer> values) {
            addCriterion("yb_id not in", values, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdBetween(Integer value1, Integer value2) {
            addCriterion("yb_id between", value1, value2, "ybId");
            return (Criteria) this;
        }

        public Criteria andYbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yb_id not between", value1, value2, "ybId");
            return (Criteria) this;
        }

        public Criteria andTfjeIsNull() {
            addCriterion("tfje is null");
            return (Criteria) this;
        }

        public Criteria andTfjeIsNotNull() {
            addCriterion("tfje is not null");
            return (Criteria) this;
        }

        public Criteria andTfjeEqualTo(BigDecimal value) {
            addCriterion("tfje =", value, "tfje");
            return (Criteria) this;
        }

        public Criteria andTfjeNotEqualTo(BigDecimal value) {
            addCriterion("tfje <>", value, "tfje");
            return (Criteria) this;
        }

        public Criteria andTfjeGreaterThan(BigDecimal value) {
            addCriterion("tfje >", value, "tfje");
            return (Criteria) this;
        }

        public Criteria andTfjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tfje >=", value, "tfje");
            return (Criteria) this;
        }

        public Criteria andTfjeLessThan(BigDecimal value) {
            addCriterion("tfje <", value, "tfje");
            return (Criteria) this;
        }

        public Criteria andTfjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tfje <=", value, "tfje");
            return (Criteria) this;
        }

        public Criteria andTfjeIn(List<BigDecimal> values) {
            addCriterion("tfje in", values, "tfje");
            return (Criteria) this;
        }

        public Criteria andTfjeNotIn(List<BigDecimal> values) {
            addCriterion("tfje not in", values, "tfje");
            return (Criteria) this;
        }

        public Criteria andTfjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tfje between", value1, value2, "tfje");
            return (Criteria) this;
        }

        public Criteria andTfjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tfje not between", value1, value2, "tfje");
            return (Criteria) this;
        }

        public Criteria andYbzhIsNull() {
            addCriterion("ybzh is null");
            return (Criteria) this;
        }

        public Criteria andYbzhIsNotNull() {
            addCriterion("ybzh is not null");
            return (Criteria) this;
        }

        public Criteria andYbzhEqualTo(String value) {
            addCriterion("ybzh =", value, "ybzh");
            return (Criteria) this;
        }

        public Criteria andYbzhNotEqualTo(String value) {
            addCriterion("ybzh <>", value, "ybzh");
            return (Criteria) this;
        }

        public Criteria andYbzhGreaterThan(String value) {
            addCriterion("ybzh >", value, "ybzh");
            return (Criteria) this;
        }

        public Criteria andYbzhGreaterThanOrEqualTo(String value) {
            addCriterion("ybzh >=", value, "ybzh");
            return (Criteria) this;
        }

        public Criteria andYbzhLessThan(String value) {
            addCriterion("ybzh <", value, "ybzh");
            return (Criteria) this;
        }

        public Criteria andYbzhLessThanOrEqualTo(String value) {
            addCriterion("ybzh <=", value, "ybzh");
            return (Criteria) this;
        }

        public Criteria andYbzhLike(String value) {
            addCriterion("ybzh like", value, "ybzh");
            return (Criteria) this;
        }

        public Criteria andYbzhNotLike(String value) {
            addCriterion("ybzh not like", value, "ybzh");
            return (Criteria) this;
        }

        public Criteria andYbzhIn(List<String> values) {
            addCriterion("ybzh in", values, "ybzh");
            return (Criteria) this;
        }

        public Criteria andYbzhNotIn(List<String> values) {
            addCriterion("ybzh not in", values, "ybzh");
            return (Criteria) this;
        }

        public Criteria andYbzhBetween(String value1, String value2) {
            addCriterion("ybzh between", value1, value2, "ybzh");
            return (Criteria) this;
        }

        public Criteria andYbzhNotBetween(String value1, String value2) {
            addCriterion("ybzh not between", value1, value2, "ybzh");
            return (Criteria) this;
        }

        public Criteria andZhjeIsNull() {
            addCriterion("zhje is null");
            return (Criteria) this;
        }

        public Criteria andZhjeIsNotNull() {
            addCriterion("zhje is not null");
            return (Criteria) this;
        }

        public Criteria andZhjeEqualTo(BigDecimal value) {
            addCriterion("zhje =", value, "zhje");
            return (Criteria) this;
        }

        public Criteria andZhjeNotEqualTo(BigDecimal value) {
            addCriterion("zhje <>", value, "zhje");
            return (Criteria) this;
        }

        public Criteria andZhjeGreaterThan(BigDecimal value) {
            addCriterion("zhje >", value, "zhje");
            return (Criteria) this;
        }

        public Criteria andZhjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zhje >=", value, "zhje");
            return (Criteria) this;
        }

        public Criteria andZhjeLessThan(BigDecimal value) {
            addCriterion("zhje <", value, "zhje");
            return (Criteria) this;
        }

        public Criteria andZhjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zhje <=", value, "zhje");
            return (Criteria) this;
        }

        public Criteria andZhjeIn(List<BigDecimal> values) {
            addCriterion("zhje in", values, "zhje");
            return (Criteria) this;
        }

        public Criteria andZhjeNotIn(List<BigDecimal> values) {
            addCriterion("zhje not in", values, "zhje");
            return (Criteria) this;
        }

        public Criteria andZhjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zhje between", value1, value2, "zhje");
            return (Criteria) this;
        }

        public Criteria andZhjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zhje not between", value1, value2, "zhje");
            return (Criteria) this;
        }

        public Criteria andXjjeIsNull() {
            addCriterion("xjje is null");
            return (Criteria) this;
        }

        public Criteria andXjjeIsNotNull() {
            addCriterion("xjje is not null");
            return (Criteria) this;
        }

        public Criteria andXjjeEqualTo(BigDecimal value) {
            addCriterion("xjje =", value, "xjje");
            return (Criteria) this;
        }

        public Criteria andXjjeNotEqualTo(BigDecimal value) {
            addCriterion("xjje <>", value, "xjje");
            return (Criteria) this;
        }

        public Criteria andXjjeGreaterThan(BigDecimal value) {
            addCriterion("xjje >", value, "xjje");
            return (Criteria) this;
        }

        public Criteria andXjjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("xjje >=", value, "xjje");
            return (Criteria) this;
        }

        public Criteria andXjjeLessThan(BigDecimal value) {
            addCriterion("xjje <", value, "xjje");
            return (Criteria) this;
        }

        public Criteria andXjjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("xjje <=", value, "xjje");
            return (Criteria) this;
        }

        public Criteria andXjjeIn(List<BigDecimal> values) {
            addCriterion("xjje in", values, "xjje");
            return (Criteria) this;
        }

        public Criteria andXjjeNotIn(List<BigDecimal> values) {
            addCriterion("xjje not in", values, "xjje");
            return (Criteria) this;
        }

        public Criteria andXjjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("xjje between", value1, value2, "xjje");
            return (Criteria) this;
        }

        public Criteria andXjjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("xjje not between", value1, value2, "xjje");
            return (Criteria) this;
        }

        public Criteria andYbjeIsNull() {
            addCriterion("ybje is null");
            return (Criteria) this;
        }

        public Criteria andYbjeIsNotNull() {
            addCriterion("ybje is not null");
            return (Criteria) this;
        }

        public Criteria andYbjeEqualTo(BigDecimal value) {
            addCriterion("ybje =", value, "ybje");
            return (Criteria) this;
        }

        public Criteria andYbjeNotEqualTo(BigDecimal value) {
            addCriterion("ybje <>", value, "ybje");
            return (Criteria) this;
        }

        public Criteria andYbjeGreaterThan(BigDecimal value) {
            addCriterion("ybje >", value, "ybje");
            return (Criteria) this;
        }

        public Criteria andYbjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ybje >=", value, "ybje");
            return (Criteria) this;
        }

        public Criteria andYbjeLessThan(BigDecimal value) {
            addCriterion("ybje <", value, "ybje");
            return (Criteria) this;
        }

        public Criteria andYbjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ybje <=", value, "ybje");
            return (Criteria) this;
        }

        public Criteria andYbjeIn(List<BigDecimal> values) {
            addCriterion("ybje in", values, "ybje");
            return (Criteria) this;
        }

        public Criteria andYbjeNotIn(List<BigDecimal> values) {
            addCriterion("ybje not in", values, "ybje");
            return (Criteria) this;
        }

        public Criteria andYbjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ybje between", value1, value2, "ybje");
            return (Criteria) this;
        }

        public Criteria andYbjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ybje not between", value1, value2, "ybje");
            return (Criteria) this;
        }

        public Criteria andYjsqbzIsNull() {
            addCriterion("yjsqbz is null");
            return (Criteria) this;
        }

        public Criteria andYjsqbzIsNotNull() {
            addCriterion("yjsqbz is not null");
            return (Criteria) this;
        }

        public Criteria andYjsqbzEqualTo(String value) {
            addCriterion("yjsqbz =", value, "yjsqbz");
            return (Criteria) this;
        }

        public Criteria andYjsqbzNotEqualTo(String value) {
            addCriterion("yjsqbz <>", value, "yjsqbz");
            return (Criteria) this;
        }

        public Criteria andYjsqbzGreaterThan(String value) {
            addCriterion("yjsqbz >", value, "yjsqbz");
            return (Criteria) this;
        }

        public Criteria andYjsqbzGreaterThanOrEqualTo(String value) {
            addCriterion("yjsqbz >=", value, "yjsqbz");
            return (Criteria) this;
        }

        public Criteria andYjsqbzLessThan(String value) {
            addCriterion("yjsqbz <", value, "yjsqbz");
            return (Criteria) this;
        }

        public Criteria andYjsqbzLessThanOrEqualTo(String value) {
            addCriterion("yjsqbz <=", value, "yjsqbz");
            return (Criteria) this;
        }

        public Criteria andYjsqbzLike(String value) {
            addCriterion("yjsqbz like", value, "yjsqbz");
            return (Criteria) this;
        }

        public Criteria andYjsqbzNotLike(String value) {
            addCriterion("yjsqbz not like", value, "yjsqbz");
            return (Criteria) this;
        }

        public Criteria andYjsqbzIn(List<String> values) {
            addCriterion("yjsqbz in", values, "yjsqbz");
            return (Criteria) this;
        }

        public Criteria andYjsqbzNotIn(List<String> values) {
            addCriterion("yjsqbz not in", values, "yjsqbz");
            return (Criteria) this;
        }

        public Criteria andYjsqbzBetween(String value1, String value2) {
            addCriterion("yjsqbz between", value1, value2, "yjsqbz");
            return (Criteria) this;
        }

        public Criteria andYjsqbzNotBetween(String value1, String value2) {
            addCriterion("yjsqbz not between", value1, value2, "yjsqbz");
            return (Criteria) this;
        }

        public Criteria andJczdIsNull() {
            addCriterion("jczd is null");
            return (Criteria) this;
        }

        public Criteria andJczdIsNotNull() {
            addCriterion("jczd is not null");
            return (Criteria) this;
        }

        public Criteria andJczdEqualTo(String value) {
            addCriterion("jczd =", value, "jczd");
            return (Criteria) this;
        }

        public Criteria andJczdNotEqualTo(String value) {
            addCriterion("jczd <>", value, "jczd");
            return (Criteria) this;
        }

        public Criteria andJczdGreaterThan(String value) {
            addCriterion("jczd >", value, "jczd");
            return (Criteria) this;
        }

        public Criteria andJczdGreaterThanOrEqualTo(String value) {
            addCriterion("jczd >=", value, "jczd");
            return (Criteria) this;
        }

        public Criteria andJczdLessThan(String value) {
            addCriterion("jczd <", value, "jczd");
            return (Criteria) this;
        }

        public Criteria andJczdLessThanOrEqualTo(String value) {
            addCriterion("jczd <=", value, "jczd");
            return (Criteria) this;
        }

        public Criteria andJczdLike(String value) {
            addCriterion("jczd like", value, "jczd");
            return (Criteria) this;
        }

        public Criteria andJczdNotLike(String value) {
            addCriterion("jczd not like", value, "jczd");
            return (Criteria) this;
        }

        public Criteria andJczdIn(List<String> values) {
            addCriterion("jczd in", values, "jczd");
            return (Criteria) this;
        }

        public Criteria andJczdNotIn(List<String> values) {
            addCriterion("jczd not in", values, "jczd");
            return (Criteria) this;
        }

        public Criteria andJczdBetween(String value1, String value2) {
            addCriterion("jczd between", value1, value2, "jczd");
            return (Criteria) this;
        }

        public Criteria andJczdNotBetween(String value1, String value2) {
            addCriterion("jczd not between", value1, value2, "jczd");
            return (Criteria) this;
        }

        public Criteria andYhjeIsNull() {
            addCriterion("yhje is null");
            return (Criteria) this;
        }

        public Criteria andYhjeIsNotNull() {
            addCriterion("yhje is not null");
            return (Criteria) this;
        }

        public Criteria andYhjeEqualTo(BigDecimal value) {
            addCriterion("yhje =", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeNotEqualTo(BigDecimal value) {
            addCriterion("yhje <>", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeGreaterThan(BigDecimal value) {
            addCriterion("yhje >", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yhje >=", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeLessThan(BigDecimal value) {
            addCriterion("yhje <", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yhje <=", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeIn(List<BigDecimal> values) {
            addCriterion("yhje in", values, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeNotIn(List<BigDecimal> values) {
            addCriterion("yhje not in", values, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yhje between", value1, value2, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yhje not between", value1, value2, "yhje");
            return (Criteria) this;
        }

        public Criteria andYjbzIsNull() {
            addCriterion("yjbz is null");
            return (Criteria) this;
        }

        public Criteria andYjbzIsNotNull() {
            addCriterion("yjbz is not null");
            return (Criteria) this;
        }

        public Criteria andYjbzEqualTo(String value) {
            addCriterion("yjbz =", value, "yjbz");
            return (Criteria) this;
        }

        public Criteria andYjbzNotEqualTo(String value) {
            addCriterion("yjbz <>", value, "yjbz");
            return (Criteria) this;
        }

        public Criteria andYjbzGreaterThan(String value) {
            addCriterion("yjbz >", value, "yjbz");
            return (Criteria) this;
        }

        public Criteria andYjbzGreaterThanOrEqualTo(String value) {
            addCriterion("yjbz >=", value, "yjbz");
            return (Criteria) this;
        }

        public Criteria andYjbzLessThan(String value) {
            addCriterion("yjbz <", value, "yjbz");
            return (Criteria) this;
        }

        public Criteria andYjbzLessThanOrEqualTo(String value) {
            addCriterion("yjbz <=", value, "yjbz");
            return (Criteria) this;
        }

        public Criteria andYjbzLike(String value) {
            addCriterion("yjbz like", value, "yjbz");
            return (Criteria) this;
        }

        public Criteria andYjbzNotLike(String value) {
            addCriterion("yjbz not like", value, "yjbz");
            return (Criteria) this;
        }

        public Criteria andYjbzIn(List<String> values) {
            addCriterion("yjbz in", values, "yjbz");
            return (Criteria) this;
        }

        public Criteria andYjbzNotIn(List<String> values) {
            addCriterion("yjbz not in", values, "yjbz");
            return (Criteria) this;
        }

        public Criteria andYjbzBetween(String value1, String value2) {
            addCriterion("yjbz between", value1, value2, "yjbz");
            return (Criteria) this;
        }

        public Criteria andYjbzNotBetween(String value1, String value2) {
            addCriterion("yjbz not between", value1, value2, "yjbz");
            return (Criteria) this;
        }

        public Criteria andShbzIsNull() {
            addCriterion("shbz is null");
            return (Criteria) this;
        }

        public Criteria andShbzIsNotNull() {
            addCriterion("shbz is not null");
            return (Criteria) this;
        }

        public Criteria andShbzEqualTo(String value) {
            addCriterion("shbz =", value, "shbz");
            return (Criteria) this;
        }

        public Criteria andShbzNotEqualTo(String value) {
            addCriterion("shbz <>", value, "shbz");
            return (Criteria) this;
        }

        public Criteria andShbzGreaterThan(String value) {
            addCriterion("shbz >", value, "shbz");
            return (Criteria) this;
        }

        public Criteria andShbzGreaterThanOrEqualTo(String value) {
            addCriterion("shbz >=", value, "shbz");
            return (Criteria) this;
        }

        public Criteria andShbzLessThan(String value) {
            addCriterion("shbz <", value, "shbz");
            return (Criteria) this;
        }

        public Criteria andShbzLessThanOrEqualTo(String value) {
            addCriterion("shbz <=", value, "shbz");
            return (Criteria) this;
        }

        public Criteria andShbzLike(String value) {
            addCriterion("shbz like", value, "shbz");
            return (Criteria) this;
        }

        public Criteria andShbzNotLike(String value) {
            addCriterion("shbz not like", value, "shbz");
            return (Criteria) this;
        }

        public Criteria andShbzIn(List<String> values) {
            addCriterion("shbz in", values, "shbz");
            return (Criteria) this;
        }

        public Criteria andShbzNotIn(List<String> values) {
            addCriterion("shbz not in", values, "shbz");
            return (Criteria) this;
        }

        public Criteria andShbzBetween(String value1, String value2) {
            addCriterion("shbz between", value1, value2, "shbz");
            return (Criteria) this;
        }

        public Criteria andShbzNotBetween(String value1, String value2) {
            addCriterion("shbz not between", value1, value2, "shbz");
            return (Criteria) this;
        }

        public Criteria andDybzIsNull() {
            addCriterion("dybz is null");
            return (Criteria) this;
        }

        public Criteria andDybzIsNotNull() {
            addCriterion("dybz is not null");
            return (Criteria) this;
        }

        public Criteria andDybzEqualTo(String value) {
            addCriterion("dybz =", value, "dybz");
            return (Criteria) this;
        }

        public Criteria andDybzNotEqualTo(String value) {
            addCriterion("dybz <>", value, "dybz");
            return (Criteria) this;
        }

        public Criteria andDybzGreaterThan(String value) {
            addCriterion("dybz >", value, "dybz");
            return (Criteria) this;
        }

        public Criteria andDybzGreaterThanOrEqualTo(String value) {
            addCriterion("dybz >=", value, "dybz");
            return (Criteria) this;
        }

        public Criteria andDybzLessThan(String value) {
            addCriterion("dybz <", value, "dybz");
            return (Criteria) this;
        }

        public Criteria andDybzLessThanOrEqualTo(String value) {
            addCriterion("dybz <=", value, "dybz");
            return (Criteria) this;
        }

        public Criteria andDybzLike(String value) {
            addCriterion("dybz like", value, "dybz");
            return (Criteria) this;
        }

        public Criteria andDybzNotLike(String value) {
            addCriterion("dybz not like", value, "dybz");
            return (Criteria) this;
        }

        public Criteria andDybzIn(List<String> values) {
            addCriterion("dybz in", values, "dybz");
            return (Criteria) this;
        }

        public Criteria andDybzNotIn(List<String> values) {
            addCriterion("dybz not in", values, "dybz");
            return (Criteria) this;
        }

        public Criteria andDybzBetween(String value1, String value2) {
            addCriterion("dybz between", value1, value2, "dybz");
            return (Criteria) this;
        }

        public Criteria andDybzNotBetween(String value1, String value2) {
            addCriterion("dybz not between", value1, value2, "dybz");
            return (Criteria) this;
        }

        public Criteria andYbdjlshIsNull() {
            addCriterion("ybdjlsh is null");
            return (Criteria) this;
        }

        public Criteria andYbdjlshIsNotNull() {
            addCriterion("ybdjlsh is not null");
            return (Criteria) this;
        }

        public Criteria andYbdjlshEqualTo(String value) {
            addCriterion("ybdjlsh =", value, "ybdjlsh");
            return (Criteria) this;
        }

        public Criteria andYbdjlshNotEqualTo(String value) {
            addCriterion("ybdjlsh <>", value, "ybdjlsh");
            return (Criteria) this;
        }

        public Criteria andYbdjlshGreaterThan(String value) {
            addCriterion("ybdjlsh >", value, "ybdjlsh");
            return (Criteria) this;
        }

        public Criteria andYbdjlshGreaterThanOrEqualTo(String value) {
            addCriterion("ybdjlsh >=", value, "ybdjlsh");
            return (Criteria) this;
        }

        public Criteria andYbdjlshLessThan(String value) {
            addCriterion("ybdjlsh <", value, "ybdjlsh");
            return (Criteria) this;
        }

        public Criteria andYbdjlshLessThanOrEqualTo(String value) {
            addCriterion("ybdjlsh <=", value, "ybdjlsh");
            return (Criteria) this;
        }

        public Criteria andYbdjlshLike(String value) {
            addCriterion("ybdjlsh like", value, "ybdjlsh");
            return (Criteria) this;
        }

        public Criteria andYbdjlshNotLike(String value) {
            addCriterion("ybdjlsh not like", value, "ybdjlsh");
            return (Criteria) this;
        }

        public Criteria andYbdjlshIn(List<String> values) {
            addCriterion("ybdjlsh in", values, "ybdjlsh");
            return (Criteria) this;
        }

        public Criteria andYbdjlshNotIn(List<String> values) {
            addCriterion("ybdjlsh not in", values, "ybdjlsh");
            return (Criteria) this;
        }

        public Criteria andYbdjlshBetween(String value1, String value2) {
            addCriterion("ybdjlsh between", value1, value2, "ybdjlsh");
            return (Criteria) this;
        }

        public Criteria andYbdjlshNotBetween(String value1, String value2) {
            addCriterion("ybdjlsh not between", value1, value2, "ybdjlsh");
            return (Criteria) this;
        }

        public Criteria andYblsh1IsNull() {
            addCriterion("yblsh1 is null");
            return (Criteria) this;
        }

        public Criteria andYblsh1IsNotNull() {
            addCriterion("yblsh1 is not null");
            return (Criteria) this;
        }

        public Criteria andYblsh1EqualTo(String value) {
            addCriterion("yblsh1 =", value, "yblsh1");
            return (Criteria) this;
        }

        public Criteria andYblsh1NotEqualTo(String value) {
            addCriterion("yblsh1 <>", value, "yblsh1");
            return (Criteria) this;
        }

        public Criteria andYblsh1GreaterThan(String value) {
            addCriterion("yblsh1 >", value, "yblsh1");
            return (Criteria) this;
        }

        public Criteria andYblsh1GreaterThanOrEqualTo(String value) {
            addCriterion("yblsh1 >=", value, "yblsh1");
            return (Criteria) this;
        }

        public Criteria andYblsh1LessThan(String value) {
            addCriterion("yblsh1 <", value, "yblsh1");
            return (Criteria) this;
        }

        public Criteria andYblsh1LessThanOrEqualTo(String value) {
            addCriterion("yblsh1 <=", value, "yblsh1");
            return (Criteria) this;
        }

        public Criteria andYblsh1Like(String value) {
            addCriterion("yblsh1 like", value, "yblsh1");
            return (Criteria) this;
        }

        public Criteria andYblsh1NotLike(String value) {
            addCriterion("yblsh1 not like", value, "yblsh1");
            return (Criteria) this;
        }

        public Criteria andYblsh1In(List<String> values) {
            addCriterion("yblsh1 in", values, "yblsh1");
            return (Criteria) this;
        }

        public Criteria andYblsh1NotIn(List<String> values) {
            addCriterion("yblsh1 not in", values, "yblsh1");
            return (Criteria) this;
        }

        public Criteria andYblsh1Between(String value1, String value2) {
            addCriterion("yblsh1 between", value1, value2, "yblsh1");
            return (Criteria) this;
        }

        public Criteria andYblsh1NotBetween(String value1, String value2) {
            addCriterion("yblsh1 not between", value1, value2, "yblsh1");
            return (Criteria) this;
        }

        public Criteria andZszhmIsNull() {
            addCriterion("zszhm is null");
            return (Criteria) this;
        }

        public Criteria andZszhmIsNotNull() {
            addCriterion("zszhm is not null");
            return (Criteria) this;
        }

        public Criteria andZszhmEqualTo(String value) {
            addCriterion("zszhm =", value, "zszhm");
            return (Criteria) this;
        }

        public Criteria andZszhmNotEqualTo(String value) {
            addCriterion("zszhm <>", value, "zszhm");
            return (Criteria) this;
        }

        public Criteria andZszhmGreaterThan(String value) {
            addCriterion("zszhm >", value, "zszhm");
            return (Criteria) this;
        }

        public Criteria andZszhmGreaterThanOrEqualTo(String value) {
            addCriterion("zszhm >=", value, "zszhm");
            return (Criteria) this;
        }

        public Criteria andZszhmLessThan(String value) {
            addCriterion("zszhm <", value, "zszhm");
            return (Criteria) this;
        }

        public Criteria andZszhmLessThanOrEqualTo(String value) {
            addCriterion("zszhm <=", value, "zszhm");
            return (Criteria) this;
        }

        public Criteria andZszhmLike(String value) {
            addCriterion("zszhm like", value, "zszhm");
            return (Criteria) this;
        }

        public Criteria andZszhmNotLike(String value) {
            addCriterion("zszhm not like", value, "zszhm");
            return (Criteria) this;
        }

        public Criteria andZszhmIn(List<String> values) {
            addCriterion("zszhm in", values, "zszhm");
            return (Criteria) this;
        }

        public Criteria andZszhmNotIn(List<String> values) {
            addCriterion("zszhm not in", values, "zszhm");
            return (Criteria) this;
        }

        public Criteria andZszhmBetween(String value1, String value2) {
            addCriterion("zszhm between", value1, value2, "zszhm");
            return (Criteria) this;
        }

        public Criteria andZszhmNotBetween(String value1, String value2) {
            addCriterion("zszhm not between", value1, value2, "zszhm");
            return (Criteria) this;
        }

        public Criteria andCfsqlshIsNull() {
            addCriterion("cfsqlsh is null");
            return (Criteria) this;
        }

        public Criteria andCfsqlshIsNotNull() {
            addCriterion("cfsqlsh is not null");
            return (Criteria) this;
        }

        public Criteria andCfsqlshEqualTo(String value) {
            addCriterion("cfsqlsh =", value, "cfsqlsh");
            return (Criteria) this;
        }

        public Criteria andCfsqlshNotEqualTo(String value) {
            addCriterion("cfsqlsh <>", value, "cfsqlsh");
            return (Criteria) this;
        }

        public Criteria andCfsqlshGreaterThan(String value) {
            addCriterion("cfsqlsh >", value, "cfsqlsh");
            return (Criteria) this;
        }

        public Criteria andCfsqlshGreaterThanOrEqualTo(String value) {
            addCriterion("cfsqlsh >=", value, "cfsqlsh");
            return (Criteria) this;
        }

        public Criteria andCfsqlshLessThan(String value) {
            addCriterion("cfsqlsh <", value, "cfsqlsh");
            return (Criteria) this;
        }

        public Criteria andCfsqlshLessThanOrEqualTo(String value) {
            addCriterion("cfsqlsh <=", value, "cfsqlsh");
            return (Criteria) this;
        }

        public Criteria andCfsqlshLike(String value) {
            addCriterion("cfsqlsh like", value, "cfsqlsh");
            return (Criteria) this;
        }

        public Criteria andCfsqlshNotLike(String value) {
            addCriterion("cfsqlsh not like", value, "cfsqlsh");
            return (Criteria) this;
        }

        public Criteria andCfsqlshIn(List<String> values) {
            addCriterion("cfsqlsh in", values, "cfsqlsh");
            return (Criteria) this;
        }

        public Criteria andCfsqlshNotIn(List<String> values) {
            addCriterion("cfsqlsh not in", values, "cfsqlsh");
            return (Criteria) this;
        }

        public Criteria andCfsqlshBetween(String value1, String value2) {
            addCriterion("cfsqlsh between", value1, value2, "cfsqlsh");
            return (Criteria) this;
        }

        public Criteria andCfsqlshNotBetween(String value1, String value2) {
            addCriterion("cfsqlsh not between", value1, value2, "cfsqlsh");
            return (Criteria) this;
        }

        public Criteria andHbwcIsNull() {
            addCriterion("hbwc is null");
            return (Criteria) this;
        }

        public Criteria andHbwcIsNotNull() {
            addCriterion("hbwc is not null");
            return (Criteria) this;
        }

        public Criteria andHbwcEqualTo(BigDecimal value) {
            addCriterion("hbwc =", value, "hbwc");
            return (Criteria) this;
        }

        public Criteria andHbwcNotEqualTo(BigDecimal value) {
            addCriterion("hbwc <>", value, "hbwc");
            return (Criteria) this;
        }

        public Criteria andHbwcGreaterThan(BigDecimal value) {
            addCriterion("hbwc >", value, "hbwc");
            return (Criteria) this;
        }

        public Criteria andHbwcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hbwc >=", value, "hbwc");
            return (Criteria) this;
        }

        public Criteria andHbwcLessThan(BigDecimal value) {
            addCriterion("hbwc <", value, "hbwc");
            return (Criteria) this;
        }

        public Criteria andHbwcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hbwc <=", value, "hbwc");
            return (Criteria) this;
        }

        public Criteria andHbwcIn(List<BigDecimal> values) {
            addCriterion("hbwc in", values, "hbwc");
            return (Criteria) this;
        }

        public Criteria andHbwcNotIn(List<BigDecimal> values) {
            addCriterion("hbwc not in", values, "hbwc");
            return (Criteria) this;
        }

        public Criteria andHbwcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hbwc between", value1, value2, "hbwc");
            return (Criteria) this;
        }

        public Criteria andHbwcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hbwc not between", value1, value2, "hbwc");
            return (Criteria) this;
        }

        public Criteria andYsjeIsNull() {
            addCriterion("ysje is null");
            return (Criteria) this;
        }

        public Criteria andYsjeIsNotNull() {
            addCriterion("ysje is not null");
            return (Criteria) this;
        }

        public Criteria andYsjeEqualTo(BigDecimal value) {
            addCriterion("ysje =", value, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeNotEqualTo(BigDecimal value) {
            addCriterion("ysje <>", value, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeGreaterThan(BigDecimal value) {
            addCriterion("ysje >", value, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ysje >=", value, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeLessThan(BigDecimal value) {
            addCriterion("ysje <", value, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ysje <=", value, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeIn(List<BigDecimal> values) {
            addCriterion("ysje in", values, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeNotIn(List<BigDecimal> values) {
            addCriterion("ysje not in", values, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ysje between", value1, value2, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ysje not between", value1, value2, "ysje");
            return (Criteria) this;
        }

        public Criteria andSxIdIsNull() {
            addCriterion("sx_id is null");
            return (Criteria) this;
        }

        public Criteria andSxIdIsNotNull() {
            addCriterion("sx_id is not null");
            return (Criteria) this;
        }

        public Criteria andSxIdEqualTo(Integer value) {
            addCriterion("sx_id =", value, "sxId");
            return (Criteria) this;
        }

        public Criteria andSxIdNotEqualTo(Integer value) {
            addCriterion("sx_id <>", value, "sxId");
            return (Criteria) this;
        }

        public Criteria andSxIdGreaterThan(Integer value) {
            addCriterion("sx_id >", value, "sxId");
            return (Criteria) this;
        }

        public Criteria andSxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sx_id >=", value, "sxId");
            return (Criteria) this;
        }

        public Criteria andSxIdLessThan(Integer value) {
            addCriterion("sx_id <", value, "sxId");
            return (Criteria) this;
        }

        public Criteria andSxIdLessThanOrEqualTo(Integer value) {
            addCriterion("sx_id <=", value, "sxId");
            return (Criteria) this;
        }

        public Criteria andSxIdIn(List<Integer> values) {
            addCriterion("sx_id in", values, "sxId");
            return (Criteria) this;
        }

        public Criteria andSxIdNotIn(List<Integer> values) {
            addCriterion("sx_id not in", values, "sxId");
            return (Criteria) this;
        }

        public Criteria andSxIdBetween(Integer value1, Integer value2) {
            addCriterion("sx_id between", value1, value2, "sxId");
            return (Criteria) this;
        }

        public Criteria andSxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sx_id not between", value1, value2, "sxId");
            return (Criteria) this;
        }

        public Criteria andYwrqIsNull() {
            addCriterion("ywrq is null");
            return (Criteria) this;
        }

        public Criteria andYwrqIsNotNull() {
            addCriterion("ywrq is not null");
            return (Criteria) this;
        }

        public Criteria andYwrqEqualTo(Date value) {
            addCriterion("ywrq =", value, "ywrq");
            return (Criteria) this;
        }

        public Criteria andYwrqNotEqualTo(Date value) {
            addCriterion("ywrq <>", value, "ywrq");
            return (Criteria) this;
        }

        public Criteria andYwrqGreaterThan(Date value) {
            addCriterion("ywrq >", value, "ywrq");
            return (Criteria) this;
        }

        public Criteria andYwrqGreaterThanOrEqualTo(Date value) {
            addCriterion("ywrq >=", value, "ywrq");
            return (Criteria) this;
        }

        public Criteria andYwrqLessThan(Date value) {
            addCriterion("ywrq <", value, "ywrq");
            return (Criteria) this;
        }

        public Criteria andYwrqLessThanOrEqualTo(Date value) {
            addCriterion("ywrq <=", value, "ywrq");
            return (Criteria) this;
        }

        public Criteria andYwrqIn(List<Date> values) {
            addCriterion("ywrq in", values, "ywrq");
            return (Criteria) this;
        }

        public Criteria andYwrqNotIn(List<Date> values) {
            addCriterion("ywrq not in", values, "ywrq");
            return (Criteria) this;
        }

        public Criteria andYwrqBetween(Date value1, Date value2) {
            addCriterion("ywrq between", value1, value2, "ywrq");
            return (Criteria) this;
        }

        public Criteria andYwrqNotBetween(Date value1, Date value2) {
            addCriterion("ywrq not between", value1, value2, "ywrq");
            return (Criteria) this;
        }

        public Criteria andJbywyhIsNull() {
            addCriterion("jbywyh is null");
            return (Criteria) this;
        }

        public Criteria andJbywyhIsNotNull() {
            addCriterion("jbywyh is not null");
            return (Criteria) this;
        }

        public Criteria andJbywyhEqualTo(BigDecimal value) {
            addCriterion("jbywyh =", value, "jbywyh");
            return (Criteria) this;
        }

        public Criteria andJbywyhNotEqualTo(BigDecimal value) {
            addCriterion("jbywyh <>", value, "jbywyh");
            return (Criteria) this;
        }

        public Criteria andJbywyhGreaterThan(BigDecimal value) {
            addCriterion("jbywyh >", value, "jbywyh");
            return (Criteria) this;
        }

        public Criteria andJbywyhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jbywyh >=", value, "jbywyh");
            return (Criteria) this;
        }

        public Criteria andJbywyhLessThan(BigDecimal value) {
            addCriterion("jbywyh <", value, "jbywyh");
            return (Criteria) this;
        }

        public Criteria andJbywyhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jbywyh <=", value, "jbywyh");
            return (Criteria) this;
        }

        public Criteria andJbywyhIn(List<BigDecimal> values) {
            addCriterion("jbywyh in", values, "jbywyh");
            return (Criteria) this;
        }

        public Criteria andJbywyhNotIn(List<BigDecimal> values) {
            addCriterion("jbywyh not in", values, "jbywyh");
            return (Criteria) this;
        }

        public Criteria andJbywyhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jbywyh between", value1, value2, "jbywyh");
            return (Criteria) this;
        }

        public Criteria andJbywyhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jbywyh not between", value1, value2, "jbywyh");
            return (Criteria) this;
        }

        public Criteria andCfzd1IsNull() {
            addCriterion("cfzd1 is null");
            return (Criteria) this;
        }

        public Criteria andCfzd1IsNotNull() {
            addCriterion("cfzd1 is not null");
            return (Criteria) this;
        }

        public Criteria andCfzd1EqualTo(String value) {
            addCriterion("cfzd1 =", value, "cfzd1");
            return (Criteria) this;
        }

        public Criteria andCfzd1NotEqualTo(String value) {
            addCriterion("cfzd1 <>", value, "cfzd1");
            return (Criteria) this;
        }

        public Criteria andCfzd1GreaterThan(String value) {
            addCriterion("cfzd1 >", value, "cfzd1");
            return (Criteria) this;
        }

        public Criteria andCfzd1GreaterThanOrEqualTo(String value) {
            addCriterion("cfzd1 >=", value, "cfzd1");
            return (Criteria) this;
        }

        public Criteria andCfzd1LessThan(String value) {
            addCriterion("cfzd1 <", value, "cfzd1");
            return (Criteria) this;
        }

        public Criteria andCfzd1LessThanOrEqualTo(String value) {
            addCriterion("cfzd1 <=", value, "cfzd1");
            return (Criteria) this;
        }

        public Criteria andCfzd1Like(String value) {
            addCriterion("cfzd1 like", value, "cfzd1");
            return (Criteria) this;
        }

        public Criteria andCfzd1NotLike(String value) {
            addCriterion("cfzd1 not like", value, "cfzd1");
            return (Criteria) this;
        }

        public Criteria andCfzd1In(List<String> values) {
            addCriterion("cfzd1 in", values, "cfzd1");
            return (Criteria) this;
        }

        public Criteria andCfzd1NotIn(List<String> values) {
            addCriterion("cfzd1 not in", values, "cfzd1");
            return (Criteria) this;
        }

        public Criteria andCfzd1Between(String value1, String value2) {
            addCriterion("cfzd1 between", value1, value2, "cfzd1");
            return (Criteria) this;
        }

        public Criteria andCfzd1NotBetween(String value1, String value2) {
            addCriterion("cfzd1 not between", value1, value2, "cfzd1");
            return (Criteria) this;
        }

        public Criteria andCfzd2IsNull() {
            addCriterion("cfzd2 is null");
            return (Criteria) this;
        }

        public Criteria andCfzd2IsNotNull() {
            addCriterion("cfzd2 is not null");
            return (Criteria) this;
        }

        public Criteria andCfzd2EqualTo(String value) {
            addCriterion("cfzd2 =", value, "cfzd2");
            return (Criteria) this;
        }

        public Criteria andCfzd2NotEqualTo(String value) {
            addCriterion("cfzd2 <>", value, "cfzd2");
            return (Criteria) this;
        }

        public Criteria andCfzd2GreaterThan(String value) {
            addCriterion("cfzd2 >", value, "cfzd2");
            return (Criteria) this;
        }

        public Criteria andCfzd2GreaterThanOrEqualTo(String value) {
            addCriterion("cfzd2 >=", value, "cfzd2");
            return (Criteria) this;
        }

        public Criteria andCfzd2LessThan(String value) {
            addCriterion("cfzd2 <", value, "cfzd2");
            return (Criteria) this;
        }

        public Criteria andCfzd2LessThanOrEqualTo(String value) {
            addCriterion("cfzd2 <=", value, "cfzd2");
            return (Criteria) this;
        }

        public Criteria andCfzd2Like(String value) {
            addCriterion("cfzd2 like", value, "cfzd2");
            return (Criteria) this;
        }

        public Criteria andCfzd2NotLike(String value) {
            addCriterion("cfzd2 not like", value, "cfzd2");
            return (Criteria) this;
        }

        public Criteria andCfzd2In(List<String> values) {
            addCriterion("cfzd2 in", values, "cfzd2");
            return (Criteria) this;
        }

        public Criteria andCfzd2NotIn(List<String> values) {
            addCriterion("cfzd2 not in", values, "cfzd2");
            return (Criteria) this;
        }

        public Criteria andCfzd2Between(String value1, String value2) {
            addCriterion("cfzd2 between", value1, value2, "cfzd2");
            return (Criteria) this;
        }

        public Criteria andCfzd2NotBetween(String value1, String value2) {
            addCriterion("cfzd2 not between", value1, value2, "cfzd2");
            return (Criteria) this;
        }

        public Criteria andCfzd3IsNull() {
            addCriterion("cfzd3 is null");
            return (Criteria) this;
        }

        public Criteria andCfzd3IsNotNull() {
            addCriterion("cfzd3 is not null");
            return (Criteria) this;
        }

        public Criteria andCfzd3EqualTo(String value) {
            addCriterion("cfzd3 =", value, "cfzd3");
            return (Criteria) this;
        }

        public Criteria andCfzd3NotEqualTo(String value) {
            addCriterion("cfzd3 <>", value, "cfzd3");
            return (Criteria) this;
        }

        public Criteria andCfzd3GreaterThan(String value) {
            addCriterion("cfzd3 >", value, "cfzd3");
            return (Criteria) this;
        }

        public Criteria andCfzd3GreaterThanOrEqualTo(String value) {
            addCriterion("cfzd3 >=", value, "cfzd3");
            return (Criteria) this;
        }

        public Criteria andCfzd3LessThan(String value) {
            addCriterion("cfzd3 <", value, "cfzd3");
            return (Criteria) this;
        }

        public Criteria andCfzd3LessThanOrEqualTo(String value) {
            addCriterion("cfzd3 <=", value, "cfzd3");
            return (Criteria) this;
        }

        public Criteria andCfzd3Like(String value) {
            addCriterion("cfzd3 like", value, "cfzd3");
            return (Criteria) this;
        }

        public Criteria andCfzd3NotLike(String value) {
            addCriterion("cfzd3 not like", value, "cfzd3");
            return (Criteria) this;
        }

        public Criteria andCfzd3In(List<String> values) {
            addCriterion("cfzd3 in", values, "cfzd3");
            return (Criteria) this;
        }

        public Criteria andCfzd3NotIn(List<String> values) {
            addCriterion("cfzd3 not in", values, "cfzd3");
            return (Criteria) this;
        }

        public Criteria andCfzd3Between(String value1, String value2) {
            addCriterion("cfzd3 between", value1, value2, "cfzd3");
            return (Criteria) this;
        }

        public Criteria andCfzd3NotBetween(String value1, String value2) {
            addCriterion("cfzd3 not between", value1, value2, "cfzd3");
            return (Criteria) this;
        }

        public Criteria andZycfIsNull() {
            addCriterion("zycf is null");
            return (Criteria) this;
        }

        public Criteria andZycfIsNotNull() {
            addCriterion("zycf is not null");
            return (Criteria) this;
        }

        public Criteria andZycfEqualTo(String value) {
            addCriterion("zycf =", value, "zycf");
            return (Criteria) this;
        }

        public Criteria andZycfNotEqualTo(String value) {
            addCriterion("zycf <>", value, "zycf");
            return (Criteria) this;
        }

        public Criteria andZycfGreaterThan(String value) {
            addCriterion("zycf >", value, "zycf");
            return (Criteria) this;
        }

        public Criteria andZycfGreaterThanOrEqualTo(String value) {
            addCriterion("zycf >=", value, "zycf");
            return (Criteria) this;
        }

        public Criteria andZycfLessThan(String value) {
            addCriterion("zycf <", value, "zycf");
            return (Criteria) this;
        }

        public Criteria andZycfLessThanOrEqualTo(String value) {
            addCriterion("zycf <=", value, "zycf");
            return (Criteria) this;
        }

        public Criteria andZycfLike(String value) {
            addCriterion("zycf like", value, "zycf");
            return (Criteria) this;
        }

        public Criteria andZycfNotLike(String value) {
            addCriterion("zycf not like", value, "zycf");
            return (Criteria) this;
        }

        public Criteria andZycfIn(List<String> values) {
            addCriterion("zycf in", values, "zycf");
            return (Criteria) this;
        }

        public Criteria andZycfNotIn(List<String> values) {
            addCriterion("zycf not in", values, "zycf");
            return (Criteria) this;
        }

        public Criteria andZycfBetween(String value1, String value2) {
            addCriterion("zycf between", value1, value2, "zycf");
            return (Criteria) this;
        }

        public Criteria andZycfNotBetween(String value1, String value2) {
            addCriterion("zycf not between", value1, value2, "zycf");
            return (Criteria) this;
        }

        public Criteria andYinhjeIsNull() {
            addCriterion("yinhje is null");
            return (Criteria) this;
        }

        public Criteria andYinhjeIsNotNull() {
            addCriterion("yinhje is not null");
            return (Criteria) this;
        }

        public Criteria andYinhjeEqualTo(BigDecimal value) {
            addCriterion("yinhje =", value, "yinhje");
            return (Criteria) this;
        }

        public Criteria andYinhjeNotEqualTo(BigDecimal value) {
            addCriterion("yinhje <>", value, "yinhje");
            return (Criteria) this;
        }

        public Criteria andYinhjeGreaterThan(BigDecimal value) {
            addCriterion("yinhje >", value, "yinhje");
            return (Criteria) this;
        }

        public Criteria andYinhjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yinhje >=", value, "yinhje");
            return (Criteria) this;
        }

        public Criteria andYinhjeLessThan(BigDecimal value) {
            addCriterion("yinhje <", value, "yinhje");
            return (Criteria) this;
        }

        public Criteria andYinhjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yinhje <=", value, "yinhje");
            return (Criteria) this;
        }

        public Criteria andYinhjeIn(List<BigDecimal> values) {
            addCriterion("yinhje in", values, "yinhje");
            return (Criteria) this;
        }

        public Criteria andYinhjeNotIn(List<BigDecimal> values) {
            addCriterion("yinhje not in", values, "yinhje");
            return (Criteria) this;
        }

        public Criteria andYinhjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yinhje between", value1, value2, "yinhje");
            return (Criteria) this;
        }

        public Criteria andYinhjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yinhje not between", value1, value2, "yinhje");
            return (Criteria) this;
        }

        public Criteria andPsrIsNull() {
            addCriterion("psr is null");
            return (Criteria) this;
        }

        public Criteria andPsrIsNotNull() {
            addCriterion("psr is not null");
            return (Criteria) this;
        }

        public Criteria andPsrEqualTo(String value) {
            addCriterion("psr =", value, "psr");
            return (Criteria) this;
        }

        public Criteria andPsrNotEqualTo(String value) {
            addCriterion("psr <>", value, "psr");
            return (Criteria) this;
        }

        public Criteria andPsrGreaterThan(String value) {
            addCriterion("psr >", value, "psr");
            return (Criteria) this;
        }

        public Criteria andPsrGreaterThanOrEqualTo(String value) {
            addCriterion("psr >=", value, "psr");
            return (Criteria) this;
        }

        public Criteria andPsrLessThan(String value) {
            addCriterion("psr <", value, "psr");
            return (Criteria) this;
        }

        public Criteria andPsrLessThanOrEqualTo(String value) {
            addCriterion("psr <=", value, "psr");
            return (Criteria) this;
        }

        public Criteria andPsrLike(String value) {
            addCriterion("psr like", value, "psr");
            return (Criteria) this;
        }

        public Criteria andPsrNotLike(String value) {
            addCriterion("psr not like", value, "psr");
            return (Criteria) this;
        }

        public Criteria andPsrIn(List<String> values) {
            addCriterion("psr in", values, "psr");
            return (Criteria) this;
        }

        public Criteria andPsrNotIn(List<String> values) {
            addCriterion("psr not in", values, "psr");
            return (Criteria) this;
        }

        public Criteria andPsrBetween(String value1, String value2) {
            addCriterion("psr between", value1, value2, "psr");
            return (Criteria) this;
        }

        public Criteria andPsrNotBetween(String value1, String value2) {
            addCriterion("psr not between", value1, value2, "psr");
            return (Criteria) this;
        }

        public Criteria andFbrqIsNull() {
            addCriterion("fbrq is null");
            return (Criteria) this;
        }

        public Criteria andFbrqIsNotNull() {
            addCriterion("fbrq is not null");
            return (Criteria) this;
        }

        public Criteria andFbrqEqualTo(Date value) {
            addCriterion("fbrq =", value, "fbrq");
            return (Criteria) this;
        }

        public Criteria andFbrqNotEqualTo(Date value) {
            addCriterion("fbrq <>", value, "fbrq");
            return (Criteria) this;
        }

        public Criteria andFbrqGreaterThan(Date value) {
            addCriterion("fbrq >", value, "fbrq");
            return (Criteria) this;
        }

        public Criteria andFbrqGreaterThanOrEqualTo(Date value) {
            addCriterion("fbrq >=", value, "fbrq");
            return (Criteria) this;
        }

        public Criteria andFbrqLessThan(Date value) {
            addCriterion("fbrq <", value, "fbrq");
            return (Criteria) this;
        }

        public Criteria andFbrqLessThanOrEqualTo(Date value) {
            addCriterion("fbrq <=", value, "fbrq");
            return (Criteria) this;
        }

        public Criteria andFbrqIn(List<Date> values) {
            addCriterion("fbrq in", values, "fbrq");
            return (Criteria) this;
        }

        public Criteria andFbrqNotIn(List<Date> values) {
            addCriterion("fbrq not in", values, "fbrq");
            return (Criteria) this;
        }

        public Criteria andFbrqBetween(Date value1, Date value2) {
            addCriterion("fbrq between", value1, value2, "fbrq");
            return (Criteria) this;
        }

        public Criteria andFbrqNotBetween(Date value1, Date value2) {
            addCriterion("fbrq not between", value1, value2, "fbrq");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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