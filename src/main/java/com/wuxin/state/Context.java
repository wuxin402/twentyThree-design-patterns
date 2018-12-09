package com.wuxin.state;

/**
 * Context(状况、前后关系、上下文)
 * @author Administrator
 *
 */
public interface Context {
	public abstract void setClock(int hour);
	public abstract void changeState(State state);
	public abstract void callSecurityCenter(String msg);
	public abstract void recordLog(String msg);
}
