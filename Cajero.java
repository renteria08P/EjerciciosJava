public class Cajero {
    public static void main(String[] args) {

        int disponible = 5000;
        int cantidad = 7000;
        int limite = 1000;


        if (cantidad > disponible){
            System.out.println("Fondos Insuficientes");

        }else if (cantidad > limite){
            System.out.println("Limite de retiro por transacciòn: ");

        }else{
            System.out.println("Retiro Exitoso. ");
        }
        int sueldoTotal =( disponible - cantidad);
        System.out.println("Su sueldo actual es: $" + sueldoTotal);
        
    }
}
 