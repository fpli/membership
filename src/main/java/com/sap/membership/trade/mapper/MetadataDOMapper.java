package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.MetadataDO;

public interface MetadataDOMapper {
    int insert(MetadataDO record);

    int insertSelective(MetadataDO record);
}