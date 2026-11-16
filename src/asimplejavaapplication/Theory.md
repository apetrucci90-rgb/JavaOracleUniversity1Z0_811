1. JAVA LANGUAGE VOCABULARY
Java has a vocabulary: words with a fixed meaning that give instructions to the program. Are 3 kinds:
    Keywords
    - All lowercase
    - They cannot be used as identifiers

    Identifiers
    - the names you invent for your units of code: variables, methods, classes, packages.
    int porzioni = 4; / porzioni is an identifier

    Literals
    - fixed values written directly in the code and assigned to variables.
    Examples: 4, 3.14, 'A', true, false, null

2. RULES FOR IDENTIFIERS    

These are compiler rules:
- It must start with a letter, _ or $
- It must not start with a digit
- It cannot be true, false or null (they are literals)
- A single _ alone is not valid (since Java 9)
- It cannot be a keyword
- It cannot contains operators or spaces
- Java is case sensitive (Porzioni != porzioni)

3. JAVA SYNTAX: HOW CODE IS STRUCTURED

public class Test {     // The CLASS opens
    private String greeting = "Hello";      // a VARIABLE: holds informations

    public String sayHello(String name) {        // 3. a METHOD: does an action
        return greeting + " " + name;            //    a STATEMENT, ends with ;
    }                                            //    the method closes

    public static void main(String[] args) {     // 4. the MAIN method: the program starts here
        Test t = new Test();
        System.out.print(t.sayHello("Joe"));     //    prints: Hello Joe
    }                                            //    main closes

}                                                // the class closes


FOUR RULES
1) Java code is grouped into classe. The claa is the main unit of code: EVERYTHING YOU WRITE GOES INSIDE A CLASS.
2) Classes contains variables and methods.
    - variables hold information
    - methods implement actions, the logic
3) Code blocks are delimitated with curly braces {} 
4) Every statement ends with a semicolon ;. A statment is an instruction.

4. COMMENTS

A Comment is text the compiler ignores: it is not translated and executed. Its purpose is to: 
    - describe what the program is supposed to do;
    - explain the logic you coded.

Comments can go anywhere in the code:
    // single line comment
    /* */ multi-line comment

Reading code is as important as writing it. 

5. CREATING A JAVA APPLICATION

An application is a class the JVM can start. To create one:
1) create a plain text file representig your class;
2) the file must have the same name as the class in it;
3) save it with the extension .java.

// file Test.java
public class Test {     // must be EXACTLY the file name: "public class test" in Test.java does NOT compile
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

- The JVM recognizes the main method as the starting point of the program, the entry point. If a class has main, the JVM can run it as an application.
- The method body, between { }, contains the program logic.
- What is print to the console is the program output.

6. THE MAIN METHOD, WORD BY WORD

public static void main(String[] args)

- public --- It means it is visible from outside the class. The JVM is outside my class: if main were not public, the JVM couldn't call it, like a locked front door. The opposite is --- private --- visible only inside the class
- static --- "no object needed" because to use a method you first create an object from the class. But when the program start, no object exist yet. --- static --- means the method belongs to the class itself, so it can be called without creating an object; the JVM call the Test.main() directly
- void --- "gives nothing back" ; some methods return a result to whoever called them. For example a method that calculates IVA returns a number. --- void --- means this method returns nothing, beacause when it ends the program ends, and nobody is waiting a result.
- main --- the name
It must be exactly main, all lowercase. Main or start won't work: the JVM looks for that exact name. Every other method in your programs can have any name you like, this one can't.
- (String[] args) --- Inside the round brackets ( ) a method lists its parameters: the informations it receives when it's called. main receives one parameter: 
    - String = a text;
    - [] = more than one, an ARRAY of texts (NOT an ArrayList: that is a different class);
    - args = the name we give to that list (arguments);
So (String[] args) is "a list of texts, called args"

There are 3 equivalent forms:
    public static void main(String[] args)   // brackets after the type — the most common
    public static void main(String args[])   // brackets after the name — same meaning
    public static void main(String... args)  // three dots ("var-args") — same meaning, since Java 5
All three mean "a list of Strings". Use the first one.

7. STANDARD INPUT AND OUTPUT

System.out (Standard Output)
    - Functions as an object of type java.io.PrintStream
    - Handles the normal, expected execution flow of a program
    - Prints standard messages, user prompts, and successfull algorithmic results
    - Responds to operating system level redirections (e.g. executing java App > file.txt)
    - Routes only its specific intercepted stream to the destination file during such redirections

System.err (Standard Error)
    - Acts as a separate java.io.PrintStream object
    - Handles diagnostics, exception stack trances and critical failures exclusively
    - Comunicates over a distinct logical channel identified as POSIX file descriptor 2
    - Is NOT captured by "java App > file.txt" (that redirects only System.out)
    - Can be redirected on its own with "java App 2> err.txt"
    - Prevents silent application failures and the corruption of output files by keeping error data isolated

System.in (System Input)
    - Operates as an object of type java.io.InputStream
    - Captures incoming data flows, predominatly user keystrokes from the console
    - Process data at a low level by reading raw bytes
    - Requires wrapping in utility classes like java.util.Scanner or java.io.BufferedReader
    - Relies on these wrappers to parse the raw byte stream into usable primitive types or strings

in = read
out = print
err = print errors

All 3 are static fields of the class System

EXAM:
- println prints and goes to a new line; print does not
- system.out.println (lowercase s) does NOT compile: System is a class name

8. PARAMETERS FOR THE MAIN METHOD   

What they are | When you start a program you can hand it some text, written after the class name. From src: java asimplejavaapplication.Test Joe Bloggs

The JVM takes Joe and Bloggs, puts them into an array of String and passes it to main. That array is args, main(String[] args)

RULE 1: spaces separate | Every space starts a new parameter

RULE 2: double quotes glue | If a space must be part of the value, use double quotes

RULE 3: you read them by index, starting from 0
package asimplejavaapplication;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]); // the FIRST parameter args[0]
    }
}

