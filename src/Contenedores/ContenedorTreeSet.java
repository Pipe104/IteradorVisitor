package Contenedores;

import Iterador.Iterador;
import Iterador.IteradorTree;
import persona.Persona;

import java.util.Comparator;
import java.util.TreeSet;

public class ContenedorTreeSet implements ContenedorPersonas {

    private TreeSet<Persona> tree;

    public ContenedorTreeSet() {
        // Ordenar por código (o el atributo que quieras)
        this.tree = new TreeSet<>(Comparator.comparing(p -> p.getCode()));
    }

    @Override
    public void agregar(Persona persona) {
        tree.add(persona);
    }

    @Override
    public Iterador<Persona> getIterador() {
        return new IteradorTree(tree.iterator());
    }
}
