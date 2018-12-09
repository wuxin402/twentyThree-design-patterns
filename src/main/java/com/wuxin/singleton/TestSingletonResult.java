package com.wuxin.singleton;

public class TestSingletonResult {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if (s1 == s2) {
			System.out.println("是同一个对象");
		}
	}
}
