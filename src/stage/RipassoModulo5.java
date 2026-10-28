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


    }    
}

class Ingrediente {
    private String nome;
    private double prezzoAlKg;
    private static int totale; // static: uno solo per tutta la classe

    Ingrediente(String nome, double prezzoAlKg) { // costruttore completo
        this.nome = nome;
        setPrezzoAlKg(prezzoAlKg);
        totale++;
    }
    Ingrediente(String nome) {
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























