package com.wuxin.proxy;

/**
 * Proxy模式
 * Client
 * @author Administrator
 *
 */
public class TestProxyResult {
	public static void main(String[] args) {
		Printable p = new PrinterProxy("Alice");
		System.out.println("现在的名字是" + p.getPrinterName() + "。 ");
		p.setPrinterName("Bob");
		System.out.println("现在的名字是" + p.getPrinterName() + "。 ");
		p.print("Helloo, world.");
	}
	
	/**
	 * 代理人只代理他能解决的问题。当遇到他不能解决的问题时,还是会"转交"给本人去解决。
	 */
}
