package com.lee.demo.proxy.statics;
public class RealSubject implements Subject {

	private String a;

	public RealSubject(String a) {
		this.a = a;
	}

	@Override
	public void execute() {
		System.out.println("do biz, " + a);
	}

}
