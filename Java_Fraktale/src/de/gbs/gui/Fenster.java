package de.gbs.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fenster extends JFrame {

	private Container c;
	private JPanel jpanelSouth;
	private JLabel jlabel;
	private JButton jbt, jbtBack;
	private Sierpinski jpanelMain;

	public Fenster() {
		super("Sierpinski");
		initializeFenster();
		eventHandling();
		this.setResizable(false);

	}

	private void eventHandling() {
		jpanelMain.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				//JOptionPane.showConfirmDialog(null, "Hello");
				
			}
		});
		jbt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Sierpinski.i++;
				jbtBack.setEnabled(true);
				jlabel.setText("Sierpinski " + Sierpinski.i + ". Stufe");
				c.repaint();
			}
		});

		jbtBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (Sierpinski.i > 0) {
					Sierpinski.i--;
					jlabel.setText("Sierpinski " + Sierpinski.i + ". Stufe");
					c.repaint();
				} 
				if (Sierpinski.i == 0){
					jbtBack.setEnabled(false);
				}
			}
		});

	}

	private void initializeFenster() {
		c = this.getContentPane();
		jpanelMain = new Sierpinski();
		jlabel = new JLabel();
		jlabel.setText("Sierpinski " + Sierpinski.i + ". Stufe");

		jpanelSouth = new JPanel();
		jbt = new JButton("nächste Stufe");
		jbtBack = new JButton("vorherige Stufe");
		jbtBack.setEnabled(false);
		jpanelSouth.add(jbtBack);
		jpanelSouth.add(jlabel);
		jpanelSouth.add(jbt);

		c.setLayout(new BorderLayout());
		c.add(jpanelMain, BorderLayout.CENTER);
		c.add(jpanelSouth, BorderLayout.SOUTH);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(729, 820);
		this.setVisible(true);
	}
}
