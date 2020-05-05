package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.UsersExtensionDO;

public interface UsersExtensionDOMapper {
    int insert(UsersExtensionDO record);

    int insertSelective(UsersExtensionDO record);
}