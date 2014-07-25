package GUI;

import java.awt.BorderLayout;




import java.awt.Container;
import java.awt.Dimension;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;



public class Gui extends JFrame{
	 private static Container contentPane;

	public static void main(String[] args){
     JFrame frame = new JFrame();
     frame.setSize(500,500);
     frame.setVisible(true);
     JTextArea area = new JTextArea(5,20);
     area.setColumns(200);
     area.setPreferredSize(new Dimension(100, 100));
     frame.add(area);
     JButton button1 = new JButton("ämîF");
     JButton button2 = new JButton("çÌèú");
     button1.setPreferredSize(new Dimension(100, 100));
     button2.setPreferredSize(new Dimension(100, 100));
     frame.add(button1);
     frame.add(button2);
	 }
	
		
	}



