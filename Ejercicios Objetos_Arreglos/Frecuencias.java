public class Frecuencias {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 2, 3, 1, 4, 2, 3, 5, 1};

        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
    
                for (int j = i; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j]) {
                        contador++;
                    }
                }
                System.out.println("Número " + numeros[i] + " aparece " + contador + " veces.");
            }
        }   
    } 
}
