public class Triangulo {
    public static void main(String[] args) {

        int lado1 = 40;
        int lado2 = 50;
        int lado3 = 60;

        if (lado1 == 5 && lado2 == 5 && lado3 == 5) {
            System.out.println("El triángulo es equilátero");

        }else if (lado1 == 5 && lado2 == 5 && lado3 == 4) {
            System.out.println("El triángulo es isóceles");

        }if (lado1 == 4 && lado2 == 9 && lado3 == 6) {
        System.out.println("El triángulo es escaleno");

        }
        else{
            System.out.println("Los valores no forman un triángulo válido.");
        }
    }
}
