public class Alumno {
    private String nombreAlumno;
    private int alturaAlumno;
    private String generoAlumno;
    private Curso cursoAlumno;

    public Alumno(String nombreAlumno, int alturaAlumno, String generoAlumno, Curso cursoAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.alturaAlumno = alturaAlumno;
        this.generoAlumno = generoAlumno;
        this.cursoAlumno = cursoAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public int getAlturaAlumno() {
        return alturaAlumno;
    }

    public void setAlturaAlumno(int alturaAlumno) {
        this.alturaAlumno = alturaAlumno;
    }

    public String getGeneroAlumno() {
        return generoAlumno;
    }

    public void setGeneroAlumno(String generoAlumno) {
        this.generoAlumno = generoAlumno;
    }

    public Curso getCursoAlumno() {
        return cursoAlumno;
    }

    public void setCursoAlumno(Curso cursoAlumno) {
        this.cursoAlumno = cursoAlumno;
    }
    public void informacion(){
        System.out.println("nombre del alumno " + nombreAlumno);
        System.out.println("altura del alumno " + alturaAlumno);
        System.out.println("genero del alumno " + generoAlumno);
        System.out.println("curso del alumno " + cursoAlumno.bailar());
        

    }

}
