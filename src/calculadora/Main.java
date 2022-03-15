package src.calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;

        System.out.println("Seleccione una opción:");
        System.out.println("1. Sumar dos números");
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println("Introuce el pimer numero");
            int numero1 = scanner.nextInt();

            System.out.println("Introduce el segundo numero");
            int numero2 = scanner.nextInt();

            resultado = suma(numero1, numero2);
        }

        System.out.println("El resultado es: " + resultado);
    }

    static int suma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
}

// Lo hagas con switch
// Ciclos para cuando no existe la opción, que te regrese el mensaje "No entiendo tu petición".
// Crear las funciones "resta", "multiplicacion" y "division". Habrá que modificar el tipo de dato de resultado.
