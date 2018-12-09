package com.wuxin.visitor;

/**
 * Element(元素)
 * Element角色表示Visitor角色的访问对象。声明了接受访问者的accept方法。
 * @author Administrator
 *
 */
public interface Element {
	public abstract void accept(Visitor v);
}
