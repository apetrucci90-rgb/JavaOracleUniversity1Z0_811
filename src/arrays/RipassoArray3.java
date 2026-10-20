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

        // PUNTO 5 Ricerca lineare (obiettivo, non sintassi)
        /*
        COSA: voglio sapere SE un certo valore esiste nell'
        array scorte e, se c'è, a QUALE indice si trova.
        COME: scorro scorte dall'inizio alla fine e confronto
        ogni cellla con il valore cercato. Mi servono due 
        variabili dichiarate FUORI dal ciclo: una bandiera
        booleana (parte da false, diventa true appena incontro
        il valore) e la posizione (parte da -1, diventa l'indice
        quando lo trovo). Appena lo trovo esco col break. 
        */

        int cercato = 9;
        boolean trovato = false;
        int posizione = - 1;

        for (int i = 0; i < scorte.length; i++) {
            if (scorte[i] == cercato) {
                trovato = true;
                posizione = i;
                break;
            }
        }
        if (trovato) {
            System.out.println(cercato + " trovato " +
             "all'indice " + posizione);
        } else {
            System.out.println(cercato + " non c'è nell'array");
        }

        // PUNTO 5 - bis
        /* 
                // PUNTO 5 - bis: ricerca di un nome (String)
        
        CONSEGNA: cerca un nome dentro l'array nomi (String[]).
        Stesso schema del PUNTO 5: scorro una volta, bandiera booleana
        + posizione a -1, mi fermo appena lo trovo. DOPO il ciclo stampo
        "trovato all'indice N" oppure "non presente".
        Provo due volte: un nome che c'è (es. "anna") e uno che non c'è
        (es. "mario").

        TRAPPOLA: le String NON si confrontano con == (confronta i
        riferimenti, non il testo). Per confrontare il contenuto uso
        il metodo .equals() -> differenza vista alla TAPPA 8.
        */

        String cercatoNome = "alessia";
        boolean trovatoNome = false;
        int posizioneNome = - 1;

        for (int i = 0; i < nomi.length; i++) {
            if (nomi[i].equals(cercatoNome)) {
                // .equals confronta il testo
                trovatoNome = true;
                posizioneNome = i;
                break;
            }
        }
        if (trovatoNome) {
            System.out.println(cercatoNome + " trovato" +
                " all'indice " + posizioneNome);
        } else {
            System.out.println(cercatoNome + " non presente");
        }

        // PUNTO 5 - ter
        
        int soglia = 2;
        

    }   
}
