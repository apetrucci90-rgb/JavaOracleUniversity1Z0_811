package operators;

public class PrePost {
    public static void main(String[] args) {
        int x = 5;
        int a = x++; // Prima usa il valore, poi aumenta
        int b = ++x; // Prima aumenta, poi usa il valore

        /*
        Prima x vale 5, poi Java prende il valore attuale di 5 e lo mette in a
        ed aumenta x, quindi a = 5 ed x diventa 6
        Infine con b Java prima aumenta il valore di 6 a 7, perché i ++ stanno
        prima della x. Poi mette il nuovo valore in B
        */
        System.out.println(x); // 7
        System.out.println(a); // 5
        System.out.println(b); // 7

        int y = 10;
        int c = y-- + --y;

        /*
        Prima prendo il valore di y, lo tiene da parte per la somma e poi
        y scende di 1 e diventa 9.
        Prima abbassa y che da 9 diventa 8.
        La somma: c = 10 + 8 = 18. Il è quello che y-- aveva messo da parte
        al punto 1, l'8 è quello che --y ha prodotto al punto secondo.
        Alla fine y vale 8: è stata abbassata due volte, una da y-- (10->9)
        e una da --y (9->8)
        */

        System.out.println(y); // 8
        System.out.println(c); // 18

        
    }
}
