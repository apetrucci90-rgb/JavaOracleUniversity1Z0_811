package inheritance;

public class Esercizi1 {
    public static void main(String[] args) {

        Cuoco c1 = new Cuoco("Andrea", 3500, "Primi");
        System.out.println(c1.descrizione());

    }
}

class Dipendente { // SUPERCLASSE (il padre)
    protected String nome; // protected: i figli possono vederlo/usarlo
    protected double stipendio;

    Dipendente(String nome, double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }

    String descrizione() {
        return nome + " - stipendio: " + stipendio + " euro";
    }
}

class Cuoco extends Dipendente { // SUBCLASSE (il figlio)
    private String reparto; // campo SOLO del figlio

    Cuoco(String nome, double stipendio, String reparto) {
        super(nome, stipendio); // chiama il costruttore del PADRE - PRIMA RIGA
        this.reparto = reparto; // poi analizza la parte sua
    }
    public String getReparto() { return reparto; }

}




