package com.wuxin.fly.weight;

public class TestFlyResult {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java Main digits");
			System.out.println("Example: java Main 1212123");
			System.exit(0);
		}
		BigString bs =new BigString("wuxin");
		bs.print();
		System.out.println("hello");
	}
	
	/**
	 * 共享实例可减少内存使用,内存是资源的一种。时间也是一种资源,使用new关键字生成实例会花费时间。
	 * 通过Flyweight模式共享实例可以减少使用new关键字生成实例的次数。
	 * 这样就可以提高程序运行速度。
	 */
}	
