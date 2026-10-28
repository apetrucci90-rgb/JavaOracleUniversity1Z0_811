package staticmembers;

public class StaticVsInstance {

    /*
    Una sola classe per file può essere public e deve chiamarsi come il file.
    main è static (parte prima di ogni oggetto).
    */
    public static void main(String[] args) {

        Piatto a = new Piatto("Capesante", 25.65);
        Piatto b = new Piatto("Crema diplomatica", 12.85);
        PiattoNormale c = new PiattoNormale("Fiorentina", 100);
        PiattoNormale d = new PiattoNormale("Branzino", 85.80);

        // static: una lavagna sola -> a e b accumulano sullo STESSO contatore
        System.out.println("Piatto (static) - totale creati: " + Piatto.quantiPiatti());

        // instance: ogni oggetto ha il SUO contaPiatti -> resta sempre 1, non accumula.
        // Stesso contaPiatti++ nel costruttore, ma senza static non e' condiviso,
        // perche' e' un campo di istanza (uno per oggetto), non di classe.
        System.out.println("PiattoNormale c: " + c.quantiPiatti());
        System.out.println("PiattoNormale d: " + d.quantiPiatti());

    }
}

class Piatto {
    static int contaPiatti; // LA LAVAGNA, una sola per tutta la classe, parte da 0
    String nome;
    double prezzo;

    Piatto(String nome, double prezzo) { // COSTRUTTORE
        this.nome = nome;
        this.prezzo = prezzo;
        contaPiatti++; // Ogni piatto che NASCE scrive +1 sulla lavagna
    }

    static int quantiPiatti() { // metodo static: legge la lavagna, non serve
                                // un oggetto
        return contaPiatti;
    }
}

class PiattoNormale {
    int contaPiatti;
    String nome;
    double prezzo;

    PiattoNormale(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        contaPiatti++;
    }
    int quantiPiatti() {
        return contaPiatti;
    }
}
