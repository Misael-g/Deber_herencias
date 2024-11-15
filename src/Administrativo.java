class Administrativo extends Persona {
    private String puesto;

    public Administrativo(String nombre, int edad, String puesto) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Administrativo - Nombre: " + nombre + ", Edad: " + edad + ", Puesto: " + puesto);
    }

    public void gestionar() {
        System.out.println(nombre + " esta gestionando los recursos.");
    }
}