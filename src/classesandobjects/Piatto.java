package classesandobjects;

public class Piatto {
    String nome;
    double prezzo;
    boolean vegano; 
    
    void descrivi() {
        System.out.println(nome + " - " + prezzo + " euro - vegano? " + vegano);
    }
    boolean isCaro() {
        return prezzo > 20;
    }
    double getPrezzo() {
        return Math.round(prezzo * 100) / 100.0;
    }
}
