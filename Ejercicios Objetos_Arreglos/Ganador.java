import java.util.Scanner;

public class Ganador {
    public static void main(String[] args) {

        int indice;
        int cantidad;
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos nombres quieres ingresar? ");
        cantidad = scanner.nextInt();
        scanner.nextLine(); 

        String[] nombres = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el nombre: ");
            nombres[i] = scanner.nextLine();
        }


        // Calcular el índice del ganador usando el operador '%' para ajustarlo al rango del arreglo
        System.out.print("Escribe tu número favorito: ");
        indice = scanner.nextInt() % cantidad;

        System.out.println("El ganador es: " + nombres[indice]);
    }
}

