package com.tcg.hydra;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Manager implements WindowListener  {
	
	int counter;
	
	public Manager() {
		new Hydra(this);
		
		counter = 1;
		
	}
	
	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		counter *= 2;
		for(int i = 0; i < counter; i++) {
			new Hydra(this);
		}
	}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}
}
