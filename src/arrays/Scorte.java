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

        int max = scorte[0];

            for (int i = 0; i < scorte.length; i++) {
                if (scorte[i] > max) {
                    max = scorte[i];
            }
        }
        System.out.println("max = " + max);

        /*
        - int max = scorte[0];
            Parto assumendo che il massimo sia il primo elemento. Serve un punto
            di partenza reale: non posso partire da 0, perchè se l'array avesse 
            tutti valori negativi, 0 sarebbe sbagliato.
             
        */
    }    
}
