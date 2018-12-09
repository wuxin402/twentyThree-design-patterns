package com.wuxin.mediator;

/**
 * Colleague接口
 * 表示向仲裁者进行报告的组员的接口
 * @author Administrator
 *
 */
public interface Colleague {
	public abstract void setMediator(Mediator mediator);
	public abstract void setColleagueEnabled(boolean enabled);
}
