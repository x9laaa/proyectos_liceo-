package Programacion_java.Clase_12.ejemplo3;

import java.util.ArrayList;

public class Curso {

    private String nombre;

    private ArrayList<Alumno> listaCurso;

    public Curso(String nombre) {
        this.nombre = nombre;
        listaCurso = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(ArrayList<Alumno> listaCurso) {
        this.listaCurso = listaCurso;
    }

    public void agregarAlumno (Alumno a){
        listaCurso.add(a);
    }

    public void mostrarLista(){
        System.out.println("-------Lista Curso-------");
        for (Alumno a : listaCurso) {
            System.out.println(a.getNombre());
        }
    }

    
    
    

    
}
