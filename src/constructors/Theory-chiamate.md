La teoria secondo il corso di ORACLE

1. Cos'è un costruttore - metodo speciale con lo stesso nome della classe, senza tipo di ritorno (nemmeno void), eseguito automaticamente da new.

2. Costruttore di default - se non ne scrivo nessuno, il compilatore ne aggiunge uno vuoto senza argomenti. Appena ne scrivo uno, quello di defaut sparisce. 

3. Costruttore con parametri - inizializzare i campi dai valori passati.

4. La parola chiave this - distingue il campo dal parametro quando hanno lo stesso nome (this.nome = nome) -> metti nel campo di questo oggetto (this.nome) il valore del parametro (nome). 

public Fornitore(String n, double a) {
    this.nome = n; // campo nome <- parametro n
    this.affidabilita = a; // campo affidabilita <- parametro a
}

5. Overloading di costruttori - più costruttori, liste di parametri diverse.

Cos'è: avere più costruttori nella stessa classe, tutti con lo stesso nome (il nome della classe), ma con liste di parametri diverse. Mi da più modi di creare lo stesso oggetto. 

Creo più costruttori con diversi parametri perché così se ho una sola variabile da inserire la posso inserire, altrimenti no. 

6. Concatenamento con this(...) - la delega o constructor chaining

Si usa per non ripetere la logica. Il costruttore completo contiene le assegnazioni e la validazione; quello corto non le ricopia, le riusa chiamando il completo. La regola di validazione sta in un posto solo -> se la cambio, la cambio una volta (DRY).

Quando scrivo new Fornitore("Metro"):
- parte il costruttore a 1 argomento
- la sua prima riga this(nome, 0) salta al costruttore a 2 argomenti con ("Metro", 0)
- quello valida e assegna i campi
- finito, torna la costruttore a 1 argomento, 


