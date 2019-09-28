package com.user.demo;

import java.util.ServiceLoader;

import com.helloworld.HelloWorld;
import com.helloworld.impl.FormattedPrintService;
import com.helloworld.services.PrintService;
import com.helloworld.welcome.Welcome;

public class HelloWorldClient {

	public static void main(String[] args) {

		HelloWorld hello = new HelloWorld();
		hello.printHello();

		Welcome welcome = new Welcome();
		welcome.printWelcome();
		
		PrintService printService = new FormattedPrintService();
		printService.print("Karthik");
		
		ServiceLoader<PrintService> serviceLoader = ServiceLoader.load(PrintService.class);
		
		for(PrintService service : serviceLoader) {
			service.print("Karthik");
		}
		
	}

}

