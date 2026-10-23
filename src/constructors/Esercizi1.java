package constructors;

public class Esercizi1 {
    public static void main(String[] args) {

        Piatto p = new Piatto("Guancette in umido", 31.85);
        System.out.println(p.getNome() + " costa " +  p.getPrezzo());

    }
}

class Piatto {
    private String nome;
    private double prezzo;

    public Piatto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }
    public String getNome() {
        return nome;
    }
    public double getPrezzo() {
        return prezzo;
    }
}
























