package ar.edu.unju.edm.until;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.edu.unju.edm.model.Punto7;

@Component
public class ListadoPunto7 {

    private List<Punto7> listado = new ArrayList<>();

    public ListadoPunto7() {
    }

    public ListadoPunto7(List<Punto7> listado) {
        this.listado = listado;
    }

    public List<Punto7> getListado() {
        return listado;
    }

    public void setListado(List<Punto7> listado) {
        this.listado = listado;
    }
    
}
