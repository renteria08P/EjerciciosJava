import java.util.Scanner;

public class Horario {

    public static void main(String[] args) {
    
        String[] eventos = {"Reunión", "Almuerzo", "Presentación", "Conferencia"};
        String[] horas24 = {"14:30", "12:00", "09:00", "18:45"};

        
        String[] horas12 = new String[horas24.length];
        for (int i = 0; i < horas24.length; i++) {
            horas12[i] = convertirAHora12(horas24[i]);
        }

    
        for (int i = 0; i < eventos.length; i++) {
            System.out.println(eventos[i] + " a las " + horas12[i]);
        }
    }

    // Método para convertir hora de 24 horas a 12 horas con AM/PM
    public static String convertirAHora12(String hora24) {
        int hora = Integer.parseInt(hora24.split(":")[0]);
        int minuto = Integer.parseInt(hora24.split(":")[1]);
        String periodo = (hora >= 12) ? "PM" : "AM";
        
        if (hora > 12) {
            hora -= 12;
        } else if (hora == 0) {
            hora = 12; // Para las 00:00 AM
        }

        return String.format("%02d:%02d %s", hora, minuto, periodo);
    }
}
