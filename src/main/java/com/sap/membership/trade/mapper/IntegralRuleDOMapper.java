package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.IntegralRuleDO;

public interface IntegralRuleDOMapper {
    int insert(IntegralRuleDO record);

    int insertSelective(IntegralRuleDO record);
}