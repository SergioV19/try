package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NorthWestPanel extends JPanel{

	public NorthWestPanel() {
		setLayout(new BorderLayout());
		setBackground(Color.decode(Constants.WHITE));
		fillLogo();
		setOpaque(false);
	}
	
	public void fillLogo() {
		ImageIcon Logo = new ImageIcon("img/Logo-Despegar.png");
		ImageIcon scaleLogo = new ImageIcon(Logo.getImage().getScaledInstance(161, 43, 0));
		JButton iconLogo = new JButton(scaleLogo);
		iconLogo.setBorderPainted(true);
		iconLogo.setBackground(Color.decode(Constants.WHITE));
		iconLogo.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		iconLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
		iconLogo.setOpaque(false);
		add(iconLogo, BorderLayout.WEST);
	}
}
