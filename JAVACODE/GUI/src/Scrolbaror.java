import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

public class Scrolbaror {

	public static void main(String[] args) {
		JFrame f = new JFrame("JScrollBar Örneği");
		
		JLabel lbl=new JLabel();
		lbl.setBounds(100, 50, 200, 30);
		
		JScrollBar s=new JScrollBar(JScrollBar.VERTICAL,10,10,0,20);
		s.setMaximum(100);
		s.setMinimum(0);
		s.setBounds(100, 100, 50, 100);
		
		s.addAdjustmentListener(new AdjustmentListener(){

			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				lbl.setText("ScrollBar Değeri : "+s.getValue());
				
			}});
		
		f.add(lbl);
		f.add(s);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
