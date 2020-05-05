package com.sap.membership.trade.controller;

import com.sap.membership.trade.mapper.ReserveDOMapper;
import com.sap.membership.trade.model.ReserveDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Random;

@RestController
public class HotelController {

    @Autowired
    private ReserveDOMapper reserveDOMapper;

    /**
     * 预订酒店房间
     * @param cid    身份证号码
     * @param name   姓名
     * @param amount 付款金额
     * @return       预订成功哦或失败
     */
    @GetMapping(value = "reserve", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean reserve(String cid, String name, BigDecimal amount){
        ReserveDO reserveDO = new ReserveDO();
        reserveDO.setCid(new Random().nextInt()+"");
        reserveDO.setName("frank");
        reserveDO.setRid("B1012");
        reserveDO.setTimeQuantum("0202-0404");
        reserveDOMapper.insertSelective(reserveDO);
        return true;
    }

    /**
     * 办理入住
     * @param cid  身份证号码
     * @param name 姓名
     */
    @PostMapping("checkIn")
    public void checkIn(String cid, String name){

    }

    /**
     * 办理退房
     * @param cid  身份证号码
     * @param name 姓名
     * @param rid  房间号码
     * @return     退款金额
     */
    @PostMapping("checkOut")
    public BigDecimal checkOut(String cid, String name, String rid){
        BigDecimal amount = new BigDecimal("0.00");


        return amount;
    }
}
