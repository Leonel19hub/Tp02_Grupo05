package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto05 {

	 private String texto;

	    public Punto05() {
	    }

	    public Punto05(String texto) {
	        this.texto = texto;
	    }

	    public String getTexto() {
	        return texto;
	    }

	    public void setTexto(String texto) {
	        this.texto = texto;
	    }

	    public String textLap(){
	        StringBuilder text = new StringBuilder();
	        texto = text.reverse().toString();
	        return texto;
	    }

	    public String cadenaInvertida(){
	        // Creamos una cadena vacia
	        String cadenaInvertida = "";
	        // Con el bucle for inicializado en el ultimo elemento de la cadena texto, para que sea el primer elemento de la nueva cadena de texto, y por ultimo decrementamos el iterador
	        for(int i=texto.length()-1; i>=0; i--){
	            cadenaInvertida = cadenaInvertida + texto.charAt(i);
	        }
	        // Devolvemos la cadena ya invertida
	        return cadenaInvertida;
	    }
	}

