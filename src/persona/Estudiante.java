package persona;

import visitor.PersonaVisitor;

public class Estudiante implements Persona {

    private String nombre;
    private String address;
    private String number;
    private String code;

    public Estudiante(String nombre, String address, String number, String code) {
        this.nombre = nombre;
        this.address = address;
        this.number = number;
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void aceptar(PersonaVisitor persona) {
        persona.visit(this);
    }
}
