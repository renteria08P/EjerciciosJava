import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {


        double peso;
        String nombre; 
        double estatura;
        double imc;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su Nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese su Peso (Kg): ");
        peso = scanner.nextDouble();

        System.out.println("Ingrese su Estatura (m): ");
        estatura = scanner.nextDouble();
    
        imc = peso /(estatura * estatura);

        System.out.println(nombre + ", tu IMC es: " + imc);

        System.out.println("Clasificación: ");

        if (imc < 18.5) {
            System.out.println("Bajo Peso");
        } else if (imc < 24.9) {
            System.out.println("Peso Normal");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc < 30.0) {
            System.out.println("Obesidad"); 
        }
    }
}

