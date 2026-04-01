package Programacion_java.Clase_10_Arrayslist_objeto.ejemplo;

public class Alumno {
    
private String nombre;
private int edad;
private String sexo;
private double promedio;

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public String getSexo() {
    return sexo;
}
public void setSexo(String sexo) {
    this.sexo = sexo;
}
public double getPromedio() {
    return promedio;
}
public void setPromedio(double promedio) {
    this.promedio = promedio;
}
public Alumno(String nombre, int edad, String sexo, double promedio) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.promedio = promedio;
}
public void setPromedio(int promedio) {
    this.promedio = promedio;
}
public void mostrarInfo() {

    System.out.println("nombre: " + nombre);

    System.out.println("edad: " + edad);

    System.out.println("genero: " + sexo);

    System.out.println("promedio: " + promedio);

    System.out.println("--------------------------");
} 


}
