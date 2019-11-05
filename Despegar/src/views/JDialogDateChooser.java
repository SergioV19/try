package views;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import com.toedter.calendar.JDateChooser;

public class JDialogDateChooser extends JDateChooser {

	private static final long serialVersionUID = 1L;

	public JDialogDateChooser(String path) {
		ImageIcon img = new ImageIcon(path);
		setIcon(img);
		calendarButton.setBackground(Color.WHITE);
		calendarButton.setBorderPainted(true);
		jcalendar.setPreferredSize(new Dimension(400, 300));
		jcalendar.setForeground(Color.BLACK);
		jcalendar.setTodayButtonVisible(false);
		jcalendar.setDecorationBackgroundVisible(false);
	}
}