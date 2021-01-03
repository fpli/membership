package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.AdministratorOperationRecordDO;

public interface AdministratorOperationRecordDOMapper {

    int insert(AdministratorOperationRecordDO record);

    int insertSelective(AdministratorOperationRecordDO record);
}