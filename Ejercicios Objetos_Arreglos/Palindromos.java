import java.util.Scanner;

public class Palindromos {

    public static void main(String[] args) {

        int cantidad;
        int contador = 0; 
        String palabra;
        int i =0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas palabras vas a ingresar? ");
        cantidad = scanner.nextInt();
        scanner.nextLine(); 

        String[] palabras = new String[cantidad];

        for (i = 0; i < cantidad; i++) {
            System.out.print("Palabra: ");
            palabras[i] = scanner.nextLine();
        }

    
        for (i = 0; i < palabras.length; i++) {
            palabra = palabras[i].toLowerCase();

            if (esPalindroma(palabra)) {
                contador++;
            }
        }

        System.out.println("Total de palabras palíndromas: " + contador);
    }

    public static boolean esPalindroma(String palabra) {
        int inicio = 0;
        int fin = palabra.length() - 1;

        while (inicio < fin) {
            if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }
}
