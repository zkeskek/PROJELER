import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Passwordfieldor {

	public static void main(String[] args) {
		JFrame f = new JFrame("PaswordField Örneği");

		JLabel l1;
		JPasswordField pass;
		JButton btn;

		l1 = new JLabel("Şifre : ");
		l1.setBounds(20, 20, 100, 30);

		pass = new JPasswordField();
		pass.setBounds(20, 50, 100, 30);

		btn = new JButton("Gönder");
		btn.setBounds(20, 80, 100, 30);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String password= new String(pass.getPassword());
				l1.setText("Şifre : "+password);
				

			}
		});

		f.add(l1);
		f.add(pass);
		f.add(btn);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
