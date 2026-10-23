package stage;

/*
OUTPUT

Guancette in umido - disponibile? true
Prezzo con IVA: 35.035
Scontato 20%: 25.48
Scontato default: 28.665
[messaggio di errore del tuo setPrezzo]
Prezzo dopo -5: 31.85
Tartare - disponibile? false
*/

public class GestionaleRistorante {
    public static void main(String[] args) {
        Piatto p =  new Piatto("Guancette in umido", 31.85);

        Piatto tartare = new Piatto("Tartare di Salmone Selvaggio", 45.50, false);
        System.out.println(tartare.getNome() + " - disponibile? " + tartare.isDisponibile());

        System.out.println(p.getNome() + " - disponibile? " + p.isDisponibile());
        System.out.println("Prezzo con IVA: " + p.getPrezzoConIva());
        System.out.println("Scontato 20%: " + p.scontato(20));
        System.out.println("Scontato default: " +p.scontato());
        p.setPrezzo(-5);
        System.out.println("Prezzo dopo -5: " + p.getPrezzo());

        System.out.println("Prima: " + p.getPrezzo());
        p.applicaSconto(20);
        System.out.println("Dopo applicaSconto(20): " + p.getPrezzo());

        
    }
    
}

class Piatto {
    private String nome;
    private double prezzo;
    private boolean disponibile;

    public Piatto(String nome, double prezzo, boolean disponibile) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.disponibile = disponibile;
    }
    public Piatto(String nome, double prezzo) {
        this(nome, prezzo, true);
    }
    //  public double getBase() { return base; }
    public String getNome() { return nome; }
    public double getPrezzo() { return prezzo; }
    public boolean isDisponibile() { return disponibile; }

    /*
    PERCHE' DEVO USARE I SETTER?
    Il mese prossimo i prezzi cambiano, e devo cambiare nome e prezzo. 
    Senza setter non potrei farlo perchè i campi sono privati. Dal main 
    non posso scrivere p.prezzo = 45; la sola porta per modificarlo 
    restano i setter.
    Imposto dei parametri affinchè anche i dati futuri siano attendibili.

    costruttore = valore iniziale;
    setter = modifiche successive;
    getter = legge i valori dall'esterno;

    Il getter serve perchè i campi sono private: dal main non posso
    fare p.prezzo = 34;

    SETTER SCRIVE
    GETTER LEGGE
    COSTRUTTORE AVVIA

    public void setPrezzo(double prezzo) {
    if (prezzo > 0) {
        this.prezzo = prezzo;
    } else {
        System.out.println("ERRORE: il prezzo deve essere positivo");
    }
}
    */
   public void setPrezzo(double prezzo) {
    if (prezzo > 0) {
        this.prezzo = prezzo;
    } else {
        System.out.println("ERRORE! Il prezzo deve essere positivo.");
    }
   }
   public void setNome(String nome) {
    if (nome.length() > 0) {
        this.nome = nome;
    } else {
        System.out.println("ERRORE! Il nome deve contenere almeno un carattere");
    }
   }
   public double getPrezzoConIva() {
    return prezzo * 1.10;
   }
   public double scontato(double perc) {
    return prezzo * (1 - perc / 100);
   }
   public double scontato() {
    return scontato(10);
   }
   public void applicaSconto(double perc) {
    this.prezzo = prezzo * (1 - perc / 100);
       }
}















