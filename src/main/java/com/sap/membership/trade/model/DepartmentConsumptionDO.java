package com.sap.membership.trade.model;

import java.math.BigDecimal;

public class DepartmentConsumptionDO {
    private String name;

    private String cid;

    private String rid;

    private String departmentName;

    private String consumptionStyle;

    private BigDecimal consumption;

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

    public BigDecimal getConsumption() {
        return consumption;
    }

    public void setConsumption(BigDecimal consumption) {
        this.consumption = consumption;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}