package constructors;

class Esercizi2 {
    public static void main(String[] args) {

        /*
        ANATOMIA DI UNA CHIAMATA NEL MAIN
        Ingrediente i1 = new Ingrediente("Farina", 2.85); 
        - Ingrediente i1 -> dichiaro una variabile di tipo Ingrediente, è 
        l'etichetta con cui richiamerò l'oggetto.
        - new Ingrediente("Farina", 2.85); -> new costruisce l'oggetto
        e lancia il costruttore a 2 argomenti; dentro, la mia validazione 
        decide cosa salvare.

        LA RIGA DI STAMPA
        System.out.println(i1.getNome() + ": " + i3.getQuantita());
        - i1.getNome() -> chiamo i GETTER per leggere i campi: sono
        private, da fuori non posso scrivere i1.nome, la sola finestra
        è il getter.
        - + ": " + -> concatena in un'unica stringa.
        - 
        */

        // INGREDIENTE
        Ingrediente i1 = new Ingrediente("Farina", 2.85);
        Ingrediente i2 = new Ingrediente("Sale", -3);
        Ingrediente i3 = new Ingrediente("Zucchero");

        System.out.println(i1.getNome() + ": " + i1.getQuantita());
        System.out.println(i2.getNome() + ": " + i2.getQuantita());
        System.out.println(i3.getNome() + ": " + i3.getQuantita());
        // ========================================================
        // FORNITURE
        Fornitore f1 = new Fornitore("CarniForniture", 9);
        Fornitore f2 = new Fornitore("PesceAdriatico", -1);
        Fornitore f3 = new Fornitore("MarketOk");

        System.out.println(f1.getNome() + ": " + f1.getAffidabilita());
        System.out.println(f2.getNome() + ": " + f2.getAffidabilita());
        System.out.println(f3.getNome() + ": " + f3.getAffidabilita());
        // ============================================================
        // ORDINE
        Ordine o1 = new Ordine("UKUKUKUK", 900.95);
        Ordine o2 = new Ordine("ASASAAS", -49.55);
        Ordine o3 = new Ordine("FGFGFG");

        System.out.println(o1.getCodice() + ": " + o1.getTotale() + "€");
        System.out.println(o2.getCodice() + ": " + o2.getTotale() + "€");
        System.out.println(o3.getCodice() + ": " + o3.getTotale() + "€");
        // ==============================================================
        // TAVOLO
        Tavolo t1 = new Tavolo("Sala 3", 10);
        Tavolo t2 = new Tavolo("Sala Argento", 18);
        Tavolo t3 = new Tavolo("Sala Crema");

        System.out.println(t1.getZona() + ": " + t1.getCoperti() + " PAX");
        System.out.println(t2.getZona() + ": " + t2.getCoperti() + " PAX");
        System.out.println(t3.getZona() + ": " + t3.getCoperti() + " PAX");
        // ===============================================================
        // ALCOLOCICI, nome, gradi
        Alcolici a1 = new Alcolici("Weissen", 4.5);
        Alcolici a2 = new Alcolici("Vino Cannonau", 15);
        Alcolici a3 = new Alcolici("Amaro Tavola", 35.5);
        Alcolici a4 = new Alcolici("Cuore di Strega", 69.9);
        Alcolici a5 = new Alcolici("Alcol Puro", 95);

        System.out.println(a1.getNome() + ": " + a1.getGradi() + " % vol");
        System.out.println(a2.getNome() + ": " + a2.getGradi() + " % vol");
        System.out.println(a3.getNome() + ": " + a3.getGradi() + " % vol");
        System.out.println(a4.getNome() + ": " + a4.getGradi() + " % vol");
        System.out.println(a5.getNome() + ": " + a5.getGradi() + " % vol");
        // ================================================================
        // DIPENDENTE nome, stipendioMensile
        Dipendente d1 = new Dipendente("Andrea", 12_000);
        Dipendente d2 = new Dipendente("Alessia", -15_000);
        Dipendente d3 = new Dipendente("Massimo");

        System.out.println(d1.getNome() + ": " + d1.getStipendioMensile() + " €");
        System.out.println(d2.getNome() + ": " + d2.getStipendioMensile() + " €");
        System.out.println(d3.getNome() + ": " + d3.getStipendioMensile() + " €");
        // =======================================================================
        // ATTREZZO nome, prezzo
        Attrezzo att1 = new Attrezzo("Planetaria X1000", 1500.95);
        Attrezzo att2 = new Attrezzo("Mixer", -180.45);
        Attrezzo att3 = new Attrezzo("Spatola");

        System.out.println(att1.getNome() + ": " + att1.getPrezzo() + " €");
        System.out.println(att2.getNome() + ": " + att2.getPrezzo() + " €");
        System.out.println(att3.getNome() + ": " + att3.getPrezzo() + " €");
        // =================================================================
        // RICETTA nome, porzioni
        Ricetta r1 = new Ricetta("Cavolo gratinato", 4);
        Ricetta r2 = new Ricetta("Mayonnaise", -1000);
        Ricetta r3 = new Ricetta("Salmone");

        System.out.println(r1.getNome() + ": " + r1.getPorzioni() + " PAX");
        System.out.println(r2.getNome() + ": " + r2.getPorzioni() + " PAX");
        System.out.println(r3.getNome() + ": " + r3.getPorzioni() + " PAX");
        // =================================================================
        // SCORTA prodotto, pezzi
        Scorta s1 = new Scorta("Polli", 100);
        Scorta s2 = new Scorta("Costate", -150);
        Scorta s3 = new Scorta("Merluzzi");

        System.out.println(s1.getProdotto() + ": " + s1.getPezzi());
        System.out.println(s2.getProdotto() + ": " + s2.getPezzi());
        System.out.println(s3.getProdotto() + ": " + s3.getPezzi());
        // =========================================================
        // PIETANZA nome, calorie
        Pietanza p1 = new Pietanza("Asiago", 550);
        Pietanza p2 = new Pietanza("Branzino", -110);
        Pietanza p3 = new Pietanza("Crostata");

        System.out.println(p1.getNome() + ": " + p1.getCalorie() + " KCal");
        System.out.println(p2.getNome() + ": " + p2.getCalorie() + " KCal");
        System.out.println(p3.getNome() + ": " + p3.getCalorie() + " KCal");

    }
}

