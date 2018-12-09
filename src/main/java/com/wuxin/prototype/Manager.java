package com.wuxin.prototype;

import java.util.HashMap;

/**
 * Manager类使用Product接口来复制实例
 * @author Administrator
 *
 */
public class Manager {
	private HashMap<String,Object> showCase = new HashMap<String,Object>();
	
	public void register(String name ,Product proto) {
		showCase.put(name, proto);
	}
	
	public Product create(String protoName) {
		return (Product)showCase.get(protoName);
	}
}
