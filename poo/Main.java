package poo;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(
            "Victor",
            21,
            'M',
            "Preparatoria",
            "2020640644"
        );

        System.out.println(estudiante1.getGrado());
        System.out.println(estudiante1.getNombre());

        System.out.println("");

        estudiante1.setNombre("Enrique");
        estudiante1.setGrado("Técnico");

        System.out.println(estudiante1.getGrado());
        System.out.println(estudiante1.getNombre());

        Trabajador trabajador1 = new Trabajador(
            "Pedro",
            34,
            'M',
            "CEO",
            "45000",
            "KeyPro"
        );

        System.out.println("");

        System.out.println(trabajador1.getPuesto());
        System.out.println(trabajador1.getNombre());
    }
}
