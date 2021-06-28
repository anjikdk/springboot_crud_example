package com.example.springboot.schedule;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.example.springboot.entity.EmployeeEntity;
import com.example.springboot.repository.EmployeeRepository;

@Configuration
@EnableScheduling
public class EmployeeScheduler {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeScheduler.class);
	
	@Autowired
	private EmployeeRepository employeeRepository;

//	@Scheduled(fixedRate = 20000)
//	@Scheduled(fixedDelay = 1000, initialDelay = 1000)
//	@Scheduled(cron = "0 15 10 15 * ?")
	public void getAllEmployeeDetails()
	{
		List<EmployeeEntity> empList = (List<EmployeeEntity>) employeeRepository.findAll();
		logger.info(" Emp Details: "+ empList);
	}
}
