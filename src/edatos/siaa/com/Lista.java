package edatos.siaa.com;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Lista extends JFrame {
	
	
	private static final long serialVersionUID = 1473381703078951088L;
	private JPanel contentPane;
	private JTable table;
	
	//ATRIBUTOS PARA EL MODELO DE LA TABLA
	private DefaultTableModel modelo;
	int col = 0;
	Object datos;
	
	//METODO CONSTRUCTOR DE TABLA
	private void cargarTabla()
	{
		Object[] col = {"NOMBRES", "PRIMER APELLIDO", "SEGUNDO APELLIDO", "GENERO", "EDAD", "FILTRO ESTUDIO", "NIVEL"};
		
		//OBJECT [FILAS][COLUMNAS]
		Object[][] datos = new Object[VentanaNuevoIntegrante.contenedor.size()][col.length];//SE INICIALIZA DEACUERDO A LA CANTIDAD DE FILAS Y COLUMNAS
		
		modelo = new DefaultTableModel(datos, col);
		table.setModel(modelo);
	}
	
	//METODO PARA MOSTRAR DATOS
	public void MostrarDatos()
	{
		NuevoIntegrante nuevo;
		
		//RECORRO TODA LA CLASE Y VOY SACANDO DATO POR DATO
		//EL CONTENEDOR  ALMACENO LOS DATOS 
		for(int i=0; i<VentanaNuevoIntegrante.contenedor.size(); i++)
		{
			//OBTENEMOS DATOS DE CADA POSICION
			nuevo = (NuevoIntegrante)VentanaNuevoIntegrante.contenedor.get(i);
			
			//TRAEMOS CADA ATRIBUTO PARA AGREGARLOS A LA TABLA
			modelo.insertRow(col, new Object[]{});
			
			modelo.setValueAt(nuevo.getNombre(), col, 0);
			modelo.setValueAt(nuevo.getPApellido(), col, 1);
			modelo.setValueAt(nuevo.getSApellido(), col, 2);
			modelo.setValueAt(nuevo.getGenero(), col, 3);
			modelo.setValueAt(nuevo.getEdadIntegrante(), col, 4);
			modelo.setValueAt(nuevo.getCreditosOSemestre(), col, 5);
			modelo.setValueAt(nuevo.getNivelEstudio(), col, 6);
		}
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista frame = new Lista();
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
	public Lista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		contentPane.setLayout(gl_contentPane);
		
		scrollPane.setViewportView(table);
		
		cargarTabla();
		MostrarDatos();
		
	}

}
