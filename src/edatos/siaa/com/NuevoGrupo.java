package edatos.siaa.com;

public class NuevoGrupo {
	
	static String nombreGrupo;
		
		public static void nuevoGrupo(String nombre) 
		{
			nombreGrupo = nombre;
		}

		public static String getNombreGrupo() {
			return nombreGrupo;
		}

		public static void setNombreGrupo(String nombreGrupo) {
			NuevoGrupo.nombreGrupo = nombreGrupo;
		}

}
