package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto4;

@Controller
public class Punto4Controller {

    @GetMapping("/punto04")
    public ModelAndView punto_04(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, @RequestParam(name = "n3") int n3, @RequestParam(name = "n4") int n4, @RequestParam(name = "n5") int n5, @RequestParam(name = "n6") int n6, @RequestParam(name = "n7") int n7, @RequestParam(name = "n8") int n8){

        Punto4 punto4 = new Punto4();

        int [] numAux = new int [8];
        numAux[0] = n1;
        numAux[1] = n2;
        numAux[2] = n3;
        numAux[3] = n4;
        numAux[4] = n5;
        numAux[5] = n6;
        numAux[6] = n7;
        numAux[7] = n8;

        punto4.setNums(numAux);
        int [] arreglo = punto4.getNums();
        String [] arregloF = new String [8];
        String esPar = "";

        for(int i=0;i < arreglo.length;i++){
            if(arreglo[i] % 2 == 0){
                esPar = "par";
            }
            else{
                esPar = "impar";
            }
            arregloF[i] = arreglo[i]+" "+esPar;

        }

        ModelAndView modelView = new ModelAndView("punto04");

        modelView.addObject("arregloF", arregloF);

        
        return modelView;
    }
    
}
