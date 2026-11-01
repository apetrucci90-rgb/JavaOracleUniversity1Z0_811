package stage;

public class RipassoModulo5 {
    public static void main(String[] args) {

        // =============================================================
        // INGREDIENTE
        Ingrediente i1 = new Ingrediente("Farina 00: ", 3.85);
        Ingrediente i2 = new Ingrediente("Zafferano");

        i2.setPrezzoAlKg(-50);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println("Ingredienti totali: " + Ingrediente.quantiIngredienti());

        // ==============================================================
        // VINO
        Vino v1 = new Vino("Merlot 1624", 16.5);
        Vino v2 = new Vino("Cabernet");

        v2.setGradi(100);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println("Vini totali: " + Vino.quantiVini());

        // ===============================================================
        // CLIENTE
        Cliente c1 = new Cliente("Petrucci", 7);
        Cliente c2 = new Cliente("Trevisan");

        c2.setTavolo(-18);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Tavoli totali: " + Cliente.totaleTavoli());

        // ===============================================================
        // DIPENDENTE
        Dipendente d1 = new Dipendente("Petrucci", 15_000);
        Dipendente d2 = new Dipendente("Trevisan");

        d2.setStipendio(100);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println("Dipendenti totali: " + Dipendente.totaleDipendenti());
        
        // ===============================================================
        // PORTATA
        Portata p1 = new Portata("Risotto ai funghi", 600);
        Portata p2 = new Portata("Filetto");

        p2.setCalorie(-200);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Portate totali: " + Portata.totalePortate());

        // ===============================================================
        // FORNITORE
        Fornitore f1 = new Fornitore("Carni BIO", 9);
        Fornitore f2 = new Fornitore("Pesce Vero");
        Fornitore f3 = new Fornitore("Pasta", 11);
        Fornitore f4 = new Fornitore("Aurelio", 7);
        
        f4.setAffidabilita(-15);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println("Fornitori totali: " + Fornitore.totaleFornitori());

        // ===============================================================
        // PRODOTTO
        Prodotto pr1 = new Prodotto("Penne lisce", 15);
        Prodotto pr2 = new Prodotto("Sale");
        Prodotto pr3 = new Prodotto("Salsiccia", 38);

        pr1.setScorta(30);

        System.out.println(pr1);
        System.out.println(pr2);
        System.out.println(pr3);
        System.out.println("Totale prodotti: " + Prodotto.totaleProdotti());
        // ===============================================================
        // MENU
        Menu m1 = new Menu("Degustazione", 25.50);
        Menu m2 = new Menu("Pranzo");
        Menu m3 = new Menu(3.85);
        Menu m4 = new Menu(0);

        m4.setCoperto(5.65);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println("Totale coperti: " + Menu.totaleCoperti());

        // ================================================================
        // PRENOTAZIONE

        Prenotazione book1 = new Prenotazione("Petrucci", "AB12");
        Prenotazione book2 = new Prenotazione("Trevisan");
        Prenotazione book3 = new Prenotazione("Meda", "AB1");
        Prenotazione book4 = new Prenotazione("Trentin");

        book4.setCodice("AB15");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println("Totale prenotazioni: " + Prenotazione.totalePrenotazioni());

        // ================================================================
        // SCONTRINO

        Scontrino s1 = new Scontrino("Fattura f1", 22.5);
        Scontrino s2 = new Scontrino("Fattura f2");
        Scontrino s3 = new Scontrino("Fattura f3", -15);
        Scontrino s4 = new Scontrino("Fattura f4", 35);

        s4.setSconto(18.9);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("Totale scontrini: " + Scontrino.totaleScontrini());


    }    
}

