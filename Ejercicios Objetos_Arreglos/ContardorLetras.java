import java.util.Scanner;

public class ContardorLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de palabras
        System.out.print("¿Cuántas palabras deseas ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea después del número

        String[] palabras = new String[cantidad];  // Arreglo para almacenar las palabras

        // Ingresar las palabras
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa la palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
        }

        // Contar las palabras por letra inicial
        int[] contador = new int[26];  // Arreglo para contar las letras (de A a Z)

        for (int i = 0; i < palabras.length; i++) {
            char letraInicial = Character.toLowerCase(palabras[i].charAt(0));  // Obtener la letra inicial
            if (letraInicial >= 'a' && letraInicial <= 'z') {
                contador[letraInicial - 'a']++;  // Contar la letra inicial
            }
        }

        System.out.println("Conteo de palabras por letra inicial:");
        for (char letra = 'a'; letra <= 'z'; letra++) {
            int count = contador[letra - 'a'];
            if (count > 0) {
                System.out.println(letra + ": " + count);
            }
        }
    }
}
