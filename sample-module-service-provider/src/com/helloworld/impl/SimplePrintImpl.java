package com.helloworld.impl;

import com.helloworld.services.PrintService;

public class SimplePrintImpl implements PrintService {

	@Override
	public void print(String str) {
		System.out.format("Simple Format : %s", str);

	}

}
