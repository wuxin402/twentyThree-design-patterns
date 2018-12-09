package com.wuxin.chain;

/**
 * ConcreteHandler(具体的处理者)
 * @author Administrator
 *
 */
public class NoSupport extends Support{

	public NoSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return false;
	}

}
