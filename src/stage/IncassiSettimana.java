package stage;
/* 
Esercizio di ripasso, package stage. Un ristorante registra l'incasso di 
ogni giorno della settimana. Partendo dall'array int[] incassi = {320, 540, 
610, 480, 290, 820, 700}, scrivi un programma che, usando una sola passata 
con un ciclo for-each, svolga le operazioni descritte qui sotto nell'ordine 
indicato.

Per prima cosa stampa ogni incasso su una riga separata. Durante lo stesso 
ciclo accumula l'incasso totale della settimana, conta quanti giorni hanno 
incassato più di 500 (soglia esclusa) e individua l'incasso massimo, 
inizializzando la variabile campione con il primo elemento incassi[0] e non 
con 0. Tutte le variabili d'appoggio (totale, giorniSopra, massimo) vanno 
dichiarate e inizializzate prima del ciclo.

Al termine del ciclo stampa il totale nel formato "totale = valore", il 
numero di giorni sopra la soglia nel formato "giorni sopra 500 = valore" e 
il massimo nel formato "massimo = valore". Calcola infine la media 
giornaliera dividendo il totale per il numero di giorni e stampala nel 
formato "media = valore": forza il cast a double prima della divisione, 
così che la media conservi i decimali, perché senza cast otterresti un 
risultato intero sbagliato.

Non usare metodi di libreria né cicli o if che accedono all'array per 
indice: solo array, for-each, accumulo, contatore condizionale, confronto
e cast a double.
*/
public class IncassiSettimana {
    public static void main(String[] args)  {
        int[] incassi = {320, 540, 610, 480, 290, 820, 700};
        int totale = 0;
        int giorniSopra = 0;
        int massimo = incassi[0];

        for (int incasso : incassi) {
            System.out.println(incasso);
            totale = totale + incasso;
            if (incasso > 500) {
                giorniSopra++;
            }
            if (incasso > massimo) {
                massimo = incasso;
            }
        }

        System.out.println("totale = " + totale);
        System.out.println("giorni sopra 500 = " + giorniSopra);
        System.out.println("massimo = " + massimo);

        double media = (double) totale / incassi.length;
        System.out.println("media = " + media);
    }
    /*
    Il ristorante ha anche i costi sostenuti ogni giorno della stessa 
    settimana, nell'array int[] costi = {150, 200, 260, 180, 130, 300, 250}.
    Con un unico ciclo for-each che scorre costi, stampa ogni costo su una 
    riga, accumula il costo totale della settimana e conta quanti giorni
    hanno avuto un costo inferiore a 200 (soglia esclusa). Dopo il ciclo
    stampa il costo totale nel formato "costi totali = valore" e il
    numero di giorni economici nel formato "giorni sotto 200 = valore". 
    Infine, usando le due variabili totale già calcolate (incassi e 
    costi), calcola e stampa il guadagno netto della settimana nel 
    formato "guadagno = valore", dove il guadagno è la differenza 
    fra l'incasso totale e il costo totale.
    */ 
}
