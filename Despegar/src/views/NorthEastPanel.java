package views;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class NorthEastPanel extends JPanel{

	public NorthEastPanel(){
		setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
		setBackground(Constants.WHITE_PANE);
		addButtons();
//		setOpaque(false);
	}
	
	public void addButtons() {
		JPanel containerPane = new JPanel(new FlowLayout());
		containerPane.setBorder(new RoundedBorder(20, Constants.WHITE_PANE, this.getInsets()));
		containerPane.setBackground(Constants.GREY_PANE);
		createHeadphones(containerPane);
		createLabel(containerPane);		
		createLoggin(containerPane);
		createBags(containerPane);
		createHelp(containerPane);
		add(containerPane);
	}

	private void createLoggin(JPanel containerPane) {
		ImageIcon Logo = new ImageIcon("img/loggin.PNG");
		ImageIcon scaleLogo = new ImageIcon(Logo.getImage().getScaledInstance(18,18, 0));
		JButton forSell = new JButton(scaleLogo);
		forSell.setText(Constants.LOGGIN_TEXT);
		forSell.setFont((Constants.RUBIK_TEXT_FONT));
		forSell.setForeground(Constants.GREY_TXT);
		forSell.setBackground(containerPane.getBackground());
		forSell.setBorderPainted(false);
		containerPane.add(forSell);
	}

	private void createHeadphones(JPanel containerPane) {
		ImageIcon Logo = new ImageIcon("img/Headphone.PNG");
		ImageIcon scaleLogo = new ImageIcon(Logo.getImage().getScaledInstance(20,18, 0));
		JButton forSell = new JButton(scaleLogo);
		forSell.setText(Constants.FORSELL_TEXT);
		forSell.setFont((Constants.RUBIK_TEXT_FONT));
		forSell.setForeground(Constants.GREY_TXT);
		forSell.setBackground(containerPane.getBackground());
		forSell.setBorderPainted(false);
		containerPane.add(forSell);
	}
	
	private void createBags(JPanel containerPane) {
		ImageIcon Logo = new ImageIcon("img/Bag.PNG");
		ImageIcon scaleLogo = new ImageIcon(Logo.getImage().getScaledInstance(20,18, 0));
		JButton forSell = new JButton(scaleLogo);
		forSell.setText(Constants.BAG_TEXT);
		forSell.setFont((Constants.RUBIK_TEXT_FONT));
		forSell.setForeground(Constants.GREY_TXT);
		forSell.setBackground(containerPane.getBackground());
		forSell.setBorderPainted(false);
		containerPane.add(forSell);
	}
	
	private void createHelp(JPanel containerPane) {
		ImageIcon Logo = new ImageIcon("img/Help.PNG");
		ImageIcon scaleLogo = new ImageIcon(Logo.getImage().getScaledInstance(20,18, 0));
		JButton forSell = new JButton(scaleLogo);
		forSell.setText(Constants.BAG_TEXT);
		forSell.setFont((Constants.RUBIK_TEXT_FONT));
		forSell.setForeground(Constants.GREY_TXT);
		forSell.setBackground(containerPane.getBackground());
		forSell.setBorderPainted(false);
		containerPane.add(forSell);
	}
	
	private void createLabel(JPanel containerPane) {
		JLabel line = new JLabel("|");
		line.setForeground(Constants.GREY_TXT);
		containerPane.add(line);
	}
	
}
