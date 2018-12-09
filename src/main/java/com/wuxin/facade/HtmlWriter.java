package com.wuxin.facade;

import java.io.IOException;
import java.io.Writer;

/**
 * 输出html的方法
 * @author Administrator
 *
 */
public class HtmlWriter {
	private Writer writer;
	
	public HtmlWriter(Writer writer) {
		this.writer = writer;
	}
	
	public void title(String title) throws IOException{
		writer.write("<html>");
		writer.write("<head>");
	}
	
	public void paragraph(String msg) throws IOException{
		writer.write("<p>" + msg + "</p>/n");
	}
	
	public void link(String href, String caption) throws IOException{
		paragraph(caption);
	}
	
	public void mailto(String mailaddr, String username) throws IOException{
		link("mailto:" +mailaddr, username);
	}
	
	public void close() throws IOException {
		writer.write("</body>");
		writer.write("</html>\n");
		writer.close();
	}
}
