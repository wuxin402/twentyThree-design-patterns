package com.wuxin.singleton;

/**
 * Singleton单例模式
 * @author Administrator
 *
 */
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("生成了一个实例。");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
