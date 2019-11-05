package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class TextPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	String iconDir ;
	String text;
	String label;
	
	public TextPanel(String iconDir, String text, String label) {
		this.iconDir = iconDir;
		this.text = text;
		this.label = label;
	}
	
	public void createPanel() {
		setLayout(new FlowLayout());
		setOpaque(false);
		Border b1 = BorderFactory.createTitledBorder(getBorder(), text, 0, Font.CENTER_BASELINE, new Font("Rubik", Font.BOLD, 13), Color.white);
		Border b2 = new EmptyBorder(14, 10, 10, 10);
		CompoundBorder bord = new CompoundBorder(b1,b2);
		setBorder(bord);
	}
	
	public void fillPanel() {
		JLabel image = new JLabel((Icon)new ImageIcon(getClass().getResource(iconDir)));
		add(image);
		
	}

}
