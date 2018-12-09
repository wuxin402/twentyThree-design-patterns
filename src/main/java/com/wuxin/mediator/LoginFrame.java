package com.wuxin.mediator;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ConcreteMediator(具体的仲裁者、中介者)
 * @author Administrator
 *
 */
public class LoginFrame extends Frame implements ActionListener, Mediator{
	private static final long serialVersionUID = 1L;

	public void createColleagues() {
		
	}

	public void colleagueChanged() {
		
	}

	public void actionPerformed(ActionEvent e) {
		
	}
	
	public LoginFrame(String title) {
		super(title);
		createColleagues();
		colleagueChanged();
	}
}
