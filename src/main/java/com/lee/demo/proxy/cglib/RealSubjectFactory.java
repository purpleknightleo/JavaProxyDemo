package com.lee.demo.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class RealSubjectFactory {

	public static RealSubject getInstance(CglibProxy proxy) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(RealSubject.class);
		enhancer.setCallback(proxy);
		RealSubject subject = (RealSubject) enhancer.create(
				new Class[] { String.class }, new Object[] { "hello" });
		System.out.println("proxy = " + subject.getClass().getName());
		return subject;
	}

}
