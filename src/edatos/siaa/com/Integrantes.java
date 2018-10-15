package edatos.siaa.com;

import java.util.LinkedList;

public class Integrantes {

private static LinkedList<String> integrantes = new LinkedList<String>();
  
	void agregarIntegrantes(String grupo){
	integrantes.add(grupo);

	}
	
	public String ultimoIntegrante() {
    	
    	return (String)integrantes.getLast();
    }
	
}
