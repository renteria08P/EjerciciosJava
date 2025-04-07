import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        int acumulador = 0;
        int numero;

        for(int n = 1; n <= 5; n++) {
            System.out.println("Ingresa un numero: ");
            numero = lector.nextInt();
            acumulador = acumulador + numero;
        }
        
        System.out.println("La suma es: " + acumulador);
    }
}




        



    