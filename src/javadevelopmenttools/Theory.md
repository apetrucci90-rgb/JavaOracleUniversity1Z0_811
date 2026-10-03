1. THE JDK: THE TOOLBOX
When I installed Java I installed the JDK that is a toolbox; its tools are in the bin folder of the JDK.
The 3 tools of this course:
1) javac | compiles : .java -> .class
2) java | runs: starts the JVM on a .class
3) jshell | tries single lines of Java, instantly

2. JDK, JRE, JVM: 3 BOXES, ONE INSIDE THE OTHER

┌─────────── JDK ────────────────────────────┐
│  javac, jshell, javadoc, jar...  (tools)   │
│  ┌────────── JRE ───────────────────────┐  │
│  │  standard libraries (System, String…)│  │
│  │  ┌──────── JVM ──────────────┐       │  │
│  │  │ executes the bytecode     │       │  │
│  │  └───────────────────────────┘       │  │
│  └──────────────────────────────────────┘  │
└────────────────────────────────────────────┘

- JVM: executes bytecode
- JRE: JVM + standard libraries, the ready-made classe like System and String. It's enough to run a program.
- JDK: JRE + development tools. I need it to compile and run programs.

RULES
- Whoever writes programs need the JDK;
- Whoever only uses them needs a runtime (JRE);

Andrea does not have a JDK. The BE Servizi installer carries its own small Java runtime inside. 

3. IDEs: THE WORKSHOP AROUND THE TOOLS

I could write Java in Notepad and only use javac and java
An IDE puts everything in one window:
- it organizes the files;
- it colors the code and flags the errors while I type;
- it compiles and runs with one button;

KEY POINT: every IDE uses the JDK underneath. The run button calls javac and java for me.
 
4.  JSHELL: JAVA ONE LINE AT A TIME

To test one line I needed a file, a class, a main, javac and java. JShell skips that: I type the line and get the result immediately.
It's called a REPL:
- Read -> read what I type;
- Eval -> evaluates it;
- Print -> prints the result;
- Loop -> waits for the next line;

jshell> int x = 1
x ==> 1
jshell> int y = 1
y ==> 1
jshell> x + y
$3 ==> 2

- x ==> 1 means "x now holds 1"
- $3 is an automatic name. Yoou don't give the result a name so JShell named it $ + the snippet number (thirs line -> $3)
- ONLY IN JSHELL I can skip the ; and write without a class or main.

5. JSHELL COMMANDS

┌───────────┬────────────────────────────────────────────────┐
│  Command  │                      Does                      │
├───────────┼────────────────────────────────────────────────┤
│ /vars     │ shows the variables you created, with their    │
│           │ values                                         │
├───────────┼────────────────────────────────────────────────┤
│ /list     │ shows the lines you typed                      │
├───────────┼────────────────────────────────────────────────┤
│ /methods  │ shows the methods you created                  │
├───────────┼────────────────────────────────────────────────┤
│ /history  │ everything you typed, commands included        │
├───────────┼────────────────────────────────────────────────┤
│ /drop     │ deletes one line (e.g. a variable)             │
├───────────┼────────────────────────────────────────────────┤
│ /!        │ repeats the last line                          │
├───────────┼────────────────────────────────────────────────┤
│ /save     │ saves your lines to a text file                │
│ file      │                                                │
├───────────┼────────────────────────────────────────────────┤
│ /open     │ reloads a file and runs it                     │
│ file      │                                                │
├───────────┼────────────────────────────────────────────────┤
│ /reset    │ forgets everything, clean start                │
├───────────┼────────────────────────────────────────────────┤
│ /help     │ help                                           │
├───────────┼────────────────────────────────────────────────┤
│ /exit     │ leaves JShell                                  │
└───────────┴────────────────────────────────────────────────┘ 

EXAM — know what JShell is for (learning, prototyping), that it's a REPL, that it arrived with JDK 9, and the meaning of /list, /vars, /save, /open, /reset, /exit.

============================
ESERCIZIO
============================

Esercizio 1 — JDK, JRE, JVM (solo teoria, niente computer)

Rispondi qui in chat, con parole tue:
1. Cosa contiene la JVM, cosa la JRE, cosa il JDK? Una riga ciascuno.
2. Un tuo cliente deve solo usare il tuo programma: cosa gli serve?
3. Tu, che il programma lo scrivi: cosa ti serve, e perché la JRE non basta?

1. JVM = esegue il bytecode
JRE = JVM + librerie standard → basta per ESEGUIRE
JDK = JRE + strumenti (javac, jshell, javadoc…) → serve per SVILUPPARE
2. Gli basta la JRE
3. La JRE non ha la javac e senza il compiler non posso trasformare il .java in .class e quindi mi serve il JDK
















