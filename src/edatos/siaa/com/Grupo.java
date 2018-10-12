package edatos.siaa.com;

import java.util.LinkedList;

public class Grupo {
	
	private static LinkedList<String> misGrupos = new LinkedList<String>();
  
    
    void agregarGrupo(String grupo){
    	misGrupos.add(grupo);

     }
    
    public String ultimoGrupo() {
    	
    	return (String)misGrupos.getLast();
    }

}
