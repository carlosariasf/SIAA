package edatos.siaa.com;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class IngresoDatos extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoDatos frame = new IngresoDatos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IngresoDatos() {
		setBounds(100, 100, 450, 300);

	}

}
