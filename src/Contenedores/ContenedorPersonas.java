package Contenedores;
import Iterador.*;
import persona.*;

public interface ContenedorPersonas {
    public void agregar(Persona persona);
    public Iterador<Persona> getIterador();
}
