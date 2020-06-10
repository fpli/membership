package com.sap.membership.trade.model;

import java.util.Date;

/**
 * 会员兑换礼品记录信息
 */
public class UserGiftRecordDO {

    private Integer id;

    private Integer userId;

    private Integer giftId;

    private Date requestTime;

    private Date finishTime;

    private Integer state;

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

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}