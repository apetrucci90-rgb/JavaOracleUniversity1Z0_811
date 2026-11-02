package inheritance;
/*
COS'E' L'EREDITARIETA'
Sono due classi in relazione "è-un" (una pizza è un piatto):
la figlia riceve in automatico campi e metodi del genitore.
Scrivo il codice comune una volta sola; la figlia aggiunge
o ridefinisce solo ciò che la distingue.
*/

public class Esercizio1Piatto {
    /*SUPERCLASS (the parent). E'il genitore da cui Pizza
     erediterà. Tutto ciò che sta qui dentro (nome, prezzo,
     descrizione) esiste in automatico anche nella Pizza,
     senza riscriverlo.
    */ 
    protected String nome;
    /*
    Con protected il campo è accessibile a questa classe
    e alle sue sottoclassi, ma non al codice esterno.
    E' la via di mezzo fra 'private' e 'public'. Serve 
    perchè la figlia possa usarlo direttamente.
    */
    protected double prezzo;

    public Esercizio1Piatto(String nome, double prezzo) {
        /*
        COSTRUTTORE DELLA SUPERCLASS
        Riceve i dati comuni ad ogni piatto e li salva nei
        campi. 
        */
        this.nome = nome;
        // Inizializzo il campo dentro al costruttore con this
        this.prezzo = prezzo;
    }
    /*
    Questo è un metodo che restituisce una stringa
    Lo scrivo qua e non nel main (solo chi usa i piatti)
    perchè li sto definendo.
    */
    public String descrizione() {
        return nome + " - " + prezzo + "€";
    }
}

/*
SUBCLASS (the child)
Con extends dichiaro l'ereditarietà: Pizza riceve in
automatico nome, prezzo e descrizione() dal genitore.
Una Pizza è un Piatto, con un campo in più.
Una sola classe è 'public'.
*/
class Pizza extends Esercizio1Piatto {
    /*
    diametro è il campo esclusivo della Pizza, che il 
    genitore non ha. Uso 'private' perchè è un dettaglio
    interno e sotto la Pizza non c'è nessuna sottoclasse: 
    non serve protected.
    */
    private double diametro; // campo in più, solo della pizza

    /*
    Inizializzo il nuovo oggetto (l'istanza Pizza), non
    la classe. La classe è lo stampo.
    L'ereidtà è data da 'extends', non da 'super'.
    suoer(nome, prezzo) chiama il costruttore del genitore
    per valorizzare quei campi ereditati.
    Con this. assegno/inizializzo. this.dia.... = ....; 
    Metto il valore del parametro dentro il campo
    dell'oggetto. this. indica il campo.
    */
    public Pizza(String nome, double prezzo, double diametro) {
        super(nome, prezzo);   // chiama il costruttore del genitore, PRIMA riga
        this.diametro = diametro;
    }
    /*
    Con Override sto ridefinendo un metodo che esiste già
    nel genitore con la stessa firma. Non è obbligatorio,
    ma è una rete di sicurezza: se sbaglio nome o parametri,
    il compilatore mi blocca.
    */
    @Override // ridefinisco un metodo ereditato, stessa firma
    public String descrizione() {
        /*
        Qui super.desc.... chiama la versione del genitore
        e ne richiama il risultato e ci concateno la parte
        specifica della pizza. Così non riscrivo la logica
        che Piatto sa già fare, la ESTENDO. 
        */
        return super.descrizione() + " (pizza da " + diametro + " cm)";
    }
}

class Esercizio1 {
    public static void main(String[] args) {
        Esercizio1Piatto p = new Esercizio1Piatto("Guancette in umido", 31.85);
        Pizza z = new Pizza("Margherita", 8.90, 34);

        System.out.println(p.descrizione());
        System.out.println(z.descrizione());
    }
}
