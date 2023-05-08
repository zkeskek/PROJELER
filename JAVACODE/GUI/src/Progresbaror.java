import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Progresbaror {

	public static void main(String[] args) {
		JFrame f = new JFrame("JProgresBar örneği");
		
		JProgressBar jb=new JProgressBar();
		jb.setBounds(40, 40, 160, 30);
		jb.setValue(0);
		jb.setStringPainted(true);
		
		f.add(jb);
		
		
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		int i=0;
		while(i<=2000) {
			jb.setValue(i);
			i=i+1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
