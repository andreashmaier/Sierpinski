package de.gbs.gui;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Sierpinski extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int d0 = 729;
	private Graphics g;
	public static int i = 0;

	public Graphics getG() {
		return g;
	}

	public void setG(Graphics g) {
		this.g = g;
	}

	@Override
	protected void paintComponent(Graphics g) {
		this.g = g;
		drawSierpinski(0, 0, getWidth(), getHeight());
	}

	private void drawSierpinski(int x, int y, int breite, int hoehe) {
		if (breite > getWidth() / (int) Math.pow(3, i)) {
			int b = breite / 3;
			int h = hoehe / 3;
			g.fillRect(x + b, y + h, b, h);
			for (int k = 0; k < 9; k++)
				if (k != 4) {
					int zeile = k / 3;
					int spalte = k % 3;
					drawSierpinski(x + zeile * b, y + spalte * h, b, h); // Rekursion
				}
		}

	}

}
