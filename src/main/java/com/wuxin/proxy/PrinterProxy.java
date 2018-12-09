package com.wuxin.proxy;

/**
 * Proxy(代理人)
 * Proxy角色会尽量处理来自Client角色的请求。只有当自己不能处理时,
 * 它才会将工作交给RealSubject
 * @author Administrator
 *
 */
public class PrinterProxy implements Printable{
	private String name;
	private Printer real;
	
	public PrinterProxy() {
		
	}
	public PrinterProxy(String name) {
		this.name = name;
	}
	
	public synchronized void setPrinterName(String name) {
		if (real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}

	public String getPrinterName() {
		return name;
	}

	public void print(String string) {
		realize();
		real.print(string);
	}
	
	private synchronized void realize() {
		if (real == null) {
			real = new Printer(name);
		}
	}
}
