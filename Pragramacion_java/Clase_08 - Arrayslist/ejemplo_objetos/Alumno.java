public class Alumno {

    private String nombre;
    private int edad;
    private String promedio;
    
    public Alumno(String nombre, int edad, String promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
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
    public String getPromedio() {
        return promedio;
    }
    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }
  
    

  
}