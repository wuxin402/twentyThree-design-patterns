package com.wuxin.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 加载配置文件的方法
 * @author Administrator
 *
 */
public class Database {
	private Database() {
		
	}
	public static Properties getProperties(String dbname) {
		String filename = dbname + ".txt";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(filename));
		} catch (IOException e) {
			System.out.println(filename + "is not find");
		}
		return prop;
	}
}
