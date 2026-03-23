package Programacion_java.Clase_08_Arrayslist.ejmplo_clase_1;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("tamaño de arraylist: "+nombres.size());
    
        nombres.add("juan");
        nombres.add("gaspar");

        nombres.set(1, "agustin");

        nombres.remove(1);

        System.out.println(nombres.contains("juan"));

        System.out.println(nombres.indexOf("juan"));

        System.out.println(nombres.get(0));


        for(int i = 0;i<nombres.size();i++){
            System.out.println(nombres.get(i));
        }

        for (String n : nombres) {
            System.out.println(n);
            
        }

        nombres.clear();

        System.out.println("tamaño de arraylist: "+nombres.size());
        
    }
    
}
