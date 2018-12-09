package com.wuxin.strategy;

public class TestStrategyResult {
	public static void main(String[] args) {
		Player player1 = new Player("Taro", new WinningStrategy(5));
		Player player2 = new Player("Hana", new ProbStrategy(7));
		
		for (int i = 0; i < 10000; i++) {
			Hand nextHand1 = player1.nextHand();
			Hand nextHand2 = player2.nextHand();
			
			if  (nextHand1.isStrongerThan(nextHand2)) {
				System.out.println("Winner:" + player1);
				player1.win();
				player2.lose();
			} else if (nextHand2.isStrongerThan(nextHand1)) {
				player1.lose();
				player2.win();
			} else {
				System.out.println("Even...");
				player1.even();
				player2.even();
			}
		}
		System.out.println("Total result:");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
	}
	
	/**
	 * 通常在编程时算法会被写在具体方法中。Strategy模式却特意将算法与其他部分分离开来,
	 * 只是定义了与算法相关的接口,然后在程序中以委托的方式来使用算法。
	 * 
	 * 当我们想要通过改善算法来提高算法的处理速度时,如果使用了Strategy模式,就不必修改
	 * Strategy角色的接口,仅仅修改ConcreteStrategy角色即可。使用委托这种弱关联
	 * 关系可以很方便的整体替换算法。
	 */
}
