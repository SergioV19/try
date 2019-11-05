package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import views.IoManager;

public class Control implements ActionListener{

	public Control() {
		new IoManager(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (Actions.valueOf(e.getActionCommand())) {
		case ACTION_ACOMODATION:
			JOptionPane.showMessageDialog(null, "alojamientos");
			break;
		case ACTION_ACTIVITIES:
			JOptionPane.showMessageDialog(null, "actividades");
			break;
		case ACTION_CARS:
			JOptionPane.showMessageDialog(null, "carros");
			break;
		case ACTION_DISNEY:
			JOptionPane.showMessageDialog(null, "disney");
			break;
		case ACTION_FLIES:
			JOptionPane.showMessageDialog(null, "vuelos");
			break;
		case ACTION_GETAWAYS:
			JOptionPane.showMessageDialog(null, "escapadas");
			break;
		case ACTION_IMBATIBLES:
			JOptionPane.showMessageDialog(null, "imbatibles");
			break;
		case ACTION_PACKAGES:
			JOptionPane.showMessageDialog(null, "paquetes");
			break;
		case ACTION_SECURES:
			JOptionPane.showMessageDialog(null, "seguros");
			break;
		case ACTION_TRANSFERS:
			JOptionPane.showMessageDialog(null, "transferencias");
			break;
		case ACION_CRUISES:
			JOptionPane.showMessageDialog(null, "cruceros");
			break;
		default:
			break;

		
		}
	}
	
	public static void main(String[] args) {
		new Control();
	}

}
