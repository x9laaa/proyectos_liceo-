package Programacion_java.Clase_06;
public class Main {
    public static void main(String[] args) {
        Computador pc1 = new Computador("Dell", "Inspiron", "Intel Core i5", 8);
        pc1.mostrarInformacoes();
        pc1.aumentarMemoria();
        System.out.println("-----------------------------");
        pc1.mostrarInformacoes();
        
    }
    
}
