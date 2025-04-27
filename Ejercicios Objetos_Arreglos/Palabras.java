import java.util.Scanner;

public class Palabras {
    public static void main(String[] args) {

        int cantidad = 0;
        int cortas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas palabras vas a ingresar? ");
        cantidad = scanner.nextInt();
        scanner.nextLine(); 

        String[] palabra = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa la palabra #" + (i + 1) + ": ");
            palabra[i] = scanner.nextLine();
        }

        System.out.println("Palabras de 3 letras o menos:");
        for (int i = 0; i < cantidad; i++) {
            if (palabra[i].length() <= 3) {
                System.out.println(palabra[i]);
                cortas++;
            }
        }

        System.out.println("Total de palabras cortas: " + cortas);
    }
}
