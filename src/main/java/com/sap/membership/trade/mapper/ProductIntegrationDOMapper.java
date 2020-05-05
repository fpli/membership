package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.ProductIntegrationDO;

public interface ProductIntegrationDOMapper {
    int insert(ProductIntegrationDO record);

    int insertSelective(ProductIntegrationDO record);
}