package arrays;

public class Voti {
    public static void main(String[] args) {
        int[] voti = {7, 9, 4, 8, 10};
        int somma = 0;
        int insufficienti = 0;


        for (int voto : voti) {
            System.out.println("voto: " + voto);
            somma = somma + voto;

            if (voto < 6) {
                insufficienti++;
            }
        }

        System.out.println("somma = " + somma);
        System.out.println("voti insufficienti = " + insufficienti);

        // Calcolo della media in due modi

        double mediaSbagliata = somma / voti.length;
        double mediaCorretta = somma / (double) voti.length;

        /*
        media sbagliata da 8.0 perchè esegue una divisione tra due numeri interi.
        Java esegue la divisione, tronca i decimali ottenendo 7, e alla fine
        salva questo 7 dentro la variabile double, trasformandolo in 7.0.
        La PERDITA del decimale avviene durante l'operazione, prima del salvataggio.
        */

        System.out.println("media sbagliata = " + mediaSbagliata);
        System.out.println("media corretta = " + mediaCorretta);
    }
}
