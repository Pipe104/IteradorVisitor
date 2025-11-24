package visitor;

import persona.Docente;
import persona.Estudiante;

import java.util.ArrayList;

public class ValidadorVisitor implements PersonaVisitor {

    private ArrayList<String> mensajes = new ArrayList<>();

    @Override
    public void visit(Estudiante e) {

        if (e.getNombre().isBlank())
            mensajes.add("Error en ESTUDIANTE (" + e.getCode() + "): Nombre vacío");

        if (e.getAddress().isBlank())
            mensajes.add("Error en ESTUDIANTE (" + e.getCode() + "): Dirección vacía");

        if (e.getNumber().isBlank())
            mensajes.add("Error en ESTUDIANTE (" + e.getCode() + "): Número vacío");

        if (e.getCode().isBlank())
            mensajes.add("Error en ESTUDIANTE (sin código): Código vacío");
    }

    @Override
    public void visit(Docente d) {

        if (d.getNombre().isBlank())
            mensajes.add("Error en DOCENTE (" + d.getCode() + "): Nombre vacío");

        if (d.getAddress().isBlank())
            mensajes.add("Error en DOCENTE (" + d.getCode() + "): Dirección vacía");

        if (d.getNumber().isBlank())
            mensajes.add("Error en DOCENTE (" + d.getCode() + "): Número vacío");

        if (d.getCode().isBlank())
            mensajes.add("Error en DOCENTE (sin código): Código vacío");
    }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }
}
