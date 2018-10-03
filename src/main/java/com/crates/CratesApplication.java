package com.crates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CratesApplication {

    @Autowired
    private static YAMLConfig myConfig;
	
	public static void main(String[] args) {
		SpringApplication.run(CratesApplication.class, args);
        System.out.println("using environment: " + myConfig.getEnvironment());
        System.out.println("name: " + myConfig.getName());
        System.out.println("servers: " + myConfig.getServers());
	}
	
}
