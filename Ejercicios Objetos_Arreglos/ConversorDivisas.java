import java.util.Scanner;

public class ConversorDivisas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] monedas = {"usd", "eur", "cop"};
        double[][] tasas = {
            {1.0, 0.90, 4000.0}, //USD - EUR - COP
            {1.11, 1.0, 4444.0}, //USD - EUR - COP
            {0.00025, 0.000225, 1.0} //USD - EUR - COP
        };

        System.out.print("Cantidad de dinero: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Moneda de origen: ");
        String origen = scanner.nextLine().toLowerCase();

        System.out.print("Moneda de destino: ");
        String destino = scanner.nextLine().toLowerCase();

        int i = 0, j = 0;

        for (int k = 0; k < monedas.length; k++) {
            if (monedas[k].equals(origen)) i = k;
            if (monedas[k].equals(destino)) j = k;
        }

        double resultado = cantidad * tasas[i][j];
        System.out.printf("%.2f %s equivalen a %.2f %s%n", cantidad, origen.toUpperCase(), resultado, destino.toUpperCase());
    }
}
