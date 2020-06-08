package com.sap.membership.trade.service.impl;

import com.sap.membership.trade.service.HotelServiceI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class HotelServiceImpl implements HotelServiceI {

    private static final Logger logger = LoggerFactory.getLogger(HotelServiceImpl.class);

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public Object reserve() {
        return null;
    }
}
