package stage;

/*
CONSEGNA — Drill getter/setter + incapsulamento.

A cosa serve: stiamo costruendo la SCHEDA (CV) di un cuoco. Ogni campo e'
una voce del CV (nome, anni di esperienza, stipendio, disponibilita',
categoria, matricola, valutazione, coperti gestiti, se e' capopartita,
specialita'). Getter e setter sono il modo CONTROLLATO con cui il resto
del programma legge e compila questo CV: un domani un setter potra'
rifiutare una valutazione fuori scala o uno stipendio negativo, senza
che chi usa la scheda debba saperlo.

Obiettivo didattico: rendere automatica la forma dei metodi di accesso e
capire perche' si usano (incapsulamento = dati chiusi, accesso controllato).

Compito:
1. Dichiara 10 campi di tipi diversi (String, int, double, boolean,
   char, long...), tutti PRIVATE: dal di fuori non devono essere
   raggiungibili direttamente (niente gs.nome da un'altra classe).
2. Per OGNI campo scrivi un GETTER e un SETTER, tutti PUBLIC:
   - getter: TIPO getCampo() { return campo; }   (nessun parametro)
   - setter: void setCampo(TIPO campo) { this.campo = campo; }
3. Convenzioni:
   - nome metodo = get/set + Campo con l'iniziale maiuscola (camelCase);
   - per i boolean il getter e' isCampo(), ma il setter resta setCampo();
   - nel setter usa sempre this.campo per distinguere il campo dal
     parametro omonimo (senza this e' shadowing: il campo non cambia).

Perche' funziona: campo private + metodo public = incapsulamento. L'unica
porta per leggere/scrivere il dato sono i metodi, dove puoi validare e
trasformare. Si puo' cambiare come il dato e' memorizzato senza rompere
chi usa la classe.
*/

public class GetterSetter {

    /*
    BLOCCO 1 - I campi private

    1. COSA SONO
    Questi campi sono lo stato dell'oggetto: i dati che un GetterSetter 
    porta con sè. Ogni oggetto ha la sua copia: la scheda di Mario e quella
    di Luigi hanno nome e stipendio indipendenti. In OOP un oggetto = stato
    (i campi) + comportamento (i metodi).

    2. IL PROBLEMA SE I CAMPI FOSSERO PUBBLICI (NO INCAPSULAMENTO)
    Se scrivessi public double stipendio;, da qualunque parte del programma 
    chiunque potrebbe fare:
    cuoco.stipendio = - 5000;
    cuoco.valutazione = 999;
    Quindi non ci sarebbe alcun controllo sul valore ed il dato può quindi
    essere messo in uno stato icoerente; se un domani cambiassi idea su
    come memorizzare lo stipendio (tipo in centesimi), o di calcolarlo,
    tutto il codice che toccava cuoco.stipendio si rompe.

    3. LA SOLUZIONE: private + porte public
    private nasconde il campo: da fuori non esiste. Il solo modo per 
    leggerlo/scriverlo diventano i metodi public (getter/setter). Questo è
    l'INCAPSULAMENTO (information hiding): separo cosa fa la classe 
    (interfaccia pubblica) da come lo fa dentro (i campi privati).
    Dentro la classe sono libero di cambiare tutto; fuori nessuno se ne
    accorge.

    4. IN CHE MODO MI SERVE DAVVERO - CASI CONCRETI 
    - VALIDAZIONE: il setter rifiuta/corregge valori.
    - PROPRIETA' CALCOLATA: un getter può calcolare invece che leggere, 
        senza che esista un campo
    - SOLA LETTURA / SOLA SCRITTURA: metto solo il getter o il setter
    - TRASFORMAZIONE: getPrezzo() che arrotonda; un getter che 
        restituisce una copia per non far modificare la lista interna.
    - UN UNICO PUNTO DI CONTROLLO: logging, notifiche, ricalcoli - li
        metto nel setter e valgono per tutto il programma.

    */
    private String nome;
    private int anniEsperienza;
    private double stipendio;
    private boolean disponibile;
    private char categoria;
    private long matricola;
    private double valutazione;
    private int numeroCoperti;
    private boolean capoPartita;
    private String specialita;

    // GETTER
    public String getNome() { return nome; }
    public int getAnniEsperienza() { return anniEsperienza; }
    public double getStipendio() { return stipendio; }
    public boolean isDisponibile() { return disponibile; } // si usa is per boolean
    public char getCategoria() { return categoria; }
    public long getMatricola() { return matricola; }
    public double getValutazione() { return valutazione; }
    public int getNumeroCoperti() { return numeroCoperti; }
    public boolean isCapoPartita() { return capoPartita; } // si usa is per boolean
    public String getSpecialita() { return specialita; }

    // SETTER
    public void setNome(String nome) { this.nome = nome; }
    public void setAnniEsperienza(int anniEsperienza) { this.anniEsperienza = anniEsperienza; }
    public void setStipendio(double stipendio) { this.stipendio = stipendio; }
    public void setDisponibile(boolean disponibile) { this.disponibile = disponibile; }
    public void setCategoria(char categoria) { this.categoria = categoria; }
    public void setMatricola(long matricola) { this.matricola = matricola; }
    public void setValutazione(double valutazione) { this.valutazione = valutazione; }
    public void setNumeroCoperti(int numeroCoperti) { this.numeroCoperti = numeroCoperti; }
    public void setCapoPartita(boolean capoPartita) { this.capoPartita = capoPartita; }
    public void setSpecialita(String specialita) { this.specialita = specialita; }



}
