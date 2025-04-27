import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {


        int destino;
        double temperatura;
        int origen;
        double celsius;
        double resultado;

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la Temperatura: ");
        temperatura = scanner.nextDouble();

        System.out.println("Seleccione la unidad de origen:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        origen = scanner.nextInt();

        System.out.println("Seleccione la unidad de destino:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        destino = scanner.nextInt();

        switch (origen) {
            case 1: // Celsius a Celsius
                celsius = temperatura;
                break;
            case 2: // Fahrenheit a Celsius
                celsius = (temperatura - 32) * 5 / 9;
                break;
            case 3: // Kelvin a Celsius
                celsius = temperatura - 273.15;
                break;
            default:
                System.out.println("Unidad de origen no válida.");
                scanner.close();
                return;
        }

        switch (destino) {
            case 1: // Celsius a Celsius
                resultado = celsius;
                break;
            case 2: // Celsius a Fahrenheit
                resultado = (celsius * 9 / 5) + 32;
                break;
            case 3: // Celsius a Kelvin
                resultado = celsius + 273.15;
                break;
            default:
                System.out.println("Unidad de destino no válida.");
                scanner.close();
                return;
        }

        System.out.printf("Resultado: %.2f\n", resultado);
    }
}
