package Pragramacion_java.Clase_01.ejemplo1;
public class Main {
    public static void main(String[] args) {
        
        Auto a1 = new Auto("Toyota", "Corolla", "Rojo", 2020);
        a1.mostrarVelocidad(); 
        a1.acelerar();
        a1.mostrarVelocidad();
        a1.acelerar();

        Auto a2 = new Auto("Honda", "Civic", "Azul", 2019);

        a2.mostrarVelocidad();

    }
    
}
