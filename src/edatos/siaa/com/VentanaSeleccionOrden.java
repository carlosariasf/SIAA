package edatos.siaa.com;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaSeleccionOrden extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 14733817078951088L;
	private JPanel contentPane;
	private JTextField textIntegrantes;
	

	
	
	/**
	 * Create the frame.
	 */
	
	public VentanaSeleccionOrden() {
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
		
		
		JLabel lblIntegrantes = new JLabel("Numero de Integrantes");
		lblIntegrantes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIntegrantes.setBounds(36, 96, 147, 14);
		contentPane.add(lblIntegrantes);
		
		textIntegrantes = new JTextField();
		textIntegrantes.setBounds(195, 93, 41, 20);
		contentPane.add(textIntegrantes);
		textIntegrantes.setColumns(10);
		
		
		JButton btnVolver = new JButton("Atras");
		btnVolver.setBounds(362, 187, 82, 25);
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnVolver);
		
		
		JLabel lblSeleccioneElParametro = new JLabel("Seleccione el parametro de ordenamiento");
		lblSeleccioneElParametro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSeleccioneElParametro.setBounds(36, 141, 350, 16);
		contentPane.add(lblSeleccioneElParametro);
		
		JButton btnEdad = new JButton("Edad");
		btnEdad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LLAMAMOS LA VENTANA QUE NOS MUESTRA LA LISTA 
				Integrantes integrantes = new Integrantes();
				integrantes.agregarIntegrantes(textIntegrantes.getText().toString());
				integrantes.agregarBoton("edad".toString());
				OrdenarGrupos l = new OrdenarGrupos(integrantes);
				l.setVisible(true);
			}
		});
		btnEdad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEdad.setBounds(144, 187, 111, 25);
		contentPane.add(btnEdad);
		
		JButton btnGenero_1 = new JButton("Genero");
		btnGenero_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnGenero_1.setBounds(251, 187, 111, 25);
		contentPane.add(btnGenero_1);
		
		
		JButton btnNivel = new JButton("Nivel");
		btnNivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LLAMAMOS LA VENTANA QUE NOS MUESTRA LA LISTA 
				Integrantes integrantes = new Integrantes();
				integrantes.agregarIntegrantes(textIntegrantes.getText().toString());
				integrantes.agregarBoton("nivel".toString());
				OrdenarGrupos l = new OrdenarGrupos(integrantes);
				l.setVisible(true);
			}
		});
		
		btnNivel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNivel.setBounds(36, 187, 111, 25);
		contentPane.add(btnNivel);
		
		
	}
}
