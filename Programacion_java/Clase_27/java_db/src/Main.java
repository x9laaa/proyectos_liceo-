import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("--------------menu---------------");
        System.out.println("Bienvenido al sistema de gestión de alumnos");
        System.out.println("1. Agregar alumno");
        System.out.println("2. Mostrar alumnos");
        System.out.println("3. Actualizar alumno");
        System.out.println("4. Eliminar alumno");
        System.out.println("0. Salir");

        System.out.println("Seleccione una opción:");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        
        ListaAlumnos listaAlumnos = new ListaAlumnos();
        listaAlumnos.cargarAlumnos();

        Scanner scanner = new Scanner(System.in);

        menu();
        int opcion = scanner.nextInt();

        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del alumno:");
                    String nombre = scanner.next();
                    System.out.println("Ingrese la edad del alumno:");
                    int edad = scanner.nextInt();
                    Alumnos alumno = new Alumnos(listaAlumnos.obtenerSiguienteId(), nombre, edad);
                    listaAlumnos.agregarAlumno(alumno);
                    break;
                case 2:
                    System.out.println("-------Alumnos-------");
                    listaAlumnos.mostrarAlumnos();
                    break;
                case 3:
                    System.out.println("Ingrese el ID del alumno a actualizar:");
                    int id = scanner.nextInt();
                    System.out.println("Ingrese el nuevo nombre del alumno:");
                    String nuevoNombre = scanner.next();
                    System.out.println("Ingrese la nueva edad del alumno:");
                    int nuevaEdad = scanner.nextInt();
                    listaAlumnos.actualizarAlumno(id, nuevoNombre, nuevaEdad);
                    break;
                case 4:
                    System.out.println("Ingrese el ID del alumno a eliminar:");
                    int idEliminar = scanner.nextInt();
                    listaAlumnos.eliminarAlumno(idEliminar);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            menu();
            opcion = scanner.nextInt();
        }

        scanner.close();

    }
}
