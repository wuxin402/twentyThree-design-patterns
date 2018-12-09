package com.wuxin.bridge;

/**
 * 类的功能层次结构:Display类
 * Abstraction(抽象化)
 * 该角色位于"类的功能层次结构"的最上层。它使用Implementor角色的方法定义了
 * 基本的功能。该角色中保存了Implementor角色的实例。
 * @author Administrator
 *
 */
public class Display {
	private DisplayImpl impl;
	
	public Display(DisplayImpl impl) {
		this.impl = impl;
	}
	
	public void open() {
		impl.rawOpen();
	}
	
	public void print() {
		impl.rawPrint();
	}
	
	public void close() {
		impl.rawClose();
	}
	
	public final void display() {
		open();
		print();
		close();
	}
}
