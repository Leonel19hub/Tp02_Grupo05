package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto6 {

    private int [] numeros = new int [10];

    public Punto6() {
    }

    public Punto6(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public String[] arregloInvertido(){

        // int aux;

        // for(int i=0;i<numeros.length/2;i++){
        //     aux = numeros[i];
        //     numeros[i] = numeros[numeros.length-1-i];
        //     numeros[numeros.length-1-i] = aux;
        // }        

        String [] arrayInvert = new String [10];

        for(int i=0;i<numeros.length;i++){
            arrayInvert[i] = numeros[numeros.length-1-i]+""; 
        }

        // for(int i=numeros.length-1;i>=0;i--){
        //     for(int j = 0; j<=9;j++){
        //         arrayInvert[j] ="Posiscion "+j+" - valor:"+numeros[i];
        //     }
        // }

        return arrayInvert;
    }
    
}
