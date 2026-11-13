package exceptions;

public class Esercizi5 {
    static void controllaForno(int gradi) throws TemperaturaException {
        if (gradi > 250) {
            throw new TemperaturaException("Troppo caldo (°COk ci s): " + gradi);
        }
        System.out.println("Forno OK a °C: " + gradi);
    }

    public static void main(String[] args) {
        try {
            controllaForno(200);
            controllaForno(300);
        } catch (TemperaturaException e) {
            System.out.println("ERRORE: " + e.getMessage());
        } finally {
            System.out.println("=== FORNO SPENTO ===");
        }
    }
    
}


class TemperaturaException extends Exception {
   TemperaturaException(String messaggio) {
    super(messaggio);
   }

}