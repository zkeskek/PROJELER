import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tableor {

	public static void main(String[] args) {
		JFrame f = new JFrame("Table Örneği");
		
		String[][] veri= {{"1","Mat","85"},{"2","Fen","50"},{"3","Tur","100"}};
		String [ ] baslik= {"ID","Ders","Not"};
		
		JTable jt=new JTable(veri,baslik);
		jt.setBounds(30, 40,200, 300);
		
		JScrollPane sp=new JScrollPane(jt);
		
		//f.add(jt);
		f.add(sp);
		
		f.setSize(400, 400);
		//f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
