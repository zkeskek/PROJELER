package com.patikadev.Helper;

import java.awt.*;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Helper {

	public static void setLayout() {
		for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
			if ("Nimbus".equals(info.getName())) {
				try {
					UIManager.setLookAndFeel(info.getClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {

					e.printStackTrace();
				}
			}
			break;
		}

	}

	public static int screenCenterPoint(String eksen, Dimension size) {
		int point;
		switch (eksen) {
		case "x":
			point = (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
			break;
		case "y":
			point = (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
			break;
		default:
			point = 0;

		}
		return point;
	}

}
