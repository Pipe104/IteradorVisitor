package Contenedores;

import Iterador.Iterador;
import Iterador.IteradorArrayList;
import persona.Persona;

import java.util.ArrayList;

public class ContenedorArrayList implements ContenedorPersonas {

    private ArrayList<Persona> personas;

    public ContenedorArrayList() {
        personas = new ArrayList<>();
    }

    @Override
    public void agregar(Persona persona) {
        personas.add(persona);
    }

    @Override
    public Iterador<Persona> getIterador() {
        return new IteradorArrayList(personas);
    }
}
