package com.lee.demo.proxy.cglib;

public class RealSubject {

	private String a;

	public RealSubject(String a) {
		this.a = a;
	}

	public void doBiz() {
		System.out.println("do biz, " + a);
	}

}
