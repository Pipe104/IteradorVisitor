package visitor;

import persona.Docente;
import persona.Estudiante;

public interface PersonaVisitor {
    public void visit(Estudiante e);
    public void visit(Docente d);
}
