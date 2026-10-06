package operators;

public class ContatorePosti {
    public static void main(String[] args) {
        int posti = 4;
        int occupati = posti++;
        int liberi = ++posti;

        /*
        1 - int occupati: il ++ sta dopo: prima prende il valore attuale
        di posti (4), e lo mette in occupati. Poi posti sale a 5.
        2 - int liberi: il ++ sta prima: prima alza posti, che da 5 
        diventa 6, poi mette questo valore in liberi.
        */

        System.out.println(occupati);
        System.out.println(liberi);
        System.out.println(posti);

        /*
        Con x++/x-- prima si copia il vecchio valore, poi si cambia x, poi si cambia x.
        Con ++x/--x prima si cambia x, poi si copia. Il +/- 1 avviene sempre; cambia 
        solo quando
        */

        int clienti = 10;
        int serviti = clienti--;
        int inCoda = --clienti;

        System.out.println(serviti);
        System.out.println(inCoda);
        System.out.println(clienti);

        /*
        Ogni ++/-- fa due cose:
            1) cambia la variabile di +/- 1
            2) produce un valore da usare nell'espressione (la copia che finisce in
            serviti/inCoda). La posizione del simbolo decide l'ordine di A e B.

        - clienti--;     : l'ordine è B poi A. Prima consegna il valore attuale (10)
        all'espressione, dopo abbassa clienti. Perciò serviti riceve il vecchio 10,
        mentre clienti è già 9.
        - --clienti;    : l'ordine è A poi B. Prima abbassa clienti (da 9 a 8), poi
        consegna il valore nuovo. Perciò inCoda riceve 8.
        */

        int pizze = 7;
        int inForno = pizze++;
        int pronte = --pizze;

        System.out.println(inForno);
        System.out.println(pronte);
        System.out.println(pizze);

        int a = 5; 
        int b = 2;
        int risultato = a++ + ++b;
        
        /*
        a++ consegna il valore vecchio di a, 5. Subito dopo a diventa 6.
        
        b++ alza PRIMA b, da 2 a 3; poi consegna il nuovo valore, cioè 3.
        
        La somma è quindi 5 + 3 = 8 e finisce in risultato
        
        risultato = 8 -> la somma dei valori consegnati, non di quelli finali
        
        a = 6 -> è stato incrementato DOPO aver consegnato il 5
        b = 3 -> era GIA' salito a 3 prima di consegnare

        risultato NON è a + b dei valori finali che altrimenti sarebbe 6 + 3 = 9;
        E' la somma di ciò che i due operatori hanno consegnato in quell'istante.
        */

        System.out.println(risultato);
        System.out.println(a);
        System.out.println(b);

        int x = 3; 
        int y = 10;
        int z = y-- - --x; // Java esegue prima y--, poi --x, poi il -

        /* 
        ===========================================================================
        COSA FA JAVA?
        ===========================================================================
        1. VALUTA L'OPERANDO SINISTRO y--
            - Mette da parte il valore attuale di y -> 10 (questo è ciò che y vale)
            - Abbassa y di 1 -> y diventa 9
            - Stato: x=3; y=9; Valore tenuto a sinistra = 10
        2. VALUTA L'OPERANDO DESTRO --x
            - Abbassa x di 1 -> x diventa 2
            - Il valore di --x è il nuovo -> 2
            - Stato: x=2; y=9; Valore tenuto a destra = 2
        3. APPLICA LA SOTTRAZIONE - tra i due valori tenuti: 10 - 2 -> 8
        4. ASSEGNA a z: z = 8
            - Stato finale: z=8, x=2, y=9

        I tre fatti chiave sull'ordine: 
            - Java valuta PRIMA TUTTA LA PARTE DESTRA di =, poi assegna a z (passo 4)
            - Dentro la parte destra, va DA SINISTRA A DESTRA: prima y--, poi --x
            - Ogni ++/-- fa SUBITO il suo +/- 1 sulla variabile (passi 1 e 2);
            il valore "tenuto" per la somma è una fotografia scattata in quel momento;
            VECCHIA PER IL POST, NUOVA PER IL PRE.
        */

        System.out.println(z);
        System.out.println(x);
        System.out.println(y);



    }
}
