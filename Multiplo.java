public class Multiplo {
    public static void main(String[] arg) {

        int numero = 2;

        if (numero % 3 == 0 && numero % 5 == 0){
            System.out.println("El número es múltiplo de 3 y 5.");
        }else if (numero % 3 == 0){
            System.out.println("El número es múltiplo de 3.");
        }else if (numero % 5 == 0){
            System.out.println("El número es múltiplo de 5.");
        }else {
            System.out.println("El número no es múltiplo de 3 ni de 5.");
        }
    }
}
