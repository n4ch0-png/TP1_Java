import java.util.ArrayList;

public class Estudiante extends Persona implements MiembroUniversidad {

    private String carrera;
    private double promedio;
    private ArrayList<Materia> materias;

    public Estudiante() {
        super("", "", 0, "");
        materias = new ArrayList<>();
    }

    public Estudiante(String nombre, String apellido, int edad, String documento,
                      String carrera, double promedio) {
        super(nombre, apellido, edad, documento);
        setCarrera(carrera);
        setPromedio(promedio);
        materias = new ArrayList<>();
    }

    public String getCarrera() { return carrera; }
    public double getPromedio() { return promedio; }
    public ArrayList<Materia> getMaterias() { return materias; }

    public void setCarrera(String carrera) {
        if (carrera.isEmpty()) throw new IllegalArgumentException("Carrera vacía");
        this.carrera = carrera;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 10) throw new IllegalArgumentException("Promedio inválido");
        this.promedio = promedio;
    }

    public void agregarMateria(Materia m) {
        this.materias.add(m);
    }

    public double calcularPromedio() {
        if (materias.isEmpty()) return 0;
        double suma = 0;
        for (Materia m : materias) suma += m.getCalificacion();
        return suma / materias.size();
    }

    /* RECURSIVO */
    public static double calcularPromedioRecursivo(Materia[] materias, int i) {
        if (i == materias.length) return 0;
        return materias[i].getCalificacion() + calcularPromedioRecursivo(materias, i + 1);
    }

    /* ITERATIVO */
    public double calcularPromedioIterativo() {
        return calcularPromedio();
    }

    @Override
    public String obtenerRol() {
        return "Estudiante";
    }

    @Override
    public String obtenerInformacionCompleta() {
        return toString() + " - Carrera: " + carrera;
    }

    @Override
    public String toString() {
        return "Estudiante: " + super.toString() + " | Carrera: " + carrera;
    }
}
