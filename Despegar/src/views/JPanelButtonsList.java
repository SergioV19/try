package views;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JPanelButtonsList extends JPanel{

		JButton[] buttonArray = {new JButton(new ImageIcon("img/trialButton.png")),new JButton(new ImageIcon("img/trialButton.png")),new JButton(new ImageIcon("img/trialButton.png")),new JButton(new ImageIcon("img/trialButton.png")),new JButton(new ImageIcon("img/trialButton.png")),new JButton(new ImageIcon("img/trialButton.png")),new JButton(new ImageIcon("img/trialButton.png")),new JButton(new ImageIcon("img/trialButton.png"))};
		
		public JPanelButtonsList() {
			LayoutManager lay = new GridLayout(2,4,16,8);
			this.setLayout(lay);
			this.setBorder(new EmptyBorder(getInsets()));
			setBackground(Color.WHITE);
			for (JButton jButton : buttonArray) {
				setBorder(new EmptyBorder(getInsets()));
				jButton.setBackground(Color.WHITE);
				jButton.setBorderPainted(false);
				add(jButton);
			}
		}
}
