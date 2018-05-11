package com.hiboom.monent.back.entity;

import java.math.BigDecimal;
import java.util.Date;

public class HbTransactionSeq {
    private Integer id;

    private Integer uid;

    private String seqSn;

    private Integer seqType;

    private BigDecimal amount;

    private Short amountType;

    private BigDecimal preHiAmount;

    private BigDecimal preCashAmount;

    private BigDecimal hiAmount;

    private BigDecimal cashAmount;

    private Integer identifyId;

    private String note;

    private Integer ctime;

    private Date etime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSeqSn() {
        return seqSn;
    }

    public void setSeqSn(String seqSn) {
        this.seqSn = seqSn == null ? null : seqSn.trim();
    }

    public Integer getSeqType() {
        return seqType;
    }

    public void setSeqType(Integer seqType) {
        this.seqType = seqType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Short getAmountType() {
        return amountType;
    }

    public void setAmountType(Short amountType) {
        this.amountType = amountType;
    }

    public BigDecimal getPreHiAmount() {
        return preHiAmount;
    }

    public void setPreHiAmount(BigDecimal preHiAmount) {
        this.preHiAmount = preHiAmount;
    }

    public BigDecimal getPreCashAmount() {
        return preCashAmount;
    }

    public void setPreCashAmount(BigDecimal preCashAmount) {
        this.preCashAmount = preCashAmount;
    }

    public BigDecimal getHiAmount() {
        return hiAmount;
    }

    public void setHiAmount(BigDecimal hiAmount) {
        this.hiAmount = hiAmount;
    }

    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public Integer getIdentifyId() {
        return identifyId;
    }

    public void setIdentifyId(Integer identifyId) {
        this.identifyId = identifyId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }
}