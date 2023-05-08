package com.patikadev.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.patikadev.Helper.Config;
import com.patikadev.Helper.Helper;
import com.patikadev.Model.Operator;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;

public class OperatorGUI extends JFrame {

	private JPanel wrapper = new JPanel();
	private final Operator operator;

	public OperatorGUI(Operator operator) {
		this.operator = operator;
		Helper.setLayout();
		getContentPane().add(wrapper);

		JTabbedPane tab_operator = new JTabbedPane(JTabbedPane.TOP);
		tab_operator.setSize(300, 300);
		tab_operator.setBounds(0, 0, 300, 300);
		wrapper.add(tab_operator);
		
		
		

		JPanel Kullanıcılar = new JPanel();
		tab_operator.addTab("Kullanıcılar", null, Kullanıcılar, null);

		JPanel pnl_top = new JPanel();
		wrapper.add(pnl_top);

		JLabel lbl_Welcome = new JLabel("New label");
		pnl_top.add(lbl_Welcome);
		setSize(1000, 500);
		int x = Helper.screenCenterPoint("x", getSize());
		int y = Helper.screenCenterPoint("y", getSize());
		setLocation(x, y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(Config.PROJECT_TITLE);
		setVisible(true);

	}

	public static void main(String[] args) {
		Operator op = new Operator();
		op.setId(1);
		op.setName("Mustafa");
		op.setPass("1234");
		op.setType("operator");
		op.setUname("mustafa");

		OperatorGUI opGUI = new OperatorGUI(op);

	}

}
