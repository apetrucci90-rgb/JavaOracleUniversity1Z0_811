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
}















