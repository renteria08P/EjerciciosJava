import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de temperaturas
        System.out.print("¿Cuántas temperaturas deseas clasificar? ");
        int cantidad = scanner.nextInt();  
        double[] temperaturas = new double[cantidad];

        // Ingresar las temperaturas
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa la temperatura: ");
            temperaturas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < temperaturas.length; i++) {
            String clasificacion;

            if (temperaturas[i] < 15) {
                clasificacion = "Frío";
            } else if (temperaturas[i] >= 15 && temperaturas[i] <= 25) {
                clasificacion = "Templado";
            } else {
                clasificacion = " Mucho Calor";
            }

            System.out.println("Temperatura " + temperaturas[i] + "°C: " + clasificacion);
        }
    }
}
