package edatos.siaa.com;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.LinkedList;

public class VentanaSeleccionOrden extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1473381703078951088L;
	private JPanel contentPane;
	private JTextField textEdad;
	

	
	
	/**
	 * Create the frame.
	 */
	//Se agrega la variable @Grupo como entrada para recibir de la ventana anterior
	public VentanaSeleccionOrden(Grupo grupo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione la cantidad de integrantes");
		lblNewLabel.setBounds(105, 37, 228, 16);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel);
		
		//NO SE LECCIONAR AMBOS BOTONES
		ButtonGroup btnGenero = new ButtonGroup();
		
		JLabel lblEdad = new JLabel("Numero de Integrantes");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEdad.setBounds(36, 96, 147, 14);
		contentPane.add(lblEdad);
		
		textEdad = new JTextField();
		textEdad.setBounds(195, 93, 41, 20);
		contentPane.add(textEdad);
		textEdad.setColumns(10);
		
		//NO SE LECCIONAR AMBOS BOTONES
		ButtonGroup btnCreditosSemestre = new ButtonGroup();
		
		JButton btnVolver = new JButton("Atras");
		btnVolver.setBounds(362, 187, 82, 25);
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnVolver);
		
		JButton btnAgregarOtroIntegrante = new JButton("Edad");
		btnAgregarOtroIntegrante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				
				
				
				
			}
		});
		btnAgregarOtroIntegrante.setBounds(36, 187, 111, 25);
		btnAgregarOtroIntegrante.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnAgregarOtroIntegrante);
		
		JLabel lblSeleccioneElParametro = new JLabel("Seleccione el parametro de ordenamiento");
		lblSeleccioneElParametro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSeleccioneElParametro.setBounds(36, 141, 350, 16);
		contentPane.add(lblSeleccioneElParametro);
		
		JButton btnNivel = new JButton("Nivel");
		btnNivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNivel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNivel.setBounds(144, 187, 111, 25);
		contentPane.add(btnNivel);
		
		JButton btnGenero_1 = new JButton("Genero");
		btnGenero_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnGenero_1.setBounds(251, 187, 111, 25);
		contentPane.add(btnGenero_1);
		
		
		
		
	}
}