- The first parameter is args[0], not args[1]
- args.length tells you how many parameters they are

RULE 4: they are always text
- Running with 5 gives args[0] = "5", which is a String, not the number 5
- So args[0] + 1 gives "51": it glues the two together, it doesn't add them
- At runtime it crashes with ArrayIndexOutOfBoundsException, 'cause you asked for position 0 in an Array with no positions.


_____________________________________________________________________________________
IL TERMINALE È SEMPRE "DENTRO" AD UNA CARTELLA
Il terminale è come Esplora File, ma senza icone: in ogni momento ti trovi dentro una cartella e quale sia te lo dice la riga prima del cursore:

PS ...\JavaOracleUniversity1Z0_811>
Tutto quello che scrivi, il terminale, lo cerca a partire da lì.

cd = change directory (cambia cartella). È come fare doppio clic su una cartella in Esplora File. 
cd src -> entra in una cartella
cd.. -> torna indietro di una cartella

Dopo cd src la riga diventa:
PS ...\JavaOracleUniversity1Z0_811\src>
Adesso sono dentro a src

Il comando javac asimplejavaapplication\Ordine.java dice: a partire da dove sono, entra in asimplejavaapplication e compila Ordine.java.

Anche java asimplejavaapplication.Ordine funziona allo stesso modo. La riga package asimplejavaapplication;  dice a Java: questa cartella sta in simplejavaapplication e per trovarla, Java, deve partire da src.

ED IL PULSANTE RUN?
Fa esattamente queste cose, ma di nascosto:
    - compila tutto e mette i .class nella cartella bin
    - lancia java dicendogli "parti da bin".


===================
ESERCIZI
===================

Es.1: Scrivi con parole tue:
    - quali nomi Java rifiuta e perché;
    - la lezione su Static.

Java rifiuta i nomi che:
    - iniziano con un numero o un carattere speciale tranne _ e $
    - contengono caratteri speciale eccetto quelli indicati sopra
    - sono esattamente una keywords
    - che contengono spazi

Static con la S maiuscola può essere usato perché la parola chiave è static con la minuscola

Es.2: 
    - perché l'output non cambia con i commenti;
    - perché i commenti non si annidano

Nell'output i commenti non vengono visualizzati e servono a chi scrive o guarda il codice scritto, che sia io stesso o altri.
Non si annidano perché non posso inserire un commmento dentro un altro commento: il primo */ chiude il primo commento e ciò che viene dopo non è più all'interno del
commento
























