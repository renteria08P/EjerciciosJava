import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {


        int saldo = 500000;
        int deposito;
        int retiro;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto a depositar: ");
        deposito = scanner.nextInt();
        if (deposito > 0) {
            saldo += deposito;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("No se realizó el depósito.");
        }

        System.out.print("Ingrese el monto a retirar: ");
        retiro = scanner.nextInt();
        if (retiro <= saldo) {
            saldo -= retiro;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
        } else {
            System.out.println("Fondos insuficientes. Saldo actual: " + saldo);
        }
    }
}
