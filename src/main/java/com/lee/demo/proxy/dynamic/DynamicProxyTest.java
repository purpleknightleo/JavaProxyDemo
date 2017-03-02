package com.lee.demo.proxy.dynamic;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

	public static void main(String[] args) {
		Subject subject = new RealSubject("hello");
		InvocationHandler handler = new DynamicProxy(subject);
		Subject proxy = (Subject) Proxy.newProxyInstance(
				Subject.class.getClassLoader(), new Class[] { Subject.class },
				handler);
		// Subject proxy = (Subject) Proxy.newProxyInstance(
		// Subject.class.getClassLoader(), subject.getClass().getInterfaces(),
		// handler);
		System.out.println("proxy = " + proxy.getClass().getName());
		if (proxy instanceof Proxy) {
			System.out.println("proxy implements java.lang.reflect.Proxy");
		}
		if (proxy instanceof Subject) {
			System.out.println("proxy implements Subject");
		}
		proxy.doBiz();
	}

}
