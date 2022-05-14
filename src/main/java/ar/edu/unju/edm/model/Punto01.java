package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Component
public class Punto01 {
	private String nombre;
    private LocalDate fechaNac;
    
    public Punto01() {
    }

    public Punto01(String nombre, LocalDate fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String calcularEdad(){

        // Convertirmos fechaNac del formato LocalDate -> yyyy-MM-dd al formato dd/MM/yyyy

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateString = fechaNac.format(fmt);
        LocalDate fechaNacimiento = LocalDate.parse(dateString, fmt);

        // Intentos errores para cambiar el formato de fechaNac
        // LocalDate now = LocalDate.now();
        // SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        // String fechaString = formatter.format(fechaNac);

        // Calcula edad de la persona
        Period edad = Period.between(fechaNacimiento, LocalDate.now());

        int anio = edad.getYears();
        int mes = edad.getMonths();
        int dias= edad.getDays();
        String edadFinal = " "+anio+" aÃ±os "+mes+" meses y "+dias+" dias";
        return edadFinal;
    }

    public String signoZodiaco(){
       int dia = fechaNac.getDayOfMonth();
       int mes = fechaNac.getMonthValue();
       String zodiacoFinal = "";

       switch(mes){
           case 1: // Enero 
                if(dia >= 21){
                    zodiacoFinal = "Acuario";
                }
                else{
                    zodiacoFinal = "Capricornio";
                }
                break;
            case 2: // Febrero
                if(dia >= 19){
                    zodiacoFinal = "Piscis";
                }
                else{
                    zodiacoFinal = "Acuario";
                }
                break;
            case 3: // Marzo
                if(dia <= 20){
                    zodiacoFinal = "Piscis";
                }
                else{
                    zodiacoFinal = "Aries";
                }
                break;
            case 4: //Abril
                if(dia <= 21){
                    zodiacoFinal = "Aries";
                }
                else{
                    zodiacoFinal = "Tauro";
                }
                break;
            case 5: // Mayo
                if(dia <= 21){
                    zodiacoFinal = "Tauro";
                }
                else{
                    zodiacoFinal = "GÃ©minis";
                }
                break;
            case 6: // Junio
                if(dia <= 21){
                    zodiacoFinal = "GÃ©minis";
                }
                else{
                    zodiacoFinal = "CÃ¡ncer";
                }
                break;
            case 7: // Julio
                if(dia <= 23){
                    zodiacoFinal = "CÃ¡ncer";
                }
                else{
                    zodiacoFinal = "Leo";
                }
                break;
            case 8: // Agosto
                if(dia <= 23){
                    zodiacoFinal = "Leo";
                }
                else{
                    zodiacoFinal = "Virgo";
                }
                break;
            case 9: // Septiembre
                if(dia <= 23){
                    zodiacoFinal = "Virgo";
                }
                else{
                    zodiacoFinal = "Libra";
                }
                break;
            case 10: // Octubre
                if(dia <= 23){
                    zodiacoFinal = "Libra";
                }
                else{
                    zodiacoFinal = "Escorpion";
                }
                break;
            case 11: // Noviembre
                if(dia <= 22){
                    zodiacoFinal = "Escorpion";
                }
                else{
                    zodiacoFinal = "Sagitario";
                }
                break;
            case 12: // Diciembre
                if(dia <= 21){
                    zodiacoFinal = "Sagitario";
                }
                else{
                    zodiacoFinal = "Capricornio";
                }
                break;
       }

        return zodiacoFinal;
    }

    public String estacionAnual(){
        int dia = fechaNac.getDayOfMonth();
        int mes = fechaNac.getMonthValue();
        String estAnio = "";

        switch(mes){
            case 1: estAnio = "Verano"; break;
            case 2: estAnio = "Verano"; break;
            case 3: if(dia <= 20){
                        estAnio = "Verano";
                    }
                    else{
                        estAnio = "OtoÃ±o";
                    }
                    break;
            case 4: estAnio = "OtoÃ±o"; break;
            case 5: estAnio = "OtoÃ±o"; break;
            case 6: if(dia <= 20){
                        estAnio = "OtoÃ±o";
                    }
                    else{
                        estAnio = "Invierno";
                    }
                    break;
            case 7: estAnio = "Invierno"; break;
            case 8: estAnio = "Invierno"; break;
            case 9: if(dia <= 20){
                        estAnio = "Invierno";
                    }
                    else{
                        estAnio = "Primavera";
                    }
                    break;
            case 10: estAnio = "Primavera";
            case 11: estAnio = "Primavera";
            case 12: if(dia <= 20){
                        estAnio = "Primavera";
                    }
                    else{
                        estAnio = "Verano";
                    }
                    break;
        }

        return estAnio;
    }
    

}
