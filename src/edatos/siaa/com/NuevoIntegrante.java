package edatos.siaa.com;

public class NuevoIntegrante {
	String nombreIntegrante;
	String primerApellidoIntegrante;
	String segundoApellidoIntegrante;
	boolean generoIntegrante;
	int edadIntegrante;
	boolean creditosOSemestre;
	int nivelEstudio;
	
	
	public NuevoIntegrante(String nombre, String pApellido, String sApellido, boolean genero,int edadIntegrante, boolean creditososemestre, int nivelEstudio) 
		{
			super();
			this.nombreIntegrante = nombre;
			this.primerApellidoIntegrante = pApellido;
			this.segundoApellidoIntegrante = sApellido;
			this.generoIntegrante = genero;
			this.edadIntegrante = edadIntegrante;
			this.creditosOSemestre = creditososemestre;
			this.nivelEstudio = nivelEstudio;
		}

	public String getNombre() {
		return nombreIntegrante;
	}

	public void setNombreI(String nombre) {
		this.nombreIntegrante = nombre;
	}

	public String getPApellido() {
		return primerApellidoIntegrante;
	}

	public void setPrimerApellidoI(String pApellido) {
		this.primerApellidoIntegrante = pApellido;
	}

	public String getSApellido() {
		return segundoApellidoIntegrante;
	}

	public void setSegundoApellidoI(String sApellido) {
		this.segundoApellidoIntegrante = sApellido;
	}

	//Si @generoIntegrante es verdadero regresa Femenino, si es falso regresa Masculino
	public String getGenero() {
		if(generoIntegrante) {
		return "Femenino";}
		else {
			return "Masculino";
		}
	}

	public void setGenero(boolean genero) {
		this.generoIntegrante = genero;
		
	}

	public int getEdadIntegrante() {
		return edadIntegrante;
	}

	public void setEdadIntegrante(int edadIntegrante) {
		this.edadIntegrante = edadIntegrante;
	}

	//Si @creditosOSemestre es verdadero regresa Creditos, si es falso regresa Semestre
	public String getCreditosOSemestre() {
		if(creditosOSemestre) {
			return "Creditos";}
			else {
				return "Semestre";
			}
	}

	public void setCreditosOSemestre(boolean creditosOSemestre) {
		this.creditosOSemestre = creditosOSemestre;
	}

	public int getNivelEstudio() {
		return nivelEstudio;
	}

	public void setNivelEstudio(int nivelEstudio) {
		this.nivelEstudio = nivelEstudio;
	}
	
	
	
}

