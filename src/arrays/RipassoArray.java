package arrays;

import java.util.ArrayList;

public class RipassoArray {
    public static void main(String[] args) {
        /*
        TAPPA 1 - Cos'è un array e le due forme di creazione
        ----------------------------------------------------
        Un array è un contenitore di dimensione FISSA che tiene più 
        valori dello STESSO tipo, numerati a partire da 0.

        Forma A: con le graffe -> crea e riempie subito
        La dimensione la conta Java da sola
        */
        int [] numeri = {10, 20, 30, 40};

        // Forma B: con new -> crea 3 caselle VUOTE, da riempire
        int [] vuoto = new int[3];

        /*
        TAPPA 2 - Accesso per indice e .length
        --------------------------------------
        Si accede ad una casella con il suo indice tra parentesi quadre.
        Il primo elemento è ad indice 0.
        */

        System.out.println("primo elemento = " + numeri[0]); // 10
        System.out.println("secondo elemento = " + numeri[1]); // 20

        /*
        .length è il NUMERO di caselle. Si scrive SENZA parentesi (non è
        un metodo come nelle String, dove invece è length()).
        */
       System.out.println("quante caselle = " + numeri.length); // 4

       // Quindi l'ULTIMO elemento è a length - 1.
       System.out.println("ultimo elemento = " + numeri[numeri.length - 1]); // 40

       /*
       TAPPA 3 - Valori di default e l'errore out-of-bounds
       */
        
    }
    
}
