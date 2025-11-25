import java.util.ArrayList;

public class Profesor extends Persona implements MiembroUniversidad {

    private String especialidad;
    private int añosExperiencia;
    private ArrayList<Materia> materiasAsignadas;

    public Profesor(String nombre, String apellido, int edad, String documento,
                    String especialidad, int añosExperiencia) {
        super(nombre, apellido, edad, documento);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        materiasAsignadas = new ArrayList<>();
    }

    public void asignarMateria(Materia m) {
        materiasAsignadas.add(m);
        m.setProfesor(this);
    }

    @Override
    public String obtenerRol() { return "Profesor"; }

    @Override
    public String obtenerInformacionCompleta() {
        return toString() + " | Especialidad: " + especialidad;
    }

    @Override
    public String toString() {
        return "Profesor: " + super.toString() + " | Exp: " + añosExperiencia + " años";
    }
}
