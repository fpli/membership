package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.CustomerInformationDO;

public interface CustomerInformationDOMapper {
    int insert(CustomerInformationDO record);

    int insertSelective(CustomerInformationDO record);
}