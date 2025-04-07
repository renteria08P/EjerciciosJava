public class Arreglos {

    public static void main(String[] args) {
        
        int[] numeros = new int [5];  //Crear arreglo numeros Vacío//
        String [] vocales = {"a","e","i","o","u"}; // Vocales tiene a,e,i,o,u //
        int[] numero = {2,3,1,4,5};

        System.out.println(numero[2]);
        System.out.println(vocales[2]);
        System.out.println(vocales[4]);
        System.out.println(numero[4]);
        System.out.println(numeros[0]);

        numeros [0] = 3;
        numeros [1] = 10;
        numeros [2] = 5;
        numeros [3] = 8;
        numeros [4] = 4;

        System.out.println(numeros[4]);
    }   

}
