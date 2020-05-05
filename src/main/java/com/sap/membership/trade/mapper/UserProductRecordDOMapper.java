package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.UserProductRecordDO;

public interface UserProductRecordDOMapper {
    int insert(UserProductRecordDO record);

    int insertSelective(UserProductRecordDO record);
}