package edatos.siaa.com;

public class NuevoIntegrante {
	String nombreI;
	String primerApellidoI;
	String segundoApellidoI;
	boolean generoI;
	int edadI;
	int creditosI;
	int semestreI;
	
	public NuevoIntegrante(String nombre, String pApellido, String sApellido, boolean genero, int edad, int creditos, int semestre) 
	{
		nombreI = nombre;
		primerApellidoI = pApellido;
		segundoApellidoI = sApellido;
		generoI =  genero;
		edadI = edad;
		creditosI = creditos;
		semestreI = semestre;
	}
}
