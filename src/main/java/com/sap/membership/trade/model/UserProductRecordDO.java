package com.sap.membership.trade.model;

import java.util.Date;

/**
 * 会员购买产品信息
 */
public class UserProductRecordDO {

    private Integer id;

    private Integer userId;

    private Integer productId;

    private Date buyTime;

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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }
}