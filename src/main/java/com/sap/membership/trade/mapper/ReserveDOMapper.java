package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.ReserveDO;

public interface ReserveDOMapper {
    int insert(ReserveDO record);

    int insertSelective(ReserveDO record);
}