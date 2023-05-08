import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class Popupmenuor {

	public static void main(String[] args) {
		JFrame f = new JFrame("");
		
		JPopupMenu pm=new JPopupMenu("Menü");
		
		JMenuItem cut=new JMenuItem("Kes");
		JMenuItem copy=new JMenuItem("Kopyala");
		JMenuItem paste=new JMenuItem("Yapıştır");
		
		pm.add(cut);
		pm.add(copy);
		pm.add(paste);
		
		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				pm.show(f,e.getX()+10,e.getY());
			}
		});
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
