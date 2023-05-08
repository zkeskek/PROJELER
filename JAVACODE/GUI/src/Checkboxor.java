import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Checkboxor {

	public static void main(String[] args) {
		JFrame f = new JFrame("ChekBox Örneği");

		JLabel lb1 = new JLabel();
		lb1.setBounds(10, 0, 200, 30);

		JLabel lb2 = new JLabel();
		lb2.setBounds(10, 50, 200, 30);

		JTextField t = new JTextField();
		t.setBounds(10, 100, 200, 30);
		t.setEditable(false);

		JCheckBox ch1 = new JCheckBox("C++");
		ch1.setBounds(10, 150, 200, 50);
		ch1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				lb1.setText("C++ seçim kutusu " + (e.getStateChange() == 1 ? "seçildi" : "seçilmedi"));

			}
		});

		JCheckBox ch2 = new JCheckBox("Java");
		ch2.setBounds(10, 200, 200, 50);
		ch2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				lb2.setText("java seçim kutusu " + (e.getStateChange() == 1 ? "seçildi" : "seçilmedi"));

			}
		});
		JButton btn = new JButton("Kontrol");
		btn.setBounds(10, 250, 100, 30);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				t.setText("");
				if (ch1.isSelected()) {
					t.setText(ch1.getText() + " seçildi ");
				}

				if (ch2.isSelected()) {
					t.setText(t.getText() + ch2.getText() + " seçildi ");
				}

			}
		});

		f.add(ch1);
		f.add(ch2);
		f.add(btn);
		f.add(t);
		f.add(lb1);
		f.add(lb2);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
