package operators;

public class Precedenza {
    public static void main(String[] args) {
        /*
        L'ordine, dal più forte al più debole:
        1. ( ) — le parentesi vincono sempre, è il 
        modo per forzare un ordine diverso da quello 
        naturale
        2. ++, --
        3. *, /, %
        4. +, -
        5. <, >, <=, >=
        6. ==, !=
        7. &&
        8. ||
        9. ? :  // Ternario
        10. =, +=, -=
        */

        int a = 10 - 4 / 2 * 3;
        System.out.println(a);

        /*
        boolean esempio = 2 + 1 > 2 && 3 * 1 == 3;
        System.out.println(esempio);

        Prima Java calcola 2+1=3,3*1=3, poi 3>2(true), 
        infine true && true, stampa true.
        */

        boolean b = 5 + 3 > 7 && 2 * 2 == 4;
        System.out.println(b);

        int c = 20 % 6 + 2 * 3;
        System.out.println(c);

        int d = (10 - 4) / 2 * 3;
        System.out.println(d);
        // Prima esegue il calcolo tra parentesi, poi lo divide
        // per 2 e lo moltiplica per 3, ottenendo 9.

        

    }
}