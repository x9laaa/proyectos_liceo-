package Programacion_java.Clase_10_Arrayslist_objeto.ejemplo;

import java.util.ArrayList;

public class Main {
    
public static void main(String[] args) {
    
ArrayList<Alumno> listaCurso = new ArrayList<>();

listaCurso.add(new Alumno("Agunto", 14, "dudoso", 4.0));

listaCurso.add(new Alumno("Mia", 45, "Hombre", 7.0));

listaCurso.add(new Alumno("Erick", 5, "mujer", 7.0));

for (Alumno n : listaCurso) {

    n.mostrarInfo();
    
}
}


}
