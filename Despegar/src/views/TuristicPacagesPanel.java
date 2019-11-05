package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class TuristicPacagesPanel extends JPanel{ 

	private static final long serialVersionUID = 1L;
	JLabel title;
	JPanel superiorPanel;
	JPanel inferiorPanel;
	JPanel containerPanel;
	JPanel internalPanel;
	
	JButton[] kind = new JButton[] { new JButton(new ImageIcon("img/Fly+Acomodation.png")),	new JButton(new ImageIcon("img/Fly+Car.png")), new JButton(new ImageIcon("img/Fly+TwoAcmdn.png")) };



	public TuristicPacagesPanel() {
		setLayout(new BorderLayout());
		this.title = new JLabel("paquetes turisticos");
		this.title.setFont(Constants.RUBIK_TITLE_FONT);
		this.title.setForeground(Constants.GREY_TXT);
		internalPanel = new JPanel(new BorderLayout());
		containerPanel = new JPanel(new FlowLayout(Constants.WITHD_AND_HEITDH, 200, 0));
		containerPanel.setBackground(Constants.PINK_PANE);
		setBackground(Constants.PINK_PANE);
		containerPanel.setBorder(new EmptyBorder(50, 0, 0, 0));
		superiorPanel = new JPanel(new BorderLayout());
		inferiorPanel = new JPanel(new BorderLayout());
		createSuperiorPane();
		addOriginDestinyTxt();
		addSearchDates();
		addAcomoddations();
		internalPanel.add(superiorPanel,BorderLayout.NORTH);
		internalPanel.add(inferiorPanel,BorderLayout.CENTER);
		containerPanel.add(internalPanel);
		add(containerPanel);
	}
	
	public void createSuperiorPane() {
		superiorPanel.setBackground(Constants.WHITE_PANE);
		superiorPanel.add(title,BorderLayout.WEST);
		JPanel buttonsKindPanel = new JPanel();
		buttonsKindPanel.setBackground(Constants.WHITE_PANE);
		buttonsKindPanel.setLayout(new GridLayout(1, kind.length, 8, 0));
		buttonsKindPanel.setBorder(new EmptyBorder((int) (Constants.WITHD_AND_HEITDH * 0.05), (int) (Constants.WITHD_AND_HEITDH * 0.05), 0,(int) (Constants.WITHD_AND_HEITDH * 0.05)));
		for (JButton jButton : kind) {
			jButton.setBorderPainted(true);
			jButton.setBackground(Color.decode(Constants.WHITE));
			jButton.setBorder(new RoundedBorder(20, Color.GRAY,getInsets()));
			buttonsKindPanel.add(jButton, BorderLayout.NORTH);
		}
		superiorPanel.add(buttonsKindPanel, BorderLayout.EAST);
	}
	
	public void addOriginDestinyTxt(){
		ImageIcon originImg = new ImageIcon("img/Origin.png");
		ImageIcon destinyImg = new ImageIcon("img/Destiny.png");
		TextImgPanel originPane = new TextImgPanel("Origen", originImg, "Ingresa una ciudad");
		TextImgPanel destinyPane = new TextImgPanel("Destino", destinyImg, "Ingresa una ciudad");
		JPanel TxtContainer = new JPanel(new BorderLayout());
		TxtContainer.add(originPane,BorderLayout.WEST);
		TxtContainer.add(destinyPane,BorderLayout.CENTER);
		inferiorPanel.add(TxtContainer, BorderLayout.WEST);
	}
	
	public void addSearchDates() {
		JPanel dateContainer = new JPanel(new FlowLayout());
		JPanelDate come = new JPanelDate("ida","img/Calendar.PNG");
		JPanelDate back = new JPanelDate("vuelta", "img/Calendar.PNG");
		dateContainer.setBackground(Color.WHITE);
		dateContainer.add(come);
		dateContainer.add(back);
		inferiorPanel.add(dateContainer,BorderLayout.CENTER);
	}
	
	public void addAcomoddations() {
		ImageIcon searchImg = new ImageIcon("img/SearchButton.png");
		ImageIcon originImg = new ImageIcon("img/Bed&Person.PNG");
		JPanel acomodationsContainer = new JPanel(new FlowLayout());
		acomodationsContainer.setBackground(Color.WHITE);
		Border temp = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE),"Habitaciones");
		acomodationsContainer.setBorder(temp);
		JButton acmdButton = new JButton(originImg);
		acmdButton.setBackground(Constants.WHITE_PANE);
		acmdButton.setBorder(new RoundedBorder(10, Constants.GREY_TXT, getInsets()));
		JButton searchButton = new JButton(searchImg);
		searchButton.setBackground(Constants.PURPLE_SEARCH);
		acomodationsContainer.add(acmdButton);
		acomodationsContainer.add(searchButton);
		inferiorPanel.add(acomodationsContainer,BorderLayout.EAST);
	}
	
}
