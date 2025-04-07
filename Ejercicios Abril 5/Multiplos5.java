public class Multiplos5 {
    public static void main(String[] args) {

        int numero = 1;

        for(numero=1; numero<=50; numero=numero+1){
            if (numero % 5 == 0){
                System.out.println("El numero multiplo es: "+numero);
            }
        }
    }
}

