import java.util.Scanner;

public class CalculadoraVariosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float suma = 0;
        int cantidadNumeros;
        float[] numerosASumar;

        System.out.println("¿Cuantos numeros quieres sumar?");
        cantidadNumeros = scanner.nextInt();

        numerosASumar = new float[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Escribe el número " + (i + 1) + " a sumar: ");
            numerosASumar[i] = scanner.nextFloat();
            scanner.close();
        }

        for(int j = 0; j < numerosASumar.length; j++) {
            suma = suma + numerosASumar[j];
        }

        System.out.println("El resultado de la suma es: " + suma);
    }
}
