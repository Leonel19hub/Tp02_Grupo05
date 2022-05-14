package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto05;

@Controller
public class Punto05Controller {

    @Autowired
    Punto05 punto05;

    @GetMapping("/punto05")
    public ModelAndView punto_05(@RequestParam(name = "text") String text){

        punto05.setTexto(text);

        String textoReversa = punto05.cadenaInvertida();


        ModelAndView modelView = new ModelAndView("punto05");

        modelView.addObject("texto", text);
        modelView.addObject("textoReversa", textoReversa);

        
        return modelView;
    }
    
}
