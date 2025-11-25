public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private double calificacion;
    private Profesor profesor;

    public Materia(String nombre, String codigo, int creditos, double calificacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        setCalificacion(calificacion);
    }

    public String getNombre() { return nombre; }
    public String getCodigo() { return codigo; }
    public int getCreditos() { return creditos; }
    public double getCalificacion() { return calificacion; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) { this.profesor = p; }

    public void setCalificacion(double c) {
        if (c < 0 || c > 10) throw new IllegalArgumentException("Calificación inválida");
        this.calificacion = c;
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + ") - Nota: " + calificacion;
    }
}
