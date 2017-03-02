package com.lee.demo.proxy.dynamic;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

	private Object target;

	public DynamicProxy(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before executing");
		Object result = method.invoke(target, args);
		System.out.println("after executing");
		return result;
	}

}
