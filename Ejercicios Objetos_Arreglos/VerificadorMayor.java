import java.util.Scanner;
import java.time.LocalDate;

public class VerificadorMayor {
    public static void main(String[] args) {

        String pais; 
        int nacimiento;
        int añoActual;
        int edadLegal;

        Scanner scanner = new Scanner(System.in);
        añoActual = LocalDate.now().getYear();
        System.out.print("Ingrese el año de nacimiento: ");
        nacimiento = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese el país: ");
        pais = scanner.nextLine().toLowerCase();
        
        int edad = añoActual - nacimiento;

        switch (pais) {
            case "argentina":
            case "mexico":
            case "españa":
            case "colombia":
                edadLegal = 18;
                break;
            case "estados unidos":
            case "usa":
            case "eeuu":
            case "ee.uu.":
                edadLegal = 21;
                break;
            case "cuba":
                edadLegal = 16;
                break;
            default:
                System.out.println("País no reconocido. Se asumirá mayoría de edad a los 18 años.");
                edadLegal = 18;
        }

    
        if (edad >= edadLegal) {
            System.out.printf("Usted es mayor de edad en " + pais);
        } else {
            System.out.printf("Usted no es mayor de edad en " + pais);
        }
    }
}

