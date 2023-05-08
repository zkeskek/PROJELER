import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonExample {

	ButtonExample() {

		// FRAME
		JFrame f = new JFrame("Button Example");

		//FONT
		Font font = new Font("SansSerif", Font.BOLD, 16);
		
		// LABEL
		JLabel l1, l2;
		l1 = new JLabel("First Label");
		l1.setBounds(50, 140, 200, 200);
		l2 = new JLabel("Secand Label");
		l2.setBounds(50, 160, 100, 30);

		// TEXTFIELD
		JTextField tf = new JTextField("Mehaba", 12);
		JTextField tf1 = new JTextField("Mehaba", 10);
		tf.setBounds(50, 50, 300, 50);
		tf1.setBounds(50, 250, 300, 50);
		
		tf1.setEditable(true);
		tf1.setFont(font);

		// ICON
		Icon icn = new ImageIcon("C:\\JAVACODE\\Patika.Dev\\src\\CLICKED.png");
		Icon icn1 = new ImageIcon();

		// BUTTON
		JButton b1 = new JButton("Click Here");
		for (int i = 1; i < 5; i++) {
			b1.setMnemonic(i);
			b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(e);
				}
			});
		}
		b1.setText("Click Here");
		b1.setIcon(icn);
		icn1 = b1.getIcon();

		// LABEL
		l1 = new JLabel("First Label", icn1, 10);
		l1.setBounds(50, 140, 400, 400);
		System.out.println(l1.getHorizontalAlignment());
		System.out.println(l1.getHorizontalTextPosition());

		// BUTTON
		System.out.println(b1.getText());
		b1.setBounds(50, 200, 95, 30);
		b1.setEnabled(true);
		b1.setIcon(new ImageIcon("C:\\JAVACODE\\Patika.Dev\\src\\REGİSTER.png"));
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e);
				b1.setText("Clicked");
				b1.setIcon(icn);
				b1.setEnabled(false);
			}
		});

		JButton b = new JButton(new ImageIcon("C:\\JAVACODE\\Patika.Dev\\src\\REGİSTER.png"));
		b.setBounds(50, 100, 95, 30);

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e);
				String host = "www.google.com";
				try {
					String ip = java.net.InetAddress.getByName(host).getHostAddress();

					tf.setText("www.google.com ip : " + ip);
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		// FRAME
		f.add(b);
		f.add(b1);
		f.add(tf);
		f.add(l1);
		f.add(l2);
		f.add(tf1);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	

	public static void main(String[] args) {
		new ButtonExample();
	}
}
