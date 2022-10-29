package com.woori.wfti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class WftiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WftiApplication.class, args);
	}

}
