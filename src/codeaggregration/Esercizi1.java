package codeaggregration;

import java.util.ArrayList;
// import java.lang.*; // è implicito
// import obbligatorio: Piatto è in un altro package,
// Senza l'import dovrei scrivere come sotto. Sono validi sia quelli sotto che
// che i due import tra commenti

// import codeaggregration.cucina.Piatto;
// import codeaggregration.cucina.*;

public class Esercizi1 {
    public static void main(String[] args) {

        // grazie all'import sopra scrivo solo "Piatto", non codeaggregration.cucina.Piatto
        codeaggregration.cucina.Piatto p = new codeaggregration.cucina.Piatto("Carbonara");

        // getNome(): leggo il campo privato 'nome' dall'esterno
        System.out.println("Piatto del giorno: " + p.getNome());

        System.out.println(Math.max(3, 7));
        System.out.println(Integer.parseInt("42"));

        ArrayList<String> lista = new ArrayList<>();
    }
    
}
