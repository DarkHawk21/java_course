package src.calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float resultado = 0;

        System.out.println("Seleccione una opción:");
    System.out.println("1. Sumar dos números \n2. Restar dos números \n3. Multiplicar dos números \n4. Dividir dos números");
        int opcion = scanner.nextInt();

    System.out.println("Introuce el pimer numero");
            int numero1 = scanner.nextInt();

            System.out.println("Introduce el segundo numero");
            int numero2 = scanner.nextInt();


    switch(opcion){
        case 1: resultado = suma(numero1, numero2);
        System.out.println("El resultado es: " + resultado);
        break;
        case 2: resultado = resta(numero1, numero2);
        System.out.println("El resultado es: " + resultado);
        break;
        case 3: resultado = multiplicación(numero1, numero2);
        System.out.println("El resultado es: " + resultado);
        break;
        case 4: resultado = division(numero1, numero2);
        System.out.println("El resultado es: " + resultado);
        break;
        default: System.out.println("La opcion ingresada no se encuentra, teclee otra");
    }

}

    static int suma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    static int resta(int a, int b){
        int resultado = a - b;
        return resultado;
    }

    
    static int multiplicación(int a, int b){
        int resultado = a * b;
        return resultado;
    }

    
    static float division(int a, int b){
        float resultado = a / b;
        return resultado;
    }


}

// Lo hagas con switch
// Ciclos para cuando no existe la opción, que te regrese el mensaje "No entiendo tu petición".
// Crear las funciones "resta", "multiplicacion" y "division". Habrá que modificar el tipo de dato de resultado.
