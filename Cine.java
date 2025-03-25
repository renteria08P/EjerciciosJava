public class Cine {
    public static void main(String[] args) {
        
        int edad = 1;
 
        if (edad < 5) {
            System.out.println("Entrada gratuita.");
        } 
        else if (edad >= 5 && edad <= 17) {
            System.out.println("El boleto cuesta $5.");
        } 
        else if (edad >= 18 && edad <= 60) {
            System.out.println("El boleto cuesta $10.");
        } 
        else { 
            System.out.println("El boleto cuesta $7, con el descuento queda le queda en: $3.5 ");
        }
    }
}
