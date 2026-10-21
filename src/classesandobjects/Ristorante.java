package classesandobjects;

public class Ristorante {
    public static void main(String[] args) {
        Piatto p1 = new Piatto();
        p1.nome = "Spaghetti alla Pescatora";
        p1.prezzo = 18.5;
        p1.vegano = false;

        Piatto p2 = new Piatto();
        p2.nome = "Filetto di Cervo";
        p2.prezzo = 35.5;
        p2.vegano = true;

        p1.descrivi();
        p2.descrivi();

        System.out.println(p1.nome + " è caro? " + p1.isCaro());
        System.out.println(p2.nome + " è caro? " + p2.isCaro());

        /*
        - Piatto p3 = p1; non crea un nuovo piatto: copia solo il riferimento
        (l'indirizzo). Ora p3 e p1 sono due nomi dello STESSO oggetto.
        - p3.prezzo = 99.0; cambia il prezzo di quell'unico piatto -> p1, che
        è lo stesso oggetto, vede 99.0.
        */
        Piatto p3 = p1;
        p3.prezzo = 99.0;

        p1.descrivi();
        
        Piatto p4 = new Piatto();
        p4.descrivi(); // null - 0.0 euro - vegano? false

    }
    
}
