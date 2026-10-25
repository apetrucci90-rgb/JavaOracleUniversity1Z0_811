package constructors;

public class Esercizi1 {
    public static void main(String[] args) {

        Piatto p = new Piatto("Guancette in umido", 31.85);
        System.out.println(p.getNome() + ", costa: " +  p.getPrezzo());
        Piatto sbagliato = new Piatto("Errore prezzo", -5);
        Piatto soloNome = new Piatto("Pane");

        System.out.println(sbagliato.getNome() + ", costa: " + sbagliato.getPrezzo());
        System.out.println(soloNome.getNome() + ", costa: " + soloNome.getPrezzo());
    }
}

class Piatto {
    private String nome;
    private double prezzo;

    public Piatto(String nome, double prezzo) {
        this.nome = nome;
        if (prezzo > 0) {
            this.prezzo = prezzo;
        } else {
            this.prezzo = 0;
        }
    }
    public Piatto(String nome) {
        // Chiama l'altro costruttore, passandogli il nome e 0 come prezzo
        // Riuso la logica di sopra (validazione compresa): OVERLOADING.
        this(nome, 0);
    }
    public String getNome() {
        return nome;
    }
    public double getPrezzo() {
        return prezzo;
    }
}
























