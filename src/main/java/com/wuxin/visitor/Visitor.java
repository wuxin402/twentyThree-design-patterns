package com.wuxin.visitor;


/**
 * Visitor(访问者)
 * visitor角色负责对数据结构中每个具体的元素(ConcreteElement角色)声明
 * 一个用于访问的方法
 * @author Administrator
 *
 */
public abstract class Visitor {
	public abstract void visit(File file);
	public abstract void visit(Directory directory);
}
