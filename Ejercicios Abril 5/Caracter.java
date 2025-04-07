import java.util.Scanner;

public class Caracter {
    public static void main(String[] args) {
        
         Scanner lector = new Scanner(System.in);
        int contador = 0;
        char caracter;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el carácter: ");
            caracter = lector.next().charAt(0);

            if (caracter == 'a' || caracter == 'A') {
                contador++;
            }
        }

        System.out.println("La letra 'a' apareció " + contador + " veces.");
    }
}
