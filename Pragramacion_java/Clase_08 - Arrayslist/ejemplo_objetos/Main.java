public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("4ºG", "01");
        
        curso1.agregarAlumno(new Alumno("Juan Pérez", 20, "70"));
        curso1.agregarAlumno(new Alumno("María Gómez", 22, "65"));
        curso1.agregarAlumno(new Alumno("Carlos Rodríguez", 19, "80"));
        curso1.agregarAlumno(new Alumno("Ana Martínez", 21, "75"));
        curso1.agregarAlumno(new Alumno("Luis Fernández", 23, "68"));

        System.out.println("Curso: " + curso1.getNombreCurso());
        System.out.println("Código: " + curso1.getCodigoCurso());
        
        curso1.mostrarAlumnos();
        System.out.println("------------------------------");
        curso1.eliminarAlumnoPorNombre("María Gómez");
        System.out.println("------------------------------");

        curso1.mostrarAlumnos();
    }
}
