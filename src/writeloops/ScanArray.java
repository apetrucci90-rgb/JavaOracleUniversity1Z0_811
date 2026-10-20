package writeloops;

public class ScanArray {
    public static void main(String[] args) {
        /*
        Dato un array di numeri interi già scritto nel 
        codice, scorrilo con un loop e, per ogni elemento:
        - se è negativo, saltalo (non stamparlo, passa al prossimo);
        - se è zero, ferma del tutto il loop;
        - altrimenti, stampalo.
        */
       int[] numbers = {1, 5, 25, -4, 56, -12, 0, 7, 4, 68};
       for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] < 0) {
            continue;
        }
        if (numbers[i] == 0) {
            break;
        }
        System.out.println(numbers[i]);
       }
       /*
       Con i due array a e b, trova e stampa la prima 
       coppia (un elemento di a + uno di b) che somma 
       10, poi ferma subito la ricerca. Usa due for 
       annidati e una label con break per uscire da 
       entrambi i loop insieme.
       */

       int[] a = {1, 3, 4, 8, 12, 24};
       int[] b = {2, 7, 11, 13, 23, 57};

       cerca:
       for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b.length; j++) {
            if (a[i] + b[j] == 10) {
                System.out.println(a[i] + "," + b[j]);
                break cerca;
            }    
        }
       }
       
       /*
       ESERCIZIO
       continue, contatore, break per soglia)
       Scorri gli 8 incassi; salta gli storni (negativi) 
       senza contarli; conta ogni giornata reale; alla 
       prima giornata ≥ 250 dichiara il record con la 
       sua posizione e fermati; infine stampa quante 
       giornate reali hai esaminato.
       */
       int[] incassi = {120, 45, -30, 80, 260, -10, 300, 95};
       int soglia = 250;
       int giornateReali = 0;

       for (int i = 0; i < incassi.length; i++) {
        // storno contabile: salto, non lo conto
        if (incassi[i] < 0) {
            continue;
        }
        // è una giornata reale, la devo contare
        giornateReali++;

        // prima giornata record trovata:  dichiaro e 
        // fermo tutto
        if (incassi[i] >= soglia) {
            System.out.println("Giornata record alla posizione " + 
            i + " (incasso " + incassi[i] + ")");
            // mi basta il primo che va bene e sopra 250
            break;
        }
       }
       System.out.println("Giornate reali esaminate: " + 
       giornateReali);

       /*
       Cerco il max ed il min di incassi
       */

       int max = incassi[0];
       int indiceMax = 0;

       for (int i = 0; i < incassi.length; i++) {
        if(incassi[i] > max) {
            max = incassi[i];
            indiceMax = i;
        }
       }

       System.out.println("massimo: " + max + " " +
            "posizione: " + indiceMax);
        int min = incassi[0];
        int indiceMin = 0;

        for(int i = 0; i < incassi.length; i++) {
            if (incassi[i] < min) {
                min = incassi[i];
                indiceMin = i;
            }
        }
        System.out.println("minimo: " + min + " " +
            "posizione: " + indiceMin);

        /*
        ESERCIZIO
        Fai un piccolo bilancio sugli stessi 8 incassi 
        di prima. 
        Una giornata conta come reale solo se il suo 
        incasso non è negativo: gli storni (i valori 
        sotto zero) vanno ignorati, esattamente come li 
        saltavi nell’esercizio precedente. 
        Scorrendo l’array una volta sola, somma gli 
        incassi di tutte le giornate reali e, nello 
        stesso giro, tieni il conto di quante sono. 
        Quando il ciclo è finito, calcola la media 
        dividendo quel totale per il numero di giornate 
        reali (facendo attenzione a non perdere i decimali) 
        e calcola la forbice, cioè la distanza tra l’incasso 
        più alto e quello più basso che hai già trovato poco 
        sopra. 
        Alla fine stampi quattro righe: il totale, il numero 
        di giornate reali, la media e la forbice.
        */

        int totIncassiReali = 0;
        int totGiornate = 0;

        for (int i = 0; i < incassi.length; i++) {
            if (incassi[i] < 0) {
                continue;
            }
            totIncassiReali = totIncassiReali + incassi[i];
            totGiornate++;
        }

        double mediaGiornaliera = totIncassiReali / (double) totGiornate;
        int forbice = max - min;

        System.out.println("Totale incassi reali: " + totIncassiReali);
        System.out.println("Totale giornate: " + totGiornate);
        System.out.println("Media per giornata reale: " + mediaGiornaliera);
        System.out.println("Forbice (max - min): " + forbice);
    }
}




