package Bomberman; //geschrieben von Rena Vamadevan

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Start implements ActionListener {
	
	JFrame jframe = new JFrame("Bomberman");
	JPanel jpanel = new JPanel();
	JLabel jlabel = new JLabel();
	
	JButton start = new JButton();
	JButton exit = new JButton();
	JLabel startbutton = new JLabel("Start");
	JLabel exitbutton = new JLabel("Beenden");
	
	
	void starteApp() {
		start.add(startbutton);
		start.addActionListener(this);

		exit.add(exitbutton);
		exit.addActionListener(this);
		
		jlabel.setIcon(new ImageIcon("images/bomberman.png"));

		jpanel.add(jlabel);
		jpanel.add(start);
		jpanel.add(exit);

		jframe.setSize(416, 416);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(jpanel);
        jframe.setResizable(false);
		jframe.setVisible(true);
		jframe.revalidate();
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == start) {
			jframe.dispose();
			
			new Main().initialize();
		}
		if(e.getSource() == exit) {
			jframe.dispose();
		}
	}
}