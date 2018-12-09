package com.wuxin.chain;

/**
 * ConcreteHandler(具体的处理者)
 * @author Administrator
 *
 */
public class OddSupport extends Support{

	public OddSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() %2 ==1) {
			return true;
		}
		return false;
	}

}
