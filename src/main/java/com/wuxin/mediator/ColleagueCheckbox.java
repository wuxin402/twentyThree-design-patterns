package com.wuxin.mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * ConcreteColleague(具体的同事)
 * @author Administrator
 *
 */
public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague{
	private static final long serialVersionUID = 1L;
	
	private Mediator mediator;
	public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
		super(caption, group, state);
	}
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
	}

	public void itemStateChanged(ItemEvent e) {
		mediator.colleagueChanged();
	}

}
