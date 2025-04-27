import java.util.Scanner;

public class Unidades {
    public static void main(String[] args) {

        int cantidad; 
        int i; 

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos valores en metros quieres convertir? ");
        cantidad = scanner.nextInt();
        double[] metros = new double[cantidad];  // Arreglo para los valores en metros

        // Ingresar los valores en metros
        for (i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el valor " + " en metros: ");
            metros[i] = scanner.nextDouble();
        }
        
        double[] kilometros = new double[metros.length];
        for (i = 0; i < metros.length; i++) {
            kilometros[i] = metros[i] / 1000;  // 1 kilómetro = 1000 metros
        }

        System.out.print("Valores en kilómetros: ");
        for (i = 0; i < kilometros.length; i++) {
            System.out.print(kilometros[i] + " ");
        }
    }
}
