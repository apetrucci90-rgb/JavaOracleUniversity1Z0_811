
EXCPETIONS 
Un'eccezione è il modo con cui Java segnala che qualcosa è andato storto durante l'esecuzione. Quando succede, Java crea un oggetto-errore (type + messaggio + stack trace) e interrompe il flusso nel ponte del guasto, cercando chi lo gestisce.

A cosa servono?
1) Non far crashare il programma. Invece di bloccarsi, intercetto il problema e reagisco: mostro un messaggio, uso un valore di riepilogo, riprovo.
2) Separare il va bene dal va storto. Il codice normale sta nel try, pulito e leggibile; tutta la gestione dell'errore sta nel catch. Senza eccezioni dovrei inserire ogni riga con controlli if.
3) Passare la responsabilità a chi sa gestirla. Con throws, il metodo dove nasce l'errore non è obbligato a risolverlo: lo rilancia verso l'alto, fino a quando un metodo più adatto lo cattura. Chi legge un file non deve decidere cosa fare se manca, lo decide chi l'ha chiamato.
4) Garantire la pulizia. Il finally chiude file e tutto con o senza errore, così non restano cose aperte.

Le eccezioni servono a gestire l'imprevisto in modo ordinato - reagire agli errore senza bloccare tutto e senza sporcare il codice normale.

TORNIAMO ALLE BASI.
Un computer capisce solo il linguaggio macchina, sequenze di 0 ed 1. 
Il COMPILATORE è quella cosa che traduce quello che scrivo io in linguaggio macchina.
Il testo che scrivo io si chiama COSICE SORGENTE (source code). In Java lo salvo in un file .java.

E' pensato per essere letto e scritto da un umano, il computer così com'è non ci capisce niente.

IL COMPILATORE: il TRADUTTORE. JAVAC

Un compiler è un programma che prende il mio source code e lo traduce in un linguaggio machine readable. 
In Java il compilatore è javac (java - c: compiler)

Qui Java fa una cosa diversa: anzichè tradurre il 0 ed 1 traduze in una lingua di mezzo che si chiama BYTECODE (bytecode).
Il risultato della compilazione è un nuovo file che finisce con .class al cui interno c'è il BYTECODE.

Il BYTECODE è una lingua che nessun computer capisce davvero. Quindi, il bytecode in .class, è una lingua inventata da Java, che nessun processore reale capisce direttamente.
Il bytecode è identico su qualunque altro computer (Mac, Windows o Linux). Lo è anche, e.g. Esercizi2.class.

La parte finale: manca qualcuno che traduca quel bytecode nella lingua del computer -> JVM.

La JVM: il traduttore universale su ogni macchina.
JVM: è un programma che si comporta come se fosse un computer e gira dento il mio computer vero.

Il SUO LAVORO:  prendi il bytecode (.class) e lo esegue, traducendo pezzo per pezzo nella lingua usata nel computer.

Esiste una JVM diversa per ogni sistema, MA TUTTE ESEGUONO lo stesso bytecode.

IL SECONDO COMANDO JAVA, CHE AVVIA LA JVM.
javac = il compilatore. Traduce .java -> .class. Lo uso una volta, quando ho finito di scrivere.

1)  javac Esercizi1.java      → compila: crea il .class
2)  java  Esercizi1           → esegue: la JVM fa partire il programma

- a javac do il nome del file, con .java;
- a java do il nome della classe, senza .class

========================================
I DUE MOMENTI NELLA VITA DI UN PROGRAMMA: COMPILE TIME E RUNTIME

Sono due istanti diversi, vanno tenuti separati:

- COMPILE TIME (tempo di compilazione): il momento in cui gira javac e controlla il mio codice. Se ho sbagliato a scrivere, l'errore salta fuori adesso e il .class non viene nemmeneo creato. Non nasce il programma.

- RUNTIME (tempo di esecuzione): il momento in cui gira java/JVM e il programma è vivo ed in funzione. Qui emergono i problemi che non si potevano vedere scrivendo e nascono le ECCEZIONI.

compile time = il momento in cui gira javac e mi controlla il codice. Se ho sbagliato a scrivere, l'errore salata subito all'occhio ed il .class non viene nemmeno creato. Il programma non nasce.

compile time: mentr il codice viene controllato e tradotto;
runtime: mentre il programma gira davvero;

JVM, JRE, JDK
Sono una matrioska: una dentro l'altra e via così. 

1) JVM - il motore che esegue il BYTECODE
2) JRE è la JVM più alcuni pezzigià pronti. Serve a chi vuole far girare programmi in Java senza scriverli.
3) JDK è il JRE più gli attrezzi per scrivere programmi: dentro ci sono javac e java, oltre ad altri strumenti

Relazione: JDK contiene il JRE, che contiene la JVM. Se hai il JDK, hai dentro tutto il resto.

========================================================
________________________________________________________

public static void main(String[] args) ---->
E' l'entry point, la porta da cui la JVM. Se si sbaglia anche una sola parola  del public static void main...
Sbagliando anche una sola lettera la JVM non trova la porta ed il progranmma non parte.









