package com.example.demo.runners;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// print like Array
		
		System.out.println("All"+Arrays.asList(args.getSourceArgs()));
		
		// print all non option arguments
		
		System.out.println("Non Option:"+args.getNonOptionArgs());
		
		
	  if(args.getNonOptionArgs().contains("start")) {
		  System.out.println("start database dump");
	  }

	}

}
