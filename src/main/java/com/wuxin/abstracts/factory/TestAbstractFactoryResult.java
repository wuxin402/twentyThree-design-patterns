package com.wuxin.abstracts.factory;

public class TestAbstractFactoryResult {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("开始执行");
			System.exit(0);
		}
		
		Factory factory = Factory.getFactory(args[0]);
		
		Link people = factory.createLink("人民日报", "http://www.people.com.cn");
		Link gmw = factory.createLink("光明日报", "http://www.gmw.com");
		
		Link us_yahoo = factory.createLink("Yahoo", "http://www.yahoo.com");
		Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp");
		
		Link excite = factory.createLink("Excite", "http://www.excite.com");
		Link google = factory.createLink("Google", "http://www.google.com");
		
		Tray trayNews =factory.createTray("日报");
		trayNews.add(people);
		trayNews.add(gmw);
		
		Tray trayYahoo = factory.createTray("Yahoo!");
		trayYahoo.add(us_yahoo);
		trayYahoo.add(jp_yahoo);
		
		Tray traySearch = factory.createTray("检索引擎");
		traySearch.add(trayYahoo);
		traySearch.add(excite);
		traySearch.add(google);
		
		Page page = factory.createPage("LinkPage", "杨文轩");
		page.add(trayNews);
		page.add(traySearch);
		page.outPut();
		
	}
}	
