package com.wuxin.factory.method;

/**
 * Creator(创建者)
 * 负责生产Product角色的抽象类,但具体的处理则由子类ConcreteCreator角色决定
 * 不用new关键字来生产实例,而是调用生成实例的专用方法来生产实例,
 * 这样就可以防止父类与其他具体类耦合
 * @author Administrator
 *
 */
public abstract class Factory {
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product p);
}
