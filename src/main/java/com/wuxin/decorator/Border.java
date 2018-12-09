package com.wuxin.decorator;

/**
 * Decorator(装饰物)
 * 该角色具有与Component角色相同的接口。内部保存了
 * 被装饰对象--Component角色
 * Decorator角色知道自己要装饰的对象
 * @author Administrator
 *
 */
public abstract class Border extends Display{
	protected Display display;
	protected Border(Display display) {
		this.display = display;
	}
}
