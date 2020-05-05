package com.sap.membership.trade.model;

import java.math.BigDecimal;

public class DepositDO {
    private String name;

    private String cid;

    private String rid;

    private BigDecimal depositAmount;

    private String depositState;

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
}