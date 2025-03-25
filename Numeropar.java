public class Numeropar{
    public static void main(String[] args) {
        
        int numero = 5;

        if (numero % 2 == 0 && numero > 50) {
            System.out.println("El número es par y mayor que 50.");
        } else if (numero % 2 == 0) { 
            System.out.println("El número es par, pero no es mayor que 50.");
        } else {
            System.out.println("El número no es par.");
        }
    }
}


    