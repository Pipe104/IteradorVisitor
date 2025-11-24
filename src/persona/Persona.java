package persona;

import visitor.PersonaVisitor;

public interface Persona {

    public void aceptar(PersonaVisitor persona );
}
