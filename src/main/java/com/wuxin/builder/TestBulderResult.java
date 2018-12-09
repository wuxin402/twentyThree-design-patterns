package com.wuxin.builder;

public class TestBulderResult {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("开始编写文档");
			System.exit(0);
		}
		
		if (args[0].equals("explain")) {
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.construct();
			String result = textBuilder.getResult();
			System.out.println(result);
		} else if (args[0].equals("html")) {
			HTMLBuilder htmlBuilder =new HTMLBuilder();
			Director director =new Director(htmlBuilder);
			director.construct();
			String fileName = htmlBuilder.getResult();
			System.out.println(fileName + "文件编写完成。");
		} else {
			System.out.println("该干嘛干嘛");
			System.exit(0);
		}
	}
	
	/**
	 * Director类知道Builder类,它调用Builder类的方法来编写文档,但是它并不知道它"真正"使用的哪个类。
	 * 正是因为不知道才能替换,正是因为可以替换,组件才具有高价值。作为设计人员,我们必须时刻关注这种"可替换性"。
	 */
}
