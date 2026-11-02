package inheritance;

/*
 ============================================================================
  ESERCIZIO 2 - RIPASSO PRATICO MODULO 6.1 (Inheritance)
 ============================================================================
  Ripasso di quello fatto finora: extends, protected, super(...),
  @Override, super.metodo(), polimorfismo, test is-a / has-a.
  (Niente 6.2: toString/equals/hashCode di Object arrivano dopo.)

  Modello gia' svolto a cui ispirarti: Esercizio1Piatto (Piatto -> Pizza).
  Dominio nuovo per non copiare: i MEZZI DI CONSEGNA del ristorante.

  --------------------------------------------------------------------------
  COSA DEVI REALIZZARE (obiettivi, non codice)
  --------------------------------------------------------------------------
   1. UN PADRE "mezzo di consegna"
      - due dati comuni a ogni mezzo (es. un'identita' e un numero), tenuti
        in modo che i FIGLI possano leggerli direttamente (scegli tu la
        visibilita' giusta: ripassa perche').
      - NESSUN costruttore senza argomenti: solo quello che riceve i due dati.
      - un metodo che descrive il mezzo a parole.

   2. DUE FIGLI, ciascuno un tipo diverso di mezzo
      - ognuno aggiunge UN proprio dato in piu' che il padre non ha.
      - ognuno nel costruttore deve far partire la parte ereditata (ragiona
        su quale deve essere la prima istruzione e perche' e' obbligatoria qui).
      - ognuno ridefinisce la descrizione: NON riscrivere da capo, riusa la
        descrizione del padre e aggiungici solo la parte sua.

   3. NEL main - POLIMORFISMO
      - crea un padre "puro" e un oggetto per ciascuno dei due figli.
      - mettili tutti in UN contenitore dichiarato del tipo del PADRE.
      - scorrilo con un ciclo e stampa ognuno: ciascuno deve uscire con la
        PROPRIA descrizione, senza che tu chieda di che tipo e'.

   4. is-a VS has-a (in un commento, a parole)
      - spiega perche' "il Ristorante HA dei mezzi" NON si modella con
        l'ereditarieta', mentre "un Furgone E' un mezzo" si'.

  --------------------------------------------------------------------------
  Quando hai finito: compila, esegui, controlla che le 3 stampe siano
  ciascuna quella giusta. Poi committa.
 ============================================================================
*/

public class Esercizi2 {
    public static void main(String[] args) {

        // Svolgi qui: crea gli oggetti, mettili nel contenitore, stampali.

    }
}

// Scrivi qui sotto il padre e i due figli.
