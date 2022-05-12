package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto3;

@Controller
public class Punto3Controller {

    @GetMapping("/punto03")
    public ModelAndView punto_03(@RequestParam(name = "nota1") int nota1, @RequestParam(name = "nota2") int nota2, @RequestParam(name = "nota3") int nota3, @RequestParam(name = "nota4") int nota4, @RequestParam(name = "nota5") int nota5, @RequestParam(name = "nombre") String nombre, @RequestParam(name = "apellido") String apellido){

        double [] notaAux = new double[5];
        notaAux[0] = nota1;
        notaAux[1] = nota2;
        notaAux[2] = nota3;
        notaAux[3] = nota4;
        notaAux[4] = nota5;

        Punto3 punto3 = new Punto3();

        punto3.setNotas(notaAux);
        punto3.setNombre(nombre);
        punto3.setApellido(apellido);

        String notaAlta = punto3.notaMaxima();
        String promedioF = punto3.calcularPromedio();

        ModelAndView modelView = new ModelAndView("punto03");

        modelView.addObject("nota1", nota1);
        modelView.addObject("nota2", nota2);
        modelView.addObject("nota3", nota3);
        modelView.addObject("nota4", nota4);
        modelView.addObject("nota5", nota5);

        modelView.addObject("notaA", notaAlta);
        modelView.addObject("promedioF", promedioF);
        modelView.addObject("nombre", nombre);
        modelView.addObject("apellido", apellido);


        return modelView;
    }
    
}
