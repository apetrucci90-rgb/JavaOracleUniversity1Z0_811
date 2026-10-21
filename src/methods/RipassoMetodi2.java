package methods;

public class RipassoMetodi2 {
    public static void main(String[] args) { 

        int[] primo = {8, 3, 12, 0, 5};
        int[] secondo = {1, 1, 9, 2};

        System.out.println("sotto soglia (soglia 2): " + 
            quantiSottoSoglia(primo, 2));
        System.out.println("sotto soglia (soglia 5): " +
            quantiSottoSoglia(secondo, 5));

        System.out.println("primo contiene 12? " + 
            contiene(primo, 12));
        System.out.println("primo contiene 7? " + 
            contiene(primo, 7));

        System.out.println("massimo di primo = " +
            massimo(primo));
        System.out.println("massimo di secondo = " + 
            massimo(secondo));

        System.out.println("media del primo = " + 
            media(primo));
        System.out.println("media del secondo = " +
            media(secondo));
    } 
    static int quantiSottoSoglia(int[] valori, int soglia) {
        int quante = 0;
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] < soglia) {
                quante++;
            }
        }
        return quante;

    }
    static boolean contiene(int[] valori, int cercato) {
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] == cercato) {
                return true; 
        }
    }
    return false;
    }
    static int massimo(int[] valori) {
        int max = valori[0];
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] > max) {
                max = valori[i];
            }
        }
        return max;
    }
    static double media(int[] valori) {
        int somma = 0;
        for (int i = 0; i < valori.length; i++) {
            somma += valori[i];
        }
        return (double) somma / valori.length;
    }
}
    

