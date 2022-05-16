package ar.edu.unju.edm.Controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Punto7;
import ar.edu.unju.edm.until.ListadoPunto7;

@Controller
public class Punto7Controller {

    @GetMapping("/punto07")
    public String punto_07(Model model){

        Punto7 alumno1 = new Punto7("Lionel", "Messi", LocalDate.of(1987, 06, 24), 388123654, 20563210);
        Punto7 alumno2 = new Punto7("Cristiano", "Ronaldo", LocalDate.of(1985, 02, 05), 388569845, 69852410);
        Punto7 alumno3 = new Punto7("Marcelo", "Gallardo", LocalDate.of(1976, 01, 18), 115698745, 33569201);
        Punto7 alumno4 = new Punto7("Lionel", "Scaloni", LocalDate.of(1978, 05, 16), 1145962561, 35965358);

        String edad1 = alumno1.calcularEdad();
        String edad2 = alumno2.calcularEdad();
        String edad3 = alumno3.calcularEdad();
        String edad4 = alumno4.calcularEdad();

        alumno1.setEdad(edad1);
        alumno2.setEdad(edad2);
        alumno3.setEdad(edad3);
        alumno4.setEdad(edad4);

        ListadoPunto7 listado = new ListadoPunto7();

        listado.getListado().add(alumno1);
        listado.getListado().add(alumno2);
        listado.getListado().add(alumno3);
        listado.getListado().add(alumno4);

        model.addAttribute("listadoAlumno", listado.getListado());

        return "punto07";
    }
    
}
