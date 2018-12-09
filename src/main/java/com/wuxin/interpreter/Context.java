package com.wuxin.interpreter;

import java.util.StringTokenizer;

public class Context {
	private StringTokenizer tokenizer;
	private String currentToken;
	public Context (String text) {
		tokenizer = new StringTokenizer(text);
		nextToken();
	}
	
	public String nextToken() {
		if (tokenizer.hasMoreTokens()) {
			currentToken = tokenizer.nextToken();
		} else {
			currentToken = null;
		}
		return currentToken;
	}
	public String currentToken() {
		return currentToken;
	}
	
	public void skipToken(String token) throws ParseException {
		
	} 
}
