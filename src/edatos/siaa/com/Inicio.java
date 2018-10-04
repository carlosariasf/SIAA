package edatos.siaa.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidPorFavor = new JLabel("Bienvenid@, por favor ingrese un nombre para su nuevo grupo.");
		lblBienvenidPorFavor.setBounds(10, 98, 424, 20);
		lblBienvenidPorFavor.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBienvenidPorFavor);
		
		textField = new JTextField();
		textField.setBounds(74, 129, 280, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(171, 160, 89, 23);
		contentPane.add(btnContinuar);
		
		JLabel lblSiaa = new JLabel("SIAA");
		lblSiaa.setHorizontalAlignment(SwingConstants.CENTER);
		lblSiaa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSiaa.setBounds(187, 11, 46, 14);
		contentPane.add(lblSiaa);
	}
}
