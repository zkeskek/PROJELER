import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Textareaor {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Frame");

		JLabel l1, l2;
		JTextArea area;
		JButton btn;

		l1 = new JLabel("Kelime : ");
		l1.setBounds(50, 25, 100, 30);

		l2 = new JLabel("Karakter : ");
		l2.setBounds(160, 25, 100, 30);

		area=new JTextArea();
		area.setBounds(20, 75, 250, 200);

		btn = new JButton("Hesapla");
		btn.setBounds(100, 300, 120, 30);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String text=area.getText();
				String words[]=text.split("\\s");
				l1.setText("Kelime : "+words.length);
				l2.setText("Karakter : "+text.length());
				

			}
		});

		frame.add(l1);
		frame.add(l2);
		frame.add(area);
		frame.add(btn);

		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
