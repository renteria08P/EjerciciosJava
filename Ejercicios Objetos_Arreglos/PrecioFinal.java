import java.util.Scanner;

public class PrecioFinal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos productos quieres agregar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 

        // Crear arreglos para los productos y precios
        String[] productos = new String[cantidad];
        double[] precios = new double[cantidad];

        // Ingresar los productos y precios
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el nombre del producto " + (i + 1) + ": ");
            productos[i] = scanner.nextLine();
            System.out.print("Ingresa el precio de " + productos[i] + ": ");
            precios[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        // Ingresar el descuento
        System.out.print("¿Cuál es el descuento (en porcentaje)? ");
        double descuento = scanner.nextDouble();

        // Calcular el precio final
        double totalFinal = 0;
        for (int i = 0; i < cantidad; i++) {
            double precioConDescuento = precios[i] - (precios[i] * descuento / 100);
            totalFinal += precioConDescuento;
            System.out.println("Producto: " + productos[i] + " - Precio original: " + precios[i] + " - Precio con descuento: " + precioConDescuento);
        }

        // Imprimir el total final
        System.out.println("\nTotal final a pagar: " + totalFinal);

        scanner.close(); // Cerrar el scanner
    }
}
