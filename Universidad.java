import java.util.ArrayList;

public class Universidad {

    private String nombre;
    private String direccion;
    private ArrayList<MiembroUniversidad> miembros;

    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        miembros = new ArrayList<>();
    }

    public void agregarMiembro(MiembroUniversidad m) {
        miembros.add(m);
    }

    public void listarMiembros() {
        for (MiembroUniversidad m : miembros)
            System.out.println(m.obtenerRol() + " → " + m.obtenerInformacionCompleta());
    }

    /* RECURSIVO contar */
    public static int contarEstudiantesRecursivo(Estudiante[] arr, String carrera, int i) {
        if (i == arr.length) return 0;
        int suma = arr[i].getCarrera().equalsIgnoreCase(carrera) ? 1 : 0;
        return suma + contarEstudiantesRecursivo(arr, carrera, i + 1);
    }

    /* ORDENAMIENTO */
    public static void ordenarPorApellido(Estudiante[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j].getApellido().compareTo(arr[min].getApellido()) < 0)
                    min = j;

            Estudiante temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    /* BUSQUEDA BINARIA */
    public static int busquedaBinariaEstudiantes(Estudiante[] arr, String apellido) {
        int inicio = 0, fin = arr.length - 1;

        while (inicio <= fin) {
            int mid = (inicio + fin) / 2;
            int cmp = arr[mid].getApellido().compareToIgnoreCase(apellido);

            if (cmp == 0) return mid;
            if (cmp < 0) inicio = mid + 1;
            else fin = mid - 1;
        }
        return -1;
    }
}
