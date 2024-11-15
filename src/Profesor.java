class Profesor extends Persona {

    public Profesor(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Profesor - Nombre: " + nombre + ", Edad: " + edad);
    }

    public void ensenar() {
        System.out.println(nombre + " esta ensenando.");
    }
}