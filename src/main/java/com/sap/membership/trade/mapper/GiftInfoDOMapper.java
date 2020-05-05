package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.GiftInfoDO;

public interface GiftInfoDOMapper {
    int insert(GiftInfoDO record);

    int insertSelective(GiftInfoDO record);
}