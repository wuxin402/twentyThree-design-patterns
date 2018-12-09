package com.wuxin.mediator;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * ConcreteColleague(具体的同事)
 * @author Administrator
 *
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague{
	private static final long serialVersionUID = 1L;
	
	private Mediator mediator;
	public ColleagueTextField(String text, int columns) {
		super(text,columns);
	}
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
		setBackground(enabled ? Color.white : Color.lightGray);
	}

	public void textValueChanged(TextEvent e) {
		mediator.colleagueChanged();
	}

}
