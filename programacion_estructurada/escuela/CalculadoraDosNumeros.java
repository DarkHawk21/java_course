package programacion_estructurada.escuela;
import java.util.Scanner;

public class CalculadoraDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numero1 = 0, numero2 = 0;
        int opcion;

        do {
            System.out.println("\n\n¡Bienvenido!");
            System.out.println("\n1. Sumar dos números \n2. Restar dos números \n3. Multiplicar dos números \n4. Dividir dos números\n5. Salir");
            System.out.print("\nSeleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion < 5) {
                System.out.print("\nIntroduce el pimer numero: ");
                numero1 = scanner.nextFloat();

                System.out.print("Introduce el segundo numero: ");
                numero2 = scanner.nextFloat();
                scanner.close();
            }

            switch (opcion) {
                case 1:
                    System.out.println("\nEl resultado es: " + suma(numero1, numero2));
                    break;
                case 2:
                    System.out.println("\nEl resultado es: " + resta(numero1, numero2));
                    break;
                case 3:
                    System.out.println("\nEl resultado es: " + multiplicación(numero1, numero2));
                    break;
                case 4:
                    System.out.println("\nEl resultado es: " + division(numero1, numero2));
                    break;
                case 5:
                    System.out.println("\nAdiós");
                    break;
                default:
                    System.out.println("\nLa opcion ingresada no se encuentra, teclee otra.");
            }

            if (opcion < 5) {
                System.out.println("\n¿Deseas hacer otra operación? [6:sí|5:no]: ");
                opcion = scanner.nextInt();
            }
        } while(opcion != 5);
    }

    static float suma(float a, float b) {
        float resultado = a + b;
        return resultado;
    }

    static float resta(float a, float b) {
        float resultado = a - b;
        return resultado;
    }

    static float multiplicación(float a, float b) {
        float resultado = a * b;
        return resultado;
    }

    static float division(float a, float b) {
        float resultado = a / b;
        return resultado;
    }
}

// Ciclos para cuando no existe la opción, que te regrese el mensaje "No
// entiendo tu petición".