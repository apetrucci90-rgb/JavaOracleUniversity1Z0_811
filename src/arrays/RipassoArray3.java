package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class RipassoArray3 {
    public static void main(String[] args) {

        // TAPPA 1 
        int[] scorte = {8, 3, 12, 0, 5};

        System.out.println("totale numero scorte = " + scorte.length);
        System.out.println("ultima voce = " + scorte[scorte.length - 1]);

        int totale = 0;
        for (int i = 0; i < scorte.length; i++) {
            totale += scorte[i];
        }
        System.out.println("totale scorte = " + totale);

        // PUNTO 3
        /*
        TALK: creo una variabile intera massimo e la faccio partire dal 
        primo valore delle scorte. Poi, per ogni scorta s dentro l'array
        scorte:
        - se s è maggiore del massimo che ho finora, allora massimo diventa
        s. 
        - Finito il firo su tutte le scorte, stampo 'massimo = ' seguito
        dal valore di massimo.
        */
        int massimo = scorte[0];
        for (int s : scorte) {
            if (s > massimo){
                massimo = s;
            }
        }
        System.out.println("numero massimo scorte: " + massimo);

        // PUNTO 3 - bis

        int minimo = scorte[0];
        for (int s : scorte) {
            if (s < minimo) {
                minimo = s;
            }
        }
        System.out.println("numero minimo scorte = " + minimo);

        // PUNTO 4, coppia ordinata
        int[] ordinate = Arrays.copyOf(scorte, scorte.length);
        Arrays.sort(ordinate);

        /*
        Perchè ora serve un Arrays.toString e prima no?
        Prima ho chiesto di stampare solo numeri singoli. Ora devo stampare
        un'array intero: sto chiedendo all'array di diventare testo e lui
        risponde con  [I@1b6d35.
        Arrays.toString(scorte) è un metodo che importo con la classe Arrays
        negli import. Java concatena anche senza il metodo Arrays.... , ma 
        converte il testo usando il toString() dell'array che mostra tipo + 
        identità.

        */
        System.out.println("scorte: " + Arrays.toString(scorte));
        System.out.println("ordinate: " + Arrays.toString(ordinate));

        // PUNTO 4 - bis
        int[] temperature = {7, 2, 9, 4, 1};

        int[] temOrdinate = Arrays.copyOf(temperature, temperature.length);
        Arrays.sort(temOrdinate);

        System.out.println("temperature = " + Arrays.toString(temperature));
        System.out.println("temperature ordinate = " + Arrays.toString(temOrdinate));

        // PUNTO 4  - ter
        String[] nomi = {"carlo", "anna", "dino", "bea"};

        String[] nomiOrdinati = Arrays.copyOf(nomi, nomi.length);
        Arrays.sort(nomiOrdinati);

        System.out.println("nomi = " + Arrays.toString(nomi));
        System.out.println("nomi ordinati = " + Arrays.toString(nomiOrdinati));

        // PUNTO 5 
    }
}
