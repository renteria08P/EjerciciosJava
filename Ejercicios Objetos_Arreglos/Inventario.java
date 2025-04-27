import java.util.Scanner;

public class Inventario {

    public static void main(String[] args) {
       
        String[] productos = {"Licuadora", "Tostadora", "Batidora", "Freidora"};
        int[] cantidades = {10, 15, 5, 7};

        System.out.println("Inventario inicial:");
        mostrarInventario(productos, cantidades);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n¿Cuántos productos se vendieron?");
        System.out.print("Ingresa el nombre del producto: ");
        String productoVendido = scanner.nextLine();
        System.out.print("Ingresa la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equalsIgnoreCase(productoVendido)) {
                if (cantidadVendida <= cantidades[i]) {
                    cantidades[i] -= cantidadVendida;
                    System.out.println("Venta realizada con éxito.");
                } else {
                    System.out.println("No hay suficiente stock para la venta.");
                }
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El producto no existe en el inventario.");
        }

        // Mostrar el inventario actualizado
        System.out.println("Inventario actualizado:");
        mostrarInventario(productos, cantidades);

    }

    public static void mostrarInventario(String[] productos, int[] cantidades) {
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": " + cantidades[i] + " unidades");
        }
    }
}
