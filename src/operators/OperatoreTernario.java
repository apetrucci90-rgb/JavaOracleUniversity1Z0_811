package operators;

public class OperatoreTernario {
    public static void main(String[] args) {
        /*
        L'operatore ternario è un if/else compatto che
        produce un valore: condizione ? valoreSeVero: valoreSeFalso
        int a = 2, b = 3;
        int c = (a >= b) ? a : b;  // c vale 3
        */

        int ospiti = 12;
        int tavoli = (ospiti > 10) ? 3 : 2;

        System.out.println(tavoli);

        /*
        int tavoli = se gli ospiti sono sopra i 10, ne servono
        3, se sono meno ne bastano 2
        */

        int x = 7, y = 4;
        int massimo = (x > y) ? x : y;

        System.out.println(massimo);

        int numero = 15;
        String risultato = (numero % 2 == 0) ? "pari" : "dispari";
        System.out.println(risultato);

        /*
        Un ternario può avere un altro risultato al posto
        dei due, per gestire più di due casi in cascata
        
        int voto = 55;
        String esito = (voto >= 90) ? "ottimo" : (voto >= 60) ? "sufficiente" : "insufficiente";
        
        Se il voto è >= di 90, ottimo;
        Se il voto è >= di 60, sufficiente; altrimenti 
        è insufficiente.
        */
        
        int punteggio = 75;
        String voto = (punteggio >= 90) ? "eccellente" : (punteggio >= 60) ? "sufficiente" : "insufficiente";

        System.out.println(voto);

        int spesa = 60;
        int sconto = (spesa >= 100) ? 20 : (spesa >= 50) ? 10 : (spesa >= 20) ? 5 : 0;
        System.out.println(sconto);
        
    
    }
    
}
