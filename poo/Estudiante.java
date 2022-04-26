// Clase hijo
package poo;

public class Estudiante extends Persona {
    // Atributos
    String grado;
    String matricula;

    // Constructor
    public Estudiante(String nombre, int edad, char sexo, String grado, String matricula) {
        super(nombre, edad, sexo);
        this.grado = grado;
        this.matricula = matricula;
    }

    // Métodos
    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getGrado() {
        return this.grado;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }
}
