package com.wuxin.adapter.extend;

import com.wuxin.adapter.Banner;

/**
 * 测试委托适配模式
 * @author Administrator
 *
 */
public class TestEntrustAdapter {
	public static void main(String[] args) {
		Print print = new PrintBanner(new Banner("Hello guoqingjie"));
		print.printWeak();
		print.printStrong();
	}
	
	/**
	 * 在软件版本升级的时候,以前版本的软件已经通过测试了,为了兼容老的版本,这时用Adapter模式,
	 * 可以轻松地同时维护新版本和老版本。
	 * 实现方式:让新版本扮演Adaptee(被适配)角色,旧版本扮演Target角色,接着编写一个扮演
	 * Adapter角色的类,让它使用新版本的类来实现旧版本的类中的方法。
	 */
}
