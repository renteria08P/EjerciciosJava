import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {

        int cantidad = 0;
        int mayor = 0;
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿ Cuántos números va a ingresar?");
        cantidad = scanner.nextInt();

        int [] numeros = new int[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
    }
}

