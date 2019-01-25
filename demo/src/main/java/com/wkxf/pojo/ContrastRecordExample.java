package com.wkxf.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContrastRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContrastRecordExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNull() {
            addCriterion("trans_id is null");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNotNull() {
            addCriterion("trans_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransIdEqualTo(String value) {
            addCriterion("trans_id =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(String value) {
            addCriterion("trans_id <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(String value) {
            addCriterion("trans_id >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("trans_id >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(String value) {
            addCriterion("trans_id <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(String value) {
            addCriterion("trans_id <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLike(String value) {
            addCriterion("trans_id like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotLike(String value) {
            addCriterion("trans_id not like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<String> values) {
            addCriterion("trans_id in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<String> values) {
            addCriterion("trans_id not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(String value1, String value2) {
            addCriterion("trans_id between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(String value1, String value2) {
            addCriterion("trans_id not between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNull() {
            addCriterion("id_card_no is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNotNull() {
            addCriterion("id_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoEqualTo(String value) {
            addCriterion("id_card_no =", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotEqualTo(String value) {
            addCriterion("id_card_no <>", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThan(String value) {
            addCriterion("id_card_no >", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_no >=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThan(String value) {
            addCriterion("id_card_no <", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("id_card_no <=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLike(String value) {
            addCriterion("id_card_no like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotLike(String value) {
            addCriterion("id_card_no not like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIn(List<String> values) {
            addCriterion("id_card_no in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotIn(List<String> values) {
            addCriterion("id_card_no not in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoBetween(String value1, String value2) {
            addCriterion("id_card_no between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotBetween(String value1, String value2) {
            addCriterion("id_card_no not between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andContrastSimilarityIsNull() {
            addCriterion("contrast_similarity is null");
            return (Criteria) this;
        }

        public Criteria andContrastSimilarityIsNotNull() {
            addCriterion("contrast_similarity is not null");
            return (Criteria) this;
        }

        public Criteria andContrastSimilarityEqualTo(BigDecimal value) {
            addCriterion("contrast_similarity =", value, "contrastSimilarity");
            return (Criteria) this;
        }

        public Criteria andContrastSimilarityNotEqualTo(BigDecimal value) {
            addCriterion("contrast_similarity <>", value, "contrastSimilarity");
            return (Criteria) this;
        }

        public Criteria andContrastSimilarityGreaterThan(BigDecimal value) {
            addCriterion("contrast_similarity >", value, "contrastSimilarity");
            return (Criteria) this;
        }

        public Criteria andContrastSimilarityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("contrast_similarity >=", value, "contrastSimilarity");
            return (Criteria) this;
        }

        public Criteria andContrastSimilarityLessThan(BigDecimal value) {
            addCriterion("contrast_similarity <", value, "contrastSimilarity");
            return (Criteria) this;
        }

        public Criteria andContrastSimilarityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("contrast_similarity <=", value, "contrastSimilarity");
            return (Criteria) this;
        }

        public Criteria andContrastSimilarityIn(List<BigDecimal> values) {
            addCriterion("contrast_similarity in", values, "contrastSimilarity");
            return (Criteria) this;
        }

        public Criteria andContrastSimilarityNotIn(List<BigDecimal> values) {
            addCriterion("contrast_similarity not in", values, "contrastSimilarity");
            return (Criteria) this;
        }

        public Criteria andContrastSimilarityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contrast_similarity between", value1, value2, "contrastSimilarity");
            return (Criteria) this;
        }

        public Criteria andContrastSimilarityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contrast_similarity not between", value1, value2, "contrastSimilarity");
            return (Criteria) this;
        }

        public Criteria andCallFromIsNull() {
            addCriterion("call_from is null");
            return (Criteria) this;
        }

        public Criteria andCallFromIsNotNull() {
            addCriterion("call_from is not null");
            return (Criteria) this;
        }

        public Criteria andCallFromEqualTo(String value) {
            addCriterion("call_from =", value, "callFrom");
            return (Criteria) this;
        }

        public Criteria andCallFromNotEqualTo(String value) {
            addCriterion("call_from <>", value, "callFrom");
            return (Criteria) this;
        }

        public Criteria andCallFromGreaterThan(String value) {
            addCriterion("call_from >", value, "callFrom");
            return (Criteria) this;
        }

        public Criteria andCallFromGreaterThanOrEqualTo(String value) {
            addCriterion("call_from >=", value, "callFrom");
            return (Criteria) this;
        }

        public Criteria andCallFromLessThan(String value) {
            addCriterion("call_from <", value, "callFrom");
            return (Criteria) this;
        }

        public Criteria andCallFromLessThanOrEqualTo(String value) {
            addCriterion("call_from <=", value, "callFrom");
            return (Criteria) this;
        }

        public Criteria andCallFromLike(String value) {
            addCriterion("call_from like", value, "callFrom");
            return (Criteria) this;
        }

        public Criteria andCallFromNotLike(String value) {
            addCriterion("call_from not like", value, "callFrom");
            return (Criteria) this;
        }

        public Criteria andCallFromIn(List<String> values) {
            addCriterion("call_from in", values, "callFrom");
            return (Criteria) this;
        }

        public Criteria andCallFromNotIn(List<String> values) {
            addCriterion("call_from not in", values, "callFrom");
            return (Criteria) this;
        }

        public Criteria andCallFromBetween(String value1, String value2) {
            addCriterion("call_from between", value1, value2, "callFrom");
            return (Criteria) this;
        }

        public Criteria andCallFromNotBetween(String value1, String value2) {
            addCriterion("call_from not between", value1, value2, "callFrom");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceIsNull() {
            addCriterion("recognition_source is null");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceIsNotNull() {
            addCriterion("recognition_source is not null");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceEqualTo(String value) {
            addCriterion("recognition_source =", value, "recognitionSource");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceNotEqualTo(String value) {
            addCriterion("recognition_source <>", value, "recognitionSource");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceGreaterThan(String value) {
            addCriterion("recognition_source >", value, "recognitionSource");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceGreaterThanOrEqualTo(String value) {
            addCriterion("recognition_source >=", value, "recognitionSource");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceLessThan(String value) {
            addCriterion("recognition_source <", value, "recognitionSource");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceLessThanOrEqualTo(String value) {
            addCriterion("recognition_source <=", value, "recognitionSource");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceLike(String value) {
            addCriterion("recognition_source like", value, "recognitionSource");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceNotLike(String value) {
            addCriterion("recognition_source not like", value, "recognitionSource");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceIn(List<String> values) {
            addCriterion("recognition_source in", values, "recognitionSource");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceNotIn(List<String> values) {
            addCriterion("recognition_source not in", values, "recognitionSource");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceBetween(String value1, String value2) {
            addCriterion("recognition_source between", value1, value2, "recognitionSource");
            return (Criteria) this;
        }

        public Criteria andRecognitionSourceNotBetween(String value1, String value2) {
            addCriterion("recognition_source not between", value1, value2, "recognitionSource");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNull() {
            addCriterion("trans_time is null");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNotNull() {
            addCriterion("trans_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransTimeEqualTo(Date value) {
            addCriterion("trans_time =", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotEqualTo(Date value) {
            addCriterion("trans_time <>", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThan(Date value) {
            addCriterion("trans_time >", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trans_time >=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThan(Date value) {
            addCriterion("trans_time <", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThanOrEqualTo(Date value) {
            addCriterion("trans_time <=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeIn(List<Date> values) {
            addCriterion("trans_time in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotIn(List<Date> values) {
            addCriterion("trans_time not in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeBetween(Date value1, Date value2) {
            addCriterion("trans_time between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotBetween(Date value1, Date value2) {
            addCriterion("trans_time not between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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