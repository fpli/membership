package com.sap.membership.trade.mapper;

import com.sap.membership.trade.model.DepartmentConsumptionDO;

public interface DepartmentConsumptionDOMapper {

    int insert(DepartmentConsumptionDO record);

    int insertSelective(DepartmentConsumptionDO record);
}