package com.wuxin.facade;

public class TestFacadeResult {
	public static void main(String[] args) {
		PageMaker.makeWelcomePage("wuxin@123.com", "wuxin.html");
	}
	
	/**
	 * 在大型系统中,类和方法很多,对于不是很熟悉业务的人来说,调用这些方法和类时就很麻烦。
	 * 不知道先使用哪个,后使用哪个,这时使用Facade模式就变得很有必要了。
	 * 
	 * 从例子中看出:先从数据库中获取需要读取的配置文件,然后拿到用户名,然后html输出,
	 * 将这些步骤放到一个makeWelcomePage方法中,这样接口变少了,使用者也不用
	 * 担心这些方法和类的调用顺序和它们放在哪了。
	 * 
	 * 在超大系统中,往往都含有非常多的类和包。如果我们在每个关键的地方都使用Facade模式,
	 * 那么系统的维护就会变得轻松很多
	 */
}
