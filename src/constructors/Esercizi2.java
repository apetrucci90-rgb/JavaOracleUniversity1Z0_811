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
        Ingrediente i1 = new Ingrediente("Farina", 2.85);
        Ingrediente i2 = new Ingrediente("Sale", -3);
        Ingrediente i3 = new Ingrediente("Zucchero");

        System.out.println(i1.getNome() + ": " + i1.getQuantita());
        System.out.println(i2.getNome() + ": " + i2.getQuantita());
        System.out.println(i3.getNome() + ": " + i3.getQuantita());

        Fo


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














