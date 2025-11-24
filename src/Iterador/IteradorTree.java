package Iterador;

import persona.Persona;
import java.util.Iterator;

public class IteradorTree implements Iterador<Persona> {

    private Iterator<Persona> iterator;

    public IteradorTree(Iterator<Persona> iterator) {
        this.iterator = iterator;
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
