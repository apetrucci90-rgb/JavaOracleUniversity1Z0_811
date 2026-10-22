package gettersetter;

/*
Una classe Cuoco (il modello) + un main che la collauda, più una Brigata 
alla fine. Le "salse" che infileremo, una per volta:

1. Setter con validazione (setValutazione 0–10)
2. Setter che normalizza (setNome con trim)
3. Getter calcolato (getStipendioAnnuo, nessun campo dietro)
4. Sola lettura (matricola: solo getter)
5. Boolean derivato (isSenior)
6. Array: copia difensiva (getSpecialita) + azione (aggiungiSpecialita)
7. Metodo d'azione (promuovi: un verbo, più campi)
8. Costruttore che riusa i setter (DRY)
9. static: contatore numeroCuochi + getter statico
10. toString() override
11. Overloading: due costruttori con this(...)
12. Ternario + arrotondamento (getLivello, getStipendioAnnuo)
13. for-each sulle specialità
14. Sfida: composizione — Brigata con array di Cuoco

Il filo: accessore (porta su un campo) ≠ metodo d'azione (verbo, una regola)
 ≠ toString (rappresenta l'oggetto) ≠ static (roba della classe).
*/
public class Esercizi1 {
    public static void main(String[] args) {
        /*
        Il main è il punto di partenza: qui dentro scrivo solo istruzioni
        che si eseguono - creare oggetti (new Cuoco(...)), chiamare metodi,
        stampare. È il banco di prova. 
        Tutto il resto - campi e metodi - lo definisco fuori dal main.
        */

        Cuoco c = new Cuoco();
        c.setNome("Andrea");
        System.out.println(c.getNome());

        c.setValutazione(8); 
        System.out.println("Valutazione: " + c.getValutazione());
        c.setValutazione(15);
        System.out.println("Valutazione: " + c.getValutazione());
    }
}

class Cuoco {
    /*
    Cuoco è lo stampo con cui posso creare altri profili di cuochi tutti
    uguali.

    private String nome blocca solo l'accesso diretto dall'esterno della 
    classe. Cioè da main, che sta fuori da Cuoco, questo è vietato:
    c.nome = "Mario"; // ERRORE

    Ma dentro la classe Cuoco il campo è pienamente accessibile. E il
    setter sta dentro cuoco:
    public void setNome(Strign nome) { this.nome = nome; }
    */
    private String nome; // campo
    private int valutazione; 
    
    public String getNome() { return nome; } // il metodo
    public void setNome(String nome) {  this.nome = nome; }
    public void setValutazione(int valutazione) {
        if (valutazione >= 0 && valutazione <= 10) {
            this.valutazione = valutazione;
        } else {
            System.out.println("Valutazione " + valutazione +
                " fuori range 0-10: rifiutata");    
        }
    }
    public int getValutazione() { return valutazione;}
}
