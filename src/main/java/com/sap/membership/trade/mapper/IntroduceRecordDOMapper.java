package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.IntroduceRecordDO;

public interface IntroduceRecordDOMapper {
    int insert(IntroduceRecordDO record);

    int insertSelective(IntroduceRecordDO record);
}