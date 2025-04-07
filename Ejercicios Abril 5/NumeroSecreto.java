import java.util.Scanner;


public class NumeroSecreto {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int numero = 8;
        int intento = 0;

        System.out.println("¡Adivina el número secreto del 1 al 10!");

        while (intento != numero) {
            System.out.print("Ingresa el Numero: ");
            intento = lector.nextInt();

            if (intento >= 1 && intento <= 10) {
                if (intento == numero) {
                    System.out.println("¡Felicidades! Adivinaste el número secreto.");
                } else {
                    System.out.println("¡Incorrecto! Intenta de nuevo.\n");
                }
            } else {
                System.out.println("Número fuera de rango. Intenta entre 1 y 10.\n");
            }
        }
    }
}
        
 
