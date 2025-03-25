public class Descuento {
    public static void main(String[] args) {

        int compratotal = 850;
        double descuento = 0.0;

        if (compratotal >=1000) {
            descuento = 0.20;
            System.out.println("Recibe un 20% de descuento");
        } 
        if (compratotal>=500){
            if(compratotal<999){
                descuento = 0.10;
                System.out.println("Recibe un 10% de descuento");   
            }
        }else {
            System.out.println("No recibe descuento");   
        }
        double totalPagar = compratotal - (compratotal * descuento);
        System.out.println("Total a pagar: $" + totalPagar);
        
    }
}
