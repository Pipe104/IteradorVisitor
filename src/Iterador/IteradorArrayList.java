package Iterador;
import persona.Persona;

import java.util.ArrayList;

public class IteradorArrayList implements Iterador<Persona> {

    private ArrayList<Persona> lista;
    private int index;

    public IteradorArrayList(ArrayList<Persona> lista) {
        this.lista = lista;
        this.index = lista.size() - 1;
    }

    @Override
    public Persona next() {
        return null;
    }
    @Override
    public boolean hasNext() {
        return false;
    }
}
