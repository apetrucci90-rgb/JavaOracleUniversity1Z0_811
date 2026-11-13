package ripassogenerale;

public class Stazione {

    public static void main(String[] args) {
        
    }
    
}

abstract class Piatto { // abstract così che nessuno possa creare un nuono 
    // Piatto da zero. Senza, chiunque potrebbe creare un piatto generico.

    // 
    private String nome;
    // il campo nome esiste dentro Piatto, da fuori nessuno può toccarlo
    private int porzioni;
    static int creati = 0;

    Piatto(String nome, int porzioni) { // COSTRUTTORE
        this.nome = nome;
        this.porzioni = porzioni;
        creati++;
    }
    String getNome() { return nome; }
    int getPorzioni() { return porzioni; }
    
    abstract double costo();
    abstract int minutiCottura();

    String scheda() {
        return nome + " (" + porzioni + " porz.) - " + costo() + " euro, "
        + minutiCottura() + " min.";
    }
}

















