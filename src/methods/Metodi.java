package methods;

public class Metodi {
    /*
    Apre la classe, il contenitore. Tutto il resto vive dentro queste 
    graffe. Un file .java ha una classe pubblica che si chiama come il
    file.
    */
    public static void main(String[] args) {
        /*  main: il metodo da cui parte il programma. Qui chiamo gli
                altri metodi

        CHIAMATA: passo 3 o 4 come ARGOMENTI. sum li elabora e mi
        ridà un valore. Quel VALORE lo salvo in r.
        */


        /*
        - chiamo sum passando gli argomenti 3 e 4
        - sum calcola e ridà 7;
        - quel 7 viene salvato nella variabile r
        */
        int r = sum(3, 4);
        System.out.println("3 + 4 = " + r);
        System.out.println("8 > 3 " + isMaggiore(8, 3));
        System.out.println("3 > 12 " + isMaggiore(3, 12));
        
        stampaDoppio(5);
        stampaDoppio(10);
    }
    /*
    - static -> posso chiamarlo dal main senza creare oggetti;
    - int -> tipo di ritorno: ridà un intero
    - sum -> il nome
    - (int a, int b) -> i parametri: due caselle che si riempiono con
        gli argomenti al momento della chiamata (3->a, 4->b);
     - return a + b; -> calcola e ridà il valore, poi esce.
    */
    static int sum(int a, int b) {
        return a + b;
    }
    // ESERCIZIO: metodo max
    // Scrivi un metodo che, dati due numeri, ti ridà il più grande dei due.
    
    /*
    ritorno boolean (true/false)
    return a > b; il confronto è già un valore vero/falso, lo ridai diretto
    */
    static boolean isMaggiore(int a, int b) {
        return a > b;
    
    }
    static void stampaDoppio(int numero) {
        System.out.println("Il doppio di " + numero + " = " + (numero * 2));

    }  
}
