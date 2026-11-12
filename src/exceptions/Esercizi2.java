package exceptions;

import java.io.FileReader;
import java.io.IOException;

/*
============================================================
DRILL: CHECKED vs UNCHECKED
============================================================

Regola: se togliendo il try/catch il codice NON compila -> CHECKED
        (il compilatore ti obbliga: try/catch oppure throws).
        Se compila e crepa solo a runtime -> UNCHECKED
        (estende RuntimeException; gestirla e' una tua scelta).

Per ogni metodo:
  1) scrivi il codice che FA scattare l'eccezione indicata
  2) nel commento // scrivi: CHECKED o UNCHECKED
  3) gestiscila con try/catch e stampa e.getMessage()

La #1 e' svolta da me come modello. Le altre 9 le fai tu.
============================================================
*/
public class Esercizi2 {

    // #1 - FileReader su un file che non esiste  --> SVOLTA (modello)
    // CHECKED: senza try/catch (o throws) NON compila.
    static void drill1() {
        try {
            FileReader f = new FileReader("inesistente.txt");
            f.close();
        } catch (IOException e) {
            System.out.println("#1 Errore: " + e.getMessage());
        }
    }

    // #2 - Integer.parseInt("abc")  --> NumberFormatException
    // UNCHECKED: NumberFormatException estende RuntimeException -> compila 
    // anche senza try/catch.
    static void drill2() {
        try {
            int n = Integer.parseInt("abc"); // abc non è un numero, scatta qui
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("#2 Errore: " + e.getMessage());
        }
    }


    // #3 - accesso a indice fuori da un array    --> ArrayIndexOutOfBoundsException
    // ...


    // #4 - divisione intera per zero             --> ArithmeticException
    // ...


    // #5 - chiamare .length() su una String null --> NullPointerException
    // ...


    // #6 - Thread.sleep(100)                     --> InterruptedException
    // ...


    // #7 - cast sbagliato: Object o = "ciao"; (Integer) o  --> ClassCastException
    // ...


    // #8 - "ciao".charAt(50)                     --> StringIndexOutOfBoundsException
    // ...


    // #9 - new int[-3]                           --> NegativeArraySizeException
    // ...


    // #10 - ricorsione infinita (un metodo che chiama se stesso) --> StackOverflowError
    // ...


    public static void main(String[] args) {
        drill1();
        // man mano che completi: drill2(); drill3(); ...
        drill2();
    }
}
