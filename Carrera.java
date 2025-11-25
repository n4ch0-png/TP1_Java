import java.util.ArrayList;

public class Carrera {

    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Carrera(String nombre) {
        this.nombre = nombre;
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void listarEstudiantes() {
        System.out.println("--- Estudiantes de " + nombre + " ---");
        for (Estudiante e : estudiantes) System.out.println(e);
    }

    public Estudiante buscarEstudiante(String nombre) {
        for (Estudiante e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) return e;
        }
        return null;
    }
}
