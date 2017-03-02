package com.lee.demo.proxy.javassist;
import java.lang.reflect.Method;

import javassist.util.proxy.MethodHandler;

public class JavassistProxy implements MethodHandler {

	private Object target;

	public JavassistProxy(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Method method2,
			Object[] args) throws Throwable {
		System.out.println("before executing");
		Object result = method.invoke(target, args);
		System.out.println("after executing");
		return result;
	}
	
}
