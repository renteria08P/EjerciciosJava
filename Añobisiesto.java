public class Añobisiesto {
    public static void main(String[] args) {
        
        int fecha = 2084;


        if (fecha % 4 == 0 && fecha % 400 == 0 || fecha % 100 != 0) {
            System.out.println("El  Bisiesto");  
        }else{
            System.out.println("El año no es Bisiesto");

        }
    }
}

            
 
