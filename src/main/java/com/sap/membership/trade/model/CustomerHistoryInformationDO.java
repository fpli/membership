package com.sap.membership.trade.model;

import java.math.BigDecimal;
import java.util.Date;

public class CustomerHistoryInformationDO {
    private String name;

    private String cid;

    private String rid;

    private String departmentName;

    private String consumptionStyle;

    private BigDecimal depositAmount;

    private String depositState;

    private Date reserveTime;

    private String timeQuantum;

    private String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getConsumptionStyle() {
        return consumptionStyle;
    }

    public void setConsumptionStyle(String consumptionStyle) {
        this.consumptionStyle = consumptionStyle == null ? null : consumptionStyle.trim();
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getDepositState() {
        return depositState;
    }

    public void setDepositState(String depositState) {
        this.depositState = depositState == null ? null : depositState.trim();
    }

    public Date getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(Date reserveTime) {
        this.reserveTime = reserveTime;
    }

    public String getTimeQuantum() {
        return timeQuantum;
    }

    public void setTimeQuantum(String timeQuantum) {
        this.timeQuantum = timeQuantum == null ? null : timeQuantum.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}