package ar.edu.unju.edm.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class Punto2 {

    private LocalDate fecha1;
    private LocalDate fecha2;
    private LocalTime time1;
    private LocalTime time2;
    private LocalDateTime dateTime1;
    private LocalDateTime dateTime2;
    
    public Punto2() {
    }

    public Punto2(LocalDate fecha1, LocalDate fecha2) {
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
    }

    public Punto2(LocalTime time1, LocalTime time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public Punto2(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        this.dateTime1 = dateTime1;
        this.dateTime2 = dateTime2;
    }

    public LocalDate getFecha1() {
        return fecha1;
    }

    public void setFecha1(LocalDate fecha1) {
        this.fecha1 = fecha1;
    }

    public LocalDate getFecha2() {
        return fecha2;
    }

    public void setFecha2(LocalDate fecha2) {
        this.fecha2 = fecha2;
    }

    public LocalTime getTime1() {
        return time1;
    }

    public void setTime1(LocalTime time1) {
        this.time1 = time1;
    }

    public LocalTime getTime2() {
        return time2;
    }

    public void setTime2(LocalTime time2) {
        this.time2 = time2;
    }

    public LocalDateTime getDateTime1() {
        return dateTime1;
    }

    public void setDateTime1(LocalDateTime dateTime1) {
        this.dateTime1 = dateTime1;
    }

    public LocalDateTime getDateTime2() {
        return dateTime2;
    }

    public void setDateTime2(LocalDateTime dateTime2) {
        this.dateTime2 = dateTime2;
    }

    public Period contarTiempoTranscurrido(){
        Period periodo = Period.between(fecha1, fecha2);
        return periodo;
    }

    public String formatearFechas(LocalDate fecha){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateString = fecha.format(fmt);
        // LocalDate fechaCambiada = LocalDate.parse(dateString, fmt);
        return dateString;
    }

    public String compararFechas(){
        String mensageFinal = "";
        if(fecha1.isAfter(fecha2)){
            mensageFinal = "La fecha: "+formatearFechas(fecha1)+" es posterior a la fecha: "+formatearFechas(fecha2);
        }
        else{
            mensageFinal = "La fecha: "+formatearFechas(fecha1)+" es anterior a la fecha: "+formatearFechas(fecha2);
        }
        return mensageFinal;
    }
    
}
