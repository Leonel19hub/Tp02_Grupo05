package ar.edu.unju.edm.model;


import org.springframework.stereotype.Component;

@Component
public class Punto3 {
    private String nombre;
    private String apellido;
    private double [] notas = new double[5];
    
    public Punto3() {
    }

    public Punto3(String nombre, String apellido, double[] notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    } 

    public String calcularPromedio(){
        double suma=0;
        for(int i=0;i<5;i++){
            suma = suma + notas[i];
        }

        double promedio = suma / 5;
        return "El promedio es: "+promedio;
    }

    public String notaMaxima(){
        double mayor=0;
        for(int i=0;i<5;i++){
            if(notas[i] > mayor){
                mayor = notas[i];
            }
        }
        return "La nota mas alta es: "+mayor;
    }
    
}
