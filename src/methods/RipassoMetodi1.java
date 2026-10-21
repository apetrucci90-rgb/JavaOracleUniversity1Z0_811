package methods;

public class RipassoMetodi1 {
    public static void main (String[] args) {
        // ES 1.
        System.out.println("Il cubo di 4 è: " + cubo(4));

        //ES. 2  
        saluto("Andrea");
        saluto("Alessia");

        // ES. 3 Aggiungo print perchè devo avere true o false come risposta
        System.out.println("10 è pari? " + isPari(10));
        System.out.println("7 è pari? " + isPari(7));

        // ES. 4 
        int soldi = 1000;
        raddoppiaStipendio(soldi);
        System.out.println("fuori, soldi = " + soldi);

        // ES. 5
        int [] voti = {10, 20, 30};
        azzeraPrimo(voti);
        System.out.println("voti[0] = " + voti[0]);
    }
    /*
    ESERCIZIO 1: DOMANDA, metodo che ridà il cubo di un numero
    */
    static int cubo(int x) {
        return x * x * x;
    }
    // ESERCIZIO 2: METODO, metodo void che stampa "Ciao, <nome>!" 
    static void saluto(String nome) {
        System.out.println("Ciao, " + nome + "!");
    }
    // ESERCIZIO 3: DOMANDA, metodo boolean, true se è pari
    static boolean isPari(int n) {
        return n % 2 == 0;
    }
    /* 
    ESERCIZIO 4: PASS-BY-VALUE: metodo void, passo una copia, non 
    l'originale.
    main:       soldi = [1000]
    metodo:     s = [1000] -> s*2 -> [2000]

    Dentro il metodo s diventa 2000, ma soldi nel main è un'altra casella;
    resta 1000.

    Una variabile dichiarata dentro un metodo (parametri inclusi) è locale:
    esiste solo lì. Lo stesso nome in un altro metodo è un'altra variabile.
    */
    static void raddoppiaStipendio(int s) {
        s = s * 2;
        System.out.println("dentro il metodo: s = " + s);
    }
    /*
    ESERCIZIO 5: PASS-BY-VALUE con ARRAY
    Java passa sempre una copia del valore, ma copia di cosa?
    Java copia ciò che è dentro la scatola. SEMPRE. Cambia solo cosa copia.
    - Caso int: dentro c'è il valore 1000 che si copia (la copia è un numero
    a sè). Se la cambio, l'originale non lo sa e quindi fuori non cambia
    - Caso array: DENTRO non c'è l'array, ma il suo indirizzo, che vive da 
    un'altra parte. Si copia l'indirizzo -> ora voti ed a sono due scatole
    diverso ma con lo stesso indirizzo, puntano allo stesso array.
    */
    static void azzeraPrimo(int[] a) {
        a [0] = 0;
    }







}
