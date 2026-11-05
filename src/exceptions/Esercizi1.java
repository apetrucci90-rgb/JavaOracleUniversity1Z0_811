package exceptions;

/*
ECCEZIONE (excpetion) = errore a runtime che interrompe
il flusso normale. Senza gestione il programma crasha (crash)
e sputa lo stack trace.

try / catch / finally:

try = prova il codice che può fallire

catch = cattura l'errore e lo gestisce

finally = gira sempre, con o senza errore

L'oggetto eccezione (e): e.getMessage() dice cosa è 
andato storto.

CHECKED vs UNCHECKED
*/

public class Esercizi1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int risultato = a / b;

            System.out.println("Risultato: " + risultato);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            System.out.println("Fine: giro comunque.");
        }
    }    
}
