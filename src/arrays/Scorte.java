package arrays;

public class Scorte {
    public static void main(String[] args) {
        int[] scorte = {12, 0, 5, 8};

        for (int i = 0; i < scorte.length; i++) {
            System.out.println("indice " + i + " -> " + scorte[i]);
        }

            /*
            int[] scorte = {12, 0, 5, 8}; dichiara + crea + riempie

            La dimensione è dedotta dai valori tra graffe (4). Quindi scorte.length
            vale 4, indici da 0 a 3.

            Il ciclo for ha tre parti:
            for (inizializzazione; condizione; aggiornamento)
            - int i = 0 -> eseguito una volta sola, all'inizio. Parto dall'indice 0.
            - i < scorte.length -> la condizione, CONTROLLATA prima di ogni giro.
            Se vera, entra nel corpo, se falsa il ciclo finisce.
            - i++ -> eseguito alla fine di ogni giro, dopo il corpo.

            Giro per giro (length = 4):

            ┌───────────┬─────┬─────────────┬────────────────────┬──────┐
            │ controllo │  i  │   i < 4?    │   corpo: stampa    │ poi  │
            │           │     │             │                    │ i++  │
            ├───────────┼─────┼─────────────┼────────────────────┼──────┤
            │ 1°        │ 0   │ sì          │ indice 0 -> 12     │ i→1  │
            │           │     │             │ (scorte[0])        │      │
            ├───────────┼─────┼─────────────┼────────────────────┼──────┤
            │ 2°        │ 1   │ sì          │ indice 1 -> 0      │ i→2  │
            │           │     │             │ (scorte[1])        │      │
            ├───────────┼─────┼─────────────┼────────────────────┼──────┤
            │ 3°        │ 2   │ sì          │ indice 2 -> 5      │ i→3  │
            │           │     │             │ (scorte[2])        │      │
            ├───────────┼─────┼─────────────┼────────────────────┼──────┤
            │ 4°        │ 3   │ sì          │ indice 3 -> 8      │ i→4  │
            │           │     │             │ (scorte[3])        │      │
            ├───────────┼─────┼─────────────┼────────────────────┼──────┤
            │ 5°        │ 4   │ no (4 < 4 è │ — esce dal ciclo   │ —    │
            │           │     │  falso)     │                    │      │
            └───────────┴─────┴─────────────┴────────────────────┴──────┘

            1. La condizione è < e non <=. L'ultimo indice valido è length - 1 = 3.
            Se avessi scritto i <= scorte.length, al 5° giro proverebbe scorte[4] 
            -> ArrayIndexOutOfBoundsException
            2. i serve a due cose insieme: è il CONTATORE del ciclo e l'indice con
            cui leggo la cella (scorte[i]). Il for classico è utile quando mi serve
            l'indice
            */

        int totale = 0;

            for (int i = 0; i < scorte.length; i++) {
                totale = totale + scorte[i];
                System.out.println("totale = " + totale);  
        }
        System.out.println("totale = " + totale);


        /*
        Consegna
        Trova il valore massimo e, insieme, la posizione (l'indice) in cui quel massimo
         si trova. Stampa tutti e due su una riga sola (formato a tua scelta, 
         es. massimo = ... indice = ...).
        */

        int max = scorte[0]; // 1
        int indiceMax = 0; // 2

        for (int i = 0; i < scorte.length; i++) { // 3
            if (scorte[i] > max) { // 4
                max = scorte[i]; // 5
                indiceMax = i; // 6
            }
        }
        System.out.println("massimo = " + max + " indice = " + indiceMax);

        int min = scorte[0];
        int indiceMin = 0;

        for (int i = 0; i < scorte.length; i++) {
            if (scorte[i] <= min) {
                min = scorte[i];
                indiceMin = i;
            }
        }
        System.out.println("minimo = " + min + " indice = " + indiceMin);

        /*
        Consegna
        Conta quanti articoli sono esauriti, cioè quante celle hanno valore uguale a 0, 
        e stampa il conteggio.
        */

        int esauriti = 0; // 1

        for (int i = 0; i < scorte.length; i++) { // 2
            if (scorte[i] == 0) { // 3
                esauriti = esauriti + 1; // 4
            }
        }
        System.out.println("esauriti = " + esauriti); // 5
        /*
        1. Il contatore; parte da 0 perchè all'inizio non ho ancora contato nulla. 
        È la differenza con massimo/minimo: lì il seme era un elemento reale (scorte[0])
        perchè cercavo un valore già nell'array; qui misuro quanto volte accade una
        cosa e all'inizio accade 0 volte.
        2. Il solito scorrimento di tutto l'array. Condizione i < scorte.length: deve
        passare su tutte le celle, da 0 a length - 1.
        3. La domanda a ogni giro: "la cella corrente vale 0?". scorte[i] (il valore
        di ogni cella); prende ogni i, quindi ogni valore nell'array-.
        4. Solo quando la riga 3 è vera dice: "prendi il valore attuale di esauriti,
        aggiungi 1, rimettilo dentro esauriti". Il contatore cresce di 1 per ogni 0
        trovato (va bene anche esauriti++)
        
        */
    }    
}
