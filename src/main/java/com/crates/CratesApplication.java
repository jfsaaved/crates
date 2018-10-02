package com.crates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CratesApplication {

    @Autowired
    private YAMLConfig myConfig;
	
	public static void main(String[] args) {
		SpringApplication.run(CratesApplication.class, args);

	}
	
    public void run(String... args) throws Exception {
        System.out.println("using environment: " + myConfig.getEnvironment());
        System.out.println("name: " + myConfig.getName());
        System.out.println("servers: " + myConfig.getServers());
    }
}
