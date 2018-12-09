package com.wuxin.facade;

import java.io.FileWriter;
import java.util.Properties;

/**
 * Facade(窗口)
 * 代表构成系统的许多其他角色的"简单窗口"。facade角色向系统外部提供
 * 高层接口
 * @author Administrator
 *
 */
public class PageMaker {
	private PageMaker() {
		
	}
	
	public static void makeWelcomePage(String mailaddr, String filename) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("welcome to" +username);
			writer.paragraph("欢迎来到"+username +"主页");
			writer.paragraph("等你邮件");
			writer.mailto(mailaddr, username);
			writer.close();
			System.out.println("执行完毕");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
