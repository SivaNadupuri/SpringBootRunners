package com.example.demo.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(55)
public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("alll  argumrnts"+Arrays.asList(args));
		// TODO Auto-generated method stub

		System.out.println("Test Runner");
	}

}
