package com.wuxin.fly.weight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Flyweight(轻量级)
 * 表示那些实例会被共享的类
 * @author Administrator
 *
 */
public class BigChar {
	private char charname;
	private String fontdata;
	public BigChar(char charname) {
		this.charname = charname;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("big" + charname + ".txt"));
			String line;
			StringBuffer buf = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				buf.append(line);
				buf.append("\n");
			}
			reader.close();
			this.fontdata = buf.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void print() {
		System.out.println(fontdata);
	}
}
