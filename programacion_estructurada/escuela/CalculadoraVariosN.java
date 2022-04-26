package programacion_estructurada.escuela;
import java.util.Scanner;

public class CalculadoraVariosN {
    public static void main(String[] args) {
        int opcion;
        int cantidadNumeros = 0;
        float[] numerosAOperar = {};
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n\n¡Bienvenido!");
            System.out.println("\n1. Sumar números \n2. Restar números \n3. Multiplicar números \n4. Salir");
            System.out.print("\nSeleccione una opción: ");
            opcion = scanner.nextInt();
    
            if (opcion < 4) {
                System.out.println("¿Cuantos numeros quieres operar?");
                cantidadNumeros = scanner.nextInt();
                numerosAOperar = new float[cantidadNumeros];
            }
            
            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + suma(cantidadNumeros, numerosAOperar));
                break;
                case 2:
                    System.out.println("El resultado de la suma es: " + resta(cantidadNumeros, numerosAOperar));
                break;
                case 3:
                    System.out.println("El resultado de la suma es: " + multiplicacion(cantidadNumeros, numerosAOperar));
                break;
                case 4:
                    System.out.println("\nAdiós");
                break;
                default:
                   System.out.println("\nLa opcion ingresada no se encuentra, teclee otra.");
            }
    
            if (opcion < 4) {
                System.out.println("\n¿Deseas hacer otra operación? [6:sí|5:no]: ");
                opcion = scanner.nextInt();
            }
        } while(opcion != 4);
    }

    static float suma(int cantidadNumeros, float[] numerosAOperar) {
        float resultado = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Escribe el número " + (i + 1) + " a sumar: ");
            numerosAOperar[i] = scanner.nextFloat();
        }

        for (int j = 0; j < numerosAOperar.length; j++) {
            resultado = resultado + numerosAOperar[j];
        }

        return resultado;
    }

    static float resta(int cantidadNumeros, float[] numerosAOperar) {
        float resultado = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Escribe el número " + (i + 1) + " a restar: ");
            numerosAOperar[i] = scanner.nextFloat();
        }

        resultado = numerosAOperar[0];

        for (int j = 1; j < numerosAOperar.length; j++) {
            resultado = resultado - numerosAOperar[j];
        }

        return resultado;
    }

    static float multiplicacion(int cantidadNumeros, float[] numerosAOperar) {
        float resultado = 1;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Escribe el número " + (i + 1) + " a multiplicar: ");
            numerosAOperar[i] = scanner.nextFloat();
        }

        for (int j = 0; j < numerosAOperar.length; j++) {
            resultado = resultado * numerosAOperar[j];
        }

        return resultado;
    }
}