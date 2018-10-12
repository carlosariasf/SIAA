package edatos.siaa.com;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
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
	
	//DECLARAMOS LA LINKEDLIST
	public static LinkedList<Object> contenedor = new LinkedList<Object>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaNuevoIntegrante frame = new VentanaNuevoIntegrante();
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
	public VentanaNuevoIntegrante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setBounds(36, 39, 51, 16);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel);
		
		textNombres = new JTextField();
		textNombres.setBounds(143, 36, 252, 22);
		textNombres.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textNombres);
		textNombres.setColumns(10);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido");
		lblPrimerApellido.setBounds(36, 63, 87, 16);
		lblPrimerApellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblPrimerApellido);
		
		textPApellido = new JTextField();
		textPApellido.setBounds(143, 62, 252, 20);
		contentPane.add(textPApellido);
		textPApellido.setColumns(10);
		
		JLabel lblS = new JLabel("Segundo Apellido");
		lblS.setBounds(36, 87, 99, 16);
		lblS.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblS);
		
		textSApellido = new JTextField();
		textSApellido.setBounds(143, 86, 252, 20);
		contentPane.add(textSApellido);
		textSApellido.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Genero");
		lblNewLabel_1.setBounds(36, 114, 41, 16);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(143, 110, 81, 25);
		rdbtnFemenino.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnFemenino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(228, 110, 81, 25);
		rdbtnMasculino.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnMasculino);
		
		JLabel lblNivelAcademico = new JLabel("Nivel Academico");
		lblNivelAcademico.setBounds(36, 143, 93, 16);
		lblNivelAcademico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNivelAcademico);
		
		JRadioButton rdbtnCreditos = new JRadioButton("Creditos");
		rdbtnCreditos.setBounds(143, 139, 73, 25);
		rdbtnCreditos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnCreditos);
		
		JRadioButton rdbtnSemestre = new JRadioButton("Semestre");
		rdbtnSemestre.setBounds(220, 139, 81, 25);
		rdbtnSemestre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnSemestre);
		
		textNivel = new JTextField();
		textNivel.setBounds(305, 142, 90, 20);
		contentPane.add(textNivel);
		textNivel.setColumns(10);
		
		JLabel lblGrupoGeneral = new JLabel("Grupo General");
		lblGrupoGeneral.setBounds(36, 170, 82, 16);
		lblGrupoGeneral.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblGrupoGeneral);
		
		JTextPane textPanelGrupo = new JTextPane();
		textPanelGrupo.setBounds(143, 168, 252, 20);
		textPanelGrupo.setText(NuevoGrupo.getNombreGrupo());
		textPanelGrupo.setEditable(false);
		contentPane.add(textPanelGrupo);
		
		JButton btnVolver = new JButton("Atras");
		btnVolver.setBounds(36, 196, 82, 25);
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnVolver);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(319, 196, 92, 25);
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnGuardar);
		
		JButton btnAgregarOtroIntegrante = new JButton("Agregar otro Integrante");
		btnAgregarOtroIntegrante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				//DATOS DEL ESTUDIANTE A GUARDAR
				String nombre = textNombres.getText(); 
				String pApellido = textPApellido.getText();
				String sApellido = textSApellido.getText();
				
				/*boolean generoI;
				int edad;
				int creditos;
				int semestre;
				*/
				
				//LLAMAMOS LA CLASE NUEVOINTEGRANTE Y LE AGREGAMOS LOS DATOS
				NuevoIntegrante alumno = new NuevoIntegrante(nombre, pApellido, sApellido);
				
				//ESTOS VALORES SE LOS AGREGAMOS A LA LINKEDLIST LLAMADA CONTENEDOR
				contenedor.offer(alumno);
				
				//LIMPIAMOS LOS CAMPOS PARA PODER AGREGAR OTRO INTEGRANTE
				textNombres.setText(""); textPApellido.setText(""); textSApellido.setText("");
				
			}
		});
		btnAgregarOtroIntegrante.setBounds(140, 196, 169, 25);
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
		btnVerLista.setBounds(143, 226, 166, 25);
		contentPane.add(btnVerLista);
	}
}
