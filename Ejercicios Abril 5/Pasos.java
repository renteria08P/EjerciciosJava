import java.util.Scanner;

public class Pasos {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int pasosDia;
        int pasosTotales = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingresa los pasos del día: " );
            pasosDia = lector.nextInt();
            pasosTotales += pasosDia;
        }

        System.out.println("\nTotal de pasos en la semana: " + pasosTotales);

        if (pasosTotales >= 50000) {
            System.out.println("Lograste los 50.000 pasos.");
        } else {
            System.out.println("No lo lograste");
        }        
    }
    
}
