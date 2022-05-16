package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Punto6;
import ar.edu.unju.edm.until.NumeroEnteros;

@Controller
public class Punto6Controller {
	
	@GetMapping ("/punto6")
	public String GetListado(Model model) {
		
		Punto6 n1 = new Punto6(1);
		Punto6 n2 = new Punto6(2);
		Punto6 n3 = new Punto6(3);
		Punto6 n4 = new Punto6(4);
		Punto6 n5 = new Punto6(5);
		Punto6 n6 = new Punto6(6);
		Punto6 n7 = new Punto6(7);
		Punto6 n8 = new Punto6(8);
		Punto6 n9 = new Punto6(9);
		Punto6 n10 = new Punto6(10);
		

		NumeroEnteros num = new NumeroEnteros(); 
		num.getNum().add(n10);
		num.getNum().add(n9);
		num.getNum().add(n8);
		num.getNum().add(n7);
		num.getNum().add(n6);
		num.getNum().add(n5);
		num.getNum().add(n4);
		num.getNum().add(n3);
		num.getNum().add(n2);
		num.getNum().add(n1);

		
		
		model.addAttribute("NumeroEnteros", num.getNum());
		return "Punto6";

}
}
