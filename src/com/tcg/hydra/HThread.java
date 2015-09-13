package com.tcg.hydra;

import javax.swing.JTextArea;

public class HThread extends Thread {

	public static String message = "LOL SCRUB\tLOL SCRUB\n";
	
	private String currentString;
	
	private int i;
	
	private JTextArea text;
	
	public HThread(JTextArea text) {
		currentString = "";
		i = 0;
		this.text = text;
	}

	public void run() {
		super.run();
		while(true) {
			currentString = currentString + message.charAt(i);
			i++;
			if(i >= message.length()) {
				i = 0;
			}
			text.setText(this.getString());
			try {
				sleep(250);
			} catch(Exception e){}
		}
	}
	
	public String getString() {
		return this.currentString;
	}

}
