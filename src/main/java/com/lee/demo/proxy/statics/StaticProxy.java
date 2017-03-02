package com.lee.demo.proxy.statics;
public class StaticProxy implements Subject {

	private Subject subject;

	public StaticProxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void execute() {
		System.out.println("before executing");
		subject.execute();
		System.out.println("after executing");
	}

}
