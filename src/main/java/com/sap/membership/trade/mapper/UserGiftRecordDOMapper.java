package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.UserGiftRecordDO;

public interface UserGiftRecordDOMapper {
    int insert(UserGiftRecordDO record);

    int insertSelective(UserGiftRecordDO record);
}