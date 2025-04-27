import java.util.Scanner;

public class CalculadoraPromedios {
    public static void main(String[] args) {

        int cantidad;
        double suma;
        double promedio; 

        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números quieres ingresar? ");
        cantidad = scanner.nextInt();

        double[] numeros = new double[cantidad];
        suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa la calificación: ");
            numeros[i] = scanner.nextDouble();
            suma += numeros[i];
        }

        promedio = suma / cantidad;
        System.out.println("El promedio es: " + promedio);
    }
}
