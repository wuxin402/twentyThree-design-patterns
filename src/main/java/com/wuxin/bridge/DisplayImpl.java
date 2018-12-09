package com.wuxin.bridge;

/**
 * 类的实现层次结构:DisplayImpl类
 * Implementor(实现者)
 * 该角色位于"类的实现层次结构"的最上层。它定义了用于实现Abstraction角色的接口
 * @author Administrator
 *
 */
public abstract class DisplayImpl {
	public abstract void rawOpen();
	public abstract void rawPrint();
	public abstract void rawClose();
}
