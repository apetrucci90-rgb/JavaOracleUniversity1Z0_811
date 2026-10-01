1. WHERE JAVA COMES FROM    

Java is an object-oriented programming languages; the program is organized around object, thingd that hold data and can do actions.

It is inspired by C and C++ and belongs to the C-like family. 

It was relased in 1996. The original idea was software for consumer electronics.

2. THE PROBLEM JAVA WANTED TO SOLVE

Every device was a different platform: a program for the devica A was not the same for the device B. This is the portability problem.

Java was built as a portable language: WORA.

3. WHERE JAVA RUNS TODAY

From smart cards to supercomputers:
- servers
- clients
- consumer electronics
- tiny chips: SIM card or credit cards.

4. HOW A PROGRAM IS MADE: SOURCE CODE AND MACHINE CODE

A programmer write source code: human-readable text in a programming language

A computer only understands machine code: sequences of 0 and 1.

Source code must be translated into machine code, into 2 ways:

    COMPILED
The whole program is translated into machine code in advance, before it runs.

The program that does it is the compiler.

The compiler sees the whole program and can optimize it: less memory, quicker execution.

    INTERPRETED
No translation in advance, each instruction is translated on the fly, while the program runs.

Slower so it can't be optimized.

Quick and simple for small scripts or experiments

5. THE PORTABILITY PROBLEM IN DETAIL

A platform is a processor (CPU) + an operating system.

Every platform needs different machine code. Code compiled for Windows does not run on Mac.

6. THE JAVA SOLUTION: BYTECODE AND THE JVM

Java adds a step in the middle:
    Java source code is compiled once into bytecode which is not the machine code of any real computer: it is the code of an imaginary computer, the JVM

    The JVM is a program installed into real computers. It is platform-specific: there is a JVM for each operating system.

    When you run the program the JVM translates the bytecode into the machine code of that computer.


The compiler, the JVM and many other tools come together into the JDK.

7. THE THREE STEPS IN PRACTICE

- STEP 1
WRITE - Java source code goes in plain text file with the extension .java
The file has the same name as the class inside it.

- STEP 2
COMPILE with javac (the Java compiler). javac Hello.java produces Hello.class, which contains the bytecode. The .class files are what you distribute to the computers where the program must run.

- STEP 3
RUN with java, which starts the JVM:
java Hello 
Watch out: you write the class name Hello, not Hello.class. The JVM reads the bytecode and translates it into instructions for my computer.

Java is both COMPILED and INTERPRETED. The JVM does not interpret the source-code: it translates already compiled and optimized bytecode. 

8. RUNNING INTERPRETED (SOURCE-FILE MODE)

You can skip the javac step (since Java 11):
java Saluto.java
The JVM compiles the file in memory and runs it right away. NO .class file is created on disk.
Watch out: here you write the file name WITH .java; in normal mode you write the class name WITHOUT extension.

___________________________________________________________________________
- javac vuole il percorso del file, con \ e l'estensione .java -> introductiontojava\Saluto.java
- java vuole il nome completo della classe, con il punto e senza estensione -> introductiontojava.Saluto
- entrambi si lanciano dalla cartelle src, quella che contiene i package


=======================
ESERCIZI
=======================

Es.1: Teoria: compilato vs interpretato (in Theory.md)
Spiega con parole tue la differenza tra compilato e interpretato, e perché il compilato è più veloce. Usa l'esempio di un'istruzione ripetuta 100 volte.
---
Il codice sorgente deve essere tradotto in machine-code in due modi diversi:
1) COMPILATO 
Il programma è tradotto in codice macchina prima che venga eseguito e il programma che fa questo è il compiler. Il compiler vede l'intero programma e lo ottimizza. 
2)  INTERPRETATO
Nessuna traduzione in anticipo, ogni istruzione viene tradotta in corso, mentre si esegue il programma. È più semplice e non può essere ottimizzato. Se un' istruzione è scritta 100 volte viene tradotta ogni volta.

Nel compilato quell'istruzione viene tradotta una volta sola, in anticipo. È più veloce perché il compiler vede tutto il programma e produce codice ottimizzato, più veloce e con meno memoria. L'interpretato  invece vede un'istruzione alla volta e non può ottimizzare l'insieme.

Es.2: Teoria: il problema della portabilità (in Theory.md)
Cos'è una piattaforma? Perché un programma C compilato su Windows non funziona su un Mac? Come lo risolve Java? Usa le parole bytecode e JVM.
---
Una piattaforma è costruita da un processore CPU e da un sistema operativo (Windows, Linux, Mac). Non funziona perchè ogni piattaforma ha un codice macchina. Il bytecode è invece uguale per tutte. Il codice Java lo risolve perchè aggiunge un passo nel mezzo: il codice sorgente Java è prima compilato in bytecode che non è il codice macchina di alcun computer: è un computer virtuale, la JVM che è specifica per ogni piattaforma. Segue il principio WORA. 

Es.3: Teoria: il viaggio di un programma (in Theory.md)
Scrivi i 3 passaggi da Ricetta.java all'esecuzione: il comando, il file prodotto, il comando che lo esegue. Poi rispondi: hai compilato su Windows e un amico ha un Mac. Quale file gli mandi? Cosa deve avere installato lui?
---
Un file Java si crea in tre passi diversi:
1) Scrivere. Il semplice codice Java va in file di testo semplici con estensione .java. La regola è che il file ha lo stesso nome della classe che ha all'interno.
2) Compilare con javac, il compilatore Java, parte del Java Development Kit. javac Ricetta.java produce Ricetta.class, che contiene il bytecode. Le .class files sono ciò che dai al computer dove il programma deve essere eseguito.
3) Esegui con java che fa partira la Java Virtual Machine. Scrivi la classe di nome Hello, non la Hello.class. La JVM legge il bytecode e lo traduce in istruzioni per il computer. 
Al mio amico mando il file Ricetta.class (il bytecode), non il .java. Lui deve avere installata una JVM per Mac: il bytecode è identico per ogni piattaforma, ma è la JVM del Mac che lo traduce nel codice macchina del Mac. Senza JVM non parte. WORA funziona proprio perché ogni piattaforma ha la sua JVM.












