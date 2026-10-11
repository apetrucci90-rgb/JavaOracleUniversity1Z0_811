package stage;

public class IncassiRistorante {
    public static void main(String[] args) {
        /*
        CONSEGNA: analisi incassi del ristorante
        Sono il proprietario del locale e voglio analizzare gli incassi degli ultimi
        3 giorni. Ogni giorno ha esattamente 2 turni

        PASSI DA ESEGUIRE:
        1. Dichiara e inizializza una matrice 2D 'int[][] incassi' (3 righe per i giorni, 
        2 colonne per i turni). Inserisci numeri a tua scelta, ma assicurati 
        di inserire almeno uno '0' (un turno in cui il locale era chiuso).
         
        2. Calcola e stampa l'INCASSO TOTALE (la somma di tutta la matrice).
          
        3. Trova e stampa il RECORD D'INCASSO (il valore massimo assoluto 
            registrato in un singolo turno).
          
        4. Conta e stampa i TURNI A ZERO (quante celle hanno esattamente valore 0).
        */

        int[][] incassi = {
            {450, 900},
            {1000, 1250},
            {0, 1030}
        };
        int incassoTotale = 0;
        int turniChiusi = 0;
        int recordIncasso = 0;

        for (int giorno = 0; giorno < incassi.length; giorno++) {
            for (int turno = 0; turno < incassi[giorno].length; turno++) {


                // Si scrive una volta sola il tipo (incassoTotale)
                // 1.ESTRAZIONE: metto l'incasso di questa cella nella variabile inc...A...
                int incassoAttuale = incassi[giorno][turno];

                // 2. SOMMA: aggiungo questo valore alla cassaforte totale
                incassoTotale = incassoTotale + incassoAttuale;

                // 3. TURNI A ZERO: controllo se il locale era chiuso e aggiorno
                // il contatore
                if (incassoAttuale == 0) {
                    turniChiusi = turniChiusi + 1;
                }
                // 4. RECORD: controllo se l'incasso attuale è più alto del record
                // registrato sino ad ora
                if (incassoAttuale > recordIncasso) {
                    recordIncasso = incassoAttuale; // Sovrascrivo il record

                }
            }
        }
        System.out.println("Incasso totale: " + incassoTotale);
        System.out.println("Record d'incasso: " + recordIncasso);
        System.out.println("Turni a zero: " + turniChiusi);

        /*
        CONSEGNA: Per ogni singolo giorno, stampa 
        l’incasso di quel giorno (la somma dei suoi due
        turni), con l’etichetta del giorno. → qui 
        tieni fermo il giorno e scorri i 
        turni: ragioni “per riga”.
        Stabilisci quale turno rende di più nel 
        complesso: somma su tutti i giorni gli incassi 
        del turno 0 (es. pranzo) e, a parte, quelli del 
        turno 1 (es. cena), poi stampa quale dei due 
        vince. → qui tieni fermo il turno e scorri i 
        giorni: ragioni “per colonna”.
        */
       for (int giorno = 0; giorno < incassi.length; giorno++) {
        int incassoGiorno = 0;
        for (int turno = 0; turno < incassi[giorno].length;
            turno++) {
                incassoGiorno = incassoGiorno + incassi[giorno][turno];
            }
            System.out.println("Giorno " + giorno + ": " + incassoGiorno);        
       }

       int totTurno0 = 0;
       int totTurno1 = 0;

       for (int giorno = 0; giorno < incassi.length; giorno++) {
        totTurno0 = totTurno0 + incassi[giorno][0];
        totTurno1 = totTurno1 + incassi[giorno][1];
       }

       System.out.println("Turno 0: " + totTurno0);
       System.out.println("Turno 1: " + totTurno1);
       System.out.println(totTurno0 > totTurno1 ? " " +
       "Vince il turno 0" : "Vince il turno 1");
    }    
}
