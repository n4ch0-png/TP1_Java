public class Personal extends Persona implements MiembroUniversidad {

    private String departamento;
    private String puesto;
    private String fechaIngreso;

    public Personal(String nom, String ape, int edad, String dni,
                    String departamento, String puesto, String fechaIngreso) {
        super(nom, ape, edad, dni);
        this.departamento = departamento;
        this.puesto = puesto;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String obtenerRol() {
        return "Personal";
    }

    @Override
    public String obtenerInformacionCompleta() {
        return toString() + " | Dpto: " + departamento + " | Puesto: " + puesto;
    }

    @Override
    public String toString() {
        return "Personal: " + super.toString() + " - " + puesto;
    }
}
