package com.wuxin.command;

import java.awt.Point;

/**
 * ConcreteCommand(具体的命令)
 * @author Administrator
 *
 */
public class DrawCommand implements Command{
	protected Drawable drawble;
	
	private Point position;
	
	public DrawCommand(Drawable drawable, Point position) {
		this.drawble = drawable;
		this.position = position;
	}
	public void execute() {
		drawble.draw(position.x, position.y);
	}

}
