package Iterador;

import persona.Persona;

public interface Iterador<Persona> {
    public boolean hasNext();
    public Persona next();
}
