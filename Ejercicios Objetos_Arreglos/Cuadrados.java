public class Cuadrados {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};  
        int[] cuadrados = new int[numeros.length]; 
     
        for (int i = 0; i < numeros.length; i++) {
            cuadrados[i] = numeros[i] * numeros[i];
        }
        
        System.out.print("Cuadrados: ");
        for (int i = 0; i < cuadrados.length; i++) {
            System.out.print(cuadrados[i] + " ");
        }
    }
}
