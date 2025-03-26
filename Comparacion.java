public class Comparacion {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 10;
        int num3 = 5;
        int mayor, menor;

        if (num1 >= num2 && num1 >= num3 ) {
            mayor = num1;
        }else if (num2 >= num1 && num2 >= num3 ){
            mayor = num2;
        }else{
             mayor = num3;
        }
        System.out.println("El numero mayor es: " + mayor);
        
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
        } else {
            menor = num3;
        }
        System.out.println("El numero menor es: " + menor);


        boolean iguales = (num1 == num2) || (num1 == num3) || (num2 == num3);
        if (iguales) {
            System.out.println("Hay numeros repetidos ");
        }
    }  
}
