public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.mostrarDatos();
        estudiante.estudiar();

        Profesor profesor = new Profesor("Juan", 40);
        profesor.mostrarDatos();
        profesor.ensenar();

        Administrativo administrativo = new Administrativo("Ana", 35, "Jefe de recursos humanos");
        administrativo.mostrarDatos();
        administrativo.gestionar();

        Alumno alumno = new Alumno("Pedro", 20, "Tercer ano");
        alumno.mostrarDatos();
        alumno.asistirClases();

        Secretaria secretaria = new Secretaria();
        secretaria.setDatos("Maria", 30);
        secretaria.mostrarDatos();
        secretaria.organizar();
    }
}