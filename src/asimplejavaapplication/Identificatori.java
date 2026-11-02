package asimplejavaapplication;

public class Identificatori {
    public static void main(String[] args) {
        int prezzo = 1;            // VALIDO
        // int 2porzioni = 1;      // NON valido: non può iniziare con una cifra
        int _totale = 1;           // VALIDO: '_' ammesso come primo carattere
        int $costo = 1;            // VALIDO: '$' ammesso (sconsigliato per convenzione)
        // int class = 1;          // NON valido: 'class' è parola riservata
        // int nome piatto = 1;    // NON valido: niente spazi nel nome
        int Static = 1;            // VALIDO: 'Static' con la S maiuscola NON è la keyword 'static'
        // int true = 1;           // NON valido: 'true' è un literal riservato
        int numeroOrdine = 1;      // VALIDO: camelCase
        // int costo-totale = 1;   // NON valido: il '-' non è ammesso negli identificatori
    }
}











