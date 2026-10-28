package staticmembers;

public class Esercizi1 {
    public static void main(String[] args) {
        
        Ordine o1 = new Ordine("Tavolo rosso");
        Ordine o2 = new Ordine("Tavolo bianco");
        // =======================================
        Tavolo t1 = new Tavolo("Tavolo 1");
        Tavolo t2 = new Tavolo("Tavolo 2");
        // =======================================
        Cliente c1 = new Cliente("Ale12345");
        Cliente c2 = new Cliente("Stefi6789");
        // =======================================
        Birra b1 = new Birra("Weissen", 7.55);
        Birra b2 = new Birra("Triplo malto", 11.95);
        // =======================================
        Cuoco ch1 = new Cuoco("Chef Andrea");
        Cuoco ch2 = new Cuoco("Sous Chef Alessia");
        // =======================================
        Conto pay1 = new Conto("Tagliolini", 35.50);
        Conto pay2 = new Conto("Astice", 98.85);
        // =======================================
        Prenotazione p1 = new Prenotazione("Petrucci", 6);
        Prenotazione p2 = new Prenotazione("Trevisan", 16);
        // =======================================
        Pizza piz1 = new Pizza("Margherita");
        Pizza piz2 = new Pizza("Margherita");
        Pizza piz3 = new Pizza("Diavola");
        // =======================================
        Fattura f1 = new Fattura(1);
        Fattura f2 = new Fattura(2);
        // =======================================
        Caffe cof1 = new Caffe(1);
        Caffe cof2 = new Caffe(2);
        Caffe cof3 = new Caffe(3);
        Caffe cof4 = new Caffe(4);


        System.out.println("Ordini aperti: " + Ordine.quantiOrdini()); // 2
        // ==============================================================
        System.out.println("Tavoli occupati: " + Tavolo.tavoliOccupati());
        // ==============================================================
        System.out.println("ID prossimo cliente: " + Cliente.prossimoId());
        // ==============================================================
        System.out.println("IVA Birra " + b1.nome + ": " + Birra.ivaPercento() + "%");
        System.out.println("IVA Birra " + b2.nome + ": " + Birra.ivaPercento() + "%");
        // ==============================================================
        System.out.println("Cuochi in brigata: " + "\n"+ ch1.nome +  ", " + 
        ch2.nome + "\n| Totale cuochi in brigata: "+ Cuoco.contaCuochi());
        // ==============================================================
        System.out.println("Totale incassato: " + Conto.totaleIncassato());
        // ==============================================================
        System.out.println("Massimo coperti: " + Prenotazione.MAX_COPERTI());
        // ==============================================================
        System.out.println("Margherite: " + Pizza.contaMargherite());
        // ==============================================================
        System.out.println("Prossimo numero fattura: " + Fattura.contatoreNumero());
        // ==============================================================
        System.out.println("Totale caffè: " + Caffe.contaCaffe());



    }   
}

class Ordine {
    static int contaOrdini; // una sola casella per tutta la classe
    String tavolo;

    Ordine(String tavolo) {
        this.tavolo = tavolo;
        contaOrdini++;
    }
    static int quantiOrdini() { return contaOrdini; }
}

class Tavolo {
    static int contaTavoli;
    String tavolo;

    Tavolo(String tavolo) {
         this.tavolo = tavolo;
         contaTavoli++;
    }
    static int tavoliOccupati() { return contaTavoli; }
}

class Cliente {
    static int contatoreId = 1; // STATIC: prossimo numero da assegnare, condiviso, parte da 1
    String ide; // codice/nome del cliente
    int id; // ISTANZA: l'id di QUESTO cliente'

    Cliente(String ide) {
        this.ide = ide;
        this.id = contatoreId; // questo cliente prende il numero corrente
        contatoreId++; // ...poi il contatore sale per il prossimo
    }
    static int prossimoId() { return contatoreId; } // ritorna il prossimo id libero
}

class Birra {
    static double ivaPercento = 22;
    String nome;
    double prezzo;

    Birra(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }
    static double ivaPercento() { return ivaPercento; }
}

class Cuoco {
    static int contaCuochi;
    String nome;

    Cuoco(String nome) {
        this.nome = nome;
        contaCuochi++;
    }
    static int contaCuochi() { return contaCuochi;}
}

class Conto {
    static double totaleIncassato;
    String nome;
    double prezzo;

    Conto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        totaleIncassato += prezzo;
    }
    static double totaleIncassato() { return totaleIncassato; }
}

class Prenotazione {
    static final int MAX_COPERTI = 120;
    

    Prenotazione(String nome, int pax) {
    
    }
    static int MAX_COPERTI() { return MAX_COPERTI; }
}

class Pizza {
    static int contaMargherite = 0;
    String nome;

    Pizza(String nome) {
        this.nome = nome;
        

        if (nome.equals("Margherita")) {
        contaMargherite++;
        }
    }
    static int contaMargherite() { return contaMargherite; }
}

class Fattura {
    static int contatoreNumero = 1;
    int numero;

    Fattura(int numero) {
        this.numero = contatoreNumero;
        contatoreNumero++;
    }
    static int contatoreNumero() { return contatoreNumero; }
}

class Caffe {
    static int contaCaffe;
    int numeroCaffe = 0;

    Caffe (int contaCaffe) {
        this.contaCaffe = contaCaffe;
        contaCaffe++;
    }
    static int contaCaffe() { return contaCaffe; }
}







