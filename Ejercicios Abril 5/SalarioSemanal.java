import java.util.Scanner;

public class SalarioSemanal {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        double horasTrabajadas, valorHora;
        double horasExtra = 0, salario;

        System.out.print("Ingresa las horas trabajadas esta semana: ");
        horasTrabajadas = lector.nextDouble();

        System.out.print("Ingresa el valor por hora: ");
        valorHora = lector.nextDouble();

        if (horasTrabajadas > 40) {
            horasExtra = horasTrabajadas - 40;
            salario = (40 * valorHora) + (horasExtra * valorHora * 1.5);
        } else {
            salario = horasTrabajadas * valorHora;
        }

        System.out.println("Horas extra trabajadas: " + horasExtra);
        System.out.println("Salario total de la semana: $" + salario);
    }
}
