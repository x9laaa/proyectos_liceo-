public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("4ºG");
        Alumno a1 = new Alumno("pablo", 1700, "F", c1);
        a1.informacion();
    }
}
