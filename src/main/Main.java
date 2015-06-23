package main;

import gameLogic.Board;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import userInterface.BoardPanel;
import databases.ImageDatabase;


public class Main {
	
	
	public static void main (String [] args) {
		
		SwingUtilities.invokeLater (new Runnable () {
			
			public void run() {
				try {
					ImageDatabase.initImages();
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "Failed to load images.");
					e.printStackTrace();
				}

				
				
				JFrame frame = new JFrame ("Chess");
				Board test = Board.standardBoard();
				BoardPanel pane = new BoardPanel (test);
				frame.add(pane);
				frame.setSize(1280, 650);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
		});
		
	}
	
	
	

}
