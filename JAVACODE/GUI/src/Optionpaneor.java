import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Optionpaneor {

	public static void main(String[] args) {
		JFrame f = new JFrame("");
		
		JOptionPane.showMessageDialog(f, "Merhaba, Hoş Geldin");
		
		JOptionPane.showMessageDialog(f, "Abone oldun","Abone ol",JOptionPane.WARNING_MESSAGE);
		
		String str=JOptionPane.showInputDialog(f, "Adınız");
		
		System.out.println(str);
		
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
