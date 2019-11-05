package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TotalNorthPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private NorthEastPanel northEastPanel;
	private NorthWestPanel northWestPanel;
	private NorthSouthPanel northSouthPanel;
	
	public TotalNorthPanel(ActionListener actionListener) {
		setBackground(Color.white);
		setBorder(new RoundedBorder(10, Color.white, getInsets()));
		this.northWestPanel = new NorthWestPanel();
		this.northSouthPanel = new NorthSouthPanel(actionListener);
		northSouthPanel.setBorder(new RoundedBorder(10, Color.WHITE, getInsets()));
		northWestPanel.setBorder(new EmptyBorder(0,(int) (IoManager.WITHD_AND_HEITDH*0.10), 0, 0));
		northEastPanel = new NorthEastPanel(); 
		((NorthWestPanel) northWestPanel).fillLogo();
		setLayout(new BorderLayout());
		add(northWestPanel, BorderLayout.WEST);
		add(northEastPanel, BorderLayout.EAST);
		add(northSouthPanel,BorderLayout.SOUTH);
	}
}
