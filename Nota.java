
public class Nota {
    public static void main(String[] arg) {

        int nota = 55;

        if (nota>0 && nota<=49) {
            System.out.println("Reprobado");    
        }
        else if (nota>50 && nota<=69) {
            System.out.println("Neceista Mejorar");
        }
        else if (nota>70 && nota<=89) {
            System.out.println("Aprobado");
        }
        else if (nota>90 && nota<=100) {
            System.out.println("Excelente");
        }
    }
}
