import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {

        int año;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Año: ");
        año = scanner.nextInt();

        if (año % 4 == 0 && año % 400 == 0 || año % 100 != 0) {
            System.out.println("El año " + año + " es Bisiesto");  
        }else{
            System.out.println("El año " + año + " no es Bisiesto");

        }
    }
    
}
