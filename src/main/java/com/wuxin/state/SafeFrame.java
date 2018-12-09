package com.wuxin.state;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context{
	private static final long serialVersionUID = 1L;
	
	private TextField textClock = new TextField(60);
	private TextArea textScreen = new TextArea(10, 60);
	private State state = DayState.getInstance();
	
	public SafeFrame (String title) {
		super(title);
	}
	
	public void setClock(int hour) {
		String clockstring= "现在时间是";
		if (hour < 10) {
			clockstring += "0" + hour +":00"; 
		} else {
			clockstring += hour + ":00";
		}
		System.out.println(clockstring);
		textClock.setText(clockstring);
		state.doClock(this, hour);
	}

	public void changeState(State state) {
		this.state = state;
	}

	public void callSecurityCenter(String msg) {
		textScreen.append("call! " + msg + "\n");
	}

	public void recordLog(String msg) {
		textScreen.append("record ..." + msg + "\n");
	}

	public void actionPerformed(ActionEvent e) {
		
	}

}
