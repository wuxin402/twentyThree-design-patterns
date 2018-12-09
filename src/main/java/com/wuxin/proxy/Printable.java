package com.wuxin.proxy;

/**
 * Subject(主体)
 * @author Administrator
 *
 */
public interface Printable {
	public abstract void setPrinterName(String name);
	public abstract String getPrinterName();
	public abstract void print(String string);
}
