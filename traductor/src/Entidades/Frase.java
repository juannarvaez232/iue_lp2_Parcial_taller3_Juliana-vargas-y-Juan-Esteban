package Entidades;

import java.util.List;

public class Frase {
    private String Texto ;
    private List<traducciones> Traducciones;
	
    
    public String getTexto() {
		return Texto;
	}
	public void setTexto(String texto) {
		Texto = texto;
	}
	public List<traducciones> getTraducciones() {
		return Traducciones;
	}
	public void setTraducciones(List<traducciones> traducciones) {
		Traducciones = traducciones;
	}
	
    
    

   

}
