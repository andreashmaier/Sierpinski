package de.gbs.gui;

import javax.swing.SwingUtilities;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Fenster().setLocationRelativeTo(null);
			
				
			}
		});
	}
}
