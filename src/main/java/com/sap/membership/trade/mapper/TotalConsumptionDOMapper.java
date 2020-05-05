package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.TotalConsumptionDO;

public interface TotalConsumptionDOMapper {
    int insert(TotalConsumptionDO record);

    int insertSelective(TotalConsumptionDO record);
}