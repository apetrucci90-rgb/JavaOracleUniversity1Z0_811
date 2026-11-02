package inheritance;

/*
 ============================================================================
  ESERCIZIO 2 - EREDITARIETA' - DRILL A SCHEMA 10
 ============================================================================
  Modello di riferimento: Esercizio1Piatto (Piatto -> Pizza) gia' svolto.
  Dominio libero (resta sul ristorante se vuoi). Per OGNI caso: una
  superclasse con 2-3 dati comuni e un metodo che li descrive; una
  sottoclasse che aggiunge il suo dato e ridefinisce la descrizione; nel
  main crei gli oggetti e li stampi.

  Obiettivo del drill: ripetere lo stesso schema 10 volte, cambiando ogni
  volta UN aspetto, finche' il meccanismo diventa automatico.

  --------------------------------------------------------------------------
  I 10 CASI (cosa deve esercitare ognuno)
  --------------------------------------------------------------------------
   1. BASE
      Padre con dati comuni + descrizione; figlio che aggiunge un dato e
      arricchisce la descrizione.

   2. CAMPI PROTETTI
      Il figlio deve leggere i dati del padre direttamente dentro un proprio
      metodo: scegli tu la visibilita' giusta dei campi del padre perche' sia
      possibile.

   3. COSTRUTTORE DEL PADRE OBBLIGATORIO
      Il padre NON ha un costruttore senza argomenti: il figlio e' costretto a
      inizializzare esplicitamente la parte ereditata in prima istruzione.

   4. RIUSO DELLA VERSIONE DEL PADRE
      Nel metodo ridefinito il figlio NON riscrive tutto: riusa il risultato
      del metodo del padre e ci aggiunge solo la sua parte.

   5. POLIMORFISMO
      Metti oggetti di sottoclassi DIVERSE in un contenitore dichiarato del
      tipo del padre; scorrilo con un ciclo e stampa ciascuno: ognuno deve
      usare la propria descrizione.

   6. CATENA A TRE LIVELLI
      Nonno -> padre -> figlio. Il figlio eredita lungo tutta la catena; la
      descrizione piu' specifica somma i contributi dei livelli sopra.

   7. toString EREDITATO DA Object
      Ridefinisci il metodo che Java chiama in automatico quando stampi un
      oggetto; verifica che senza la ridefinizione comparirebbe una stringa
      tecnica inutile.

   8. is-a VS has-a
      Un caso in cui l'ereditarieta' sarebbe SBAGLIATA: la relazione e'
      "ha un", non "e' un". Risolvilo con un campo (composizione), non
      estendendo. Scrivi in un commento perche' qui extends non va.

   9. CONTATORE CONDIVISO LUNGO LA GERARCHIA
      Un conteggio unico per tutta la famiglia che cresce ogni volta che nasce
      un oggetto, figli compresi; esponilo con un metodo di classe.

  10. RIEPILOGO (il caso "esame")
      Tutto insieme: padre con modifica controllata dei dati (validazione),
      figlio che aggiunge e ridefinisce, e stampa polimorfica di una lista
      mista padre/figli.

  --------------------------------------------------------------------------
  Quando hai finito: compila, esegui, controlla gli output. Poi committa.
 ============================================================================
*/

public class Esercizi2 {
    public static void main(String[] args) {

        // Svolgi qui: crea gli oggetti dei vari casi e stampali.

    }
}

// Scrivi qui sotto le classi (superclassi e sottoclassi) dei 10 casi.
