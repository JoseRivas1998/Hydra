package com.tcg.hydra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowListener;
import java.util.Random;

public class Hydra extends JFrame {
	
	private static final long serialVersionUID = -8553739209800742117L;

	public Hydra(WindowListener manager) {
		Random r = new Random();
		int width = 212;
		int height = 200;
		int widthDim = Toolkit.getDefaultToolkit().getScreenSize().width - width - 10;
		int heightDim = Toolkit.getDefaultToolkit().getScreenSize().height - height - 50;
		setSize(width, height);
		setLocation(r.nextInt(widthDim), r.nextInt(heightDim));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		addWindowListener(manager);
		
		JPanel p = new JPanel();
		
		JScrollPane pane = new JScrollPane();
		
		JTextArea text = new JTextArea(10, 16);
		
		text.setEditable(false);
		
		p.add(text);
		
		setResizable(false);
		
		pane.setViewportView(p);
		
		getContentPane().add(pane);
		
		setTitle("lol scrub");
		
		setVisible(true);
		
		HThread thread = new HThread(text);
		
		thread.start();
	}
	
}
