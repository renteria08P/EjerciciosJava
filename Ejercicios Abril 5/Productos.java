import java.util.Scanner;

public class Productos {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        double total = 0;
        int contador = 0;
        double precio;

        while (total <= 100.000) {
            System.out.print("Ingresa el precio del producto: ");
            precio = lector.nextDouble();
            total += precio;
            contador++;
        }

        System.out.println("Se necesitaron " + contador + " productos para superar los $100.000");
    }
}

