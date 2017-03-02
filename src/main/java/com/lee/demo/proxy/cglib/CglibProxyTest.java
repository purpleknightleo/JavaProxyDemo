package com.lee.demo.proxy.cglib;

public class CglibProxyTest {

	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		RealSubject subject = RealSubjectFactory.getInstance(proxy);
		subject.doBiz();
	}

}
