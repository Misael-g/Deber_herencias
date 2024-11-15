class Estudiante extends Persona {

    public Estudiante() {
        super();
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Estudiante - Nombre: " + nombre + ", Edad: " + edad);
    }

    public void estudiar() {
        System.out.println(nombre + " esta estudiando.");
    }
}