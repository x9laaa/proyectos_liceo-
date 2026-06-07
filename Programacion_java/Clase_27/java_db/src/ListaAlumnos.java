import java.util.ArrayList;
import java.sql.ResultSet;

public class ListaAlumnos {
    private ArrayList<Alumnos> lista = new ArrayList<>();

    public void agregarAlumno(Alumnos alumno) {
        boolean existe = false;
        for (Alumnos a : lista) {
            if (a.getId() == alumno.getId()) {
                System.out.println("El alumno con ID " + alumno.getId() + " ya existe.");
                existe = true;
                break;
            }
        }
        if (!existe) {
            Insertar.insertar(alumno.getNombre(), alumno.getEdad());
            lista.add(alumno);
        }

    }
    public void mostrarAlumnos() {
        for (Alumnos a : lista) {
            System.out.println("------------------------------");
            System.out.println("ID: " + a.getId());
            System.out.println("Nombre: " + a.getNombre());
            System.out.println("Edad: " + a.getEdad());
            System.out.println("------------------------------");
        }
    }
    public void cargarAlumnos() {
        ResultSet rs = Consultar.consultar();
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                Alumnos a = new Alumnos(id, nombre, edad);
                lista.add(a);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public int obtenerSiguienteId() {
        return lista.size()+1;
    }

    public void actualizarAlumno(int id, String nombre, int edad) {
        boolean encontrado = false;
        for (Alumnos a : lista) {
            if (a.getId() == id) {
                a.setNombre(nombre);
                a.setEdad(edad);
                Actualizar.actualizar(id, nombre, edad);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un alumno con ID " + id);
        }
    }

    public void eliminarAlumno(int id) {
        boolean encontrado = false;
        for (Alumnos a : lista) {
            if (a.getId() == id) {
                lista.remove(a);
                Eliminar.eliminar(id);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un alumno con ID " + id);
        }
    }


}
