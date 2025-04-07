import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int numero;
        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresa un número: ");
            numero = lector.nextInt();

            if (numero > 0) {
                suma += numero;
            }
        }

        System.out.println("La suma de los números positivos es: " + suma);
    }
}
