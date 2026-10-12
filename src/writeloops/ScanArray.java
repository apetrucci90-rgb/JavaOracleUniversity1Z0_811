package writeloops;

public class ScanArray {
    public static void main(String[] args) {
        /*
        Dato un array di numeri interi già scritto nel 
        codice, scorrilo con un loop e, per ogni elemento:
        - se è negativo, saltalo (non stamparlo, passa al prossimo);
        - se è zero, ferma del tutto il loop;
        - altrimenti, stampalo.
        */
       int[] numbers = {1, 5, 25, -4, 56, -12, 0, 7, 4, 68};
       for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] < 0) {
            continue;
        }
        if (numbers[i] == 0) {
            break;
        }
        System.out.println(numbers[i]);
       }
       /*
       Con i due array a e b, trova e stampa la prima 
       coppia (un elemento di a + uno di b) che somma 
       10, poi ferma subito la ricerca. Usa due for 
       annidati e una label con break per uscire da 
       entrambi i loop insieme.
       */

       int[] a = {1, 3, 4, 8, 12, 24};
       int[] b = {2, 7, 11, 13, 23, 57};

       cerca:
       for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b.length; j++) {
            if (a[i] + b[j] == 10) {
                System.out.println(a[i] + "," + b[j]);
                break cerca;
            }    
        }
       }
    }
}




