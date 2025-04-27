import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int indice;
        double nota;

        char[] calificaciones = {'A', 'B', 'C', 'D', 'F'};

        System.out.print("Ingrese la calificación: ");
        nota = scanner.nextDouble();

        if (nota >= 4.0) {
            System.out.println("Excelente");
        } else if (nota >= 3.0) {
            System.out.println( " Bueno");
        } else if (nota >= 2.0) {
            System.out.println(" Suficiente");
        } else if (nota >= 1.0) {
            System.out.println("Cercano a la reprobación");
        } else {
            System.out.println("Reprobado");
        }
    }
}
