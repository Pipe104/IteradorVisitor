package Iterador;

import persona.Persona;

public class IteradorTree implements Iterador<Persona> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Persona next() {
        return null;
    }
}
