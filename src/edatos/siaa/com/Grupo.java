package edatos.siaa.com;

import java.util.LinkedList;

public class Grupo {
	
	private String nombreGrupo;
	private static LinkedList<String> misGrupos = new LinkedList<String>();
  
    Grupo(){

    }
    
    void agregarGrupo(String grupo){
    	misGrupos.add(grupo);

     }
}

