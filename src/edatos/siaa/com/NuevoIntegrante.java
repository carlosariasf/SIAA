package edatos.siaa.com;

public class NuevoIntegrante {
	String nombreI;
	String primerApellidoI;
	String segundoApellidoI;
	String generoI;
	
	/*int edadI;
	int creditosI;
	int semestreI;
	*/
	
	public NuevoIntegrante(String nombre, String pApellido, String sApellido, String genero) 
		{
			super();
			this.nombreI = nombre;
			this.primerApellidoI = pApellido;
			this.segundoApellidoI = sApellido;
			this.generoI = genero;
			
			/*this.edadI = edad;
			this.creditosI = creditos;
			this.semestreI = semestre;*/
		}

	public String getNombre() {
		return nombreI;
	}

	public void setNombreI(String nombre) {
		this.nombreI = nombre;
	}

	public String getPApellido() {
		return primerApellidoI;
	}

	public void setPrimerApellidoI(String pApellido) {
		this.primerApellidoI = pApellido;
	}

	public String getSApellido() {
		return segundoApellidoI;
	}

	public void setSegundoApellidoI(String sApellido) {
		this.segundoApellidoI = sApellido;
	}

	public String getGenero() {
		return generoI;
	}

	public void setGenero(String generoI) {
		this.generoI = generoI;
	}
	
	



	/*public int getEdad() {
		return edadI;
	}

	public void setEdad(int edad) {
		this.edadI = edad;
	}

	public int getCreditos() {
		return creditosI;
	}

	public void setCreditos(int creditos) {
		this.creditosI = creditos;
	}

	public int getSemestre() {
		return semestreI;
	}

	public void setSemestreI(int semestre) {
		this.semestreI = semestre;
	}
	*/
	
}

