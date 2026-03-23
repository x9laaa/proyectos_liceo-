package Programacion_java.Clase_08_Arrayslist.ejemplo_simple;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        System.out.println("Tamaño: " + list.size());        
        for (String item : list) {
            System.out.println(item);
        }   

        System.out.println("eliminando un elemento...");
        list.remove("World");
        System.out.println("Tamaño después de eliminar: " + list.size());

        System.out.println("Índice de 'Java': " + list.indexOf("Java"));
        System.out.println("Contiene 'Hello': " + list.contains("Hello"));
    
    }
    
}
