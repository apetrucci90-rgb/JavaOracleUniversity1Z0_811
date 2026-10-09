package arrays;

public class Arrays {
    public static void main(String[] args) {
        
        int[] coperti = new int[7]; // coperti punta ad un array di 7 celle di valore 
                                    // 0 -> [0, 0, 0, 0, 0, 0, 0] 

        /*
        int[] coperti = new int[7]; crea un array di 7 interi sull'heap

        1. coperti[0] vale 0. Appena new gira, Java azzera tutto il blocco: ogni 
        int parte da 0. Non c'è spazzatura, non resta vuoto: è 0. Tutte le 7 celle
        valgono 0
        2. coperti.length vale 7. È il numero di celle deciso alla creazione con
        new int[7], fisso per sempre. Nota: length senza parentesi (è un campo
        dell'array, non un metodo)

        Gli indici validi vanno da 0 a 6 (length - 1). 
        coperti[7] non esiste -> ArrayIndexOutOfBoundsException
        */
        System.out.println("coperti[0] = " + coperti[0] + ", length = " + coperti.length);

        coperti[0] = 4;
        coperti[3] = 2;

        System.out.println(coperti[0] + " " + coperti[3] + " " + coperti[5]);

        /*
        1. coperti[0] = 4;
            - Java valuta l'indice 0, va alla cella 0 e ci scrive 4, sovrascrivendo 
            il vecchio 0.
            - Array ora: [4, 0, 0, 0, 0, 0, 0]. La dimensione non cambia
        2. coperti[3] = 2;
            - Indice 3, va alla cella e scrive un 2 al posto dello 0
            - Array ora: [4, 0, 0, 2, 0, 0, 0]
        3. System.out.println(coperti[0] + " " + coperti[3] + " " + coperti[5]);
            - coperti[0] -> legge la cella 0 che vale 4
            - + " " -> c'è una String, quindi tutto diventa concatenazione di testo
            - coperti[3] -> legge la terza cella che vale 2
            - + coperti[5] -> legge la cella 5 che è ancora al suo valore originario: 0
        */


        
    }
    
}
