package edatos.siaa.com;

import java.awt.EventQueue;
import java.util.Collections;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class OrdenarGrupos extends JFrame {

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
		Object[] col = {"GRUPO", "NOMBRES", "PRIMER APELLIDO", "SEGUNDO APELLIDO", "GENERO", "EDAD", "FILTRO ESTUDIO", "NIVEL"};
		
		//OBJECT [FILAS][COLUMNAS]
		Object[][] datos = new Object[VentanaNuevoIntegrante.contenedor.size()][col.length];//SE INICIALIZA DEACUERDO A LA CANTIDAD DE FILAS Y COLUMNAS
		
		modelo = new DefaultTableModel(datos, col);
		table.setModel(modelo);
	}
	
	//METODO PARA MOSTRAR DATOS
	public void MostrarDatos()
	{
		NuevoIntegrante nuevo;
		//Metodo sort para organizar los datos
		Collections.sort(VentanaNuevoIntegrante.contenedor);
		
		int c=0;
		String grupo;
		//ciclo for que recorre la lista y crea los grupos de acuerdo a la cantidad de integrantes
		
		Integrantes numeroIntegrantes = new Integrantes();
		 String cantidad = numeroIntegrantes.ultimoIntegrante();
		 int numeroEstudiantes = Integer.parseInt(cantidad);
		 

		for(int i=0; i<VentanaNuevoIntegrante.contenedor.size()/numeroEstudiantes; i++)
		{
			grupo="Grupo" + (i+1);
			for (int j = 0; j < numeroEstudiantes; j++) {
				//OBTENEMOS DATOS DE CADA POSICION
				nuevo = (NuevoIntegrante)VentanaNuevoIntegrante.contenedor.get(c);
				c=c+1;
				//TRAEMOS CADA ATRIBUTO PARA AGREGARLOS A LA TABLA
				modelo.insertRow(col, new Object[]{});
				
				modelo.setValueAt(grupo, col, 0);
				modelo.setValueAt(nuevo.getNombre(), col, 1);
				modelo.setValueAt(nuevo.getPApellido(), col, 2);
				modelo.setValueAt(nuevo.getSApellido(), col, 3);
				modelo.setValueAt(nuevo.getGenero(), col, 4);
				modelo.setValueAt(nuevo.getEdadIntegrante(), col, 5);
				modelo.setValueAt(nuevo.getCreditosOSemestre(), col, 6);
				modelo.setValueAt(nuevo.getNivelEstudio(), col, 7);
			}
			
		}
	}
	

	/**
	 * Create the frame.
	 */
	public OrdenarGrupos(Integrantes integrantes) {
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
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		contentPane.setLayout(gl_contentPane);
		
		scrollPane.setViewportView(table);
		
		cargarTabla();
		MostrarDatos();
		
	}

}