class Ingrediente {
    private String nome;
    private double quantita;

    public Ingrediente(String nome, double quantita) {
        this.nome = nome;
        if (quantita > 0) {
            this.quantita = quantita;
        } else {
            this.quantita = 0;
        }
    }

    public Ingrediente(String nome) {
        this(nome, 0);
    }

    public String getNome() { return nome; }
    public double getQuantita() { return quantita; }
}

class Fornitore {
    private String nome;
    private double affidabilita;

    public Fornitore(String nome, double affidabilita) {
        this.nome = nome;
        if (affidabilita >= 1 && affidabilita <= 10) {
            this.affidabilita = affidabilita;
        } else {
            this.affidabilita = 0;
        }
    }

    public Fornitore(String nome) {
        this(nome, 0);
    }

    public String getNome() { return nome; }
    public double getAffidabilita() { return affidabilita; }
}

class Ordine {
    // DICHIARAZIONE
    private String codice;
    private double totale;

    // VALIDAZIONE
    public Ordine(String codice, double totale) {
        this.codice = codice;
        if (totale > 0) {
            this.totale = totale;
        } else {
            this.totale = 0;
        }
    }
    // DELEGAZIONE
    public Ordine(String codice) {
        this(codice, 0);
    }
    // LETTURA
    public String getCodice() {return codice; }
    public double getTotale() { return totale; }
}

class Tavolo {
    private String zona;
    private int coperti;

    public Tavolo(String zona, int coperti) {
        this.zona = zona;

    if (coperti >=1 && coperti <= 12) {
        this.coperti = coperti;
    } else {
        this.coperti = 0;
        }
    }
    public Tavolo(String zona) {
        this(zona, 0);
    }
    public String getZona() { return zona; }
    public int getCoperti() { return coperti; }
}

class Alcolici {
    private String nome;
    private double gradi;

    public Alcolici(String nome, double gradi) {
        this.gradi = gradi; // il numero lo salvo solo una volta
        
        if (gradi <= 0 || gradi > 70) { // prima scarto il non valido
            this.nome = "NON conforme";
            this.gradi = 0;
        } else if (gradi <= 9) {
            this.nome = "Birra";
        } else if (gradi <= 20) {
            this.nome = "Vino";
        } else if (gradi <= 40) {
            this.nome = "Amari";
        } else { // qui per forza minore di 70 e maggiore di 40
            this.nome = "SuperAlcolici";
        }
    }
    public Alcolici (String nome) {
        this(nome, 0);
    }
    public String getNome() { return nome; }
    public double getGradi() { return gradi; }
}

