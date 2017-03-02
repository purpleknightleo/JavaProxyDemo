package com.lee.demo.proxy.javassist;
import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

public class JavassistProxyTest {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
		Subject subject = new RealSubject("hello");
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setInterfaces(new Class[] { Subject.class });
		Subject proxy = (Subject) proxyFactory.createClass().newInstance();
		((ProxyObject) proxy).setHandler(new JavassistProxy(subject));
		proxy.doBiz();
	}

}
