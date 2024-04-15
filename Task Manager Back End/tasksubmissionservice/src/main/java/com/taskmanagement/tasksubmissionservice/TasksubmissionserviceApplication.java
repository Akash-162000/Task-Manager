package com.taskmanagement.tasksubmissionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TasksubmissionserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksubmissionserviceApplication.class, args);
	}

}
