package com.sap.membership.trade.model;

/**
 * 介绍人记录
 */
public class IntroduceRecordDO {

    private Integer id;

    private Integer userId;

    private Integer introduceUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIntroduceUserId() {
        return introduceUserId;
    }

    public void setIntroduceUserId(Integer introduceUserId) {
        this.introduceUserId = introduceUserId;
    }
}