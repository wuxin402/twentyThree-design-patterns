package com.wuxin.adapter.implement;

import com.wuxin.adapter.Banner;

/**
 * Adapter适配器(类比为将100伏特的电压转换成12伏特的电压)
 * 使用继承的适配器
 * @author Administrator
 *
 */
public class PrintBanner extends Banner implements Print{

	public PrintBanner(String words) {
		super(words);
	}

	public void printWeak() {
		showWithParen();
	}

	public void printStrong() {
		showWithAster();
	}

}
