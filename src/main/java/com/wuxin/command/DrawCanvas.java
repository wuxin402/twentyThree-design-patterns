package com.wuxin.command;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 * receiver(接收者)
 * Command角色执行命令时的对象,命令接收者
 * @author Administrator
 *
 */
public class DrawCanvas extends Canvas implements Drawable{
	private static final long serialVersionUID = 1L;
	
	private Color color = Color.red;
	private int radius = 6;  //要绘制的圆点的半径
	private MacroCommand history;
	
	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
	}
	
	public void paint(Graphics g) {
		history.execute();
	}
	
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
	}

}
