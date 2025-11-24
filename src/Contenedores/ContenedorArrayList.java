package Contenedores;

import Iterador.Iterador;
import persona.Persona;

import java.util.ArrayList;

public class ContenedorArrayList implements  ContenedorPersonas {
    private ArrayList<Persona> personas;
    public ContenedorArrayList() {
        personas = new ArrayList<Persona>();
    }
    @Override
    public void agregar(Persona persona) {
        personas.add(persona);
    }

    @Override
    public Iterador<Persona> getIterador() {
        return null;
    }

}
