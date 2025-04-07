import java.util.Scanner;

public class MenuFrutas {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int mango = 0, sandia = 0, banano = 0;
        int opcion;

        System.out.println("=== Menú de Frutas ===");
        System.out.println("1. Mango");
        System.out.println("2. Sandia");
        System.out.println("3. Banano");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Elige una fruta: ");
            opcion = lector.nextInt();

            if (opcion == 1) {
                mango++;
            } else if (opcion == 2) {
                sandia++;
            } else if (opcion == 3) {
                banano++;
            } else {
                System.out.println("Opción inválida. No se contará.");
                i--;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Mangos elegidas: " + mango);
        System.out.println("Sandias elegidos: " + sandia);
        System.out.println("Bananos elegidas: " + banano);
    }
}
        

