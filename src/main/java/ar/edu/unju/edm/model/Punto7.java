package ar.edu.unju.edm.model;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

@Component
public class Punto7 {

    private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private int telefono;
	private int dni;
    private String edad;
    
    public Punto7() {
    }

    public Punto7(String nombre, String apellido, LocalDate fechaNacimiento, int telefono, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.dni = dni;
    }

    public Punto7(String nombre, String apellido, LocalDate fechaNacimiento, int telefono, int dni, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.dni = dni;
        this.edad = edad;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
	
	public String calcularEdad(){
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        String edadF = edad.getYears()+" años"+edad.getMonths()+" meses y "+edad.getDays()+" dias";
        return edadF;
    }
    
}
