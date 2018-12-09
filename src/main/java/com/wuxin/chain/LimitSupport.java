package com.wuxin.chain;

/**
 * ConcreteHandler(具体的处理者)
 * @author Administrator
 *
 */
public class LimitSupport extends Support{
	private int limit;
	public LimitSupport(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() < limit) {
			return true;
		}
		return false;
	}

}
