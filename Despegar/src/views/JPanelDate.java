package views;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class JPanelDate extends JPanel{
	public JPanelDate(String referential, String source) {
		initialice(referential, source);
	}
	
	private void initialice(String referential, String source) {
		setBackground(Color.WHITE);
		Border temp = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(getBackground()),referential);
		setBorder(temp);
		add(new JDialogDateChooser(source));
	}
}
