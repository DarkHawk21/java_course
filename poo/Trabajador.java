package poo;

public class Trabajador extends Persona {
    // Atributos
    String puesto;
    String sueldo;
    String empresa;

    // Constructor
    public Trabajador(String nombre, int edad, char sexo, String puesto, String sueldo, String empresa) {
        super(nombre, edad, sexo);
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    // Métodos
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getSueldo() {
        return this.sueldo;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return this.empresa;
    }
}
