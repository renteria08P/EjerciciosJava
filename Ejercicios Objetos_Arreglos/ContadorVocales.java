import java.util.Scanner;

public class ContadorVocales {

    public static void main(String[] args) {

        int cantidad;
        int vocales = 0;
        int i;
        char letra; 
        String palabra;
        int j;

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
            for (j = 0; j < palabra.length(); j++) {
                letra = palabra.charAt(j);
            
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    vocales++;
                }
        }
    }
        System.out.println("Total de vocales: " + vocales);
    }
}




