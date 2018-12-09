package com.wuxin.template.method;

/**
 * Template Method模式
 * 定义一个模板类
 * @author Administrator
 *
 */
public abstract class AbstractDisplay {
	public abstract void open(); 
	public abstract void print();
	public abstract void close();
	public final void display() {
		open();
		for (int i=0;i<5;i++) {
			print();
		}
		close();
	}
}
