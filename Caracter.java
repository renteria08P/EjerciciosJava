public class Caracter {
    public static void main(String[] args) {

        char caracter = '#';

        if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            System.out.println("Es una Vocal");

        } else if (caracter >= 'A' && caracter <= 'Z') {
            System.out.println("Es una Consonante");

        } else if (caracter >= '0' && caracter <= '9') {
            System.out.println("Es un número");

        } else {
            System.out.println("Es un símbolo");
        }
    }
}
