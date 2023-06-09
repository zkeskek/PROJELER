import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layoutor {

	public static void main(String[] args) {
		JFrame f = new JFrame("Layout");
		
		JButton jb1=new JButton("b1");
		JButton jb2=new JButton("b2");
		JButton jb3=new JButton("b3");
		JButton jb4=new JButton("b4");
		JButton jb5=new JButton("b5");
		
		JPanel p=new JPanel();
		
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p.add(jb1);
		p.add(jb2);
		p.add(jb3);
		p.add(jb4);
		p.add(jb5);
		
		/*
		p.setLayout(new GridLayout(3,2));
		p.add(jb1);
		p.add(jb2);
		p.add(jb3);
		p.add(jb4);
		p.add(jb5);
		*/
		
		
		/*
		p.setLayout(new BorderLayout());
		p.add(jb1,BorderLayout.WEST);
		p.add(jb2,BorderLayout.EAST);
		p.add(jb3,BorderLayout.NORTH);
		p.add(jb4,BorderLayout.SOUTH);
		p.add(jb5,BorderLayout.CENTER);
		*/
		f.add(p);
		
		f.setSize(400, 400);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
