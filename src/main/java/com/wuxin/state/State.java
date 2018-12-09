package com.wuxin.state;

/**
 * State角色表示状态,定义了根据不同状态进行不同处理的接口。
 * 该接口是那些处理内容依赖于状态的方法的集合。
 * @author Administrator
 *
 */
public interface State {
	public abstract void doClock(Context context, int hour);
	public abstract void doUse(Context context);
	public abstract void doAlarm(Context context);
	public abstract void doPhone(Context context);
}