class Dipendente {
    private String nome;
    private double stipendioMensile;

    public Dipendente(String nome, double stipendioMensile) {
        this.nome = nome;

        if (stipendioMensile > 0) {
            this.stipendioMensile = stipendioMensile;
        } else {
            this.stipendioMensile = 0;
        }
    }
    public Dipendente (String nome) {
        this(nome, 0);
    }
    public String getNome() { return nome; }
    public double getStipendioMensile() { return stipendioMensile; }
}

class Attrezzo {
    private String nome;
    private double prezzo;

    public Attrezzo(String nome, double prezzo) {
        this.nome = nome;

        if(prezzo > 0) {
            this.prezzo = prezzo;
        } else {
            this.prezzo = 0;
        }
    }
    public Attrezzo (String nome) {
        this(nome, 0);
    }
    public String getNome() { return nome; }
    public double getPrezzo() { return prezzo;}
}

class Ricetta {
    private String nome;
    private int porzioni;

    public Ricetta(String nome, int porzioni) {
        this.nome = nome;

        if (porzioni > 0) {
            this.porzioni = porzioni;
        } else {
            this.porzioni = 0;
        }
    }
    public Ricetta (String nome) {
        this(nome, 0);
    }
    public String getNome() { return nome; }
    public int getPorzioni() { return porzioni;}
}

class Scorta {
    private String prodotto;
    private int pezzi;

    public Scorta(String prodotto, int pezzi) {
        this.prodotto = prodotto;

        if (pezzi > 0) {
            this.pezzi = pezzi;
        } else {
            this.pezzi = 0; 
        }
    }
    public Scorta (String prodotto) {
        this(prodotto, 0);
    }
    public String getProdotto() { return prodotto; }
    public int getPezzi() { return pezzi; }
}

class Pietanza {
    private String nome;
    private int calorie;

    public Pietanza(String nome, int calorie) {
        this.nome = nome;

        if (calorie > 0) {
            this.calorie = calorie;
        } else {
            this.calorie = 0;
        }
    }
    public Pietanza (String nome) {
        this(nome, 0);
    }
    public String getNome() { return nome; }
    public int getCalorie() { return calorie; }
}



/*
I 4 PASSAGGI DA RICORDARE:

1) DICHIARO i campi private prima di tutto, perchè i campi sono gli oggetti,
: un Piatto senza nome e prezzo è niente. Prima DEFINISCO cosa esiste, poi
lo RIEMPIO. Uso il private perchè da fuori nessuno deve poter scrivere
il campo direttamente, scavalcando le mie regole: l'accesso passa solo da
costruttore e getter.

2) COSTRUISCO e VALIDO nel costruttore, perché è l'unico momento di nascita
dell'oggetto: se metto la regola qui, nessun Piatto può venire con un prezzo
negativo. Se la mettessi altrove, il valore sbagliato sarebbe già dentro. 
Se VALIDO alla fonte, il dato sporco non entra mai.

3) DELEGO con this(...) senza riscrivere le righe perché la regola di
validazione deve stare in un posto solo. Se il secondo costruttore ricopiasse
l'if-else, qualora cambiassi la regola dovrei farlo in due punti, facendo 
nascere bugs. 
this(nome, 0) fa passare anche la scorciatoia dallo stesso controllo: una
sola verità.

4) LEGGO coi getter che servono anche se i campi già ci sono perchè sono
private: da fuori sono invisibili. Il getter è la finestra controllata per
leggerli senza permettere di modificarli. Avere solo il GETTER e non il
SETTER significa:
- guardare, ma non toccare.
- il valore si fissa alla nascita e resta.

PERCHÈ QUESTO ORDINE? (DICHIARO, COSTRUISCO e VALIDO, DELEGO e LEGGO)
Segue la vita dell'oggetto:
1) Prima deve esistere lo stato
2) Deve nascere giusto
3) Offro un modo di crearlo 
4) Do accesso in lettura
*/














