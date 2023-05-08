import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.JFormattedTextField;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel Panelici;
	private JTextField ekran;
	private double answer, answer1, answer2, number, number1, number2;
	private String answert, answert1, answert2, answert3, numbert, numbert1, numbert2;
	private String operation, operation1, operation2;
	private JLabel lbl;
	private boolean isesit = false, ekranchange;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void addEkranText(String butonText) {

		if (!ekranchange) {
			ekran.setText("");
			ekranchange = true;
		}

		if (butonText.equals(".")) {
			if ((ekran.getText().equals(""))) {
				ekran.setText("0.");
			}
			if (!ekran.getText().equals("")&&!ekran.getText().contains(".")) {
				ekran.setText(ekran.getText()+".");
			}
		}

		if (butonText.equals("0")) {
			if ((ekran.getText().equals(""))) {
				ekran.setText(butonText);
			} else {
				ekran.setText(ekran.getText() + butonText);
			}
		}

		if (!butonText.equals(".") && !butonText.equals("0")) {

			ekran.setText(ekran.getText() + butonText);

		}

	}

	public void calculate() {

		System.out.println("1." + ekranchange + " n:" + numbert + " n1:" + numbert1 + " n2:" + numbert2 + "ekran: "
				+ ekran.getText() + " op:" + operation + " op1:" + operation1 + " op2:" + operation2 + " answer: "
				+ answert + " answer1: " + answert1 + " answer2: " + answert2 + " answer3: " + answert3);

		if (!ekranchange) {
			System.out.println("-1.");
			operation1 = operation;
		}

		if (ekranchange && (numbert == null)) {
			System.out.println("0.");
			ekranchange = false;
			numbert = ekran.getText();
			answert1 = numbert;
			operation1 = operation;

			lbl.setText(lbl.getText() + numbert + operation);

		}

		if (ekranchange && !(numbert == null) && (numbert1 == null)) {
			System.out.println("1.");
			ekranchange = false;
			numbert1 = numbert;
			answert3 = numbert1;
			numbert = ekran.getText();

			lbl.setText(lbl.getText() + numbert + operation);

			if (operation1.equals("+")) {
				System.out.println(answert1 + "+" + numbert + "=" );
				answer = Double.parseDouble(answert1) + Double.parseDouble(numbert);
				System.out.println(answert1 + "+" + numbert + "=" + answer);
			}

			if (operation1.equals("-")) {
				System.out.println(answert1 + "-" + numbert + "=");
				answer = Double.parseDouble(answert1) - Double.parseDouble(numbert);
				System.out.println(answert1 + "-" + numbert + "=" + answer);
			}

			if (operation1.equals("*")) {
				System.out.println(answert1 + "*" + numbert + "=" );
				answer = Double.parseDouble(answert1) * Double.parseDouble(numbert);
				answert3 = Double.toString(answer);
				System.out.println(answert1 + "*" + numbert + "=" + answer);
			}

			if (operation1.equals("/")) {
				System.out.println(answert1 + "/" + numbert + "=" );
				answer = Double.parseDouble(answert1) / Double.parseDouble(numbert);
				System.out.println(answert1 + "/" + numbert + "=" + answer);
				answert3 = Double.toString(answer);
			}

			ekran.setText(Double.toString(answer));
			answert = Double.toString(answer);

			answert2 = answert1;
			answert1 = answert;
			ekran.setText(Double.toString(answer));
			operation2 = operation1;
			operation1 = operation;
		}

		if (ekranchange && !(numbert == null) && !(numbert1 == null)) {
			System.out.println("2.");

			ekranchange = false;
			numbert2 = numbert1;
			numbert1 = numbert;

			numbert = ekran.getText();

			lbl.setText(lbl.getText() + numbert + operation);

			if (operation1.equals("+")) {
				System.out.println(answert1 + "+" + numbert + "=");
				answer = Double.parseDouble(answert1) + Double.parseDouble(numbert);
				System.out.println(answert1 + "+" + numbert + "=" + answer);
				answert2 = answert1;
				answert3 = numbert;
				operation2 = operation1;
			}

			if (operation1.equals("-")) {
				System.out.println(answert1 + "-" + numbert + "=" );
				answer = Double.parseDouble(answert1) - Double.parseDouble(numbert);
				System.out.println(answert1 + "-" + numbert + "=" + answer);
				answert2 = answert1;
				answert3 = numbert;
				operation2 = operation1;
			}

			if (operation1.equals("*")) {
				if (operation2.equals("+")) {
					System.out.println(answert2 + "+" + answert3 + "*" + numbert + "=" );
					answer = Double.parseDouble(answert2) + Double.parseDouble(answert3) * Double.parseDouble(numbert);

					System.out.println(answert2 + "+" + answert3 + "*" + numbert + "=" + answer);
				}

				if (operation2.equals("-")) {
					System.out.println(answert2 + "-" + answert3 + "*" + numbert + "=");
					answer = Double.parseDouble(answert2) - Double.parseDouble(answert3) * Double.parseDouble(numbert);

					System.out.println(answert2 + "-" + answert3 + "*" + numbert + "=" + answer);
				}

				if (operation2.equals("*") || operation2.equals("/")) {
					System.out.println(answert3 + "*" + numbert + "=" );
					answer = Double.parseDouble(answert3) * Double.parseDouble(numbert);
					System.out.println(answert3 + "*" + numbert + "=" + answer);

				}

				answert3 = Double.toString(Double.parseDouble(answert3) * Double.parseDouble(numbert));

			}

			if (operation1.equals("/")) {
				if (operation2.equals("+")) {
					System.out.println(answert2 + "+" + answert3 + "/" + numbert + "=" );
					answer = Double.parseDouble(answert2) + Double.parseDouble(answert3) / Double.parseDouble(numbert);
					System.out.println(answert2 + "+" + answert3 + "/" + numbert + "=" + answer);
				}

				if (operation2.equals("-")) {
					System.out.println(answert2 + "-" + answert3 + "/" + numbert + "=" );
					answer = Double.parseDouble(answert2) - Double.parseDouble(answert3) / Double.parseDouble(numbert);
					System.out.println(answert2 + "-" + answert3 + "/" + numbert + "=" + answer);
				}

				if (operation2.equals("*") || operation2.equals("/")) {
					System.out.println(answert1 + "/" + numbert + "=" );
					answer = Double.parseDouble(answert3) / Double.parseDouble(numbert);
					System.out.println(answert1 + "/" + numbert + "=" + answer);
				}

				answert3 = Double.toString(Double.parseDouble(answert3) / Double.parseDouble(numbert));
			}
			ekran.setText(Double.toString(answer));

			answert = Double.toString(answer);

			answert1 = answert;

			operation1 = operation;

		}

		if (!ekranchange && !lbl.getText().equals("")) {
			lbl.setText(lbl.getText().substring(0, (lbl.getText().length() - 1)));
			lbl.setText(lbl.getText() + operation);
		}
		
		System.out.println(ekran.getText());
		System.out.println(ekran.getText().substring(ekran.getText().length()-1));
		
		if(ekran.getText().substring(ekran.getText().length()-1).equals("0")) {
			ekran.setText(ekran.getText().substring(0,ekran.getText().length()-1));
		}
		
		if(ekran.getText().substring(ekran.getText().length()-1).equals(".")) {
			ekran.setText(ekran.getText().substring(0,ekran.getText().length()-1));
		}
		System.out.println(ekran.getText());
		
		System.out.println("1." + ekranchange + " n:" + numbert + " n1:" + numbert1 + " n2:" + numbert2 + "ekran: "
				+ ekran.getText() + " op:" + operation + " op1:" + operation1 + " op2:" + operation2 + " answer: "
				+ answert + " answer1: " + answert1 + " answer2: " + answert2 + " answer3: " + answert3);

	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Hesap Makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 472);

		Panelici = new JPanel();
		Panelici.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Panelici);
		Panelici.setLayout(null);

		JPanel ekrancercevesi = new JPanel();
		ekrancercevesi.setBounds(10, 48, 282, 60);
		Panelici.add(ekrancercevesi);
		ekrancercevesi.setLayout(null);

		ekran = new JTextField();
		ekran.setHorizontalAlignment(SwingConstants.RIGHT);
		ekran.setText("");
		ekran.setFont(new Font("Arial", Font.PLAIN, 25));
		ekran.setBounds(0, 20, 282, 40);
		ekrancercevesi.add(ekran);
		ekran.setColumns(10);

		lbl = new JLabel("");
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(0, 0, 282, 21);
		ekrancercevesi.add(lbl);

		JPanel sayicercevesi = new JPanel();
		sayicercevesi.setBounds(10, 162, 282, 260);
		Panelici.add(sayicercevesi);
		sayicercevesi.setLayout(new GridLayout(0, 4, 5, 5));

		JButton btnYuzde = new JButton("%");
		btnYuzde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		btnYuzde.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(btnYuzde);

		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		btnCe.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(btnCe);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
				answer=0;
				answert1 = null;
				answert2 = null;
				answert3 = null;
				numbert = null;
				numbert1 = null;
				numbert2 = null;
				operation = null;
				operation1 = null;
				operation2 = null;
				lbl.setText("");
				ekran.setText("");
				
			}
		});
		btnC.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(btnC);

		JButton btnGeriSil = new JButton("<");
		btnGeriSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		btnGeriSil.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(btnGeriSil);

		JButton btn1BoluX = new JButton("1/x");
		btn1BoluX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		btn1BoluX.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(btn1BoluX);

		JButton btnXKare = new JButton("x2");
		btnXKare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		btnXKare.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(btnXKare);

		JButton btnKarekokX = new JButton("2/-x");
		btnKarekokX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		btnKarekokX.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(btnKarekokX);

		JButton btnbolme = new JButton("/");
		btnbolme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = e.getActionCommand();
				calculate();
			}
		});
		btnbolme.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(btnbolme);

		JButton buton7 = new JButton("7");
		buton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		buton7.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(buton7);

		JButton buton8 = new JButton("8");
		buton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		buton8.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(buton8);

		JButton buton9 = new JButton("9");
		buton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		buton9.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(buton9);

		JButton buton4 = new JButton("4");
		buton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});

		JButton btncarpma = new JButton("*");
		btncarpma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = e.getActionCommand();
				calculate();
			}
		});
		btncarpma.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(btncarpma);
		buton4.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(buton4);

		JButton buton5 = new JButton("5");
		buton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		buton5.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(buton5);

		JButton buton6 = new JButton("6");
		buton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		buton6.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(buton6);

		JButton btncikarma = new JButton("-");
		btncikarma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = e.getActionCommand();
				calculate();
			}
		});
		btncikarma.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(btncikarma);

		JButton buton1 = new JButton("1");
		buton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		buton1.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(buton1);

		JButton buton2 = new JButton("2");
		buton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		buton2.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(buton2);

		JButton buton3 = new JButton("3");
		buton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		buton3.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(buton3);

		JButton btntoplama = new JButton("+");
		btntoplama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = e.getActionCommand();
				calculate();
			}
		});
		btntoplama.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(btntoplama);

		JButton btnTersi = new JButton("+/-");
		btnTersi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnTersi.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(btnTersi);

		JButton buton0 = new JButton("0");
		buton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		buton0.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(buton0);

		JButton butonvirgul = new JButton(".");
		butonvirgul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEkranText(e.getActionCommand());
			}
		});
		butonvirgul.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(butonvirgul);

		JButton butonesit = new JButton("=");
		butonesit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				isesit = true;
				if (ekran.getText().equals("") || operation == null || numbert == null) {

				} else {
					operation = e.getActionCommand();
					calculate();

					answert1 = answert;
					answert2 = null;
					answert3 = null;
					numbert = answert;
					numbert1 = null;
					numbert2 = null;
					operation = null;
					operation1 = null;
					operation2 = null;
					lbl.setText(answert);

				}
			}
		});
		butonesit.setFont(new Font("Arial", Font.PLAIN, 20));
		sayicercevesi.add(butonesit);

		JPanel hafiza = new JPanel();
		hafiza.setBounds(10, 119, 282, 32);
		Panelici.add(hafiza);
		hafiza.setLayout(new GridLayout(1, 6, 0, 0));

		JButton btnMc = new JButton("MC");
		btnMc.setFont(new Font("Arial", Font.PLAIN, 8));
		hafiza.add(btnMc);

		JButton btnMr = new JButton("MR");
		btnMr.setFont(new Font("Arial", Font.PLAIN, 8));
		hafiza.add(btnMr);

		JButton btnMarti = new JButton("M+");
		btnMarti.setFont(new Font("Arial", Font.PLAIN, 8));
		hafiza.add(btnMarti);

		JButton btnMeksi = new JButton("M-");
		btnMeksi.setFont(new Font("Arial", Font.PLAIN, 8));
		hafiza.add(btnMeksi);

		JButton btnMs = new JButton("MS");
		btnMs.setFont(new Font("Arial", Font.PLAIN, 8));
		hafiza.add(btnMs);

		JButton btnMh = new JButton("MH");
		btnMh.setFont(new Font("Arial", Font.PLAIN, 8));
		hafiza.add(btnMh);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 284, 32);
		Panelici.add(panel_1);

	}
}
