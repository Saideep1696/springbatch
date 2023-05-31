package com.bsli.tatdashboard;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableBatchProcessing
@SpringBootApplication
public class TatdashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TatdashboardApplication.class, args);
	}

}
