import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        int cantidad = 0;
        int pares = 0;
        int impares = 0;
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿ Cuántos números va a ingresar?");
        cantidad = scanner.nextInt();

        int [] numeros = new int[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
    
}
