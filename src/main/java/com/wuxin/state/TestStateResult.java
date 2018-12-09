package com.wuxin.state;

/**
 * State模式
 * @author Administrator
 *
 */
public class TestStateResult {
	public static void main(String[] args) {
		SafeFrame frame =new SafeFrame("State sample");
		while (true) {
			for (int hour = 0; hour < 24; hour++) {
				frame.setClock(hour);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 在编程时,我们经常会使用分而治之的方针。它非常适用于大规模的复杂处理。当遇到庞大且复杂
	 * 的问题,不能用一般的方法解决时,我们会先将该问题分解为多个小问题。
	 * 分而治之:将一个复杂的大问题分解为多个小问题然后逐个解决
	 */
}
