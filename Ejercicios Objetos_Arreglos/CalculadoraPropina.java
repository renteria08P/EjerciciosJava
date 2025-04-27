import java.util.Scanner;

public class CalculadoraPropina {

    public static void main(String[] args) {

        int opcion;
        double monto;

        Scanner scanner = new Scanner(System.in);

        double[] porcentajes = {10, 15, 20}; // 3 opciones de propina

        System.out.print("Ingrese el total de la cuenta: ");
        monto = scanner.nextDouble();

        System.out.println("Seleccione el porcentaje de propina:");
        System.out.println("1. " + porcentajes[0] + "%");
        System.out.println("2. " + porcentajes[1] + "%");
        System.out.println("3. " + porcentajes[2] + "%");

        System.out.print("Opción: ");
        opcion = scanner.nextInt();

        if (opcion < 1 || opcion > 3) {
            System.out.println("Opción inválida.");
        } else {
            double propina = (monto * porcentajes[opcion - 1]) / 100;
            double total = monto + propina;

            System.out.println("Valor de la propina: " + propina);
            System.out.println("Total a pagar: " + total);
        }
    }
}
