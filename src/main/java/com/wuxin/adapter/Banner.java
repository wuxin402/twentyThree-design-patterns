package com.wuxin.adapter;

/**
 * Adaptee被适配(不满足真正需求而又是真正存在的对象,类比为100伏特电源)
 * @author Administrator
 *
 */
public class Banner {
	private String words;
	
	public Banner(String words) {
		this.words = words;
	}
	
	public void showWithParen() {
		System.out.println("(" + words + ")");
	}
	
	public  void showWithAster() {
		System.out.println("*" + words + "*");
	}
}
