package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto01;

import java.time.LocalDate;

@Controller
public class Punto01Controller {
	 @GetMapping({"/menu", "/principal", "/grupo5", "/home"})
	    public String getMenu(){
	        return "menuTp02";
	    }

	    @Autowired
	    Punto01 punto01;

	    @GetMapping("/punto01")
	    public ModelAndView punto_01(@RequestParam(name = "nombre") String nombre, @RequestParam(name = "dateBirthday") String fecNac){

	        punto01.setNombre(nombre);
	        punto01.setFechaNac(LocalDate.parse(fecNac));

	        String edad = punto01.calcularEdad();
	        String zodiaco = punto01.signoZodiaco();
	        String estacionAnio = punto01.estacionAnual();

	        ModelAndView modelView = new ModelAndView("punto01");

	        modelView.addObject("nombre", nombre);
	        modelView.addObject("dateBirthday", fecNac);
	        modelView.addObject("edad", edad);
	        modelView.addObject("zodiaco", zodiaco);
	        modelView.addObject("estacionAnio", estacionAnio);

	        return modelView;
	    }

}
