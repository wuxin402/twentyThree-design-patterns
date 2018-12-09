package com.wuxin.builder;

/**
 * 使用Builder类中声明的方法
 * @author Administrator
 *
 */
public class Director {
	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("早上好");
		builder.makeString("学习");
		builder.makeItems(new String[] {
				"Java",
				"Scala",
				"Python"
		});
		builder.close();
	}
}
