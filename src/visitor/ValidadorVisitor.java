package visitor;

import persona.Docente;
import persona.Estudiante;

import java.util.ArrayList;
public class ValidadorVisitor implements PersonaVisitor {
    private ArrayList<String> mensajes = new ArrayList<>();

    @Override
    public void visit(Estudiante e) {
        if (e.getNombre().isBlank()) mensajes.add("El nombre del estudiante es obligatorio");
        if (e.getAddress().isBlank()) mensajes.add("La dirección del estudiante es obligatoria");
        if (e.getNumber().isBlank()) mensajes.add("El número del estudiante es obligatorio");
        if (e.getCode().isBlank()) mensajes.add("El código del estudiante es obligatorio");
    }

    @Override
    public void visit(Docente d) {
        if (d.getNombre().isBlank()) mensajes.add("El nombre del docente es obligatorio");
        if (d.getAddress().isBlank()) mensajes.add("La dirección del docente es obligatoria");
        if (d.getNumber().isBlank()) mensajes.add("El número del docente es obligatorio");
        if (d.getCode().isBlank()) mensajes.add("El código del docente es obligatorio");
    }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }
}

