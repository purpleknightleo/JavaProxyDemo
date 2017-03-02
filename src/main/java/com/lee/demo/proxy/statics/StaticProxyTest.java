package com.lee.demo.proxy.statics;
public class StaticProxyTest {

	public static void main(String[] args) {
		Subject subject = new RealSubject("hello");
		StaticProxy proxy = new StaticProxy(subject);
		proxy.execute();
	}
	
}
