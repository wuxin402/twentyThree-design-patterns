package com.wuxin.fly.weight;

import java.util.HashMap;

/**
 * FlyweightFactory(轻量级工厂)
 * 在工厂中生成Flyweight角色可以实现共享实例
 * @author Administrator
 *
 */
public class BigCharFactory {
	private HashMap pool = new HashMap();
	private static BigCharFactory singleton = new BigCharFactory();
	
	private BigCharFactory() {
		
	}
	
	public static BigCharFactory getInstance() {
		return singleton;
	}
	
	//生成(共享)BigChar类的实例
	public synchronized BigChar getBigChar(char charname) {
		BigChar bc = (BigChar)pool.get("" + charname);
		if (bc == null) {
			bc = new BigChar(charname);
			pool.put("" + charname, bc);
		}
		return bc;
	}
}
