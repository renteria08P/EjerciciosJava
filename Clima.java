public class Clima {
    public static void main(String[] args) {
        
        int temperatura = 15;

        if (temperatura < 10) {
            System.out.println("Dìa muy frìo");   
        }
        else if (temperatura >=10 && temperatura <= 20) {
            System.out.println("Dìa Fresco"); 
        }
        else if (temperatura >=21 && temperatura <= 30) {
            System.out.println("Dìa Càlido"); 
        }
        else{
            System.out.println("Dia muy caluroso");
        }
        
    }
    
}
