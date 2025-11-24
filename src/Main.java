import Contenedores.ContenedorArrayList;
import Contenedores.ContenedorPersonas;
import Contenedores.ContenedorTreeSet;
import Iterador.Iterador;
import persona.Docente;
import persona.Estudiante;
import persona.Persona;
import visitor.ValidadorVisitor;

public class Main {
    public static void main(String[] args) {

        // Contenedor arreglo
        ContenedorPersonas contenedor = new ContenedorArrayList();

        //Contenedor TreeSet
        ContenedorTreeSet  contenedorT = new ContenedorTreeSet();

        Estudiante e1 = new Estudiante("Juan", "Calle 123", "3011111111", "1001232");
        Estudiante e2 = new Estudiante("", "Calle 45", "3022222222", "1002123");           // Falta nombre
        Estudiante e3 = new Estudiante("Maria", "", "3033333333", "1003");             // Falta direccion
        Estudiante e4 = new Estudiante("Carlos", "Calle 999", "3044444444", "1004");
        Estudiante e5 = new Estudiante("Luisa", "Calle 555", "3055555555", "1005");


        Docente d1 = new Docente("Andrés", "Avenida 1", "3111111111", "2001");
        Docente d2 = new Docente("Sofia", "", "3222222222", "2002");                   // Falta direccion
        Docente d3 = new Docente("", "Avenida 90", "3333333333", "2003");              // Falta nombre
        Docente d4 = new Docente("Miguel", "Avenida 88", "3444444444", "2004");
        Docente d5 = new Docente("Laura", "Avenida 33", "3555555555", "2005");

        // Agregar al contenedor
        contenedorT.agregar(e1);
        contenedor.agregar(e2);
        contenedorT.agregar(e3);
        contenedor.agregar(e4);
        contenedorT.agregar(e5);

        contenedor.agregar(d1);
        contenedorT.agregar(d2);
        contenedor.agregar(d3);
        contenedorT.agregar(d4);
        contenedor.agregar(d5);

        Iterador<Persona> it = contenedor.getIterador();
        Iterador<Persona>  itT = contenedorT.getIterador();

        ValidadorVisitor validador = new ValidadorVisitor();

        while (it.hasNext()) {
            Persona p = it.next();
            p.aceptar(validador);  // Aqui se usa el patron Visitor
        }

        while (itT.hasNext()) {
            Persona p = itT.next();
            p.aceptar(validador);  // Aqui se usa el patron Visitor
        }

        System.out.println("\n=== RESULTADO DE VALIDACION ===");
        validador.getMensajes().forEach(System.out::println);
    }
}
