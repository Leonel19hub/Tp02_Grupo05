package ar.edu.unju.edm.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto2;

@Controller
public class Punto2Controller {
    
    @GetMapping("/menuPunto02")
    public String controlMenuPunto2(){
        return "punto02";
    }

    @Autowired
    Punto2 punto2;

    @GetMapping("/punto02-1")
    public ModelAndView punto_02_1(@RequestParam(name = "fecha1") String date1, @RequestParam(name = "fecha2") String date2){

        punto2.setFecha1(LocalDate.parse(date1));
        punto2.setFecha2(LocalDate.parse(date2));

        ModelAndView modelView = new ModelAndView("punto02-1");
        modelView.addObject("fecha1", date1);
        modelView.addObject("fecha2", date2);

        return modelView;
    }
    
    @GetMapping("/punto02-2")
    public ModelAndView punto_02_2(){
        
        Punto2 point2 = new Punto2(LocalTime.parse("22:00:59"), LocalTime.of(10, 50, 45));

        LocalTime timeMd1 = point2.getTime1();
        LocalTime timeMd2 = point2.getTime2();

        LocalTime timeMd1Plus = timeMd1.plusHours(5);

        LocalTime timeMd2Less = timeMd2.plusMinutes(-20);

        ModelAndView modelView = new ModelAndView("punto02-2");

        modelView.addObject("time1", timeMd1);
        modelView.addObject("time2", timeMd2);
        modelView.addObject("time1Plus", timeMd1Plus);
        modelView.addObject("time2Less", timeMd2Less);

        return modelView;
    }

    @GetMapping("/punto02-3")
    public ModelAndView punto_02_3(@RequestParam(name = "fecha1") String date1, @RequestParam(name = "fecha2") String date2){
        
        punto2.setFecha1(LocalDate.parse(date1));
        punto2.setFecha2(LocalDate.parse(date2));

        String resultadoF = punto2.compararFechas();

        ModelAndView modelView = new ModelAndView("punto02-3");

        modelView.addObject("fecha1", punto2.getFecha1());
        modelView.addObject("fecha2", punto2.getFecha2());
        modelView.addObject("resultadoF", resultadoF);

        return modelView;
    }

    @GetMapping("/punto02-4")
    public ModelAndView punto_02_4(){
        
        Punto2 point2Sub4 = new Punto2();
        LocalDate date = LocalDate.of(2022, 05, 25);
        LocalTime time = LocalTime.of(12, 30, 30);

        LocalDateTime dateTime = LocalDateTime.of(date, time);

        point2Sub4.setDateTime1(dateTime);
        
        ModelAndView modelView = new ModelAndView("punto02-4");

        modelView.addObject("resultadoF", point2Sub4.getDateTime1());
        modelView.addObject("localDate", date);
        modelView.addObject("localTime", time);

        return modelView;
    }

    @GetMapping("/punto02-5")
    public ModelAndView punto_02_5(){
        
        LocalDate fechaNacimiento = LocalDate.of(1987, 06, 24);
        LocalDate now = LocalDate.now();

        Punto2 pf4 = new Punto2();

        pf4.setFecha1(fechaNacimiento);
        pf4.setFecha2(now);

        Period resultadoF = pf4.contarTiempoTranscurrido();

        int dia = resultadoF.getDays();
        int mes = resultadoF.getMonths();
        int anio = resultadoF.getYears();

        String resultadoFinal = "Han transcurrido "+anio+" años, "+mes+" meses y "+dia+" desde la fecha: "+pf4.formatearFechas(fechaNacimiento)+" hasta la fecha: "+pf4.formatearFechas(now);

        ModelAndView modelView = new ModelAndView("punto02-5");

        modelView.addObject("fechaNac", fechaNacimiento);
        modelView.addObject("horaActual", now);
        modelView.addObject("resultadoF", resultadoFinal);

        return modelView;
    }

    @GetMapping("/punto02-6")
    public ModelAndView punto_02_6(@RequestParam(name = "fecha1") String date1, @RequestParam(name = "fecha2") String date2){
        // Falta el control de errores 

        Punto2 pf5 = new Punto2();

        DateTimeFormatter fmtInput = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        DateTimeFormatter fmtOutput = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate nuevaFecha = LocalDate.parse(date1, fmtInput);
        LocalDate nuevaFecha2 = LocalDate.parse(date2, fmtInput);
        
        String fechaFinal = nuevaFecha.format(fmtOutput);
        String fechaFinal2 = nuevaFecha2.format(fmtOutput);

        pf5.setFecha1(LocalDate.parse(fechaFinal));
        pf5.setFecha2(LocalDate.parse(fechaFinal2));

        
        LocalDate fecha1Less = pf5.getFecha1().plusDays(-365);
        
        LocalDate fecha2Less = pf5.getFecha2().plusMonths(-6);

        ModelAndView modelView = new ModelAndView("punto02-6");
        modelView.addObject("fecha1", pf5.getFecha1());
        modelView.addObject("fecha2", pf5.getFecha2());
        
        modelView.addObject("resultadoF1", fecha1Less);
        modelView.addObject("resultadoF2", fecha2Less);

        return modelView;
    }
    
}
