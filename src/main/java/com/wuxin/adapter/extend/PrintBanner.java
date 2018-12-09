package com.wuxin.adapter.extend;

import com.wuxin.adapter.Banner;

/**
 *  使用委托的适配器
 * @author Administrator
 *
 */
public class PrintBanner extends Print{
	private Banner banner;
	
	public PrintBanner(Banner banner) {
		this.banner = banner;
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}
