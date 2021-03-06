package edatos.siaa.com;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.LinkedList;

public class VentanaNuevoIntegrante extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1473381703078951088L;
	private JPanel contentPane;
	private JTextField textNombres;
	private JTextField textPApellido;
	private JTextField textSApellido;
	private JTextField textNivel;
	private JTextField textEdad;
	private boolean creditososemestre;
	private Integer intCreados = 0;
	private JButton btnOrdenar;

	// NO ME PERMITE SELECCIONAR LOS DOS BOTONES AL MISMO TIEMPO

	// DECLARAMOS LA LINKEDLIST
	public static LinkedList<NuevoIntegrante> contenedor = new LinkedList<NuevoIntegrante>();

	/**
	 * Create the frame.
	 */
	//Se agrega la variable @Grupo como entrada para recibir de la ventana anterior
	public VentanaNuevoIntegrante(Grupo grupo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setBounds(36, 39, 126, 16);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel);
		
		textNombres = new JTextField();
		textNombres.setBounds(172, 36, 231, 22);
		textNombres.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textNombres);
		textNombres.setColumns(10);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido");
		lblPrimerApellido.setBounds(36, 63, 126, 16);
		lblPrimerApellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblPrimerApellido);
		
		textPApellido = new JTextField();
		textPApellido.setBounds(172, 62, 231, 20);
		contentPane.add(textPApellido);
		textPApellido.setColumns(10);
		
		JLabel lblS = new JLabel("Segundo Apellido");
		lblS.setBounds(36, 87, 126, 16);
		lblS.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblS);
		
		textSApellido = new JTextField();
		textSApellido.setBounds(172, 86, 231, 20);
		contentPane.add(textSApellido);
		textSApellido.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Genero");
		lblNewLabel_1.setBounds(36, 114, 82, 16);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setSelected(true);
		rdbtnFemenino.setBounds(143, 113, 81, 25);
		rdbtnFemenino.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnFemenino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(226, 113, 81, 25);
		rdbtnMasculino.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnMasculino);
		
		//NO SE LECCIONAR AMBOS BOTONES
		ButtonGroup btnGenero = new ButtonGroup();
		btnGenero.add(rdbtnFemenino);
		btnGenero.add(rdbtnMasculino);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEdad.setBounds(36, 141, 60, 14);
		contentPane.add(lblEdad);
		
		textEdad = new JTextField();
		textEdad.setBounds(143, 139, 41, 20);
		contentPane.add(textEdad);
		textEdad.setColumns(10);
		
		JLabel lblNivelAcademico = new JLabel("Nivel Academico");
		lblNivelAcademico.setBounds(36, 163, 93, 16);
		lblNivelAcademico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNivelAcademico);
		
		JRadioButton rdbtnCreditos = new JRadioButton("Creditos");
		rdbtnCreditos.setSelected(true);
		rdbtnCreditos.setBounds(143, 159, 73, 25);
		rdbtnCreditos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnCreditos);
		
		JRadioButton rdbtnSemestre = new JRadioButton("Semestre");
		rdbtnSemestre.setBounds(218, 159, 81, 25);
		rdbtnSemestre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnSemestre);
		
		//NO SE LECCIONAR AMBOS BOTONES
		ButtonGroup btnCreditosSemestre = new ButtonGroup();
		btnCreditosSemestre.add(rdbtnCreditos);
		btnCreditosSemestre.add(rdbtnSemestre);
		
		
		textNivel = new JTextField();
		textNivel.setBounds(305, 162, 98, 20);
		contentPane.add(textNivel);
		textNivel.setColumns(10);
		
		JLabel lblGrupoGeneral = new JLabel("Grupo General");
		lblGrupoGeneral.setBounds(36, 190, 82, 16);
		lblGrupoGeneral.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblGrupoGeneral);
		
		JTextPane textPanelGrupo = new JTextPane();
		textPanelGrupo.setText(grupo.ultimoGrupo());
		textPanelGrupo.setBounds(143, 191, 260, 20);
		textPanelGrupo.setEditable(false);
		contentPane.add(textPanelGrupo);
		
		JTextPane textPaneAgregados = new JTextPane();
		textPaneAgregados.setText(intCreados.toString());
		textPaneAgregados.setEditable(false);
		textPaneAgregados.setBounds(224, 264, 24, 20);
		contentPane.add(textPaneAgregados);
		
		
		
		JButton btnAgregarOtroIntegrante = new JButton("Agregar otro Integrante");
		btnAgregarOtroIntegrante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				//DATOS DEL ESTUDIANTE A GUARDAR
				String nombre = textNombres.getText(); 
				String pApellido = textPApellido.getText();
				String sApellido = textSApellido.getText();
				boolean genero=true;
				int edad=Integer.parseInt(textEdad.getText());
				int nivel=Integer.parseInt(textNivel.getText());
				
				if(rdbtnFemenino.isSelected())
				{
					genero = true;
				}
				else{
					if(rdbtnMasculino.isSelected()){
						genero = false;
					}
				}
				
				if(rdbtnCreditos.isSelected())
				{
					creditososemestre = true;
					rdbtnSemestre.setEnabled(false);
				}
				else{
					if(rdbtnSemestre.isSelected()){
						creditososemestre = false;
						rdbtnCreditos.setEnabled(false);
					}
				}
				
				
				//LLAMAMOS LA CLASE NUEVOINTEGRANTE Y LE AGREGAMOS LOS DATOS
				NuevoIntegrante alumno = new NuevoIntegrante(nombre, pApellido, sApellido, genero, edad, creditososemestre, nivel);
				
				//ESTOS VALORES SE LOS AGREGAMOS A LA LINKEDLIST LLAMADA CONTENEDOR
				contenedor.offer(alumno);
				
				//LIMPIAMOS LOS CAMPOS PARA PODER AGREGAR OTRO INTEGRANTE
				textNombres.setText(""); textPApellido.setText(""); textSApellido.setText("");textEdad.setText("");textNivel.setText("");
				
				intCreados = contenedor.size();
				textPaneAgregados.setText(intCreados.toString());
				
				if(intCreados >=10) {
					btnOrdenar.setEnabled(true);
				}
				
				
			}
		});
		btnAgregarOtroIntegrante.setBounds(226, 221, 198, 25);
		btnAgregarOtroIntegrante.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnAgregarOtroIntegrante);
		
		JButton btnVerLista = new JButton("Ver Integrantes");
		btnVerLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//LLAMAMOS LA VENTANA QUE NOS MUESTRA LA LISTA 
				Lista l = new Lista();
				l.setVisible(true);
				
			}
		});
		btnVerLista.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVerLista.setBounds(10, 221, 192, 25);
		contentPane.add(btnVerLista);
		
		
		btnOrdenar = new JButton("Ordenar");
		btnOrdenar.setEnabled(false);
		btnOrdenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//LLAMAMOS LA VENTANA QUE NOS MUESTRA LA LISTA 
				new VentanaSeleccionOrden(creditososemestre).setVisible(true);
				
			}
		});
		btnOrdenar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnOrdenar.setBounds(342, 259, 82, 25);
		contentPane.add(btnOrdenar);
		
		JLabel lblIntegrantesActuales = new JLabel("Integrantes Actuales");
		lblIntegrantesActuales.setBounds(41, 267, 175, 14);
		contentPane.add(lblIntegrantesActuales);
		
		

		 
		
		
		
	}

}