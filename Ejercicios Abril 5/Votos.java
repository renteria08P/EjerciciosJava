import java.util.Scanner;

public class Votos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int positivos = 0, neutros = 0, negativos = 0;
        int voto;

        System.out.println("=== Evaluación de 10 votos ===");
        System.out.println("1. Positivo");
        System.out.println("2. Neutro");
        System.out.println("3. Negativo");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Votos: ");
            voto = lector.nextInt();

            switch (voto) {
                case 1:
                    positivos++;
                    break;
                case 2:
                    neutros++;
                    break;
                case 3:
                    negativos++;
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    i--;
            }
        }

        // Cálculo de porcentajes
        double porcentajePositivos = positivos * 100.0 / 10;
        double porcentajeNeutros = neutros * 100.0 / 10;
        double porcentajeNegativos = negativos * 100.0 / 10;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos + " (" + porcentajePositivos + "%)");
        System.out.println("Neutros: " + neutros + " (" + porcentajeNeutros + "%)");
        System.out.println("Negativos: " + negativos + " (" + porcentajeNegativos + "%)");
    }
}
