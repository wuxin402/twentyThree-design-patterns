package com.wuxin.decorator;

/**
 * Component
 * 增加功能时核心角色。
 * 装饰前的蛋糕
 * @author Administrator
 *
 */
public abstract class Display {
	public abstract int getColumns();
	public abstract int getRows();
	public abstract String getRowText(int row);
	
	public final void show() {
		for (int i =0; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
