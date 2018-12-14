package com.mosesc.vobscriptapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.mosesc")
@MapperScan(basePackages = {"com.mosesc.vobscriptapi.mapper"})
public class VobScriptApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VobScriptApiApplication.class, args);
	}

}

