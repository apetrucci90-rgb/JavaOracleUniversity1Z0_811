package ripassomirato;

public class OverrideOverload {
    public static void main(String[] args) {
        /*
        Animale a = new Cane();
        System.out.println(a.verso());
        System.out.println(a.verso(3));
        */
        Cane a = new Cane();
        System.out.println(a.verso());
        System.out.println(a.verso(3));
    }
}

class Animale {
    String verso() { return "..."; }
}

class Cane extends Animale {
    @Override
    public String verso() { return "Bau"; }

    String verso(int volte) {
        String risultato = "";
        for (int i = 0; i < volte; i++) risultato += "Bau ";
        return risultato;
    }
}
class Gatto extends Animale {
    @Override
    public String verso() { return "Miao"; }

    /*
    Un Miao per giro, il numero di giri lo dà il numero tra parentesi.
    i = il contatore. Conta i giri
    */
    String verso(int volte) {
        String risultato = "";
        for (int i = 0; i < volte; i++) risultato += "Miao";
        return risultato;
    }
}

/*
==============
Overload
==============
Stesso nome, firma diversa (cambia numero/tipo di parametri).
verso() e verso(int) sono due metodi diversi che per caso si chiamano
uguale. 
==============
Override
==============
la sottoclasse riscrive un metodo del padre con la stessa firma.
Cane.verso() riscrive Animale.verso()

Quando scrivo Animale a = new Cane(); ho 2 tipi: 
- a sx c'è Animale (il tipo dichiarato)
- a dx c'è Cane (l'oggetto vero)

Questo metodo esiste, posso chiamarlo? E risponde Animale
Quale versione del metodo viene eseguita? Risponde la destra

Nel codice sopra:
- a.verso(3) muore sulla domanda 1: Animale non ha verso(int) -> ERRORE
- a.verso() passa la domanda 1 e sulla domanda 2 vince la destra -> ESEGUE
    il Bau di cane
*/