package com.helloworld.impl;

import com.helloworld.services.PrintService;

public class FormattedPrintService implements PrintService {

	@Override
	public void print(String str) {
		System.out.println("Formatted :" + str);
	}

}
