package com.wkxf.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ContrastRecord {
    private Integer id;

    private String transId;

    private String idCardNo;

    private String name;

    private BigDecimal contrastSimilarity;

    private String callFrom;

    private String recognitionSource;

    private Date transTime;

    private Date createTime;

    private String picBase64;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getContrastSimilarity() {
        return contrastSimilarity;
    }

    public void setContrastSimilarity(BigDecimal contrastSimilarity) {
        this.contrastSimilarity = contrastSimilarity;
    }

    public String getCallFrom() {
        return callFrom;
    }

    public void setCallFrom(String callFrom) {
        this.callFrom = callFrom == null ? null : callFrom.trim();
    }

    public String getRecognitionSource() {
        return recognitionSource;
    }

    public void setRecognitionSource(String recognitionSource) {
        this.recognitionSource = recognitionSource == null ? null : recognitionSource.trim();
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPicBase64() {
        return picBase64;
    }

    public void setPicBase64(String picBase64) {
        this.picBase64 = picBase64 == null ? null : picBase64.trim();
    }
}