class Ingrediente {
    /*
    1) I CAMPI
    nome e prezzo sono i dati che ogni ingrediente porta con sè. Ogni volta
    che faccio new Ingrediente(...) nasce un oggetto con il suo nome e il
    suo prezzoAlKg: due ingredienti diversi hanno valori diversi,
    indipendenti.
    private è il cuore dell'incapsulamento: nessuno da fuori può falsificare
    i campi come nome e prezzo. Al di fuori della classe non si vedono. 
    Per toccarli devo passare dai metodi che ho deciso di aprire (getter/setter).
    È questo che permette alla classe di difendere i suoi dati.
    
    2) IL CAMPO static
    private static int totale;
    I due campi sono uno per oggetto; totale è uno per tutta la classe,
    condiviso da tutti gli Ingrediente. Appartiene alla classe Ingrediente.
    Serve da contatore: lo uso per sapere quanti Ingrediente sono stati
    creati. È un'informazione della classe.
    
    3) I DUE COSTRUTTORI (overloading + this(...))
    Ingrediente(String nome, double prezzoAlKg) { // costruttore completo
        this.nome = nome;
        setPrezzoAlKg(prezzoAlKg);
        totale++;
    }
    Ingrediente(String nome) { // costruttore ridotto
        this(nome, 1.0);
    }
    DUE COSTRUTTORI, con lo stesso nome ma parametri diversi: OVERLOADING. 
    Java capisce quali chiamare dal numero/tipo di argomenti che passo.
    La riga this(nome, 1.0): il costruttore corto non ripete il lavoro,
    chiama il costruttore lungo passandogli un prezzo di default. Questo 
    è this(...) = "chiama un altro costruttore di questa classe". Deve stare
    come prima istruzione del costruttore, SEMPRE.
    - this.nome = nome -> this. serve a distinguire il campo nome dal 
    parametro nome che ha lo stesso nome; senza this. assegnerei il 
    parametro a sè stesso e il campo resterebbe vuoto.
    - setPrezzoAlKg(prezzoAlKg) -> il costruttore NON assegna direttamente 
    il prezzo, passa dal setter. Così la validazione vale anche in fase
    di costruzione: non posso creare un ingrediente con prezzo negativo.
    - totale++ nel costruttore -> ogni volta che nasce un oggetto, il 
    contatore condiviso cresce di 1. È questo che fa funzionare il static.
    
    4) GETTER E SETTER (l'accesso controllato)
    Il getter è la porta in uscita: restituisce il valore, le leggo ma 
    non lo cambio. Il setter è la porta in entrata: è il solo modo per
    modificare il campo da fuori. Se i campi fossero pubblici, uno 
    potrebbe scavalcare il setter e mettere valori incoerenti.

    5) IL METODO static
    static int quantiIngredienti() { return totale; }
    È static perchè risponde ad una domanda della classe, non del singolo
    oggetto. Per questo lo chiamo sulla classe.
    Un metodo static non può toccare i campi d'istanza nè usare this. 
    
    6) toString()
    public String toString() {
        return nome + " - " + prezzoAlKg + " euro/kg";
    }
    Questo è un metodo speciale: Java lo chiama in automatico ogni volta 
    che un oggetto finisce in una stampa (System.out.println(i1)) o in una
    concatenazione di stringhe. Senz stamperebbe qualcosa di inutile tipo:
    Ingrediente@7a81197d. Lo sto sovrascrivendo da Object (override).

    ----------------------------------------------------------------------
    IL QUADRO DI INSIEME
    Questa classe è un oggetto che si auto-difende: tiene i dati nascosti
    (private), li lascia leggere a tutti (getter), ma li lascia cambiare
    solo rispettando le sue regole (setter con if). Nasce in modo 
    flessibile (due costruttori), tiene il conto di quanti ne esistono (static)
    e si autodescrive (toString).

    */
    private String nome;
    private double prezzoAlKg;
    private static int totale; // static: uno solo per tutta la classe

    Ingrediente(String nome, double prezzoAlKg) { // costruttore completo
        this.nome = nome;
        setPrezzoAlKg(prezzoAlKg);
        totale++;
    }
    Ingrediente(String nome) { // costruttore ridotto
        this(nome, 1.0);
    }

    public String getNome() { return nome; }
    public double getPrezzoAlKg() { return prezzoAlKg; }
    public void setPrezzoAlKg(double prezzoAlKg) {
        if (prezzoAlKg > 0) {
            this.prezzoAlKg = prezzoAlKg;
        }
    }

    static int quantiIngredienti() {return totale; }

    public String toString() {
        return nome + " - " + prezzoAlKg + " euro/kg";
    }
}

class Vino {
    String nome;
    double gradi;
    private static int totale;

    Vino(String nome, double gradi) {
        this.nome = nome;
        setGradi(gradi);
        totale++;
    }
    Vino(String nome) {
        this(nome, 12.5);
    }

    public String getNome() { return nome; }
    public double getGradi() { return gradi; } 
    public void setGradi(double gradi) {
        if (gradi > 9.5 && gradi < 20.8) {
            this.gradi = gradi;
        }
    }

    static int quantiVini() {return totale; }

    public String toString() {
        return nome + " - " + gradi + "% vol. alc.";
    }
}

class Cliente {
    String nome;
    int tavolo;
    private static int totale;

    Cliente(String nome, int tavolo) {
        this.nome = nome;
        setTavolo(tavolo);
        totale++;
    }
    Cliente(String nome) {
        this(nome, 0);
    }

