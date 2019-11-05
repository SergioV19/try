package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class TextImgPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel img;
	private JTextField txtBox;
	private JPanel container;
	private JPanel total;
	
	public TextImgPanel(String txtTitle, ImageIcon defaultImg, String txtDef) {
		setLayout(new FlowLayout(Constants.WITHD_AND_HEITDH, 7, 15));
		total = new JPanel(new BorderLayout());
		ImageIcon scaleLogo = new ImageIcon(defaultImg.getImage().getScaledInstance(20, 20, 0));
		this.container = new JPanel(new FlowLayout());
		Border defaultBorder = new RoundedBorder(6,Constants.GREY_LABEL,getInsets());
		this.container.setBorder(defaultBorder);
		this.img = new JLabel(scaleLogo);
		setBackground(Color.WHITE);
		total.setBackground(this.getBackground());
		addLabel(txtTitle);
		createTxtBox(txtDef);
		createContainer();
		total.add(container);
		add(total);
	}
	
	private void addLabel(String txtTitle) {
		JLabel label = new JLabel(txtTitle);
		label.setFont(Constants.RUBIK_LABEL_FONT);
		label.setBorder(null);
		label.setBackground(this.getBackground());
		label.setForeground(Constants.GREY_TXT);
		total.add(label, BorderLayout.NORTH);
	}

	private void createContainer() {
		container.add(img, BorderLayout.WEST);
		container.add(txtBox, BorderLayout.EAST);
		container.setBackground(Color.WHITE);
	}

	private void createTxtBox(String txtDef) {
		txtBox = new JTextField(txtDef);
		txtBox.setBorder(null);
		txtBox.setFont(Constants.RUBIK_TEXT_FONT);
		txtBox.setDisabledTextColor(Constants.GREY_TXT);
		txtBox.setForeground(Constants.GREY_TXT);
		txtBox.setBackground(Color.WHITE);
	}
	
//	protected void paintComponent(Graphics g) {
//		Graphics2D g2 = (Graphics2D)g;
//		g2.setColor(Constants.WHITE_PANE);
//		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//		g2.fillRoundRect(0, 0, getWidth() -1, getHeight() -1, arcW, arcH);
//		super.paintComponent(g2);
//	}

}
