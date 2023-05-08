import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		
		JFrame frame = new JFrame("Frame");
		
		JLabel l1,l2,l3;
		JTextField t1,t2,t3;
		JButton btn;
		
		
		l1 = new JLabel("İlk Sayı");
		l1.setBounds(50, 10, 100, 30);
		
		t1=new JTextField();
		t1.setBounds(50, 40, 200, 30);
		
		l2 = new JLabel("İkinci Sayı");
		l2.setBounds(50, 70, 100, 30);
		
		t2=new JTextField();
		t2.setBounds(50, 100, 200, 30);
		
		l3 = new JLabel("Toplam");
		l3.setBounds(50, 130, 100, 30);
		
		t3=new JTextField();
		t3.setBounds(50, 160, 200, 30);
		t3.setEditable(false);
			
		btn = new JButton("Toplam");
		btn.setBounds(50, 220, 200, 30);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=a+b;
				String toplam=String.valueOf(c);
				t3.setText(toplam);
				
			}
		});

		// JPanel panel=new JPanel();
		// panel.setBounds(0, 0, 200, 200);

		// frame.getContentPane();
		frame.add(l1);
		frame.add(t1);
		frame.add(l2);
		frame.add(t2);
		frame.add(l3);
		frame.add(t3);
		frame.add(btn);
		
		
		

		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
