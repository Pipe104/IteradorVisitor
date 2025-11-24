package Iterador;

import persona.Persona;
import java.util.ArrayList;
import java.util.Iterator;

public class IteradorArrayList implements Iterador<Persona> {

    private Iterator<Persona> iterator;

    public IteradorArrayList(ArrayList<Persona> lista) {
        this.iterator = lista.iterator(); // delegacion al iterador de Java
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Persona next() {
        return iterator.next();
    }
}
