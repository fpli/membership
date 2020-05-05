package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.UserCardDO;

public interface UserCardDOMapper {
    int insert(UserCardDO record);

    int insertSelective(UserCardDO record);
}