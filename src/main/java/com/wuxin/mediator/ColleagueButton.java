package com.wuxin.mediator;

import java.awt.Button;

/**
 * ConcreteColleague(具体的同事)
 * @author Administrator
 *
 */
public class ColleagueButton extends Button implements Colleague{
	private static final long serialVersionUID = 1L;
	
	private Mediator mediator;
	
	public ColleagueButton(String caption) {
		super(caption);
	}
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
	}

}
