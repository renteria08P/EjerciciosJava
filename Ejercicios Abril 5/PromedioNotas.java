import java.util.Scanner;

public class PromedioNotas {
   
     public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        double numero;
        double suma = 0;
        int i;
        double promedio;


        for (i = 1; i <= 4; i++) {
            System.out.print("Ingresa la Nota: ");
            numero = lector.nextDouble();
            suma += numero;
        }

        promedio = suma / 4;
        System.out.println("El promedio es: " +promedio);

        if(promedio >= 3.0){
                
            System.out.println("Aprobò");
        }else{
            System.out.println("No Aprobo");
        }
    }
}
    

