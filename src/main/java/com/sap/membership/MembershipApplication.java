package com.sap.membership;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sap.membership.trade.mapper")
public class MembershipApplication {

	public static void main(String[] args) {
		SpringApplication.run(MembershipApplication.class, args);
	}

}
