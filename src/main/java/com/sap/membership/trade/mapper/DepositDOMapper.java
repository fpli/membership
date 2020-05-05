package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.DepositDO;

public interface DepositDOMapper {
    int insert(DepositDO record);

    int insertSelective(DepositDO record);
}