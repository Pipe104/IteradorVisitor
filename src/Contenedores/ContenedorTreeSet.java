package Contenedores;

import Iterador.Iterador;
import persona.Persona;

import java.util.Iterator;
import java.util.TreeSet;

public class ContenedorTreeSet implements  ContenedorPersonas {
    private TreeSet<Persona> tree;
    public  ContenedorTreeSet() {
        tree = new TreeSet<>();
    }
    @Override
    public void agregar(Persona persona) {
        tree.add(persona);
    }

    @Override
    public Iterador<Persona> getIterador() {
        return null;
    }


}
