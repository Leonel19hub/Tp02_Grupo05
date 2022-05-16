package ar.edu.unju.edm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto6;

@Controller
public class Punto6Controller {

    @Autowired
    Punto6 punto6;

    @GetMapping("/punto06")
    public ModelAndView punto_06(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, @RequestParam(name = "n3") int n3, @RequestParam(name = "n4") int n4, @RequestParam(name = "n5") int n5, @RequestParam(name = "n6") int n6, @RequestParam(name = "n7") int n7, @RequestParam(name = "n8") int n8, @RequestParam(name = "n9") int n9, @RequestParam(name = "n10") int n10){

        int [] numAux = new int [10];
        numAux[0] = n1;
        numAux[1] = n2;
        numAux[2] = n3;
        numAux[3] = n4;
        numAux[4] = n5;
        numAux[5] = n6;
        numAux[6] = n7;
        numAux[7] = n8;
        numAux[8] = n9;
        numAux[9] = n10;

        punto6.setNumeros(numAux);

        String [] numInverso = new String[10];
        numInverso = punto6.arregloInvertido();

        ModelAndView modelView = new ModelAndView("punto06");

        modelView.addObject("arreglo", punto6.getNumeros());
        modelView.addObject("numInverso", numInverso);
        
        return modelView;
    }
    
}
