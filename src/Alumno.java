class Alumno extends Persona {
    private String grado;

    public Alumno(String nombre, int edad, String grado) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Alumno - Nombre: " + nombre + ", Edad: " + edad + ", Grado: " + grado);
    }

    public void asistirClases() {
        System.out.println(nombre + " esta asistiendo a clases.");
    }
}