package com.wuxin.decorator;

public class TestDecoratorResult {
	public static void main(String[] args) {
		Display b1 = new StringDisplay("Hello,world.");
		Display b2 = new SideBorder(b1, '#');
		Display b3 = new FullBorder(b2);
		b1.show();
		b2.show();
		b3.show();
		Display b4 =
					 new SideBorder(
						 new FullBorder(
							 new FullBorder(
								 new SideBorder(
									 new FullBorder(
										 new StringDisplay("你好, 世界。")
									 ),
									 '*'
								 )
							 )
						 ),
						 '/'
					 );
		b4.show();
	}
	
	/**
	 * Decorator模式的主要目的是通过添加装饰物来增加对象的功能
	 * 使用Decorator模式可以为程序添加许多功能。只要准备一些装饰边框(ConcreteDecorator角色),
	 * 即使这些装饰边框都只具有非常简单的功能,也可以将它们自由组合成为新的对象
	 * 
	 * java.io包与Decorator模式
	 * Reader reader = new FileReader("datafile.txt");  ---读取文件
	 * Reader reader = new BufferedReader(new FileReader("datafile.txt"));  ---读取文件时将文件内容放入缓冲区
	 * Reader reader = new LineNumberReader(new BufferedReader(new FileReader("datafile.txt")));  ---管理行号
	 * 
	 * 缺点:Decorator模式的一个缺点是会导致程序中增加许多功能类似的很小的类
	 */
}
