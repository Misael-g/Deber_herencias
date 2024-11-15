class Persona {
    protected String nombre;
    protected int edad;

    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}