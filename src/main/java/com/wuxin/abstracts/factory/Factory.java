package com.wuxin.abstracts.factory;

/**
 * 抽象的工厂:Factory类
 * @author Administrator
 *
 */
public abstract class Factory {
	public static Factory getFactory(String className) {
		Factory factory = null;
		try {
			factory =(Factory)Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}
	
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title,String author);
}
