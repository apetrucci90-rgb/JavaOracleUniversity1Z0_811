package methods;

public class RipassoMetodi2 {
    public static void main(String[] args) { 

        int[] primo = {8, 3, 12, 0, 5};
        int[] secondo = {1, 1, 9, 2};

        System.out.println("sotto soglia (soglia 2): " + 
            quantiSottoSoglia(primo, 2));
        System.out.println("sotto soglia (soglia 5): " +
            quantiSottoSoglia(secondo, 5));

        System.out.println("primo contiene 12? " + 
            contiene(primo, 12));
        System.out.println("primo contiene 7? " + 
            contiene(primo, 7));

        System.out.println("massimo di primo = " +
            massimo(primo));
        System.out.println("massimo di secondo = " + 
            massimo(secondo));

        System.out.println("media del primo = " + 
            media(primo));
        System.out.println("media del secondo = " +
            media(secondo));

        riepilogo(primo);
        riepilogo(secondo);
    } 
    // CONSEGNA [Claude]: DOMANDA (int) - conta quanti elementi dell'array sono < soglia.
    static int quantiSottoSoglia(int[] valori, int soglia) {
        int quante = 0;
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] < soglia) {
                quante++;
            }
        }
        return quante;

    }
    // CONSEGNA [Claude]: DOMANDA (boolean) - true se l'array contiene il valore cercato.
    static boolean contiene(int[] valori, int cercato) {
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] == cercato) {
                return true; 
        }
    }
    return false;
    }
    // CONSEGNA [Claude]: DOMANDA (int) - ridà il valore più grande dell'array.
    static int massimo(int[] valori) {
        int max = valori[0];
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] > max) {
                max = valori[i];
            }
        }
        return max;
    }
    // CONSEGNA [Claude]: DOMANDA (double) - ridà la media (cast a double per non troncare).
    static double media(int[] valori) {
        int somma = 0;
        for (int i = 0; i < valori.length; i++) {
            somma += valori[i];
        }
        return (double) somma / valori.length;
    }
    /*
    void vuol dire letteralmente "vuoto / niente": il metodo, finito
    il suo lavoro, non mi mette niente in mano.
    Due tipi di metodo, due comportamenti:
        1) COMANDO (void) -> fa un'azione e basta. "Accendi la luce!"
        2) DOMANDA (tipo di ritorno) ->  consegna una risposta. "Quanto
        fa 3 + 4?". Mi mette in mano il 7 che posso riusare. 
        
    Posso scrivere qualcosa = metodo(...) e tenere il risultato?
    -- Sì, il metodo ha un tipo di ritorno
    -- No, fa solo un'azione (stampare e modificare) -> void

    Metodo con return -> prima di chiudersi, spinge fuori UN valore verso
    chi l'ha chiamaato, e quel valore prende il posto della chiamata.
        int r = quadrato(4); il 16 viaggia indietro e finisce in r 
            (mi è tornato qualcosa in mano);
    
    Metodo void ->  si chiude e non spinge fuori niente. Il controllo
    torna al chiamante, ma nessun valore lo accompagna.
        stampaDoppio(5); ha stampato, poi si chiude a mani vuote.

    
    */
    static void riepilogo(int[] valori) {
        System.out.println("massimo = " + massimo(valori));

        System.out.println("media = " + media(valori));
        System.out.println("contiene lo 0? " + contiene(valori, 0));
    }
}
    

