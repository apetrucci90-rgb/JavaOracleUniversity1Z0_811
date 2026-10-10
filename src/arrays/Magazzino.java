package arrays;

public class Magazzino {
    public static void main(String[] args) {
        /*
        CONSEGNA 1.
        Sono il responsabile magazzino del ristorante. Ho una cella frigorifera 
        composta da 3 scaffali. Ogni scaffale contiene 4 cassette di ingredienti.
        L'array 'giacenze' mappa fisicamente il frigo: le righe sono gli scaffali,
        le colonne sono le cassette. 
        ESEGUI l'inventario. Scorri tutte le postazioni, somma la quantità contenuta
        in ogni singola cassetta e stampa il conteggio finale
        */

        // Matrice: 3 righe (scaffali) x 4 colonne (cassette)
        int[][] giacenze = {
            {10, 5, 12, 0}, // Scaffale 0
            {8, 15, 2, 6}, // Scaffale 1
            {0, 20, 11, 4} // Scaffale 2
        };
        int totaleIngredienti = 0;
        int cassetteVuote = 0;

        // 1. Ciclo interno: scorre gli scaffali dall'alto in basso (le righe)
        for (int riga = 0; riga < giacenze.length; riga++) {

            // 2. Ciclo interno: scorre le cassette dello scaffale corrente, da 
            // sinistra a destra (le colonne)
            for (int col = 0; col < giacenze[riga].length; col++) {

                // Estraggo il valore della singola cassetta usando le due coordinate
                int valoreCassetta = giacenze[riga][col];

                // Lo aggiungo al totale
                totaleIngredienti = totaleIngredienti + valoreCassetta;

                if (valoreCassetta == 0) {
                    cassetteVuote++;
                }
                // Stampa di servizio per mostrarti come si muovono i due indici
                // Le " " aperte prima di andare a capo servono da glue col + a capo
                System.out.println("Scaffale " + riga + ", Cassetta " + col + " "
                + "-> trovati " + valoreCassetta + " pezzi.");            
            }
        }
        System.out.println("\nTotale ingredienti: " + totaleIngredienti);
        System.out.println("Cassette vuote: " + cassetteVuote); 

        /*
        CONSEGNA 2: trovare la cassetta più piena.
        Inizializzo una variabile per il massimo usando la prima cella (giacenze[][]).
        Scorro tutta la matrice nuovamente con un doppio ciclo for annidato.
        Se la cella anlizzata contiene un numero maggiore del massimo attuale,
            lo aggiorno.
        Al termine dei cicli, stampo a schermo il record trovato.
        */

        int cassettaPiuPiena = giacenze[0][0];

        for (int riga = 0; riga < giacenze.length; riga++) {
            for (int col = 0; col < giacenze[riga].length; col++) {

                // Estraggo fisicamente il contenuto della cassetta
                int valoreCassetta = giacenze [riga][col];

                // Controllo se il contenuto batte il record attuale
                if (valoreCassetta > cassettaPiuPiena) {

                    // Se lo batte, sovrascrivo la variabile record
                    cassettaPiuPiena = valoreCassetta;
                }
            }
        }
        // Solo alla fine di tutti i giri, quando la griglia è finita, stampo il 
        // "vincitore assoluto":

        System.out.println("La cassetta più piena contiene: " + cassettaPiuPiena + 
        " pezzi.");

        /*
        CONSEGNA 3. Totale di un singolo scaffale
        Calcolo la somma degli ingredienti solo nella riga 1
        */
       int totaleScaffaleUno = 0;

       for (int col = 0; col < giacenze[1].length; col++) {
        int valoreCassetta = giacenze[1][col];

        totaleScaffaleUno = totaleScaffaleUno + valoreCassetta;
       } 


       System.out.println("Ingredienti nello Scaffale 1: " + totaleScaffaleUno);
    } 
}
