package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.IntegralRecordDO;

public interface IntegralRecordDOMapper {
    int insert(IntegralRecordDO record);

    int insertSelective(IntegralRecordDO record);
}