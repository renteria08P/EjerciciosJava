import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int edad;
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa tu Edad: " );
            edad = lector.nextInt();

            if (edad >= 18) {
                contador++;
        }
    }
    System.out.println("Cantidad de personas mayores de edad: " + contador);
}
}

