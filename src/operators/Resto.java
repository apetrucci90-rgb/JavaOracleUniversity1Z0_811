package operators;

public class Resto {
    /*
    Il modulo % dà il resto della divisione intera.
    17 / 5 = 3 - Il risultato tronca, non arrotonda
    17 % 5 = 2 - Dà 2 come resto (17 - (5 * 3) = 2)
    Viene utilizzato principalmente per vedere se un 
    numero è pari o dispari (n % 2 == 0; pari), far 
    girare un contatore (ora % 24) o per distribuire 
    qualcosa e sapere cosa resta fuori. 
    */

    public static void main(String[] args) {

    int porzioniPerPerson = 17 / 5;
    int porzioniAvanzate = 17 % 5;

    System.out.println(porzioniPerPerson);
    System.out.println(porzioniAvanzate);

    /*
    Gli operatori composti uniscono operazione e 
    assegnazione sulla stessa variabile.
    a += b == a + b
    Stessa cosa per -=, *=, /=, %=
    */

    
    }
}
