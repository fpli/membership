package com.sap.membership.trade.model;

import java.util.Date;

/**
 * 管理员操作记录信息
 */
public class AdministratorOperationRecordDO {
    
    private Integer id;

    private Integer administratorId;

    private Date createTime;

    private String operation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }
}