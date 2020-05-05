package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.UserDO;

public interface UserDOMapper {
    int insert(UserDO record);

    int insertSelective(UserDO record);
}