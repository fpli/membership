package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.TenantStateDO;

public interface TenantStateDOMapper {
    int insert(TenantStateDO record);

    int insertSelective(TenantStateDO record);
}