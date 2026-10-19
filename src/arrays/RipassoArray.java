package arrays;

import java.util.ArrayList;
import java.util.Arrays;

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
       ----------------------------------------------------
       Un array creato con new NON è davvero vuoto: Java riempie ogni casella
       con il valore di default del tipo. Per int il default è 0 (per double 0.0,
       boolean false, oggetti null). 
       */
      System.out.println("vuoto[0] vale = " + vuoto[0]); // 0, non niente
      /*
      Se chiedi un indice che non esiste, il programma non compila male:
      esplode a RUNTIME con ArrayOutOfBoundException.
      numeri ha indici validi 0,1,2,3 -> l'indice 4 non esiste
      */
     /*
     TAPPA 4: I due modi di scorrere un array
     ----------------------------------------
     (A) for CLASSICO: usa un indice i che va da 0 a length - 1. Serve quando
     mi interessa la POSIZIONE o voglio MODIFICARE l'array
     */ 
    System.out.println("-- for classico (con indice) --");
    for (int i = 0; i < numeri.length; i++) {
        System.out.println("posizione " + i + " -> " + numeri[i]);
    }
    /*
    (B) for-each: scorre i VALORI uno ad uno, senza preoccuparmi dell'indice
    Più pulito quando mi serve solo leggere i valori
    */
    System.out.println("--- for-each (solo valori) --");
    for (int n : numeri) {
        System.out.println("valore = " + n);
    }
    /*
    TAPPA 5: La TRAPPOLA del for-each (è una copia)
    -----------------------------------------------
    Nel for-each la variabile del ciclo (qui n) è una COPIA del valore,
    non la casella dell'array. Se la modifico, l'array NON cambia.
    */
   for (int n : numeri) {
    n = n + 1000; // modifico la copia, inutilmente
   }
   System.out.println("dopo for-each, numeri[0] = " + numeri[0]); // ancora 10!
   // Per modificare DAVVERO l'array devo usare l'indice (for classico):
   for (int i = 0; i < numeri.length; i++) {
    numeri[i] = numeri[i]+ 1000; // scrivo nella casella vera
   }
   System.out.println("dopo for classico, numeri[0] = " + numeri[0]); // 1010

   /*
   TAPPA 6: Array Vs ArrayList (solo un assaggio)
   ----------------------------------------------
   L'array ha dimensione FISSA: decisa alla creazione, non cambia.
   ArrayList è ELASTICO: puoi aggiungere e togliere elementi.
   */

   ArrayList<Integer> lista = new ArrayList<>();
   lista.add(10);
   lista.add(20);
   lista.add(30);
   lista.remove(0); // tolgo il primo, restano 20, 30
   System.out.println("la lista ora è = " + lista); // [20, 30]
   System.out.println("quanti elementi = " + lista.size()); 
   // (qui si usa size(), NON length)

   /*
   TAPPA 7 (APPROFONDIMENTO) - L'array è un RIFERIMENTO, non i valori
   ------------------------------------------------------------------
   Questo spiega davvero la trappola della TAPPA 5. Quando scrivo
   int[] a = {1, 2, 3}; la variabile 'a' NON contiene i tre numeri.
   Contine un RIFERIMENTO: l'indirizzo du una zona du memoria (sullo
   "heap") dove stanno i tre numeri. 'a' è un bigliettino con scritto
   "i valori sono in quel cassetto là".
   Conseguenza n.1: se copi la variabile, copio il bigliettino, NON il 
   cassetto. Due variabili puntano allo STESSO array.
   */


   int[] a = {1, 2, 3};
   int[] b = a; // b riceve una copia del riferimento: stesso cassetto

   b[0] = 99;
   System.out.println("a[0] dopo aver cambiato b[0] = " + a[0]); //...e a [0] è 99!

   /*
   Perché nella tappa 5 il for-each NON cambiava l'array e qui invece sì?
   Tappa  5: 'n' era un int (tipo PRIMITIVO) -> copia del VALORE. Cambiare
   la copia non tocca la casella. Qui: 'b' è un int[] (tipo RIFERIMENTO)
    -> copia dell'INDIRIZZO. b e a guardano lo stesso cassetto, quindi
    b[0] == 99 si vede anche da a. Regola: assegnare un array NON lo duplica.
        Conseguenza n.2: per avere una copia INDIPENDENDTE devo duplicare il
    contenuto. Il modo pulito è Arrays.copyOf (dalla libreria java.util.Arrays).
   */

    int[] c = Arrays.copyOf(a, a.length); // c'è un cassetto NUOVO con gli stessi valori
    c[0] = -1;
    System.out.println("a[0] resta = " + a[0] + ", invece c[o] = " + c[0]); // a[0]=99, c[0]=-1

    // Ultimo tassello: stampare un array direttamente dà spazzatura
    System.out.println("stampa diretta: " + a);
    System.out.println("con Arrays.toString: " + Arrays.toString(a)); // [99, 2, 3]
    /*
    Perché? println su un array non sa stamparne il contenuto: stampa
    tipo+indirizzo ([I = "array di int", @...= codice nel riferimento]).
    Arrays.toString serve proprio a vedere i valori in chiaro: all'esame
    e nel debug lo userai sempre
    */

    /*
    CONSEGNA: Dichiara un array int[] prezzi con i valori 5, 10, 15. 
    Poi crea una seconda variabile copiaRiferimento assegnandole 
    direttamente prezzi (quindi puntano allo stesso array) e, attraverso 
    copiaRiferimento, cambia l'ultimo elemento mettendolo a 100. Dopodiché 
    crea una terza variabile copiaVera usando Arrays.copyOf per ottenere 
    una copia indipendente di prezzi, e attraverso copiaVera cambia il primo
     elemento mettendolo a 0. Infine stampa tutti e tre gli array usando 
     Arrays.toString, ciascuno con un'etichetta che dica quale stai 
     stampando.
    */

     int[] prezzi = {5, 10, 15};
     int[] copiaRiferimento = prezzi;

     copiaRiferimento[prezzi.length -1] = 100;

     int[] copiaVera = Arrays.copyOf(prezzi, prezzi.length);
     copiaVera[0] = 0;

     System.out.println("prezzi = " + Arrays.toString(prezzi));
     System.out.println("copiaRiferimento = " + Arrays.toString(copiaRiferimento));
     System.out.println("copiaVera = " + Arrays.toString(copiaVera));  
     
     /*
    CONSEGNA: Dichiara un array int[] punti con i valori 1, 2, 3. 
    Subito dopo (prima di qualsiasi modifica) crea backup come copia 
    indipendente di punti usando Arrays.copyOf. Poi crea alias 
    assegnandogli direttamente punti, così puntano allo stesso cassetto.
    A questo punto fai tre modifiche, in quest'ordine: metti punti[0]
    a 50; metti alias[1] a 60; metti backup[2] a 70. Infine stampa 
    tutti e tre gli array con Arrays.toString, ognuno con la sua 
    etichetta.
     */

    int[] punti = {1, 2, 3};
    int[] copiaVera1 = Arrays.copyOf(punti, punti.length);

    int[] copiaAlias = punti;

    punti[0] = 50;      // modifica 1: punti e copiaAlias sono lo STESSO cassetto
    copiaAlias[1] = 60; // modifica 2: anche questa finisce nel cassetto condiviso
    copiaVera1[2] = 70; // modifica 3: copiaVera1 è INDIPENDENTE, resta solo sua

    // Previsione: punti e copiaAlias stampano UGUALI, perché condividono il
    // cassetto -> [50, 60, 3]. copiaVera1 è una copia fatta PRIMA delle
    // modifiche, quindi parte da {1,2,3} e riceve solo il suo 70 -> [1, 2, 70].
    System.out.println("punti = " + Arrays.toString(punti));
    System.out.println("alias (copiaAlias)  = " + Arrays.toString(copiaAlias));
    System.out.println("backup (copiaVera1) = " + Arrays.toString(copiaVera1));


    /* 
    CONSEGNA:  Dichiara int[] temperature con i valori 20, 20, 20. 
    Per prima cosa cambia temperature[0] mettendolo a 99. Poi (solo 
    adesso, dopo questa modifica) crea fotografia come copia indipendente
     di temperature con Arrays.copyOf. Poi crea gemello assegnandogli 
     direttamente temperature (stesso cassetto). Infine cambia 
     temperature[1] mettendolo a 50. Alla fine stampa i tre array 
     (temperature, gemello, fotografia) con Arrays.toString ed etichetta.
    */

     int[] temperature = {20, 20, 20};
     temperature[0] = 99;

     int[] fotografia = Arrays.copyOf(temperature, temperature.length);

     int[] gemello = temperature;
     temperature[1] = 50;

     System.out.println("temperature  = " + Arrays.toString(temperature));
     System.out.println("fotografia = " + Arrays.toString(fotografia)); 
     System.out.println("gemello = " + Arrays.toString(gemello));

     /*
     1. Arrays.toString(array) -> è il modo rapido per vedere tutti i valori di
     un array monodimensionale in una riga: [99, 20, 20]. Serve l'import
     java.util.Arrays.
     2. Stampare l'array nudo (println(array)) -> no: dà [I@8bcc55f (tipo + codice
     del riferimento), non i valori. È l'errore di prima.
     3. Un ciclo (for-each, for) che stampa elemento per elemento -> funziona
     uguale, è nella tappa 4. Lo uso quando voglio un formato mio
     */
     
     /*
     TRAPPOLA 1 - array a due dimensioni (int[][])

     Un array 2D in Java non è una griglia: è un array di un array.
     int[][] m = è un array i cui elementi sono a loro volta int[],
     cioè dei riferimenti
     */

     int[][] m = {{1, 2}, {3, 4}};
     System.out.println(Arrays.toString(m)); // [[I@1b6d, [I@4554]  <- spazzatura!

     System.out.println(Arrays.deepToString(m)); // [[1, 2], [3, 4]]    <- giusto

     /*
     TRAPPOLA 1
     */
    }
}
