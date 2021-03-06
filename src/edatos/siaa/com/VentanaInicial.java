package edatos.siaa.com;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaInicial extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3401325008279193550L;
	private JPanel contentPane;
	private static JTextField textoNuevoGrupo;

	
	public boolean casillaVacia() {
		
		if(textoNuevoGrupo.getText().isEmpty())
		{
			return true;
		}
		return false;
	}

	/**
	 * Create the frame.
	 */
	public VentanaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidParaContinuar = new JLabel("Bienvenid@ para continuar cree un nuevo grupo");
		lblBienvenidParaContinuar.setBounds(87, 54, 278, 14);
		contentPane.add(lblBienvenidParaContinuar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(47, 94, 57, 14);
		contentPane.add(lblNombre);
		
		textoNuevoGrupo = new JTextField();
		textoNuevoGrupo.setBounds(116, 91, 217, 20);
		contentPane.add(textoNuevoGrupo);
		textoNuevoGrupo.setColumns(10);
		
		
		JButton btnCrearNuevoGrupo = new JButton("Crear Nuevo Grupo");
		btnCrearNuevoGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Se crean ventanas de advertencia para casilla vacia y confirmacion para casilla correcta.
				if(!casillaVacia()) {
					Grupo grupo = new Grupo();
					grupo.agregarGrupo(textoNuevoGrupo.getText().toString());
					JOptionPane.showMessageDialog(null, "Gracias, se ha creado el grupo " + grupo.ultimoGrupo()); 
					//Abre ventana VentanaNuevoIntegrante y pasa objeto @Grupo
					new VentanaNuevoIntegrante(grupo).setVisible(true);
					;
				}else {
					JOptionPane.showMessageDialog(null, "La casilla Nombre es Obligatoria y no puede estar vacia");
				}
			}
		});
		btnCrearNuevoGrupo.setBounds(70, 152, 148, 23);
		contentPane.add(btnCrearNuevoGrupo);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
				//JFrame VentanaInicial = new JFrame("Test InternalJFrame");
				//VentanaInicial.getContentPane().add(new AgragarIntegrante());
				//.setVisible(true);
			}
		});
		btnCancelar.setBounds(268, 152, 89, 23);
		contentPane.add(btnCancelar);
	}
}

