package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Gui {
	JTextArea area = new JTextArea(5, 20);
	static JFrame f = new JFrame();
	public static void main(String[] args) {
		f.setSize(500, 500);
		f.setVisible(true);
	}

	Gui() {
		
		area.setColumns(200);
		area.setPreferredSize(new Dimension(100, 100));
		f.add(area);

		JPanel p = new JPanel();
		JButton button1 = new JButton("ämîF");
		JButton button2 = new JButton("çÌèú");
		button1.setPreferredSize(new Dimension(100, 100));
		button2.setPreferredSize(new Dimension(100, 100));
		p.add(button1);
	
		

		
		f.add(p, BorderLayout.CENTER);

	}

}
