// In quale cartella logica vive questa classe. src/arrays
package arrays;
// Importa una classe dalla libreria già presente in Java.
import java.util.Arrays;
// Dichiara la classe: il nome DEVE essere identico al nome del file.
public class EsameArray1 {

    /*
    Questo è il METODO MAIN: il punto esatto da cui parte il programma.
    - public -> la JVM deve poterlo chiamare da fuori
    - static -> si esegue senza creare un oggetto della classe
    - void -> non restituisce niente
    - main -> il nome che la JVM cerca per partire
    - String[] args -> eventuali parametri passati da riga di comando
    */
    public static void main(String[] args) {
        /*
        STEP 1: creare un array, stamparlo, misurarlo
        Forma A: creo e riempio subito, la dimensione Java la conta da sola
        */
        int[] prezzi = {5, 10, 15, 20};

        // println su un array nudo darebbe spazzatura.
        System.out.println("prezzi = " + Arrays.toString(prezzi));
        // .length = numero di caselle senza parentesi. Nelle String 
        // invece è un metodo: length().
        System.out.println("numero prezzo = " + prezzi.length);
        // Le caselle vanno da 0 a length-1. L'ultima è a length - 1
        System.out.println("ultimo numero = " + prezzi[prezzi.length - 1]);

        //STEP 2: creare con new -> valori di default 
        // Con new chiedo solo quante caselle, non cosa metterci.
        // Java non le lascia vuote: un int[] parte tutto a 0 di default
        int[] sconti = new int[4];
        System.out.println("sconti = " + Arrays.toString(sconti)); // [0 ,0 , 0, 0]

        // STEP 3 : for classico - il solo che può modificare
        // Ho l'indice i, quindi scrivo dentro la casella vera: prezzi[i].
        // Aumento di 2
        for (int i = 0; i < prezzi.length; i++) {
            prezzi[i] = prezzi[i] + 2;
        }
        System.out.println("prezzi dopo + 2 = " + Arrays.toString(prezzi));

        // STEP 4: for-each -> comodo per leggere
        // Scorro i valori 1 ad 1 (non mi serve l'indice) e li sommo
        int somma = 0;
        for (int p : prezzi) {
            somma = somma + p; // Uso il valore, non lo modifico
        }
        System.out.println("somma prezzi = " + somma);

        // STEP 5: la trappola del for-each (non modifica l'array)
        // Provo ad aggiungere 1000 ad ogni prezzo con for-each. Ma 'p'
        // è una copia del valore (int = tipo primitivo), non la casell
        // vera: cambiare la copia non tocca l'array
        for(int p : prezzi) {
            p = p + 1000; // modifico solo la copia p inutilmente
        }
        // Risultato: prezzi è rimasto [7, 12, 17, 22]. Il for-each non ha 
        // cambiato niente. 
        System.out.println("prezzi dopo for-each = " + Arrays.toString(prezzi));

        // STEP 6: riferimento (=) vs copia vera (Arrays.copyOf)
        // 'alias' NON è un nuovo array: '=' copia solo il bigliettino
        // alias e prezzi puntano allo stesso cassetto
        int[] alias = prezzi;

        // 'copia' invece è un cassetto nuovo con gli stessi valori
        int[] copia = Arrays.copyOf(prezzi, prezzi.length);

        // Cambio il primo elemento passandi da alisa (cassetto condiviso con prezzi)
        alias[0] = 999; 
        // e il SECONDO elemento passando da copia (cassetto separato, tutto suo)
        copia[1] = -1;
        

    }
    
}