    public String getNome() { return nome; }
    public int getTavolo() { return tavolo; }
    public void setTavolo(int tavolo) {
        if (tavolo > 0) {
            this.tavolo = tavolo;
        }
    }
    static int totaleTavoli() { return totale; }

    public String toString() {
        return nome + " - " + "Tavolo n.: " + tavolo;
    }
}

class Dipendente {
    String nome;
    double stipendio;
    private static int totale;

    Dipendente(String nome, double stipendio) {
        this.nome = nome;
        setStipendio(stipendio);
        totale++; 
    }
    Dipendente(String nome) {
        this(nome, 1000.0);
    }
    public String getNome() { return nome; }
    public double getStipendio() { return stipendio; }
    public void setStipendio(double stipendio) {
        if (stipendio >= 1000) {
            this.stipendio = stipendio;
        }
    }
    static int totaleDipendenti() { return totale; }

    public String toString() {
        return nome + " - " + "Stipendio: " + stipendio;
    }
}

class Portata {
    String nome;
    int calorie;
    private static int totale;

    Portata(String nome, int calorie) {
        this.nome = nome;
        setCalorie(calorie);
        totale++;
    }
    Portata(String nome) {
        this(nome, 0);
    }
    public String getNome() { return nome; }
    public int getCalorie() { return calorie; }
    public void setCalorie(int calorie) {
        if (calorie >= 0) {
            this.calorie = calorie;
        }
    }
    static int totalePortate() { return totale; }
    
    public String toString() {
        return nome + " - " + calorie + " KCal";
    }
}

class Fornitore {
    String nome;
    int affidabilita;
    private static int totale;

    Fornitore(String nome, int affidabilita) {
        this.nome = nome;
        setAffidabilita(affidabilita);
        totale++;
    }
    Fornitore(String nome) {
        this(nome, 0);
    }
    public String getNome() { return nome; }
    public int getAffidabilita() { return affidabilita; }
    public void setAffidabilita(int affidabilita) {
        if (affidabilita >= 1 && affidabilita <= 10) {
            this.affidabilita = affidabilita;
        }
    }
    static int totaleFornitori() { return totale; }

    public String toString() {
        return nome + " - Voto: " + affidabilita;
    }
}

class Prodotto {
    String nome;
    int scorta;
    private static int totale;

    Prodotto(String nome, int scorta) {
        this.nome = nome;
        setScorta(scorta);
        totale++;
    }
    Prodotto(String nome) {
        this(nome, 0);
    }
    public String getNome() { return nome; }
    public int getScorta() { return scorta; }
    public void setScorta(int scorta) {
        if (scorta >= 0) {
            this.scorta = scorta;
        }
    }
    static int totaleProdotti() { return totale; }

    public String toString() {
        return nome + " - In casa: " + scorta;
    }
}

class Menu {
    private String nome;
    double coperto;
    private static int totale;

    Menu(String nome, double coperto) {
        this.nome = nome;
        setCoperto(coperto);
        totale++;
    }
    Menu(String nome) {
        this(nome, 2.50);
    }
    Menu(double coperto) {
        setCoperto(coperto);
    }

    public String getNome() { return nome; }
    public double getCoperto() { return coperto; }
    public void setCoperto(double coperto) {
        if  (coperto >= 0) {
            this.coperto = coperto;
        }
    }
    static int totaleCoperti() { return totale; }
    public String toString() {
        return nome + " - Coperto: " + coperto + " euro.";
    }
}

class Prenotazione {
    private String nome;
    private String codice;
    private static int totale;

    Prenotazione(String nome, String codice) {
        this.nome = nome;
        this.codice = codice;
        totale++;
    }
    Prenotazione(String nome) {
        this(nome, "N/A");
    }
    
    public String getNome() { return nome; }
    public String getCodice() { return codice; }
    public void setCodice(String codice) {
        if (codice.length() >= 4) {
            this.codice = codice;
        }
    }
    static int totalePrenotazioni() { return totale; }
    public String toString() {
        return nome + " - Codice: " + codice;
    }
}

class Scontrino {
    private String nome;
    private double sconto;
    private static int totale;

    Scontrino(String nome, double sconto) {
        this.nome = nome;
        setSconto(sconto);
        totale++;
    }
    Scontrino(String nome) {
        this(nome, 0.0);
    }
    public String getNome() { return nome; }
    public double getSconto() { return sconto; }
    public void setSconto(double sconto) {
        if (sconto >= 0 && sconto <= 100) {
            this.sconto = sconto;
        }
    }
    static int totaleScontrini() { return totale; }
    public String toString() {
        return nome + " - Sconto: " + sconto + " %";
    }
}

















