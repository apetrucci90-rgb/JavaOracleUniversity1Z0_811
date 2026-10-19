package arrays;

public class RipassoArray {
    public static void main(String[] args) {
        /*
        TAPPA 1 - Cos'è un array e le due forme di creazione
        ----------------------------------------------------
        Un array è un contenitore di dimensione FISSA che tiene più 
        valori dello STESSO tipo, numerati a partire da 0.

        Forma A: con le graffe -> crea e riempie subito
        La dimensione la conta Java da sola
        */
        int [] numeri = {10, 20, 30, 40};

        // Forma B: con new -> crea 3 caselle VUOTE, da riempire
        int [] vuoto = new int[3];

        /*
        TAPPA 2 - Accesso per indice e .length
        --------------------------------------
        Si accede ad una casella con il suo indice tra parentesi quadre.
        Il primo elemento è ad indice 0.
        */

        System.out.println("primo elemento = " + numeri[0]); // 10
        System.out.println("secondo elemento = " + numeri[1]); // 20

        /*
        .length è il NUMERO di caselle. Si scrive SENZA parentesi (non è
        un metodo come nelle String, dove invece è length()).
        */
       System.out.println("quante caselle = " + numeri.length); // 4

       // Quindi l'ULTIMO elemento è a length - 1.
       System.out.println("ultimo elemento = " + numeri[numeri.length - 1]); // 40

       /*
       TAPPA 3 - Valori di default e l'errore out-of-bounds
       ---------------------------------------------------
       Un array creato con new NON è davvero vuoto: Java riempie subito
       ogni casella con un valore di default che dipende dal TIPO.
       int -> 0, double -> 0.0, boolean -> false, oggetti (String) -> null.
       */
       System.out.println("default vuoto[0] = " + vuoto[0]); // 0
       System.out.println("default vuoto[1] = " + vuoto[1]); // 0
       System.out.println("default vuoto[2] = " + vuoto[2]); // 0

       /*
       Gli indici validi vanno da 0 a length - 1. Chiedere una casella
       fuori da questo intervallo COMPILA lo stesso, ma in esecuzione Java
       lancia ArrayIndexOutOfBoundsException e il programma si FERMA lì:
       le righe che vengono dopo non vengono eseguite.
       */
       // System.out.println(numeri[4]); // ERRORE a runtime: numeri ha indici 0..3
       // System.out.println("questa riga non verrà mai stampata");

       /*
       TAPPA 4 - Scorrere un array con un ciclo
       ----------------------------------------
       for classico: l'indice i va da 0 a length-1 (condizione i < length).
       Serve quando ti serve la POSIZIONE o devi modificare le celle.
       */
       for (int i = 0; i < numeri.length; i++) {
           System.out.println("casella " + i + " = " + numeri[i]);
       }

       /*
       for-each: scorre direttamente i VALORI, senza indice. Più pulito
       quando ti basta LEGGERE. Da qui non puoi modificare l'array.
       */
       for (int n : numeri) {
           System.out.println(n);
       }

       // Solo le caselle di indice PARI: l'indice cresce di 2 (0, 2, ...).
       for (int i = 0; i < numeri.length; i += 2) {
           System.out.println("indice pari " + i + " = " + numeri[i]);
       }

       /*
       TAPPA 5 - Somma, media e modifica sul posto
       -------------------------------------------
       SOMMA: serve una variabile "accumulatore" dichiarata FUORI dal
       ciclo (parte da 0) e che a ogni giro si somma l'elemento. Se la
       dichiarassi dentro il ciclo, ripartirebbe da 0 a ogni passo.
       */
       int somma = 0;
       for (int i = 0; i < numeri.length; i++) {
           somma = somma + numeri[i]; // equivalente: somma += numeri[i];
       }
       System.out.println("somma = " + somma); // 100

       /*
       MEDIA: somma / quante. Attento: somma e length sono int, quindi
       int/int TRONCA la parte decimale. Per avere i decimali si forza
       uno dei due a double con il cast (double) PRIMA della divisione.
       */
       double media = (double) somma / numeri.length;
       System.out.println("media = " + media); // 25.0

       /*
       RADDOPPIA SUL POSTO: ogni casella diventa il doppio di se stessa.
       Qui serve il for con INDICE: il for-each ti dava una COPIA del
       valore, non la casella, quindi non potrebbe modificare l'array.
       */
       for (int i = 0; i < numeri.length; i++) {
           numeri[i] = numeri[i] * 2; // equivalente: numeri[i] *= 2;
       }

       // Ristampo l'array raddoppiato per controllare.
       for (int i = 0; i < numeri.length; i++) {
           System.out.println("raddoppiato[" + i + "] = " + numeri[i]);
       }
    /*
    TAPPA 6 - Trovare il massimo
    ----------------------------
    Si parte dando per scontato che il massimo sia il PRIMO elemento,
    poi si scorre dall'indice 1 in poi: ogni volta che si trova un
    valore più grande, si aggiorna max. 
    Si parte da numeri[0], NON da 0.
    */

    int max = numeri[0];
    for (int i = 1; i < numeri.length; i++) {
        if (numeri[i] > max) {
            max = numeri[i];
        }
    }
    System.out.println("massimo = " + max); // 80

    /*
    TAPPA 7 - Ricerca lineare: c'è un valore? A quale indice?
    Scorro l'array e confronto ogni casella con il 
    valore cercato. Due variabili FUORI dal ciclo:
        1 - trovato: parte da false, diventa true se lo
        incontro;
        2 - posizione: parte da -1 (= "non trovato"),
        diventa l'indice.
    Appena trovo, uso break per uscire: inutile
    continuare.
    */

    int cercato = 60;
    boolean trovato = false;
    int posizione = - 1;

    for (int i = 0; i < numeri.length; i++) {
        if (numeri[i] == cercato) {
            trovato = true;
            posizione = i;
            break;
        }
    }
    if (trovato) {
        System.out.println(cercato + " trovato all' + " +
        "indice " + posizione);
    } else {
        System.out.println(cercato + " non c'è nell'array");
    }

    /*
    TAPPA 8 - Array di oggetti (String)
    -----------------------------------
    Un array può contenere OGGETTI, non solo numeri. 
    Funziona uguale, ma con due differenze:
        1) il valore di default non è 0 ma null
        2) due String si confrontano con .equals()
    == confronta i riferimenti, 
    .equals() confronta il testo
    */

    String[] piatti = {"Pasta", "Pizza", "Risotto"};
    for (String p : piatti) {
        System.out.println("piatto = " + p);
    }
    String cercatoPiatto = "Pizza";
    boolean trovatoPiatto = false;
    for (int i = 0; i < piatti.length; i++) {
        if (piatti[i].equals(cercatoPiatto)) {
            trovatoPiatto = true;
            System.out.println(cercatoPiatto + " è in menù"
            + "," + " posizione " + i);
        }
    }
    }
}

