package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.UserTypeDO;

public interface UserTypeDOMapper {
    int insert(UserTypeDO record);

    int insertSelective(UserTypeDO record);
}