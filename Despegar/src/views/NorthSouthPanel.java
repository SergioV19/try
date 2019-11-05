package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import controllers.Actions;

public class NorthSouthPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel westButtonsPanel;
	private JPanel eastButtonsPanel;

	public JButton[] totalButtoms = { new JButton(new ImageIcon("img/Housing.png")),
			new JButton(new ImageIcon("img/Flies.png")), new JButton(new ImageIcon("img/Packs.png")),
			new JButton(new ImageIcon("img/Imbatibles.png")), new JButton(new ImageIcon("img/Getaways.png")),
			new JButton(new ImageIcon("img/Activities.png")), new JButton(new ImageIcon("img/Cars.png")),
			new JButton(new ImageIcon("img/Disney.png")), new JButton(new ImageIcon("img/Secures.png")),
			new JButton(new ImageIcon("img/Transfers.png")), new JButton(new ImageIcon("img/Cruises.png")) };

	public NorthSouthPanel(ActionListener actionListener) {
		setBackground(Constants.WHITE_PANE);
		this.westButtonsPanel = new JPanel();
		this.eastButtonsPanel = new JPanel(new BorderLayout());
		this.eastButtonsPanel.setBackground(Constants.WHITE_PANE);
		this.eastButtonsPanel.setBorder(new EmptyBorder(0, 0, 15, 20));
		setLayout(new BorderLayout());
		addButtoms(actionListener);
		addCompassButton();
		add(westButtonsPanel,BorderLayout.WEST);
		add(eastButtonsPanel, BorderLayout.EAST);
	}

	public void addButtoms(ActionListener actionListener) {
		westButtonsPanel.setLayout(new GridLayout(1, totalButtoms.length));
		westButtonsPanel.setBorder(new EmptyBorder((int) (Constants.WITHD_AND_HEITDH * 0.05), (int) (Constants.WITHD_AND_HEITDH * 0.05), 0,
				(int) (Constants.WITHD_AND_HEITDH * 0.05)));
		westButtonsPanel.setBackground(Color.decode(Constants.WHITE));
		String[] actionsName = new String[Actions.values().length];
		int i = 0;
		for (Actions action : Actions.values()) {
			actionsName[i] = action.name();
			i++;
		}
		i = 0;
		for (JButton jButton : totalButtoms) {
			jButton.setActionCommand(actionsName[i]);
			i++;
			jButton.addActionListener(actionListener);
			jButton.setBackground(Color.decode(Constants.WHITE));
			jButton.setBorder(null);
			westButtonsPanel.add(jButton);
		}
	}
	
	public void addCompassButton() {
		Border defaultBorder = new RoundedBorder(28, Color.BLACK, getInsets());
		eastButtonsPanel.setBackground(Constants.WHITE_PANE);
		ImageIcon defaultImg = new ImageIcon("img/Compass.png");
		ImageIcon scaleLogo = new ImageIcon(defaultImg.getImage().getScaledInstance(35, 35, 0));
		JButton compass = new JButton(" ¿A donde vamos?",scaleLogo);
		compass.setBackground(Constants.WHITE_PANE);
		compass.setBorder(defaultBorder);
		compass.setFont(Constants.RUBIK_TEXT_FONT);
		eastButtonsPanel.add(compass, BorderLayout.SOUTH);
	}
}
