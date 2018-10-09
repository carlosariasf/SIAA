package edatos.siaa.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.TexturePaint;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.Window.Type;
import javax.swing.JTextPane;

public class VentanaNuevoIntegrante extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1473381703078951088L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		contentPane.setLayout(new MigLayout("", "[20px:n][][][149.00,grow,right][30px:n]", "[20px:n][][][][][][grow][][][30px:n]"));
		
		JLabel lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel, "cell 1 1");
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textField, "cell 3 1,growx");
		textField.setColumns(10);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido");
		lblPrimerApellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblPrimerApellido, "cell 1 2");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 3 2,growx");
		textField_1.setColumns(10);
		
		JLabel lblS = new JLabel("Segundo Apellido");
		lblS.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblS, "cell 1 3");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 3 3,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Genero");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_1, "cell 1 4");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Femenino");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnNewRadioButton, "flowx,cell 3 4,alignx left");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masculino");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnNewRadioButton_1, "cell 3 4,alignx center");
		
		JLabel lblNivelAcademico = new JLabel("Nivel Academico");
		lblNivelAcademico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNivelAcademico, "cell 1 5");
		
		JRadioButton rdbtnCreditos = new JRadioButton("Creditos");
		rdbtnCreditos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnCreditos, "flowx,cell 3 5");
		
		JRadioButton rdbtnSemestre = new JRadioButton("Semestre");
		rdbtnSemestre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnSemestre, "cell 3 5");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "cell 3 5,growx");
		textField_3.setColumns(10);
		
		JLabel lblGrupoGeneral = new JLabel("Grupo General");
		lblGrupoGeneral.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblGrupoGeneral, "cell 1 6");
		
		JTextPane textPanelGrupo = new JTextPane();
		textPanelGrupo.setText(NuevoGrupo.getNombreGrupo());
		textPanelGrupo.setEditable(false);
		contentPane.add(textPanelGrupo, "cell 3 6,grow");
		
		JButton btnVolver = new JButton("Atras");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnVolver, "cell 1 8");
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnGuardar, "flowx,cell 3 8");
		
		JButton btnAgregarOtroIntegrante = new JButton("Agregar otro Integrante");
		btnAgregarOtroIntegrante.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(btnAgregarOtroIntegrante, "cell 3 8");
	}

}
