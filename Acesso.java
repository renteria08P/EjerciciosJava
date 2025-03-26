public class Acesso {
    public static void main(String[] args) {
        
        int edad = 12; 

        if (edad < 5) {
            System.out.println("No pueden subir");

        }else if (edad >=5 && edad < 12) {
            System.out.println("Deben ir acompañados por un adulto");

        }
        else if (edad >=12) {
            System.out.println("Pueden ingresar solos"); 
        }
    }
}




