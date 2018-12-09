package com.wuxin.abstracts.factory;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的产品:Page类
 * @author Administrator
 *
 */
public abstract class Page {
	protected String title;
	protected String author;
	protected List<Item> content = new ArrayList<Item>();
	
	public Page(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	public void add(Item item) {
		content.add(item);
	}
	
	public void outPut() {
		try {
			String fileName = title + ".html";
			Writer writer = new FileWriter(fileName);
			writer.write(this.makeHTML());
			writer.close();
			System.out.println(fileName + "编写完成。");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public abstract String makeHTML();
}
