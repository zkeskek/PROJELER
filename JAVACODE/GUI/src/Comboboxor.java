import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Comboboxor {

	public static void main(String[] args) {
		JFrame f = new JFrame("ComboBox örneği");
		
		String arr[]= {"C","C++","Java","Python"};
		
		JComboBox cb=new JComboBox(arr);
		cb.setBounds(50	,100, 90, 20);
		
		JButton btn=new JButton("Seç");
		btn.setBounds(50	,150, 80, 20);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text="Seçilen programlamadili : "+cb.getSelectedItem();
				String text1="Seçilen programlamadili : "+cb.getItemAt(cb.getSelectedIndex());
				System.out.println(text+" "+text1);
				
			}});
		
		f.add(cb);
		f.add(btn);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
