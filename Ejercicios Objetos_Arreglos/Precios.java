import java.util.Scanner;

public class Precios {

    public static void main(String[] args) {
    
        String[] productos = {"Licuadora", "Tostadora", "Batidora", "Freidora"};
        double[] precios = {65000, 85000, 200000, 230000};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del producto para obtener su precio: ");
        String productoBuscado = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equalsIgnoreCase(productoBuscado)) {
                System.out.println("El precio de " + productos[i] + " es: $" + precios[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El producto no se encuentra en la lista.");
        }
    }
}
