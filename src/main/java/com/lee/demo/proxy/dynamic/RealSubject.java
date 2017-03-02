package com.lee.demo.proxy.dynamic;
public class RealSubject implements Subject {

	private String a;

	public RealSubject(String a) {
		this.a = a;
	}

	@Override
	public void doBiz() {
		System.out.println("do biz, " + a);
	}

}
