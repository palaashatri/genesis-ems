package com.ltts.project.ems;

import com.ltts.project.ems.controller.EmployeeController;
import com.ltts.project.ems.controller.EmsController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class EmsApplicationTests {

	@Autowired
	EmployeeController ec;	

	@Autowired 
	EmsController emsc;


	@Test
	void contextLoads() {
		assertThat(ec).isNotNull();
		assertThat(emsc).isNotNull();
	}

	

}
