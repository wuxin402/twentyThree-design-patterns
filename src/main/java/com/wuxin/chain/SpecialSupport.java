package com.wuxin.chain;

/**
 * ConcreteHandler(具体的处理者)
 * @author Administrator
 *
 */
public class SpecialSupport extends Support{
	private int number;
	public SpecialSupport(String name, int number) {
		super(name);
		this.number = number;
	}
	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() == number) {
			return true;
		}
		return false;
	}
}
