package programacion_estructurada.escuela;
class Alumno {
    // Propiedades o atributos
    String nombre;
    int edad;
    String grado;

    // Métodos o funciones
    public Alumno(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public static void estudiar() {

    }

    public static void comer() {

    }
}

Alumno enrique = new Alumno("Enrique", 22, "Universidad"); // Instancia de un objeto
enrique.setNombre("Enrique Carranza");
System.out.print(enrique.getNombre());


// https://www.w3schools.com/java/java_oop.asp
