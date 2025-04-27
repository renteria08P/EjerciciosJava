import java.util.Scanner;

public class Velocidad {

    public static void main(String[] args) {

        double distancia;
        double tiempo;
        double resultado;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la distancia (Km): ");
        distancia = scanner.nextDouble();

        System.out.println("Ingrese el tiempo (Horas): ");
        tiempo = scanner.nextDouble();

        resultado = distancia / tiempo;
        System.out.println("La Velocidad es: " +resultado + " Km/h");

         // Clasificación de velocidad
         if (resultado < 40) {
            System.out.println("Clasificación: Lenta");
        } else if (resultado <= 80) {
            System.out.println("Clasificación: Normal");
        } else {
            System.out.println("Clasificación: Rápida");
        }
        
    }
    
}
