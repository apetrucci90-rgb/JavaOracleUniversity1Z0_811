# Glossario Java — il mio dizionario personale (1Z0-811)

Formato: **termine inglese** (come all'esame) · *italiano* — significato in parole semplici — `micro-esempio`.
Regola: quando mi blocco su una parola, la aggiungo qui. Ripassare tutto prima dell'esame.

---

## 1. Classi e oggetti

- **class** · *classe* — lo stampo: dice com'è fatto un tipo di oggetto (dati + metodi). — `class Carta { ... }`
- **object / instance** · *oggetto / istanza* — una cosa concreta creata dallo stampo con `new`. — `new CartaDebito(...)` è un'istanza.
- **field (attribute)** · *campo / attributo* — una variabile dentro la classe: lo stato dell'oggetto. — `private double saldo;`
- **constructor** · *costruttore* — il metodo speciale che costruisce l'oggetto e ne imposta i campi; stesso nome della classe, niente tipo di ritorno. — `Carta(String nome) { ... }`
- **instantiate** · *istanziare* — creare un oggetto da una classe. — `new Portafoglio()`
- **member** · *membro* — tutto ciò che sta dentro la classe (campi e metodi).
- **state** · *stato* — i valori attuali dei campi di un oggetto.

## 2. Metodi

- **method** · *metodo* — un blocco di codice con un nome, che fa qualcosa; si chiama con `nome(...)`. — `scheda()`
- **parameter** · *parametro* — la variabile dichiarata nella firma del metodo. — `int ms` in `attendi(int ms)`
- **argument** · *argomento* — il valore vero che passi quando chiami. — `attendi(100)` → 100 è l'argomento
- **return type** · *tipo di ritorno* — cosa restituisce il metodo; `void` = niente. — `double costo()` ritorna un double
- **signature** · *firma* — nome del metodo + lista dei parametri; è ciò che lo identifica.
- **getter / setter** · — metodo che legge (`getX`) o scrive (`setX`) un campo privato. — `getSaldo()`
- **void** · — "nessun valore di ritorno": il metodo fa e non consegna niente.
- **static** · — appartiene alla CLASSE, non al singolo oggetto; uno condiviso da tutti. — `Carta.emesse`

## 3. Incapsulamento e visibilità

- **encapsulation** · *incapsulamento* — chiudere i dati dentro l'oggetto ed esporre solo ciò che serve.
- **access modifier** · *modificatore di accesso* — `private` (solo dentro la classe), `public` (tutti), `protected` (classe + figli).
- **constant** · *costante* — valore fisso che non cambia; parola chiave `final`. — `final double IVA = 0.22;`

## 4. Ereditarietà e polimorfismo

- **inheritance** · *ereditarietà* — una classe prende campi e metodi da un'altra con `extends`. — `class Primo extends Piatto`
- **superclass / subclass** · *superclasse / sottoclasse* — padre / figlio. Anche "parent / child".
- **extends** · — «è un»: eredita dal padre. Una classe ha UN solo padre.
- **implements** · — «sa fare»: realizza il contratto di un'interfaccia. Una classe ne può implementare TANTE.
- **override** · *sovrascrivere* — il figlio riscrive un metodo del padre con `@Override`. — `@Override double costo()`
- **overload** · *sovraccaricare* — stesso nome di metodo, parametri diversi, nella stessa classe. — `aggiungi(c)` / `aggiungi(c, 3)`
- **super** · — richiama il costruttore o un metodo del padre. — `super(nome, pin)`
- **abstract class** · *classe astratta* — padre che non si può istanziare; può avere metodi "buco" (astratti). — `abstract class Carta`
- **abstract method** · *metodo astratto* — dichiarato senza corpo, finisce con `;`; lo riempie il figlio. — `abstract double costo();`
- **interface** · *interfaccia* — un contratto di sole capacità (metodi senza corpo + costanti). — `interface Contactless`
- **polymorphism** · *polimorfismo* — lo stesso metodo si comporta diverso secondo il tipo reale dell'oggetto. — `preleva` usa il `limiteDisponibile()` giusto
- **instanceof** · — controlla se un oggetto è di un certo tipo. — `if (c instanceof Contactless)`
- **cast / casting** · *conversione di tipo* — trattare un oggetto/valore come un altro tipo. — `(int) 3.9` → 3

## 5. Eccezioni

- **exception** · *eccezione* — oggetto-errore creato quando qualcosa va storto a runtime.
- **checked exception** · — il compilatore ti OBBLIGA a gestirla (`try/catch`) o dichiararla (`throws`). Estende `Exception`.
- **unchecked exception** · — nessun obbligo; errori da bug. Estende `RuntimeException`.
- **throw** · — lanci un'eccezione adesso. — `throw new PinErratoException("...")`
- **throws** · — dichiari nella firma che il metodo può lanciarla (la passi a chi chiama). — `void preleva(...) throws ...`
- **try / catch / finally** · — `try` codice rischioso, `catch` gestisce l'errore, `finally` gira SEMPRE.
- **getMessage()** · — restituisce il testo dell'eccezione. — `e.getMessage()`
- **stack trace** · — la lista delle chiamate che ha portato all'errore.

## 6. Linguaggio e strumenti

- **compile-time** · *tempo di compilazione* — mentre gira `javac`; qui saltano gli errori di scrittura.
- **runtime** · *tempo di esecuzione* — mentre il programma gira davvero; qui nascono le eccezioni.
- **bytecode** · — la lingua di mezzo (`.class`) che la JVM esegue.
- **JVM / JRE / JDK** · — motore che esegue il bytecode / JVM+librerie / JDK = JRE + attrezzi (`javac`, `java`).
- **package** · *pacchetto* — una cartella/namespace che raggruppa classi. — `package exceptions;`
- **import** · — rende usabile una classe di un altro pacchetto. — `import java.util.ArrayList;`
- **literal** · *letterale* — un valore scritto diretto nel codice. — `"ciao"`, `42`, `3.14`
- **reference** · *riferimento* — "l'indirizzo" di un oggetto; `==` fra oggetti confronta i riferimenti, non il contenuto.

## 7. Array e collezioni

- **array** · — contenitore a lunghezza FISSA di elementi dello stesso tipo. — `int[] voti = new int[5];`
- **element** · *elemento* — una casella dell'array/lista.
- **index** · *indice* — la posizione, parte da **0**. — `voti[0]` è il primo
- **ArrayList** · — lista che cresce e si accorcia; sta in `java.util`. — `ArrayList<Carta> carte`
- **iterate / for-each** · *scorrere* — passare su ogni elemento. — `for (Carta c : carte) { ... }`
- **iterator** · *iteratore* — oggetto che scorre una collezione un elemento alla volta.

---

## 8. Mappa dei nomi in un file Java reale

Un file che compila davvero: accanto a ogni pezzo c'è il **nome proprio** (inglese + italiano).
Puoi copiarlo in un file `Esempio.java` e compilarlo con `javac Esempio.java`.

```java
package banca;                          // PACKAGE (package) = la cartella/namespace del file

import java.util.ArrayList;             // IMPORT (import) = porta una classe da un altro package

// INTERFACE (interfaccia) = contratto di sole capacita'
interface Bonificabile {
    double LIMITE = 5000.0;             // CONSTANT (costante) = qui e' public static final implicito
    boolean bonifica(double importo);   // ABSTRACT METHOD (metodo astratto) = senza corpo, finisce con ;
}

// ABSTRACT CLASS (classe astratta) = fa da padre, non si puo' istanziare
abstract class Conto {
    private String titolare;            // FIELD (campo) privato = ENCAPSULATION (incapsulamento)
    private double saldo;               // FIELD (campo)
    static int apertiTotali = 0;        // STATIC FIELD (campo static) = uno solo per tutta la classe

    Conto(String titolare, double saldo) {   // CONSTRUCTOR (costruttore) + PARAMETERS (parametri)
        this.titolare = titolare;            // THIS = distingue il campo dal parametro
        this.saldo = saldo;
        apertiTotali++;                      // uso del campo static
    }

    String getTitolare() { return titolare; } // GETTER (getter) = legge un campo privato
    double getSaldo()    { return saldo; }    // RETURN TYPE (tipo di ritorno) = double

    abstract double limite();                 // ABSTRACT METHOD = il "buco", lo riempie il figlio

    void versa(double importo) {              // METHOD (metodo), RETURN TYPE = void (niente)
        saldo += importo;
    }
    void versa(double importo, int volte) {   // OVERLOAD (overload) = stesso nome, parametri diversi
        for (int i = 0; i < volte; i++) saldo += importo;
    }
}

// CUSTOM EXCEPTION (eccezione custom), CHECKED perche' extends Exception
class SaldoException extends Exception {
    SaldoException(String messaggio) {        // CONSTRUCTOR
        super(messaggio);                     // SUPER (super) = chiama il costruttore del padre
    }
}

// INHERITANCE (ereditarieta') = extends; + implements di un'interfaccia
class ContoBase extends Conto implements Bonificabile {   // SUBCLASS (sottoclasse) di Conto
    ContoBase(String titolare, double saldo) {
        super(titolare, saldo);               // SUPER = costruisce prima la parte-padre
    }
    @Override                                 // OVERRIDE (override) = riscrive un metodo del padre
    double limite() { return getSaldo(); }    // riempie il metodo astratto

    @Override
    public boolean bonifica(double importo) { // IMPLEMENT del metodo dell'interfaccia (public!)
        return importo <= LIMITE;             // usa la COSTANTE dell'interfaccia
    }
}

public class Esempio {                        // PUBLIC CLASS = il nome deve = nome del file (Esempio.java)
    public static void main(String[] args) {  // ENTRY POINT (main) = da qui parte la JVM
        ArrayList<Conto> conti = new ArrayList<>();   // ARRAYLIST + OBJECT/INSTANCE (new = istanzia)

        Conto c = new ContoBase("Andrea", 100.0);     // POLYMORPHISM: variabile di tipo PADRE, oggetto FIGLIO
        //                       ^^^^^^^^  ^^^^^ = ARGUMENTS (argomenti) = i valori veri passati
        conti.add(c);                                 // chiamata di metodo; c = ARGUMENT

        for (Conto x : conti) {                       // FOR-EACH = scorre ogni ELEMENT (elemento)
            System.out.println(x.getSaldo());
        }

        if (c instanceof Bonificabile b) {            // INSTANCEOF + cast: "e' bonificabile?" e lo converte in b
            System.out.println(b.bonifica(200));
        }

        try {                                         // TRY = codice che puo' fallire
            controlla(-5);
        } catch (SaldoException e) {                  // CATCH = gestisce l'eccezione di QUEL tipo
            System.out.println(e.getMessage());       // getMessage() = il testo dell'errore
        } finally {                                   // FINALLY = gira SEMPRE, errore o no
            System.out.println("fine");
        }
    }

    static void controlla(double v) throws SaldoException {   // THROWS = dichiara la checked
        if (v < 0) {
            throw new SaldoException("negativo: " + v);       // THROW = lancia adesso. "negativo:" = LITERAL
        }
    }
}
```

---

### Da aggiungere man mano (termini su cui mi blocco)
- (qui le prossime parole nuove)
