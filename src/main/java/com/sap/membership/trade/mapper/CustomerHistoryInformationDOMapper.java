package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.CustomerHistoryInformationDO;

public interface CustomerHistoryInformationDOMapper {
    int insert(CustomerHistoryInformationDO record);

    int insertSelective(CustomerHistoryInformationDO record);
}