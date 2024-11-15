class Secretaria extends Persona {
    private String puesto;

    public Secretaria() {
        super();
        this.puesto = "Secretaria";
    }

    public void setDatos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Secretaria - Nombre: " + nombre + ", Edad: " + edad + ", Puesto: " + puesto);
    }

    public void organizar() {
        System.out.println(nombre + " esta organizando documentos.");
    }
}