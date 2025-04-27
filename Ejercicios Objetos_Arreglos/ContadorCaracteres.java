public class ContadorCaracteres {
  
    static class Contador {
        char letra;
        int cantidad;

        // Constructor
        Contador(char letra) {
            this.letra = letra;
            this.cantidad = 0;
        }

        // Método para incrementar el contador de letras
        void contar() {
            this.cantidad++;
        }
    }

    public static void main(String[] args) {
        // Crear el objeto Contador para cada letra
        Contador[] contadores = new Contador[26];
        for (int i = 0; i < 26; i++) {
            contadores[i] = new Contador((char) ('a' + i));  // Asignar la letra correspondiente
        }

        // Palabra a contar
        String palabra = "banana";

        // Contar las letras
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra >= 'a' && letra <= 'z') {  // Solo contar letras válidas
                contadores[letra - 'a'].contar();  // Incrementar el contador correspondiente
            }
        }

        // Mostrar los resultados
        for (Contador contador : contadores) {
            if (contador.cantidad > 0) {
                System.out.println(contador.letra + ": " + contador.cantidad);
            }
        }
    }
}
