package com.wuxin.decorator;

/**
 * ConcreteDecorator(具体的装饰物)
 * @author Administrator
 *
 */
public class SideBorder extends Border{
	private char borderChar;
	protected SideBorder(Display display, char ch) {
		super(display);
		this.borderChar = ch;
	}

	@Override
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		return borderChar + display.getRowText(row) + borderChar;
	}

}
