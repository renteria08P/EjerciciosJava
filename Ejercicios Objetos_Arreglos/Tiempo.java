import java.util.Scanner;

public class Tiempo {

    public static void main(String[] args) {

        int segundos;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los segundos: ");
        segundos = scanner.nextInt();

        int[] tiempo = new int[3];  

        tiempo[0] = segundos / 3600;  // Calcular las horas
        segundos %= 3600;  

        tiempo[1] = segundos / 60;  // Calcular los minutos
        segundos %= 60;  

        tiempo[2] = segundos; // Segundos 
        System.out.printf("El tiempo es: %d:%02d:%02d\n", tiempo[0], tiempo[1], tiempo[2]);
    }
}

// 1 hora = 3600 segundos
// 1 minuto = 60 segundos