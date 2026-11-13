# Ripasso Generale — "La Stazione" (capstone, tutto il corso)

Un solo file: `Stazione.java`, package `ripassogenerale`.
Dentro ci stanno TUTTE le classi (una `public class Stazione` col `main`, le altre package-private nello stesso file — come nei tuoi Esercizi).

Dominio: una **stazione di cucina** che gestisce un menu di piatti e li "manda" in servizio.

## Schema a passi — #1 svolto da me, il resto lo scrivi tu

| #  | Passo | Argomenti che tocca | Dove hai già l'esempio |
|----|-------|---------------------|------------------------|
| 1  | `abstract class Piatto` (campi privati, costruttore, getter, `static` contatore, 2 metodi astratti + `scheda()` concreto = template) | classe astratta, incapsulamento, costruttore, static, template method | ✅ **svolto sotto** |
| 2  | `interface Impiattabile { String impiatta(); }` | interfaccia | `interfaces/Esercizi1` (Pagabile) |
| 3  | `class Primo extends Piatto implements Impiattabile` — `super(...)`, `@Override` dei 3 metodi | ereditarietà, `super`, `@Override`, implements | `inheritance/Esercizi2` |
| 4  | `class Dolce extends Piatto implements Impiattabile` — stesso schema, numeri diversi | ripetizione ereditarietà/interfaccia | come #3 |
| 5  | `class CucinaException extends Exception` con `super(messaggio)` | eccezione **custom checked** | `exceptions/Esercizi3` (lanciavi IllegalArgument) |
| 6  | Nel costruttore di `Piatto`: `if (porzioni <= 0) throw new CucinaException(...)` → la firma del costruttore dichiara `throws CucinaException` | `throw`, checked, `throws` | `exceptions/Esercizi3` |
| 7  | `class Stazione` con `ArrayList<Piatto> menu`; metodo `aggiungi(Piatto p)` + **overload** `aggiungi(Piatto p, int volte)` | ArrayList, metodi, overload | `overload/` + `arrays/` ArrayList |
| 8  | `costoTotale()` con **for-each** e `+=`; `contaImpiattabili()` con **instanceof** | for-each, operatori, polimorfismo, instanceof | `arrays/` for-each |
| 9  | `main`: crea i piatti **dentro un `try`**, aggiungili, stampa le `scheda()` (polimorfismo), `catch (CucinaException e)`, `finally` che stampa "Servizio chiuso" | polimorfismo, try/catch/finally | `exceptions/Esercizi4` (catena) |
| 10 | Sfida: cicla un `Piatto[]` misto; per ciascuno `if (p instanceof Impiattabile imp) ...imp.impiatta()` | instanceof pattern, casting | — |

Obiettivo finale: compila (`javac ripassogenerale/Stazione.java`) e gira (`java ripassogenerale.Stazione`) stampando le schede dei piatti, il costo totale, quanti sono impiattabili, e gestendo l'errore se provi a creare un piatto con 0 porzioni.

---

## #1 — SVOLTO (il tuo pattern di riferimento)

```java
package ripassogenerale;

import java.util.ArrayList;   // ti servira' dal passo 7

abstract class Piatto {
    // incapsulamento: campi privati, nessuno li tocca da fuori
    private String nome;
    private int porzioni;

    // static: appartiene alla CLASSE, non al singolo piatto.
    // Conta quanti piatti sono stati creati in tutta la stazione.
    static int creati = 0;

    // costruttore: riceve i dati e inizializza lo stato.
    // (al passo 6 qui dentro aggiungerai il controllo con throw)
    Piatto(String nome, int porzioni) {
        this.nome = nome;
        this.porzioni = porzioni;
        creati++;              // ogni volta che nasce un piatto, +1
    }

    // getter: lettura controllata dei campi privati
    String getNome()    { return nome; }
    int getPorzioni()   { return porzioni; }

    // metodi ASTRATTI: Piatto non sa quanto costa o quanto cuoce.
    // Lo decide ogni figlio (Primo, Dolce...).
    abstract double costo();
    abstract int minutiCottura();

    // metodo CONCRETO = template method: usa i due astratti senza
    // sapere come sono fatti. Vale uguale per tutti i figli.
    String scheda() {
        return nome + " (" + porzioni + " porz.) - "
             + costo() + " euro, " + minutiCottura() + " min";
    }
}
```

Cosa nota di questo #1:
- `abstract class` non si puo' istanziare: `new Piatto(...)` da' errore. Esiste solo per far da padre.
- `scheda()` chiama `costo()` e `minutiCottura()` che qui NON hanno corpo: li riempiranno i figli. Questo e' il template method.
- `static int creati` e' uno solo per tutta la classe, condiviso. `getPorzioni()` invece e' diverso per ogni oggetto.

Ora tocca a te dal **#2**: crea l'interfaccia `Impiattabile`. Quando l'hai scritta, dimmelo e ti interrogo prima del #3.
