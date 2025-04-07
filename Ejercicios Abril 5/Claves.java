import java.util.Scanner;

public class Claves {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int claveCorrecta = 1234;
        int claveUsuario;
        
        while (true) {
            System.out.print("Introduce la clave: ");
            claveUsuario = lector.nextInt();

            if (claveUsuario == claveCorrecta) {
                System.out.println("Acceso autorizado");
                
            } if(claveUsuario != claveCorrecta) {
                System.out.println("Error");
            }
        }
    }
}

          

                
       
        
            
