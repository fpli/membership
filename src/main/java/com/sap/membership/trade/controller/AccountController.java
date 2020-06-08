package com.sap.membership.trade.controller;


import com.sap.membership.trade.model.UserDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/account")
public class AccountController {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @GetMapping(value = "findAccount/{accountNo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity findAccount(@PathVariable String accountNo){
        UserDO userDO = new UserDO();
        userDO.setUsername("k1");
        return ResponseEntity.ok(userDO);
    }
}
