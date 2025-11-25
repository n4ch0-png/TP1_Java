public class App {
    public static void main(String[] args) {

        Universidad uni = new Universidad("UNViMe", "San Luis");

        Estudiante e1 = new Estudiante("Nacho", "Perez", 20, "123",
                "Programación", 8.5);
        Estudiante e2 = new Estudiante("Ana", "Gomez", 22, "456",
                "Programación", 9);
        Estudiante e3 = new Estudiante("Luis", "Acosta", 19, "789",
                "Diseño", 7);

        Profesor p1 = new Profesor("María", "Lopez", 50, "999",
                "Matemática", 20);

        Personal per1 = new Personal("Carlos", "Nuñez", 40, "888",
                "Administración", "Secretario", "2010");

        // Materias
        Materia m1 = new Materia("Matemática I", "MAT101", 6, 9);
        Materia m2 = new Materia("Programación I", "PRO101", 8, 8);
        m1.setProfesor(p1);

        e1.agregarMateria(m1);
        e1.agregarMateria(m2);

        // Carrera
        Carrera carrera = new Carrera("Programación");
        carrera.agregarEstudiante(e1);
        carrera.agregarEstudiante(e2);

        // Universidad
        uni.agregarMiembro(e1);
        uni.agregarMiembro(e2);
        uni.agregarMiembro(e3);
        uni.agregarMiembro(p1);
        uni.agregarMiembro(per1);

        System.out.println(" MIEMBROS DE LA UNIVERSIDAD");
        uni.listarMiembros();

        System.out.println("\n PROMEDIO DE E1");
        System.out.println(e1.calcularPromedio());

        System.out.println("\n RECURSIVO promedio E1");
        Materia[] arrM = e1.getMaterias().toArray(new Materia[0]);
        double suma = Estudiante.calcularPromedioRecursivo(arrM, 0);
        System.out.println("Promedio recursivo: " + (suma / arrM.length));

        System.out.println("\n ORDENAMIENTO POR APELLIDO");
        Estudiante[] arrayEst = {e1, e2, e3};
        Universidad.ordenarPorApellido(arrayEst);
        for (Estudiante e : arrayEst) System.out.println(e.getApellido());

        System.out.println("\n BÚSQUEDA BINARIA (Gomez)");
        int pos = Universidad.busquedaBinariaEstudiantes(arrayEst, "Gomez");
        System.out.println("Encontrado en posición: " + pos);
    }
}
