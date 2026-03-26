package Programacion_java.Clase_09_Arrayslist2.ejemplo_2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> listaProductos = new ArrayList<>();

        Producto p1 = new Producto("Laptop", 1200.00);
        Producto p2 = new Producto("Smartphone", 800.00);
        Producto p3 = new Producto("Tablet", 500.00);

        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);

        System.out.println("Lista de productos: ");
        for (Producto producto : listaProductos) {
            producto.mostrarInfoProducto();
        }

    }
}
