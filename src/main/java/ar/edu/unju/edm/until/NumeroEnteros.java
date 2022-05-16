package ar.edu.unju.edm.until;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.edu.unju.edm.model.Punto6;

@Component
public class NumeroEnteros {
	private List<Punto6> num = new ArrayList<>();
	
	public NumeroEnteros() {
		// TODO Auto-generated constructor stub
	}

	public List<Punto6> getNum() {
		
		return num;
	}

	public void setNum(List<Punto6> num) {
		this.num = num;
	}

	
	

}
