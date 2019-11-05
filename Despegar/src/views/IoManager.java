package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import controllers.Control;

public class IoManager extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final String DESPEGAR_TITLE = "Despegar";
	private static final String WHITE = "#FFFFFF";
	public static final int WITHD_AND_HEITDH= 800;
	private TotalNorthPanel panelNorth;
	private JPanel container;
	JScrollPane scrollPane;

	public IoManager(ActionListener actionListener) {
		container = new JPanel();
		scrollPane = new JScrollPane();
		container.setLayout(new BorderLayout());
		container.setSize(new Dimension(800,1600));
		container.setPreferredSize(new Dimension(800,1600));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setPreferredSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(WITHD_AND_HEITDH, WITHD_AND_HEITDH));
		this.setTitle(DESPEGAR_TITLE);
		this.setIconImage(new ImageIcon("img/Icon-Despegar.png").getImage());
		this.getContentPane().setBackground(Color.decode(WHITE));
		panelNorth=  new TotalNorthPanel(actionListener);
		addTitle();
		addCard();
		addButtonsList();
		this.getContentPane().add(scrollPane);
		scrollPane.setPreferredSize(new Dimension(WITHD_AND_HEITDH,WITHD_AND_HEITDH/2));
		scrollPane.setViewportView(container);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.setVisible(true);
	}

	public void addTitle() {
		container.add(panelNorth, BorderLayout.NORTH);
	}
	
	public void addCard() {
	}
	
	public void addButtonsList() {
		JPanel temporalContainer = new JPanel(new FlowLayout());
		JPanel botones = new JPanelButtonsList();
		temporalContainer.add(botones);
		container.add(temporalContainer ,BorderLayout.SOUTH);
	}

}
