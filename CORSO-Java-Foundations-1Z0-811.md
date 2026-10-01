# Oracle Java Foundations — complete study guide (exam 1Z0-811)

> Study notes written from the course **Oracle Java Foundations** on Oracle MyLearn
> (course 152254 — 8 modules, 36 videos, 10 h 23 min, instructor Vasiliy Strelnikov), from its
> Student Guide (course code S106334GC10/11) and from the public 1Z0-811 exam topics.
> Same order as the videos, so you can follow the course without opening Oracle every time.
> These are **notes in my own words**, not a copy of Oracle's material.
>
> **How to use this file**
> - **Lessons are in English** — the exam is in English, get used to the words.
> - **Esercizi are in Italian**, at least one for every topic. You write every line of code yourself.
> - `⚠️ EXAM` = something the exam asks that the course only hints at, or skips.
> - `❌ SLIDE ERROR` = code in the course slides that does **not** compile or does not do what the slide
>   says. Every one was verified with `javac` on 25/09/2026.
> - Your setup differs from the course: the course uses **IntelliJ on a Linux lab machine**; you use
>   **VS Code on Windows** with **JDK 25**. The course requires JDK 21 or later → fine.
>
> **Index**
> 0. The exam · Course map
> 1. Module 1 — Overview
> 2. Module 2 — Introduction to Java Basics (lesson 1 of the book)
> 3. Module 3 — Handling Text and Numbers (lessons 2–3)
> 4. Module 4 — Arrays, Conditions, and Loops (lessons 4–5)
> 5. Module 5 — Defining Classes and Creating Objects (lessons 6–9)
> 6. Module 6 — Code Reuse through Inheritance (lesson 10)
> 7. Module 7 — Handling Exceptions (lesson 11)
> 8. Module 8 — What's Next? and the Workshop
> 9. Exam extras — topics of 1Z0-811 the course does not cover
> 10. Final checklist · Mock exam questions (answers at the very end)

---

## 0. The exam 1Z0-811 at a glance

| Item | Value |
|---|---|
| Certification | Oracle Certified Foundations Associate, Java — exam **1Z0-811** |
| Format | 60 multiple-choice questions, 120 minutes |
| Passing score | 65 % |
| Price | ≈ 95 USD (varies by country). Check the current price on education.oracle.com before booking |

Official topics (tick them as you go):

1. **What is Java?** — features of Java; real-world applications.
2. **Java Basics** — JDK vs JRE; components of OOP; components of a basic program; compile and execute.
3. **Basic Java Elements** — naming conventions; reserved words; single- and multi-line comments; `import`; the `java.lang` package.
4. **Working with Java Data Types** — declare/initialize variables, incl. `final`; casting (automatic promotion and manual cast); `String` variables.
5. **Working with Java Operators** — `+ - * / %`; `++ --`; `== != > >= < <=`; `+= -= …`; `&& || ?:`; precedence and parentheses.
6. **Working with the String Class** — String methods; formatting with `%d %n %s` and escape sequences.
7. **Working with the Random and Math Classes.**
8. **Using Decision Statements** — `if`, `if-else`, `switch`; `==` on primitives vs objects; `equals` and `compareTo` on Strings.
9. **Using Looping Statements** — `for`, enhanced `for`, `while`, `do-while`; compare them; `break` and `continue`.
10. **Debugging and Exception Handling** — syntax vs logic errors; exceptions; common exceptions; `try`/`catch`.
11. **Arrays and ArrayLists** — one-dimensional arrays; `ArrayList`; iterate with loops and iterators; array vs ArrayList.
12. **Classes and Constructors** — class with `main`; `private`; object and its members; class vs instance vs local variables; default constructor; constructors with/without parameters; overloading constructors.
13. **Java Methods** — create methods; getters/setters; overloading; `static` methods.

**What the course does NOT cover but the exam asks** → chapter 9 of this file: `ArrayList`, iterators,
`Random`, most of `Math`, `printf`/`String.format`, `equals` vs `==` vs `compareTo`, `Scanner`, other primitive types.
**What the course covers beyond the exam:** inheritance, `throw`/`throws`, switch expressions. Study them anyway.

---

## Course map (videos in order)

| Module | Videos | Book lesson |
|---|---|---|
| 1. Overview | Course Introduction | I |
| 2. Introduction to Java Basics | Introduction to Java · A Simple Java Application · Java Development Tools · Practice 1-1 · Practice 1-2 | 1 |
| 3. Handling Text and Numbers | Variables, Constants and Types · Operators · Operation Results · Practice 2-1 · Work with Text values · Practice 3-1 | 2, 3 |
| 4. Arrays, Conditions, and Loops | Work with Arrays · Practice 4-1 · Write Loops · Write if/else constructs · Write switch/case constructs · Practice 5-1 | 4, 5 |
| 5. Defining Classes and Creating Objects | Write Methods · Practice 6-1 · Create Classes and Objects · Work with Objects · Overload Methods · Practice 7-1 · Design Encapsulation and Constructors · Java code Aggregations · Practice 8-1 · Use Class Context · Practice 9-1 | 6, 7, 8, 9 |
| 6. Object-Oriented Approach to Code Reuse | Java Inheritance · Extend the Object class · Practice 10-1 | 10 |
| 7. Handling Exceptions | Handle Exceptions · Throw Exceptions · Practice 11-1 | 11 |
| 8. Continue Your Learning | What's Next? | 12 |

**Practices theme:** during the whole course you build a small application for a fictional science lab,
**"DukeLabs"**, that records **measurements of scientific experiments** (values, units, conversions).
The practices follow the **Activity Guide** (MyLearn → *Guides*) and use lab files (`practices` and
`solutions` folders). At the end there is an optional **Workshop: a word-guessing game** with no
step-by-step instructions.

---

# 1. MODULE 1 — Overview

## 1.1 Course Introduction (5 min)

**Course goals.** After the course you should be able to:
- explain the essential elements of the Java language;
- use the **JDK** tools to compile and run programs;
- create Java **classes and objects**;
- use simple **data types** and **operators**;
- **control the program flow**;
- use Java **arrays**;
- **handle errors**.

**Audience.** People with no or little programming experience who want to learn Java, and people
preparing for the **Junior Associate certification** (1Z0-811).

**Book structure (12 lessons).** 1 Introduction to Java · 2 Variables and Operators · 3 Text Values ·
4 Arrays · 5 Program Flow · 6 Methods · 7 Classes and Objects · 8 Enhance Class Design · 9 Class Methods
and Variables · 10 Inheritance · 11 Exceptions · 12 What's Next?

**Two kinds of hands-on work.**
- **Practices** — prescribed steps: you are told exactly what to do.
- **Workshop** — a task plus hints, **no** steps. Word-guessing game. Optional but recommended: it builds
  confidence.

*(No code in this lesson → no exercise.)*

---

# 2. MODULE 2 — Introduction to Java Basics

Lesson objectives: describe the origins and use cases of Java · explain portability and provider
neutrality · describe syntax and vocabulary · create a class with a `main` method · compile and execute ·
use JShell · describe the development tools.

## 2.1 Introduction to Java (17 min)

### Origins
- Java is an **object-oriented** programming language inspired by **C/C++**. It belongs to the C-like
  family (C, C++, C#, Objective-C): if you know one, the others are easier. This was **intentional**.
- It was released in **1996** (announced in 1995) as a general-purpose language for **consumer electronics**.
- The problem it solved: every device was a different **platform**, and manufacturers did not care about
  compatibility. Code written for one device did not work on another → the **portability problem**.
- Today it runs on **billions of devices, from smart cards to supercomputers**: servers, desktop
  clients, consumer electronics, and the chip inside a **SIM card** or a **credit card**.

### How program code is produced
Programmers write **human-readable source code** in one of many languages. The computer only executes
**machine code** (binary instructions, 1s and 0s), so the source must be translated. Two ways:

| | **Compiled** | **Interpreted** |
|---|---|---|
| What | the **entire** program is translated into machine code **in advance**, all at once | **individual instructions** are translated as needed, **every time the program runs** |
| Speed | faster: the compiler optimizes the whole program | slower: e.g. an instruction repeated 100 times is translated 100 times |
| Good for | real, high-performance programs | scripts, quick experiments |

### The portability problem
- **Platform** = CPU + operating system.
- Each platform needs **different machine code**. C and C++ are **compiled and linked** into an
  **executable** that works only on one platform. Running on Windows, macOS and Linux means compiling
  three times, often with code changes.

### Java is platform independent
- A Java program is compiled **only once**.
- The compiler produces **bytecode** for the **Java Virtual Machine (JVM)** — an imaginary computer,
  not tied to any real platform.
- The **JVM itself is platform-specific**: there is one for Windows, one for macOS, one for Linux…
- The JVM runs your program by **translating bytecode into platform-specific code**.
- **Write Once, Run Anywhere (WORA)**. You only produce bytecode; each JVM does the rest.
- The target computer must have a **JVM installed**. Since **Java 9** you can also package the program
  **together with a Java runtime** into a platform-specific installer, so no separate JVM is needed.
- `javac`, the JVM and many tools and libraries come in the **JDK (Java SE Development Kit)**.

### Write, compile, run

```
Hello.java  ──javac Hello.java──►  Hello.class  ──java Hello──►  output on this platform
source code (plain text)           bytecode
```

```java
public class Hello {
    public static void main(String[] args) {
        System.out.print("Hello World!");
    }
}
```

1. **Write** — plain text files, extension **`.java`**. Any text editor works; an IDE helps.
2. **Compile** — `javac Hello.java` → produces **`Hello.class`** (bytecode). The `.class` files are what
   you distribute to target machines.
3. **Run** — `java Hello`. You write the **class name**, *not* `Hello.class`.

(`javac` has options to compile many files at once or choose the output folder — out of the course scope.)

### Running a source file directly ("interpreted" mode)
```
java Hello.java
```
The JVM compiles the source **behind the scenes, in memory**, and runs it immediately. No `.class` file is
written. It is **slower and has some functional limitations**, but fine for small experiments.
It only *feels* interpreted: the source is still compiled to bytecode.

> ⚠️ EXAM — "What is Java?" questions. Features to know by name:
> **object-oriented · platform-independent (WORA) · compiled to bytecode, run by the JVM · robust**
> (strong typing, exceptions, automatic memory management / garbage collection) · **secure · simple**
> (C-like syntax without pointers) · **multithreaded · distributed** (built for networks).
> Real-world uses: desktop apps, web and enterprise servers, Android mobile apps, embedded devices, smart
> cards, big data, cloud.

### ✏️ Esercizi — 2.1
1. **Compilato vs interpretato.** Nei tuoi appunti spiega con parole tue la differenza e perché il
   compilato è più veloce. Usa l'esempio di un'istruzione ripetuta 100 volte.
2. **Il viaggio di un programma.** Scrivi i 3 passaggi da `Ricetta.java` all'esecuzione: il comando, il
   file prodotto, il comando che lo esegue.
3. **Portabilità.** Hai compilato `Ricetta.java` su Windows. Un amico ha un Mac. Quale file gli mandi?
   Cosa deve avere installato lui? Perché non serve ricompilare?
4. **Due modi di eseguire.** Crea `Saluto.java` (classe `Saluto`, stampa `Ciao`). Eseguilo prima con
   `javac Saluto.java` e poi `java Saluto`. Cancella `Saluto.class` ed eseguilo con `java Saluto.java`.
   In quale dei due casi compare `Saluto.class` nella cartella?

---

## 2.2 A Simple Java Application (14 min)

### Java language vocabulary
Keywords, reserved words and literals are the **instructions** of the language.
- All are **lowercase**.
- They **cannot be used as identifiers**.
- **Identifier** = a custom name you give to a unit of code: variable, method, class, package…
- **Literal** = a constant value you can assign to a variable (`42`, `3.14`, `'a'`, `"Hi"`, `true`, `null`).

The essential ones, grouped as in the course:

| Control program flow | Describe code structures | Define types | Literal values | Work with objects | Handle exceptions |
|---|---|---|---|---|---|
| `if` `else` `continue` `break` `for` `do` `while` `switch` `case` `default` | `private` `public` `import` `package` `class` `static` `final` `return` `void` | `byte` `int` `double` `boolean` `var` | `true` `false` `null` | `new` `this` `super` | `try` `catch` |

The **complete** list, for reference (the book notes include it):
`abstract assert boolean break byte case catch char class const continue default do double else enum
extends final finally float for goto if implements import instanceof int interface long native new
package private protected public return short static strictfp super switch synchronized this throw throws
transient try void volatile while` · literals `true false null` · contextual words `var record sealed
non-sealed permits yield when module open opens requires exports to uses provides with transitive`.

> ⚠️ EXAM
> - `goto` and `const` are reserved but never used.
> - Everything is **case-sensitive**: `True`, `NULL`, `Class` are *not* keywords (valid but awful names).
> - Identifier rules: must **not start with a digit**; may contain letters, digits, `_` and `$`; no
>   spaces and no operators (`+ - *`…); cannot be a keyword or reserved word.
>   Valid: `price`, `_count`, `$total`, `item2`. Invalid: `2item`, `my-price`, `some+other`, `double`, `my price`.

### Java syntax

```java
public class Test {                              // a class groups variables and methods
    private String greeting = "Hello";           // variable: holds information

    public String sayHello(String name) {        // method: implements an action
        return greeting + " " + name;
    }

    public static void main(String[] args) {     // method: the entry point
        Test t = new Test();
        System.out.print(t.sayHello("Joe"));     // prints: Hello Joe
    }
}
```

- Java code is grouped into **classes**. The class is the main unit of code.
- Classes contain **variables** (hold data) and **methods** (implement actions, logic).
- **Code blocks** are delimited with **`{ }`**: start and end of a class, of a method, of an `if`…
- **Statements** end with **`;`**.

> ❌ SLIDE ERROR — the slide writes `sayHello(Sting name)`: `Sting` is a typo for `String` and does not compile.

### Comments
Comments describe what the program should do and explain the logic. **The compiler ignores them.**
They can go anywhere in the code.

```java
// single-line comment: from // to the end of the line

/* multi-line comment:
   everything between slash-star and star-slash */
```

Why comment: reading code is as important as writing it. You or somebody else will come back months or
years later to fix or extend it. The instructor admits he could not understand his own old code without
comments. Be courteous to whoever supports the code after you.

> ⚠️ EXAM — also `/** Javadoc comment */`, used to generate HTML documentation.
> Multi-line comments **cannot be nested**: in `/* a /* b */ c */` the comment ends at the first `*/`,
> so `c */` is a compile error.

### Creating a Java application
1. Create a plain text file representing your class.
2. The file must have **the same name as the class** it defines.
3. Save it with the **`.java`** extension.

```java
// file Test.java
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World!");   // program output
    }
}
```

The JVM recognizes **`main`** as the **starting point**. If a class has `main`, the JVM can run it as an
application. The method body, between `{ }`, holds the program logic.

### The main method — every word matters

| Part | Why |
|---|---|
| `public` | it is invoked **from outside** the class (by the JVM) |
| `static` | it can be invoked **without creating an instance** of the class |
| `void` | it **returns no value** |
| `main` | the name **must** be `main` |
| `String[] args` | the **only parameter**: an array of `String` objects = the command-line arguments. The name `args` is not important |

Three equivalent ways to declare the array parameter:
```java
public static void main(String[] args) { }     // most common
public static void main(String args[]) { }
public static void main(String... args) { }    // var-args, since Java 5
```

> ⚠️ EXAM — also valid: `static public void main(String[] x)` (modifiers in any order, any parameter
> name), and `final` on the parameter. **Not** an entry point: missing `static`, a return type other than
> `void`, the name `Main`, a parameter that is not `String[]`. Such code usually **compiles**, but
> `java Test` fails at runtime with "main method not found".
> ⚠️ JDK 25 (Andrea's PC): since Java 25 (JEP 512) a main **without `static`** RUNS anyway (instance main
> method; verified 26/09/2026 with javac/java 25.0.3). The exam follows the classic rule: answer "not an
> entry point / fails at runtime".

### Standard I/O
The class **`System`** gives access to the console through three constants:

| | Use |
|---|---|
| `System.in` | **read** input the user types (shown later in the course) |
| `System.out` | **print** normal output |
| `System.err` | **print error** information |

```
javac Test.java      ← compile
java Test            ← run
Hello World          ← printed output
```

`System.out` and `System.err` can point to the same place: normal and error output may appear in the
same console.
(The audio says "system.int / system.error" — the real names are **`System.in`** and **`System.err`**.)

> ⚠️ EXAM — `println` prints and then moves to a **new line**; `print` does **not**.
> `system.out.println` (lowercase `s`) does not compile: `System` is a class name.

### Parameters for the main method
- Supplied **when you run** the program, after the class name.
- **Separated by spaces**.
- Enclosed in **double quotes** if a space must be part of the value.
- Read with an **index**: `args[0]` is the **first** parameter.

```java
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);
    }
}
```
```
java Test "Joe Bloggs"   →  Hello Joe Bloggs     (one parameter)
java Test Joe Bloggs     →  Hello Joe            (args[0]="Joe", args[1]="Bloggs")
```

> ⚠️ EXAM — with no arguments, `args` is an **empty array** (length 0), **not null**. Reading `args[0]`
> throws **`ArrayIndexOutOfBoundsException`** at runtime.

### ✏️ Esercizi — 2.2
1. **Identificatori.** Quali nomi sono validi? `prezzo`, `2porzioni`, `_totale`, `$costo`, `class`,
   `nome piatto`, `Static`, `true`, `numeroOrdine`, `costo-totale`. Per ogni nome non valido scrivi
   perché. Poi dichiarali in un file e leggi cosa risponde il compilatore.
2. **Struttura.** Scrivi da zero una classe `Cucina` con una variabile `String chef = "Andrea";` e un
   `main` che stampa `Benvenuti in cucina`. Metti un commento accanto a ogni `{` e `}` per dire cosa aprono
   e cosa chiudono.
3. **Commenti.** Aggiungi un commento su una riga, uno su più righe e un Javadoc `/** */` sopra la classe.
   Ricompila: l'output cambia? Poi prova a **annidare** due commenti `/* /* */ */` e leggi l'errore.
4. **La firma di `main`.** Fai 5 prove, una alla volta, e annota per ognuna se **compila** e se **parte**:
   (a) togli `static`; (b) `Main` al posto di `main`; (c) `String[] ricetta` al posto di `String[] args`;
   (d) `static public void main`; (e) `String... args`.
5. **Output.** Stampa due righe con `System.out.print`, una con `System.out.println` e una con
   `System.err.println`. Che differenza vedi nel terminale?
6. **Argomenti.** Scrivi `Ordine.java` che stampa `Ordine per: ` + `args[0]` e `Tavolo: ` + `args[1]`.
   Eseguilo con `java Ordine Mario 5`, poi con `java Ordine "Mario Rossi" 5`, poi **senza argomenti**.
   Che eccezione esce nell'ultimo caso, e perché?

---

## 2.3 Java Development Tools (12 min)

### The JDK and the IDEs
- The **JDK** comes with several tools: **`javac`** (compile), **`java`** (run), **`jshell`** (interpret
  snippets). Download: oracle.com/java/technologies/downloads.
- Any text editor works, but an **IDE (Integrated Development Environment)** helps you organize files,
  write code, build, test and document. Examples: **IntelliJ**, **NetBeans**, **Eclipse**, **JDeveloper**
  (and **VS Code** with the Java extensions, which you use).
- Every IDE uses the **JDK underneath** to compile and run.
- **Licences differ**: NetBeans is free; IntelliJ Community Edition is free, while IntelliJ Ultimate is paid
  (free or discounted for students and teachers). The course uses **IntelliJ Community Edition**.

> ⚠️ EXAM — **JDK vs JRE vs JVM**, a classic question:
> - **JVM** — executes bytecode.
> - **JRE** (Java Runtime Environment) — JVM + the standard class libraries → enough to **run** programs.
> - **JDK** — JRE + development tools (`javac`, `jshell`, `javadoc`, `jar`…) → needed to **develop**.
> - JDK ⊃ JRE ⊃ JVM. Developer → JDK. Someone who only runs the program → a runtime (JRE).

### JShell — Read-Evaluate-Print Loop (REPL)
- Interactive command-line tool. Start it with the **`jshell`** command. Available from **JDK 9**.
- Purpose: **learn** Java and **prototype** code.
- It evaluates **declarations, statements and expressions** as you type them and shows the result
  **immediately**. No class, no `main`, no separate compilation.
- The loop: **Read** the expression → **Evaluate** it → **Print** the result → again.

```
$ jshell
jshell> int x = 1
x ==> 1
jshell> int y = 1
y ==> 1
jshell> x+y
$3 ==> 2          ← an unnamed result gets an automatic name: $3
jshell> /exit
```

> JShell accepts variables and methods **outside any class**, and statements without `;`. This is allowed
> **only in JShell**, never in a real `.java` program.

### JShell commands

| Command | Does |
|---|---|
| `/list` | list the source you typed |
| `/edit` | edit a source entry |
| `/drop` | delete a source entry |
| `/save file` | save the snippets to a file |
| `/open file` | open a file and run it as input |
| `/vars` | list declared variables and their values |
| `/methods` | list declared methods |
| `/types` | list declared types |
| `/imports` | list imports |
| `/env` | view/change the classpath or modules |
| `/reset` | reset JShell (forget everything) |
| `/reload` | reset and replay the relevant history |
| `/history` | what you typed |
| `/help` or `/?` | help; `/? /list` = help on `/list` |
| `/set` | set configuration |
| `/!` | rerun the last snippet |
| `/<id>` | rerun a snippet by id (or range of ids) |
| `/-<n>` | rerun the n-th previous snippet |
| `/exit` | leave JShell |

### Inside the IDE (IntelliJ, as in the course)
1. **Project** window — main entry point to your sources; shows source files **and** compiled bytecode;
   describes settings (compiler options, Java version).
2. **Editor** — much more than a text editor: indents lines, matches brackets, **highlights** code
   syntactically and semantically, **flags errors**, helps write code fragments.
3. **Structure** window — quick navigation and search inside the source.
4. **Edit Configurations** — how the program is run.
5. **Run** window — runtime console: shows **output** and accepts **user input**.
Toolbar: **Build Project**, **Run** (compiles and runs), **Debug**, **Stop**.

**Your VS Code equivalent:** Explorer = project window (`src` = sources, `bin` = compiled classes, see
`.vscode/settings.json`); editor with red underlines for errors; "Outline" = structure; **Run | Debug**
links above `main`; output in the **Terminal**.

### Lesson summary
- Java's key design principle is **portability**: compile once, each platform's JVM does the rest.
- Know the **vocabulary** (reserved words) and the **syntax rules**: `{ }` for blocks, `;` for statements.
- An **application** = a class with a `main` method; execution starts there.
- Compile with `javac`, run with `java`.
- Snippets → **JShell**. Real programs → an **IDE**.

### ✏️ Esercizi — 2.3
1. **JDK / JRE / JVM.** Scrivi in 3 righe cosa contiene ognuno. Un cliente che deve solo *usare* il tuo
   programma cosa installa? E tu che lo scrivi?
2. **JShell, primi passi.** Apri il terminale di VS Code e scrivi `jshell`. Crea `int porzioni = 12` e
   `int ospiti = 4`, poi calcola `porzioni / ospiti`. Che nome automatico dà JShell al risultato?
3. **Comandi.** Nella stessa sessione prova in ordine: `/vars`, `/list`, `/save cucina.jsh`, `/reset`,
   `/list` (cosa vedi?), `/open cucina.jsh`, `/vars`, `/history`, `/exit`. Apri `cucina.jsh` con un
   editor: cosa contiene?
4. **`/drop` e `/!`.** Crea tre variabili, cancellane una con `/drop`, poi ripeti l'ultimo comando con `/!`.
5. **Il tuo IDE.** In VS Code trova: dove sono i `.java`, dove finiscono i `.class`, il comando per
   eseguire, dove appare l'output, dove vedi un errore di compilazione. Scrivilo negli appunti.

---

## 2.4 Practice 1-1: Course Environment Setup (16 min)

Two options: the **preconfigured Linux machine** from Oracle University (lab files in `/home/oracle/labs`),
or **your own machine** (your case) → replicate the setup and adapt the paths.

**Setup required**
- **JDK 21 or later.** Download from Oracle for your platform and follow its installation instructions.
- **IntelliJ IDEA 2023/2024 or later** (Community Edition is enough). With another IDE the steps differ.
- The **`bin` folder of the JDK home** must be in the **PATH** environment variable: it contains all the
  JDK tools. The installer usually does it.
- From MyLearn → *Guides*: the **Activity Guide** (the PDF with all the steps) and the **lab files**
  archive (`practices` + `solutions`). Unpack it.

**Steps**
1. In a terminal verify the tools: `java -version` (prints the version; fails if `bin` is not in PATH)
   and `javac` (prints its options = it is reachable).
2. `cd` into the practice 1 folder (`labs/practices/practice1`).
3. Start `jshell` and type: `int x = 1` · `int y = 1` · `int z = x + y` → `z ==> 2`.
4. `/save p1.jsh` — saves the script (a plain text file; the extension means nothing special).
5. `/list` · `/reset` · `/list` (empty now) · `/open p1.jsh` · `/list` · type `z` → `2`.
6. `/help` · `/exit`. List the folder: `p1.jsh` is there. Open it in any editor.
7. Start `jshell` again, `/open p1.jsh`, check `z`, `/list`, `/exit`.

### ✏️ Esercizi — 2.4
1. Esegui `java -version` e `javac -version`: annota le versioni. Sono ≥ 21?
2. Trova la cartella del JDK sul PC e la sua `bin`. Controlla che sia nel PATH: in PowerShell
   `$env:Path -split ';'`.
3. Rifai i passi 3–7 in una cartella `practice1`: alla fine devi avere `p1.jsh`.
4. Variante: script `prezzi.jsh` con `double prezzo = 8.5`, `int quantita = 3`,
   `double totale = prezzo * quantita`. Salvalo, `/reset`, riaprilo, stampa `totale`.

---

## 2.5 Practice 1-2: Creating, Compiling, and Executing a Java Application (18 min)

Goal (book): **create a simple application using the IDE, compile it and run it**, also from the
command line, with parameters.

**Steps adapted to your VS Code**
1. Create a project folder (the course creates an IntelliJ project in `labs/practices/practice1`).
2. Create a class with a `main` method that prints a message.
3. Run it from the IDE (the Run link).
4. Run it from the terminal: `javac` then `java`, and check the `.class` file.
5. Run it again in "interpreted" mode: `java NomeFile.java`.
6. Change `main` to use `args[0]` and pass a parameter, with and without double quotes.

### ✏️ Esercizi — 2.5
1. Crea la classe `DukeLab` con un `main` che stampa `Welcome to DukeLabs`. Eseguila da VS Code.
2. Dal terminale compila con `javac`, trova `DukeLab.class`, eseguila con `java DukeLab`.
3. Cancella il `.class` ed eseguila con `java DukeLab.java`.
4. Modificala perché stampi `Scientist: ` + `args[0]`. Eseguila con `java DukeLab Duke`, poi con
   `java DukeLab "Duke Java"`.
5. Sbaglia di proposito: chiama il file `dukelab.java` (minuscolo) lasciando `public class DukeLab`.
   Che errore dà `javac`? Scrivi la regola che hai scoperto.

---

# 3. MODULE 3 — Handling Text and Numbers

## 3.1 Variables, Constants and Types (23 min)

Lesson objectives: represent data with variables and constants · understand variable types · use
operators · operator precedence · type casting.

### How Java represents data
A **variable** is a named unit of information with:
- a **type** (numeric, text, boolean…),
- a **name** (an **identifier**).

```java
int id;               // type int, name id
double weight;        // type double, name weight
String description;   // type String, name description
boolean complete;     // type boolean, name complete
```
(Names of variables, methods, classes… are collectively called **identifiers**.)

### Variable types
| Type | Holds | Examples |
|---|---|---|
| `int` | whole numbers | `-10`, `0`, `42` |
| `double` | floating-point numbers | `2.00`, `9.39`, `-2042.00009` |
| `boolean` | logical values | `true`, `false` |
| `char` | a **single** character, single quotes | `'H'`, `'e'` |
| `String` | text, double quotes | `"Hello"` |

**Java is strongly typed:**
- a variable of one type **cannot become another type**;
- the type of every variable **must be defined before the program can compile**.

Weakly typed languages (e.g. JavaScript) let you put any value in any variable. That looks simpler but
raises errors: you expect one type and find another. Code becomes harder to read and debug.

### Primitive types vs object types

| **Primitive** | **Object** |
|---|---|
| `int`, `double`, `char`, `boolean` (plus `byte`, `short`, `long`, `float`) | everything else, defined as **classes**: `String`, `LocalDate`, your own `Scientist`, `Experiment`… |
| hold **one simple value** (a number, a character) | complex structures made of **many values** |
| **no behaviors** (no methods), but take part in expressions | have **behaviors** = **methods** |
| lowercase names | class names start with an uppercase letter |

### Naming convention for variables
- A **noun**, **lowercase**.
- Multi-word: every word after the first starts **uppercase** → **camelCase**.
- **Short but descriptive**.

```java
double totalWeight;   // short and descriptive
String agent007;      // ok, but agentName would be better
int intValue;         // ok, but too vague
```
A convention is a **best practice**, not a compiler rule.

### Rules for identifiers (compiler rules — breaking them = compile error)
- must **not start with a digit**;
- keywords and reserved words are **not allowed**;
- **operators are not allowed** inside a name;
- Java is **case-sensitive**: `some` ≠ `Some`.

```java
int 2much;           // ❌ starts with a digit
int double;          // ❌ keyword
String some+other;   // ❌ contains an operator
```

### Variables store values
A **value** is the piece of data a variable holds. It must be **compatible** with the variable's type.
```java
int id;  double mass;  String description;
id = 101;
mass = 2.4;
description = "Measure mass";
```

### Variable initialization
**Initialization** = the **first** time a value is assigned.
- Declare first, initialize later — or both in one line.
- A variable **must be initialized before it is used**.
- A **new value** can be assigned later.
- Several variables of the **same type** can be declared (and initialized) together.
```java
int id = 101;       // declare + initialize
double mass;        // declare
mass = 2.4;         // initialize
id = 42;            // reassign
double mass2 = 42.15, height = 16.30, width = height;   // several at once
```

### Constants — `final`
- A `final` variable is a **constant**: a value can be assigned **only once**.
- It does not have to be initialized immediately — but only once.
- Convention: `UPPER_CASE` with `_` between words, so you recognize a constant by its name.
```java
final int id = 101;
// id = 42;                          // ❌ compile error: cannot assign a value to final variable
final int code;
code = 7;                           // ok: first and only assignment
final double MIN_TEMPERATURE = -459.67;
```

### Inferring variable types — `var`
The compiler can **guess** the type from the initial value:
```java
var id = 101;      // int
var mass = 2.4;    // double
```
- Works only in limited cases: **local variables** (inside methods) **with an initializer**.
- Convenient, but can make code **harder to read**: the explicit type tells the reader what the variable
  represents.
- The compiled code always has a precise type: `var` is not "any type".

> ⚠️ EXAM — `var` traps:
> - `var x;` ❌ (no initializer) · `var x = null;` ❌ · `var a = 1, b = 2;` ❌ (only one variable).
> - not allowed for fields, method parameters or return types.
> - once inferred, the type is fixed: `var n = 5; n = 2.5;` ❌ (n is int).
> - `var` is not a keyword but a reserved type name: `int var = 3;` compiles (terrible, but legal).

> ⚠️ EXAM — all **8 primitive types** (the course shows 4):
>
> | Type | Size | Range / example | Default (fields/arrays) |
> |---|---|---|---|
> | `byte` | 8 bit | −128 … 127 | 0 |
> | `short` | 16 bit | −32 768 … 32 767 | 0 |
> | `int` | 32 bit | ≈ ±2.1 billion | 0 |
> | `long` | 64 bit | huge; literal ends with `L`: `5000000000L` | 0L |
> | `float` | 32 bit | literal ends with `f`: `3.14f` | 0.0f |
> | `double` | 64 bit | default for decimals: `3.14` | 0.0 |
> | `char` | 16 bit | one Unicode character: `'A'`, `'\n'` (it is a number: `'A'` = 65) | `'\u0000'` |
> | `boolean` | — | `true` / `false` only | false |
>
> `float f = 3.14;` ❌ (3.14 is a double literal) → `3.14f`. `long big = 5000000000;` ❌ (int literal too
> large) → `5000000000L`. Underscores are allowed in numbers: `1_000_000`.

### ✏️ Esercizi — 3.1
1. **Tipi giusti.** Per ognuno scegli il tipo e dichiara la variabile con un nome in camelCase: numero di
   coperti, prezzo di un piatto, "il piatto è vegano?", iniziale del cuoco, nome del piatto.
2. **Identificatori.** Prova a compilare `int 2coperti;`, `double class;`, `String nome+cognome;`,
   `int Coperti; int coperti;`. Quali compilano? Perché l'ultima coppia sì?
3. **Inizializzazione.** Dichiara `int ordini;` e poi stampalo **senza** assegnargli un valore. Leggi
   l'errore. Poi correggi.
4. **Costanti.** Crea `final double IVA = 0.10;` e prova a riassegnarla. Poi crea `final int MAX_COPERTI;`
   e assegnala su una riga separata. Quale delle due dà errore?
5. **`var`.** Scrivi `var temperatura = 75;` e poi `temperatura = 75.5;`. Cosa succede e perché? Prova
   anche `var x;`.
6. **Primitivi vs oggetti.** In JShell crea `String piatto = "Carbonara";` e scrivi `piatto.` e poi TAB:
   vedi i metodi. Fai lo stesso con `int n = 5;` e `n.` : cosa succede? Cosa dimostra?
7. **Gli 8 primitivi.** Dichiara una variabile per ognuno degli 8 tipi. Fai compilare `long` e `float`
   usando i suffissi giusti.

---

## 3.2 Operators (19 min)

### Assignment and arithmetic operators
| Op | Meaning |
|---|---|
| `=` | assignment: the value on the **right** goes into the variable on the **left** |
| `+` | addition |
| `-` | subtraction |
| `*` | multiplication |
| `/` | division |
| `%` | **modulus**: the **remainder** of a division (`7 % 3` is `1`) |

```java
int quantity = 2;
double mass = 2.4;
int a = quantity + 1;         // 3
int b = quantity - 1;         // 1
double c = quantity * mass;   // 4.8
double d = mass / 2;          // 1.2
int e = 3 % quantity;         // 1  (3 = 2*1 + 1)
```

### Operations and assignments
An operation **uses** the variable's value but **does not change** the variable. It produces a new value
that you can assign somewhere:
```java
int quantity = 2;
int differentQuantity = quantity + 1;   // differentQuantity is 3, quantity is still 2
quantity = quantity + 1;                // now quantity is 3
```

> ❌ SLIDE ERROR — the slide shows `quantity+1;` alone on a line, "result 3 but quantity not changed".
> The idea is right, but that line **does not compile**: `error: not a statement`. An expression like
> `x + 1` must be used: assigned, printed or passed to a method. (Only JShell accepts it.)

### Compound assignments
Combine an operation and an assignment on the same variable:
```java
int a = 1, b = 3;
a += b;   // a = a + b  → 4
a -= 2;   // a = a - 2  → 2
a *= b;   // a = a * b  → 6
a /= 2;   // a = a / 2  → 3
a %= a;   // a = a % a  → 0
```
Long and short forms are interchangeable: choose the more readable one.

> ⚠️ EXAM — they are **not 100 % identical**: a compound assignment includes an **automatic cast** back to
> the variable's type.
> `int n = 1; n += 2.5;` compiles (n becomes 3) — `int n = 1; n = n + 2.5;` ❌ does not compile.

### Increment and decrement
- `++` adds 1, `--` subtracts 1.
- **prefix** `++a` (in front) or **postfix** `a++` (behind). Alone on a line they do the same thing.
```java
int a = 42;
++a;   // 43        a++;   // 43
--a;   // 42        a--;   // 42
```

### Prefix vs postfix inside an expression
The difference appears only when combined with other operators in the same expression:
- **prefix** → **first** change the variable, **then** use the new value;
- **postfix** → **first** use the current value, **then** change the variable.
```java
int a = 42, b = 0;
b = --a;   // a 41, b 41
b = ++a;   // a 42, b 42
b = a--;   // b 42 (old value), then a 41
b = a++;   // b 41 (old value), then a 42
```

> ⚠️ EXAM — classic trick: `int x = 5; x = x++;` → x is still **5** (the old value is saved, x is
> incremented, then the old value is assigned back). Also: `int y = x++ + ++x;` with x=5 → 5 + 7 = 12, x=7.

### Equality and relational operators
They compare values and give a **`boolean`**: `true` or `false` only.

| Op | Meaning |
|---|---|
| `==` | equal to (two `=`! one `=` is assignment) |
| `!=` | not equal to |
| `>` `>=` `<` `<=` | greater, greater or equal, less, less or equal |
| `!` | **NOT**: inverts a boolean |

```java
int a = 3, b = 2;
boolean c = false;
c = (a == b);    // false
c = !(a == b);   // true
c = (a != b);    // true
c = (a > b);     // true
c = (a >= b);    // true
c = (a < b);     // false
c = (a <= b);    // false
```
- Parentheses around a boolean expression are **optional**, they only help readability.
- Case-sensitive: `TRUE`, `True`, `FALSE` are **not** boolean values.
- Unlike C, Java **never converts 0/1 to false/true**: `boolean b = 1;` ❌, `if (1)` ❌.

### Conditional operators `&&` and `||`
Combine boolean conditions into one expression.

| `&&` AND — true only if **both** are true | `\|\|` OR — false only if **both** are false |
|---|---|
| true && true → **true** | true \|\| true → **true** |
| true && false → false | true \|\| false → **true** |
| false && true → false | false \|\| true → **true** |
| false && false → false | false \|\| false → false |

```java
int a = 3, b = 2;
boolean c;
c = (a > b && b == 2);   // true
c = (a < b && b == 2);   // false
c = (a < b || b == 2);   // true
c = (a < b || b == 3);   // false
```

> ⚠️ EXAM — **short-circuit**: if the left side already decides, the right side is **not evaluated**.
> `false && …` → false without looking right · `true || …` → true without looking right.
> `int k = 0; boolean t = (3 < 2) && (++k > 0);` → k stays **0**.
> This is how you write safe checks: `if (s != null && s.length() > 0)`.
> (`&` and `|` also work on booleans but **always** evaluate both sides.)

### Ternary operator — conditional assignment
```java
variable = (booleanExpression) ? valueIfTrue : valueIfFalse;

int a = 2, b = 3;
int c = (a >= b) ? a : b;   // 2 >= 3 is false → c is 3
```
(The audio says "if a is greater than b"; the code on the slide uses `>=`. The code is what counts.)

### Operator precedence
From first to last:
1. `( )` operations inside round brackets
2. `++` `--`
3. `*` `/` `%` (multiplicative)
4. `+` `-` (additive)
5. `<` `>` `<=` `>=` (relational)
6. `==` `!=` (equality)
7. `&&` (logical AND)
8. `||` (logical OR)
9. `? :` (ternary)
10. `=` `+=` `-=` `*=` `/=` `%=` (assignment)

- Same level → evaluated **left to right**.
- Assignment → evaluated **right to left** (`a = b = 5;` first b, then a).
- This is not the full list of Java operators, only the basic ones.

### Order of operations example
```java
double a = 2.4, b = 1.2, c = 1.6;
c += b / a + ((b < a) ? c : (a - b));   // c is 3.7
```
Step by step, with imaginary intermediate variables:
1. `double x1 = (a - b);` → 1.2 (innermost parentheses)
2. `boolean x2 = (b < a);` → true (the ternary is next because it sits in another pair of parentheses;
   its condition first)
3. `double x3 = x2 ? c : x1;` → 1.6
4. `double x4 = b / a;` → 0.5
5. `double x5 = x4 + x3;` → 2.1
6. `c = c + x5;` → 3.7 (compound assignment is last)

> ❌ SLIDE ERROR — step 3 on the slide is `double x3 = (x3) ? c : x1;`: it must be `(x2)` (x3 used to
> define itself does not compile). Step 6 is `double c = c+x5;`: redeclaring `c` does not compile; it
> means `c = c + x5;`.

Complex expressions can always be split into simple steps like these. If a line is hard to read, write it
in more lines — it is like writing several short sentences instead of one long one.

### ✏️ Esercizi — 3.2
1. **Aritmetica.** Hai 17 porzioni e 5 persone: stampa le porzioni intere a testa (`/`) e quante ne
   avanzano (`%`). Poi con `double prezzo = 12.5` stampa il costo di 3 porzioni.
   *Atteso: 3 · 2 · 37.5*
2. **Operazione vs assegnazione.** `int scorte = 10;` Stampa `scorte - 3`, poi stampa `scorte`
   (**prevedi** prima il valore). Poi fai valere davvero 7 a `scorte`. Infine scrivi `scorte - 3;` da
   solo su una riga e leggi l'errore del compilatore.
3. **Assegnazioni composte.** `int totale = 100;` Usando **solo** operatori composti: +20, −30, ×2, ÷3,
   resto di ÷7. Stampa dopo ognuno. *Atteso: 120 · 90 · 180 · 60 · 4.* Poi prova `totale += 2.5;` e
   `totale = totale + 2.5;`: quale compila?
4. **++ e --.** `int ordini = 0;` Arrivano 3 ordini (tre `++`), uno viene annullato (un `--`).
   Stampa. *Atteso: 2*
5. **Prefisso/postfisso.** `int a = 10, b;` poi `b = a++;` `b = ++a;` `b = a--;` `b = --a;`.
   **Prima** scrivi nei commenti cosa ti aspetti, poi stampa `a` e `b` dopo ogni riga. Bonus: prevedi
   `int x = 5; x = x++;`.
6. **Confronti.** Un arrosto è cotto se il cuore arriva ad almeno 75 °C. `int temperatura = 75;`
   Crea `boolean cotto` (usa `>=`), `boolean crudo` (usa `!`), e stampa se `temperatura != 100`.
7. **AND/OR e cortocircuito.** `int temp = 80, minuti = 3;` `servibile` = temp ≥ 75 **e** minuti ≥ 2;
   `daControllare` = temp < 75 **o** minuti < 2. Poi `int controlli = 0;` e
   `boolean test = (temp < 0) && (++controlli > 0);` — **prevedi** `controlli` e poi stampalo.
8. **Ternario.** `int ospiti = 12;` → `tavoli` = 3 se ospiti > 10, altrimenti 2. Poi `int x = 7, y = 4;`
   → `massimo` con il ternario.
9. **Precedenza.** **Prevedi**, poi stampa: `10 - 4 / 2 * 3` · `(10 - 4) / 2 * 3` · `20 % 6 + 2 * 3` ·
   `5 + 3 > 7 && 2 * 2 == 4`.
10. **Scomporre.** `int r = 3; r += 4 * 2 - ((r > 2) ? 1 : 5);` Stampa `r`. Poi rifallo passo per passo con
    variabili intermedie (`s1` confronto, `s2` ternario, `s3` moltiplicazione, `s4` sottrazione, infine
    l'assegnazione) e controlla che il risultato sia uguale.

---

## 3.3 Operation Results (10 min)

### Operation result type
- If **all** operands are `int`, the result is an **`int`** — the decimal part is **thrown away**
  (integer division truncates, it does not round).
- Assigning that `int` to a `double` variable is allowed, but the damage is done: only `.0` after the dot.
```java
int x = 1, y = 4;
double r = x / y;     // x/y is int 0 → r is 0.0
```
- For a `double` result, **at least one operand must be `double`**:
```java
int x = 1, y = 4;
double z = y;         // int → double automatically
double r = x / z;     // 0.25
```

**The general rule (from the book notes).** Each numeric type has a capacity in bits (8, 16, 32, 64):
bigger capacity = bigger range. `int` is 32-bit; `char` is also numeric (it stores a character code).
> An arithmetic operation involving types **smaller than `int`** gives an **`int`**.
> Otherwise the result has the type of the **biggest** operand.
- `int` + `double` → `double` · `int` + `char` → `int` · `char` + `char` → `int`.

### Type casting
- To convert a value to another type, put the **type in parentheses** in front of it: `(double) y`.
- It works directly inside an expression, no extra variable needed.
```java
int x = 1, y = 4;
double r = x / (double) y;   // 0.25
```
- Assigning a **bigger** type to a **smaller** one is **illegal** (possible loss of information):
```java
int x = 0;
double y = 3.14;
x = y;          // ❌ compile error: possible lossy conversion from double to int
```
- With an **explicit cast** you tell the compiler you accept the loss. The decimal part is **truncated**,
  **not rounded**:
```java
double y = 3.74;
x = (int) y;    // 3, not 4
```
- For real rounding use `Math.round`:
```java
x = (int) Math.round(y);   // 4
```

> ❌ SLIDE ERROR — the book writes `x = Math.round(y);` with `int x`. It does **not** compile:
> `Math.round(double)` returns a **`long`** → "possible lossy conversion from long to int". You need
> `(int) Math.round(y)`. (`Math.round(float)` returns `int`.)

> ⚠️ EXAM — casting rules to memorize:
> - **Widening** (automatic, safe): `byte → short → int → long → float → double`, and `char → int`.
> - **Narrowing** (needs an explicit cast, may lose data): the other direction.
> - `(int) 3.99` → 3 · `(int) -3.99` → −3 (truncates toward zero).
> - Integer overflow wraps silently: `(byte) 200` → −56; `Integer.MAX_VALUE + 1` → a negative number.
> - Cast precedence is high: `(double) x / y` casts **x** first → decimal division; `(double)(x / y)`
>   casts the already-truncated result → `0.0`.
> - `int / 0` → **`ArithmeticException`** at runtime. `double / 0` → `Infinity` (no exception).
>   `0.0 / 0` → `NaN`.
> - `%` also works with doubles: `7.5 % 2` → 1.5. The sign follows the left operand: `-7 % 3` → −1.
> - `char` arithmetic: `'A' + 1` → 66 (an int); `char c = 'A'; c++;` → `'B'`.

### ✏️ Esercizi — 3.3
1. **Divisione intera.** `int pizze = 7, persone = 2;` Stampa `pizze / persone`. Poi assegnalo a
   `double risultato` e stampa: perché esce `3.0` e non `3.5`?
2. **Ottenere 3.5.** Ottieni 3.5 in **tre modi**: (a) con una variabile `double` intermedia, (b) con un
   cast `(double)` su un operando, (c) scrivendo `7.0` al posto di `7`. Poi prova `(double)(pizze / persone)`
   e spiega perché fa `3.0`.
3. **Cast che tronca.** `double peso = 2.99;` Mettilo in un `int` con il cast e stampa. Poi arrotondalo
   bene con `Math.round`. Scopri da solo perché `int n = Math.round(peso);` non compila e correggilo.
4. **Il tipo del risultato.** **Prevedi** il tipo e il valore, poi verifica in JShell (JShell mostra il
   tipo): `5 / 2` · `5 / 2.0` · `'A' + 1` · `(char)('A' + 1)` · `10 % 3` · `10.0 % 3`.
5. **Divisione per zero.** Prova `10 / 0` e `10.0 / 0`. Annota la differenza: in quale caso il programma
   si ferma?

---

## 3.4 Practice 2-1: Working with Variables and Constants (34 min)

Goal (book): write code snippets in JShell; **record a number of temperature measurements**; **convert
them between units**.

Formulas you will need:
- Celsius → Fahrenheit: `F = C * 9 / 5 + 32`
- Fahrenheit → Celsius: `C = (F - 32) * 5 / 9`
- Celsius → Kelvin: `K = C + 273.15`
- Absolute zero: −273.15 °C = −459.67 °F (the book's constant `MIN_TEMPERATURE = -459.67`).

> Watch out: `C * 9 / 5` with an `int C` truncates. `9 / 5` alone is `1` → a classic bug. Use `9.0 / 5`.

### ✏️ Esercizi — 3.4 (stile DukeLabs)
1. In JShell dichiara tre misure di temperatura in °C (`double t1 = 21.5`, ecc.) e la costante
   `final double ABSOLUTE_ZERO_C = -273.15;`.
2. Converti ognuna in °F e in K e stampale con testo, es. `21.5 C = 70.7 F`.
3. Calcola la **media** delle tre temperature. Prima con `int` (osserva l'errore di troncamento), poi con
   `double`.
4. Scrivi `double f = t1 * 9 / 5 + 32;` e `double g = t1 * (9 / 5) + 32;`. Perché escono diversi?
5. Porta tutto in una classe `TemperatureLab` con `main` e riesegui dal terminale.

---

## 3.5 Work with Text Values (19 min)

Lesson objectives: represent single letters as `char` primitives and text as `String` objects;
manipulate text with `String` methods.

### char and String
- **`char`** — primitive, **one character**, in **single quotes**: `char letter = 'e';`
- **`String`** — class (object type), **text**, in **double quotes**: `String text = "It's Magic!";`
- A String stores a **sequence of characters**. Each character has an **index starting at 0**.

```
 I  t  '  s     M  a  g  i  c  !
 0  1  2  3  4  5  6  7  8  9  10      length = 11, last index = 10
```
- A String may contain `'`; a char may be `"`. The quotes are **delimiters** (boundaries of the value).

### Escape characters
`\` is the **escape character**: the next character is treated as text, or forms a special symbol.
```java
char letter1 = '\'';          // the ' character
char letter2 = '\\';          // the \ character
String text = "8'5\"";        // 8'5"
char newLine = '\n';          // new line
char tab = '\t';              // tab
String example = "Hi,\n\tHow are you?\nBye!";
```
prints:
```
Hi,
	How are you?
Bye!
```

### Creating String objects
```java
String text1 = "Hi";              // recommended
String text2 = new String("Hi");  // works, NOT recommended
```
**Why not `new String`?** — **String interning**: two identical literals `"Hi"` and `"Hi"` share **one
single object** in memory (the **String pool**). This is possible because Strings are immutable.
`new String("Hi")` forces a separate copy and defeats the optimization.

**Strings are immutable**
- Once created, a String object can **never** be modified.
- **No** String method changes the original: they return a **new** String.
```java
String s = "magic";
s.toUpperCase();            // result thrown away — s is still "magic"
s = s.toUpperCase();        // now s refers to a new object "MAGIC"
```

### String methods (the ones in the course)
Using `String text = "It's Magic!";`

| Method | Does | Example | Result |
|---|---|---|---|
| `length()` | number of characters | `text.length()` | `11` |
| `charAt(i)` | character at index i | `text.charAt(6)` | `'a'` |
| `indexOf(c or s)` | first position of a char/substring, **−1 if not found** | `text.indexOf('i')` · `text.indexOf("It")` · `text.indexOf('b')` | `8` · `0` · `-1` |
| `substring(start, end)` | from start **included** to end **excluded** | `text.substring(3, 7)` | `"s Ma"` |
| `substring(start)` | from start to the end | `text.substring(8)` | `"ic!"` |
| `concat(s)` | joins | `"It's".concat("Magic!")` | `"It'sMagic!"` |
| `+` | joins (simpler) | `"It's" + "Magic!"` | `"It'sMagic!"` |
| `toUpperCase()` | uppercase copy | `text.toUpperCase()` | `"IT'S MAGIC!"` |
| `toLowerCase()` | lowercase copy | `text.toLowerCase()` | `"it's magic!"` |

- Valid indexes: **0 … length()−1**. Outside → error **at runtime**:
  `text.charAt(11)` → `StringIndexOutOfBoundsException`.
- Spaces, `\n`, `\t` all count as characters: in `"Hi,\n\tHow are you?"`, `\n` is index 3 and `\t` index 4.
- `substring(3,7)` takes indexes 3,4,5,6 → length = end − start = 4.

> ❌ SLIDE ERROR — concatenation slide: `String text2 = "Magic!"` is missing its `;`, and the comments say
> the result is `"It'sMagic"`: the real result is **`"It'sMagic!"`** (with the `!`).

### Primitives, classes and methods — wrapper classes
Primitives have **no methods**. Java gives each primitive a **wrapper class** with useful methods:
`Character` for `char`, `Integer` for `int`, `Double` for `double`, `Boolean` for `boolean`…
```java
char c1 = 'a', c2 = '4';
c1 = Character.toUpperCase(c1);        // 'A'
c1 = Character.toLowerCase(c1);        // 'a'
boolean x = Character.isLetter(c1);    // true
x = Character.isLetter(c2);            // false
x = Character.isDigit(c2);             // true
```

> ❌ SLIDE ERROR — the slide writes `Character.toUpperCase(x)` using a variable `x` that is not declared yet
> (it is declared later as a boolean): "cannot find symbol". It must be `c1`.

> ⚠️ EXAM — String topics the course skips (all in chapter 9): `equals` vs `==`, `equalsIgnoreCase`,
> `compareTo`, `trim`/`strip`, `isEmpty`/`isBlank`, `replace`, `contains`, `startsWith`/`endsWith`,
> `lastIndexOf`, `indexOf(s, from)`, `String.format` / `printf` with `%d %s %f %n`, and `+` with numbers:
> `"1" + 2 + 3` → `"123"` but `1 + 2 + "3"` → `"33"` (left to right!).

### ✏️ Esercizi — 3.5
1. **Indici.** `String piatto = "Tiramisu";` Disegna gli indici su carta. Poi stampa `length()`,
   `charAt(0)`, l'ultimo carattere **usando** `length()`, e `charAt(8)` (leggi l'errore).
2. **Escape.** Stampa, con **una sola** `println`: `Lo chef disse: "Sale q.b."` a capo, tab, `Fine`.
   Poi stampa il percorso `C:\ricette\dolci`.
3. **`indexOf`.** In `"spaghetti alla carbonara"` trova la posizione di `'a'`, di `"carbonara"` e di `'z'`.
4. **`substring`.** Da `"spaghetti alla carbonara"` estrai `"spaghetti"` e `"carbonara"` usando
   `indexOf` per trovare gli indici (non contarli a mano).
5. **Immutabilità.** `String s = "pesto";` Chiama `s.toUpperCase();` senza assegnarlo e stampa `s`.
   Poi correggi perché stampi `PESTO`. Spiega perché nei tuoi appunti.
6. **Concatenazione.** Unisci `"Pasta"` e `"Fagioli"` con `concat` e con `+`, con uno spazio in mezzo.
   Poi **prevedi**: `"Tavolo " + 2 + 3` e `2 + 3 + " coperti"`.
7. **Wrapper `Character`.** Per `char c = '7'` e `char d = 'b'` stampa `isDigit`, `isLetter` e
   `toUpperCase`.

---

## 3.6 Practice 3-1: Working with Strings (18 min)

Goal (book): write snippets in JShell; create and use text values; **assemble text fragments that
describe measurements**.

### ✏️ Esercizi — 3.6 (stile DukeLabs)
1. Crea `String unit = "kg";`, `double value = 42.7;`, `String description = "Measure mass";`.
2. Costruisci con `+` la frase `Measure mass: 42.7 KG` (unità in maiuscolo con `toUpperCase()`).
3. Da `String record = "temperature=21.5C";` estrai con `indexOf` e `substring`: il nome
   (`temperature`), il valore (`21.5`) e l'unità (`C`).
4. Aggiungi una nota su più righe con `\n` e `\t`, per esempio
   `Notes:\n\tsample 1\n\tsample 2`, e stampala.
5. Controlla con `Character.isDigit` se il primo carattere di `"7kg"` è una cifra.

---

# 4. MODULE 4 — Arrays, Conditions, and Loops

## 4.1 Work with Arrays (16 min)

Lesson objectives: explain arrays · declare and create array objects · initialize and access elements.

### What an array is
A simple **collection** that groups several elements:
- all elements have the **same type** (e.g. all `String` or all `double`);
- the **length is fixed** when the array is created, and can never change;
- elements are reached with an **`int` index** that **starts at 0**;
- the last valid index is always **`length - 1`**.

```
index  String            index  double
  0    "kg"                0    22.1
  1    "lb"                1    17.09
  2    "m"                 2    42.7
  3    "ft"              length is 3
length is 4
```

### Declaring array variables — two syntaxes
```java
double[] values;     // type[] name   ← more common
double values[];     // type name[]   ← same result
String[] units;
```

### Creating array objects — `new`
```java
values = new double[3];        // double array of length 3
units  = new String[4];        // String array of length 4
double[] values2 = new double[3];   // declare + create together
```
The length is a **constant**: `values.length` (a field, **no parentheses** — unlike `String.length()`).

### Default contents
When the array is created every element gets a default value:

| Element type | Default |
|---|---|
| whole numbers (`int`, `long`…) | `0` |
| floating point (`double`, `float`) | `0.0` |
| `char` | character code 0 (`'\u0000'`) |
| `boolean` | `false` |
| any object reference (`String`…) | **`null`** |

### Initializing and using elements
```java
double[] values = new double[3];
String[] units = new String[4];
values[0] = 22.1;
values[1] = 17.09;       // values[2] stays 0.0
units[2] = "m";
units[0] = "kg";         // any order; units[1] and units[3] stay null

double x = values[0];                    // read an element
String u = units[2];
values[1] = values[1] + values[0];       // 39.19
units[1] = units[0].toUpperCase();       // "KG" — call methods on elements
```

### Declare, create and initialize in one go
```java
double[] values = {22.1, 17.09, 42.7};                 // length 3, inferred
String[] units = {"kg", "lb", "m", "ft"};

double[] values2;
values2 = new double[]{22.1, 17.09, 42.7};             // needed when declaration is separate
```
The `new type[]` part can be omitted **only** in the declaration line.

### Errors when using arrays
```java
String[] units = {"kg", null, "m", "ft"};
units[1].toLowerCase();   // NullPointerException: element 1 is null
units[4];                 // ArrayIndexOutOfBoundsException: valid indexes are 0..3
```

### Preventing errors
- The lowest index is always `0`, the highest `length - 1`.
- Before calling a method on an element of an **object** array, check it is **not null**.
- Use `length` to compute the last index.
```java
units[1] = (units[1] != null) ? units[1].toLowerCase() : null;
String last = units[units.length - 1];   // "ft"
```
Elements of **primitive** arrays can never be `null`.

> ⚠️ EXAM — array traps:
> - `int[] a = new int[3]; a.length` → 3 · `a[3]` → exception at **runtime** (it compiles).
> - `int[] a = new int[];` ❌ (length required) · `int[] a = new int[2]{1,2};` ❌ (length AND values).
> - `int[] a = {1,2}; a = {3,4};` ❌ — braces alone only work in the declaration.
> - `int a[], b;` → `a` is an array, `b` is a plain int! · `int[] a, b;` → both are arrays.
> - Arrays are **objects**: `int[] b = a;` copies the **reference**, not the elements — changing
>   `b[0]` changes `a[0]` too.
> - `System.out.println(a)` prints something like `[I@1b6d3586`, not the contents. Use
>   `java.util.Arrays.toString(a)` → `[1, 2, 3]`.
> - An array of length 0 is legal: `new int[0]`.

### ✏️ Esercizi — 4.1
1. **Dichiarare e creare.** Crea un array `int[] coperti` di 7 elementi (uno per giorno) e stampa
   `coperti[0]` e `coperti.length` **prima** di assegnare qualsiasi valore. Che valore c'è dentro?
2. **Valori di default.** Crea array di lunghezza 2 di `double`, `boolean`, `char`, `String` e stampa il
   primo elemento di ognuno. Scrivi una tabella dei default negli appunti.
3. **Inizializzare.** `String[] antipasti = {"bruschetta", "caprese", "tagliere"};` Cambia il secondo in
   `"burrata"` e stampa tutti gli elementi uno per uno.
4. **Ultimo elemento.** Stampa l'ultimo elemento di `antipasti` usando `length` (senza scrivere 2).
5. **Errori.** Stampa `antipasti[3]` e leggi l'eccezione. Poi crea `String[] vuoti = new String[2];` e
   chiama `vuoti[0].length()`: che eccezione esce? Correggi con un controllo `!= null` e il ternario.
6. **Riferimenti.** `int[] a = {1, 2, 3}; int[] b = a; b[0] = 99;` **Prevedi** `a[0]`, poi stampalo.
7. **Stampare un array.** Stampa `a` con `println(a)`, poi con `java.util.Arrays.toString(a)`.

---

## 4.2 Practice 4-1: Working with Arrays (20 min)

Goal (book): JShell snippets; **represent measurement notes, values and units as arrays**; **manage the
array contents**.

### ✏️ Esercizi — 4.2 (stile DukeLabs)
1. Crea `double[] values = {22.1, 17.09, 42.7};` e `String[] units = {"kg", "lb", "m"};`: due array
   **paralleli** (lo stesso indice = la stessa misura).
2. Stampa ogni misura come `22.1 kg`, accedendo ai due array con lo stesso indice.
3. Converti `values[1]` da libbre a kg (`× 0.453592`) e cambia `units[1]` in `"kg"`.
4. Crea `String[] notes = new String[3];` Riempi solo `notes[0]`. Stampa tutte le note in maiuscolo senza
   provocare `NullPointerException`.
5. "Allunga" l'array: crea un nuovo `double[]` di lunghezza 4, copia i 3 valori e aggiungi `9.81` in fondo.
   Perché serve un array nuovo?

---

## 4.3 Write Loops (14 min)

Lesson objectives (book lesson 5): execute logic iteratively with `while`, `do/while`, `for`, for-each ·
fork the execution path with `if/else` · jump forward with `switch/case`.

### Three ways to control program flow
- **Select** a path based on a boolean condition → `if` / `else`.
- **Jump forward** to a point on the path → `switch` / `case`.
- **Repeat** a block while a condition holds → `for`, `while` (loops).

### while
```java
while (booleanExpression) {
    // repeated while the expression is true
}
```
The four elements of a loop: **iterator declaration**, **termination condition**, **iterator update**
(usually `++`/`--`), **loop body**.
```java
int i = 0;             // declare the iterator
while (i < 10) {       // termination condition, checked BEFORE each cycle
    // loop actions
    i++;               // update the iterator
}
```
When the condition is false the loop ends and execution continues after the closing `}`.
The condition can be **any** boolean expression, not only a counter.

### do / while
```java
int i = 0;
do {
    // loop actions
    i++;
} while (i < 10);      // condition checked at the END → note the ;
```
The **only** difference from `while`: the condition is checked **after** each cycle, so the body runs
**at least once** even if the condition is false from the start.

### for
Packs all the loop mechanics in one line, three parts separated by `;`:
```java
for (int i = 0; i < 10; i++) {
    //  declaration ; condition ; update
}
```
Useful when the body is long: you don't have to hunt for the `i++` inside it.
```java
double[] values = {22.1, 17.09, 42.7};
double sum = 0;
for (int i = 0; i < values.length; i++) {
    sum += values[i];
}
```

### for-each (enhanced for loop)
```java
for (double value : values) {   // "for each value in values"
    sum += value;
}
```
- Goes through **all** elements; each iteration puts the current element in the variable.
- No index to maintain, no boundaries to check.
- The keyword is still **`for`**. Also called the **enhanced for loop**.

### break and continue
- **`continue`** — skip the rest of this iteration, go to the **next** one.
- **`break`** — **exit** the loop completely.
```java
double[] values = {22.8, 16.1, 42.7, 3.1};
double sum = 0;
for (double value : values) {
    value = Math.round(value);   // round to a whole number
    if (value % 2 == 0) {
        continue;                // skip EVEN values
    }
    if (value > 30) {
        break;                   // stop at the first value over 30
    }
    sum += value;
}
// 22.8→23 (odd, added) · 16.1→16 (even, skipped) · 42.7→43 (>30, break) → sum = 23.0
```

> ❌ SLIDE ERROR — the slide's comment says `continue` "jumps to the next iteration if the value is an
> **odd** number", but `value % 2 == 0` is true for **even** numbers. The code is right, the comment is wrong.

### Loop inside a loop
Any loop can contain any other loop, at any depth.
```java
for (int x = 0; x < 3; x++) {     // outer: 3 iterations
    int y = 5;
    while (y > 0) {               // inner: 5 iterations per outer iteration
        y--;
    }
}                                 // 3 × 5 = 15 inner iterations in total
```

> ⚠️ EXAM — loops, "compare and contrast":
>
> | | checks condition | runs at least once? | best when |
> |---|---|---|---|
> | `while` | before | no | you don't know how many times |
> | `do-while` | after | **yes** | the body must run once (e.g. a menu) |
> | `for` | before | no | you know the count / you need the index |
> | for-each | — | no | read every element, no index needed |
>
> - for-each **cannot** replace array elements (the loop variable is a copy of each value), cannot go
>   backwards, has no index.
> - All three parts of `for` are optional: `for (;;) { }` is an infinite loop.
> - A variable declared in the `for` header exists **only inside** the loop.
> - `while (false) { }` → compile error "unreachable statement".
> - Off-by-one: `i <= values.length` → `ArrayIndexOutOfBoundsException` on the last round.
> - `break` in a nested loop exits only the **innermost** loop.

### ✏️ Esercizi — 4.3
1. **while.** Stampa i numeri da 1 a 10 con un `while`. Poi da 10 a 1.
2. **do-while.** Scrivi un `do-while` con condizione `false` fin dall'inizio: quante volte gira? Fai lo
   stesso con un `while`. Scrivi la differenza negli appunti.
3. **for.** Con un `for` stampa la tabellina del 7 (`7 x 1 = 7` … `7 x 10 = 70`).
4. **for con array.** `double[] incassi = {320.5, 410.0, 275.25, 500.0};` Calcola totale e media con un
   `for` classico.
5. **for-each.** Rifai il 4 con un for-each. Poi prova a raddoppiare gli elementi dentro il for-each
   (`valore = valore * 2;`) e stampa l'array: è cambiato? Perché?
6. **continue/break.** Da `int[] ordini = {5, 12, 0, 8, -1, 7};` somma gli ordini saltando gli zeri
   (`continue`) e fermandoti al primo negativo (`break`). *Atteso: 25*
7. **Ciclo annidato.** Stampa un rettangolo di asterischi 3 righe × 5 colonne. Poi un triangolo:
   riga 1 = `*`, riga 2 = `**`… fino a 5.
8. **Off-by-one.** Scrivi `for (int i = 0; i <= incassi.length; i++)` e leggi l'errore. Correggilo.

---

## 4.4 Write if/else constructs (9 min)

### if / else
- The **`if`** block runs when the boolean expression is **true**.
- Otherwise the **`else`** block runs.
- `else` is **optional**.
```java
if (booleanExpression) {
    // when true
}

if (booleanExpression) {
    // when true
} else {
    // when false
}
```

Example — convert pounds to kilograms when needed:
```java
String u = "lb";                        // could be "kg"
double v = 42;
String notes = "Measurement details.";
String unit;
double value;
if (u.equals("lb")) {                   // compare Strings with equals, not ==
    notes += "Converted from lb to kg.";
    value = v * 0.453592;
} else {
    notes += "No conversion required.";
    value = v;
}
unit = "kg";                            // runs in any case
```

### A single statement after if or else
- Braces are **optional** when the block has **one** statement.
- Not recommended: it reduces readability and invites bugs when you add a second line later.
- **Only braces define a block. Indentation means nothing to the compiler.**
```java
if (u.equals("lb"))
    value = v * 0.453592;
else
    value = v;
    unit = "kg";        // NOT part of else, despite the indentation: always runs
```
An `if` with **two** statements and no braces, followed by `else`, does not compile ("'else' without 'if'").

### Ternary vs if/else
A ternary performs **one simple conditional assignment**; `if/else` can run **groups of actions**.
```java
value = (u.equals("lb")) ? v * 0.453592 : v;   // same as the if/else above for 'value'
unit = "kg";
```
The more complex the logic, the more you need `if/else`.

### Nested if/else
```java
if (v < 0) {
    notes += "Set value to 0.";
    v = 0;
} else {
    if (u.equals("lb") || u.equals("kg")) {
        notes += "Measure Weight.";
        value = v;
    }
}
```
**Java has no separate `else if` keyword.** A whole `if/else` counts as **one statement**, so it can follow
`else` without braces. That's what `else if` really is:
```java
if (v < 0) {
    ...
} else if (u.equals("lb") || u.equals("kg")) {   // = else { if (...) {...} }
    ...
}
```

> ⚠️ EXAM
> - `if (x = 5)` ❌ does not compile (an int is not a boolean). But `boolean b = false; if (b = true)`
>   compiles and is always true — a classic trap.
> - **Dangling else**: an `else` belongs to the **nearest** `if` without an else, whatever the indentation.
> - A local variable assigned only inside an `if` may be "not initialized" after it → compile error when
>   you use it (`value` above is fine only because both branches assign it).
> - `==` on Strings compares **references**, not text → always use `equals` (details in chapter 9).

### ✏️ Esercizi — 4.4
1. **if semplice.** `int temperaturaFrigo = 6;` Se è sopra 4 stampa `ATTENZIONE: frigo troppo caldo`.
2. **if/else.** `String unita = "lb"; double peso = 10;` Se l'unità è `"lb"` converti in kg e aggiungi una
   nota, altrimenti nota "nessuna conversione". Stampa peso e nota. Usa `equals`.
3. **Graffe e indentazione.** Scrivi un `if/else` **senza graffe** con due istruzioni indentate sotto
   `else`. **Prevedi** cosa stampa, poi eseguilo. Poi togli le graffe da un `if` con due istruzioni
   seguito da `else` e leggi l'errore.
4. **Ternario vs if.** Riscrivi il 2 (solo la parte del peso) con un ternario.
5. **else if.** `int voto` da 0 a 10: `>= 9` "ottimo", `>= 7` "buono", `>= 6` "sufficiente", altrimenti
   "insufficiente". Poi riscrivilo con `else { if ... }` annidati e le graffe, per vedere che è la stessa cosa.
6. **Trappola `=`.** Scrivi `boolean pronto = false; if (pronto = true) System.out.println("pronto");`
   Cosa stampa? Perché? Correggi.

---

## 4.5 Write switch/case constructs (16 min)

### switch with `case :` (the classic form)
The switch **jumps forward** to a point of the execution path:
- the **switch expression** produces a value, compared with the **case labels**;
- flow jumps to the **matching** case;
- if nothing matches, flow jumps to **`default`** (if present);
- flow then **continues through the following cases** until it meets a **`break`** — this is
  **fall-through**.
```java
switch (expression) {
    case LABEL_A:
        actions;          // no break → continues into case B!
    case LABEL_B:
        actions;
        break;            // leave the switch
    default:
        actions;
}
```
- `default` is **optional**. Without it, if no case matches, nothing in the switch runs.
- Cases (and `default`) can appear **in any order**.

### Types of the expression and labels
- The expression and the labels must have **matching types**: `char`, `int`, `String` are valid (also
  `byte`, `short`, their wrappers and enums; other types are out of scope).
- Each label is a **constant** value.
```java
int x = 20, y = 2;
switch (x + y) { case 42: ... case 3: ... case 22: ... }
switch (unit)  { case "lb": ... case "kg": ... case "ft": ... }
switch (c)     { case 'x': ... case 'y': ... case 'z': ... }
```

### Example — fall-through used on purpose
```java
String notes = "Measurement details.";
String unit = "lb";                    // "lb", "kg", "ft", "m"
double v = 12.6, value = 0;
switch (unit) {
    case "lb":
        v = v * 0.453592;              // convert, then FALL THROUGH into "kg"
    case "kg":
        notes += "Measure weight.";
        break;
    case "ft":
        v = v * 0.3048;                // convert, then fall through into "m"
    case "m":
        notes += "Measure length.";
        break;
    default:
        notes += "Measure things.";
}
value = v;
```

### switch with `case ->` (arrow form)
Works like `case :` but **breaks automatically** after each case: **no fall-through**.
Several labels per case, separated by commas.
```java
switch (unit) {
    case "lb", "kg" -> notes += "Measure weight.";
    case "ft", "m"  -> notes += "Measure length.";
    default         -> notes += "Measure things.";
}
```
A case can run several statements inside `{ }`: `case "lb" -> { v *= 0.453592; notes += "..."; }`.

### Switch expression — a switch that produces a value
```java
double value = switch (unit) {
    case "lb" -> v * 0.453592;
    case "ft" -> v * 0.3048;
    default   -> v;
};                          // ← the ; ends the assignment statement
```
- **Each** case, including `default`, must **yield a value**.
- `break` is **not allowed**; there is no fall-through anyway.
- It must be **exhaustive**: cover every possible value, or have a `default`.
- With the `case :` form you must return the value with **`yield`**:
```java
double value = switch (unit) {
    case "lb": yield v * 0.453592;
    case "ft": yield v * 0.3048;
    default:   yield v;
};
```
`->` implies a value; `:` does not, so it needs `yield`.

> ⚠️ EXAM
> - Classic switch types: `int`, `char`, `byte`, `short` (+ wrappers), `String`, enums. **Not** `long`,
>   `float`, `double`, `boolean`.
> - Labels must be **compile-time constants** (literals or `final` variables initialized with a constant)
>   and **unique**: two `case 1:` → compile error.
> - With `case :` and no `break`, **everything after the match runs**, `default` included if it comes after.
> - `default` placed first still runs **only** when nothing matches.
> - A `null` String in `switch(s)` → `NullPointerException`.
> - You cannot mix `:` and `->` in the same switch.

### ✏️ Esercizi — 4.5
1. **switch classico.** `int giorno = 3;` (1 = lunedì … 7 = domenica). Stampa il nome del giorno con
   `case :` e `break`, con `default` "giorno non valido".
2. **Fall-through voluto.** Stampa `weekend` per 6 e 7 e `lavoro` per 1–5, sfruttando il fall-through
   (più `case` di fila senza `break`).
3. **Fall-through per errore.** Togli **tutti** i `break` dall'esercizio 1 e prova con `giorno = 5`.
   **Prevedi** l'output prima di eseguire.
4. **String.** `String portata = "primo";` → stampa il tempo di preparazione: antipasto 10, primo 15,
   secondo 25, dolce 5, altrimenti "sconosciuto".
5. **Freccia.** Rifai il 2 con `case 6, 7 ->` e `case 1, 2, 3, 4, 5 ->`.
6. **Switch expression.** `String unita = "ft"; double v = 10;` Calcola `double metri = switch (unita) {...};`
   (ft × 0.3048, in × 0.0254, m × 1, default 0). Poi riscrivilo con `case :` e `yield`.
7. **Errori del compilatore.** Prova, uno alla volta: uno `switch` classico su un `double`; due `case`
   uguali; una switch expression senza `default`. Annota i messaggi.

---

## 4.6 Practice 5-1: Controlling Program Flow (32 min)

Goal (book): JShell snippets; **process measurements using if/else, switch statements and expressions, and
loops**.

### ✏️ Esercizi — 4.6 (stile DukeLabs)
1. `String[] units = {"lb", "kg", "ft", "m", "s"};` e `double[] values = {10, 4.5, 3, 2, 60};`
2. Con un `for` su tutti gli indici e una **switch expression** converti ogni valore in unità SI
   (lb → kg, ft → m, le altre invariate) e stampa `valore originale → valore SI`.
3. Con un `if/else` aggiungi a una `String notes` "weight", "length" o "other" per ogni misura.
4. Salta con `continue` le misure con valore ≤ 0 (metti un valore negativo nell'array per provare) e
   fermati con `break` se l'unità è `"stop"`.
5. Con un `while` somma i valori finché la somma non supera 50: quanti elementi hai usato?

---

# 5. MODULE 5 — Defining Classes and Creating Objects

## 5.1 Write Methods (18 min)

Lesson objectives: organize logic into methods · create methods · create and use local variables ·
understand variable scope.

### Algorithms
An **algorithm** is a group of related operations that performs a specific task. It expresses the
**logic** of the program and works on variables and constants.
```java
double mass1 = 2.4, mass2 = 1.9, height = 1.5, width = height, depth = 0.2;
int quantity = 2;
double volume = height * width * depth;                    // volume
double density1 = mass1 / volume;                          // densities
double density2 = mass2 / volume;
double averageDensity = (density1 + density2) / quantity;  // average
```

### Organizing algorithms into methods
A **method** is a **named** algorithm: a reusable unit of code you can invoke again and again.
- **Invoking** a method runs its logic.
- Optionally it **accepts parameters** (different values each time it is invoked) and **returns a value**.
```
calculateDensity(2.4, 42);   calculateDensity(8.7, 12);   // same logic, different values
mass = measureMass();                                     // gets a value back
```
"Method", "operation", "function" and "procedure" are used as synonyms.

### Creating a method
```java
<access modifier> <return type> <name>(<parameters>) {
    // method body
}
```
A method is described by: **name** · **zero or more parameters** in `( )` · **return type** · **body** in
`{ }`. (Access modifiers such as `public`/`private` → lesson 8.)

### Naming convention for methods
- Start with a **verb** (the main action), lowercase.
- Add one or more **nouns**, each starting uppercase → camelCase.
- Short but descriptive.
```
calculateAverageDensity   // good
getTheDensityOfTheLiquid  // ok, but getDensity is more concise
checkValue                // ok, but vague
```

### Parameters
- Define what data can be passed in: a **comma-separated list of type + name pairs**.
- No parameters → **empty parentheses** `()`.
- Inside the body, parameters behave like **normal variables**.
```java
double calculateDensity(double mass, int volume) { ... }
double measureMass() { ... }
```

### Return type and `return`
- The method declares the **type of the result** it returns.
- A method with a non-`void` return type must execute a **`return`** with a value of a compatible type.
- **`void`** = returns nothing; no `return` value needed (a bare `return;` may still end it early).
```java
void printDensity(double mass, int volume) {      // returns nothing
    System.out.println(mass / volume);
}
double measureMass() {                             // returns a double
    double mass = 42.7;                            // measurement logic
    return mass;
}
```

### Method body
Any number of statements and comments, ending with `return` if the method is not `void`.
```java
double calculateDensity(double mass, int volume) {
    double density = 0;
    /* if mass or volume is not positive, the result stays 0,
       otherwise calculate it */
    density = (volume <= 0 || mass <= 0) ? 0 : mass / volume;
    return density;
}
```

### Local variables
- A variable declared **inside a method** (parameters included) is a **local variable**.
- Local variables **must be initialized before use**. They get **no default value** (unlike array
  elements and object fields).
```java
double density;
double half = density / 2;   // ❌ compile error: variable density might not have been initialized
density = 1.5;
double half2 = density / 2;  // ✔ after initialization
```
(The slide shows both lines with the same name `halfDensity` to compare them; in real code that is a
second compile error — the same variable declared twice.)

### Variable scope
- **Scope** = the part of the program where a variable is **visible** (usable).
- A variable is visible in the **block where it is declared** and in all blocks **inside** it — not outside.
```java
double calculate(double speed) {       // speed: visible in the whole method
    double distance = 2;               // distance: the whole method, from here on
    {
        double time = distance / speed;   // time: only inside this inner block
        time *= 4;
        speed = distance / time;
    }
    // time = distance / speed;        // ❌ time is out of scope here
    return speed;
}
```

> ⚠️ EXAM
> - **Pass by value**: Java always copies the argument. Changing a primitive parameter does not change the
>   caller's variable. With objects the **reference** is copied: the method can change the object's
>   contents, but not make the caller's variable point to another object.
> - Code after `return` in the same block → "unreachable statement".
> - A non-void method where some path has no `return` → "missing return statement".
> - You cannot declare a local variable with the same name as another local still in scope
>   (e.g. inside a nested block).
> - Methods cannot be declared inside other methods.
> - Calling a method: arguments must match the parameters in number, order and (compatible) type.
>   `int` → `double` parameter is fine (widening); `double` → `int` parameter is not.

### ✏️ Esercizi — 5.1
Scrivi questi metodi `static` in una classe `Ricettario` e chiamali dal `main`
(`static` si spiega nella lezione 9; per ora serve per chiamarli dal `main`).
1. **void senza parametri.** `static void stampaIntestazione()` che stampa `=== MENU DEL GIORNO ===`.
   Chiamalo due volte.
2. **Parametri.** `static void stampaPiatto(String nome, double prezzo)` → `Carbonara ....... 12.5 €`.
3. **Valore di ritorno.** `static double calcolaIva(double prezzo)` che restituisce il prezzo con IVA 10 %.
   Usa il risultato in una variabile e stampalo.
4. **Logica nel corpo.** `static double calcolaDensita(double massa, double volume)` che restituisce 0 se
   massa o volume sono ≤ 0 (usa il ternario, come nella slide).
5. **`missing return`.** Scrivi un metodo `int` con un `return` solo dentro un `if`. Leggi l'errore e
   correggilo.
6. **Variabili locali.** Dichiara una variabile locale senza inizializzarla e usala. Leggi l'errore.
7. **Scope.** Crea un blocco `{ }` dentro il `main` con una variabile `int dentro = 5;` e prova a usarla
   fuori dal blocco. Poi prova a dichiarare **dentro** il blocco una variabile con lo stesso nome di una
   del `main`.
8. **Passaggio per valore.** `static void raddoppia(int n) { n = n * 2; }` Chiamalo su `int x = 5;` e
   stampa `x`. **Prevedi** prima il risultato.

---

## 5.2 Practice 6-1: Working with Methods (32 min)

Goal (book): JShell snippets; **create methods that process measurements**; **validate and convert units
and values**.

### ✏️ Esercizi — 5.2 (stile DukeLabs)
1. `static boolean isValidUnit(String unit)` → true per `"kg"`, `"lb"`, `"m"`, `"ft"` (usa `switch` o `||`).
2. `static double toKg(double value, String unit)` → converte da lb a kg, lascia invariati i kg,
   restituisce −1 se l'unità non è di peso.
3. `static double toMeters(double value, String unit)` (ft × 0.3048).
4. `static String describe(double value, String unit)` → per esempio `"42.7 KG"`.
5. Nel `main` crea due array paralleli `values` e `units` e per ogni misura chiama i metodi: se l'unità
   non è valida stampa un avviso, altrimenti stampa la misura convertita.

---

## 5.3 Create Classes and Objects (18 min)

Lesson objectives (book lesson 7): explain classes and objects · create classes · create objects ·
use references · define instance variables and methods · access instance variables via methods ·
use `this` · overload methods.

### Java classes
- Classes are the **most fundamental building blocks** of a Java application.
- They represent the **things and concepts** your program works with (a `Scientist`, an `Experiment`).
- A class is an **abstraction**: it keeps only what matters to your program (a scientist's name and title,
  not their shoe size).
- A class is a **group of related variables and methods**. **All** variables and methods must live
  inside a class (only JShell allows otherwise).
- **Class** = the **type** of a thing. **Object** = an **instance** (a specific example) of that type.

### Class definition
- Declared with the keyword **`class`** + the name.
- Convention: the name starts with an **uppercase** letter; several words → each capitalized
  (`ThoughtExperiment`) — **PascalCase**.
- Saved in a file with **the same name** + `.java`: `Scientist.java`.
- Body in `{ }`.
```java
class Scientist { }      // Scientist.java
class Experiment { }     // Experiment.java
```
Java is case-sensitive: `class` ≠ `Class`. All keywords are lowercase.

### Class structure
Each class defines:
- the **information** it stores → **attributes** (also called variables, properties, fields);
- the **behaviors** it is capable of → **operations** (methods, functions, procedures).
```java
class Scientist {
    String name;                     // attribute
    void startExperiments() {        // behavior
        // experiment algorithm
    }
}
```

### Classes and objects
```java
class Scientist {
    String name;
    void startExperiments() {
        Experiment e1 = new Experiment();   // two OBJECTS of the class Experiment
        Experiment e2 = new Experiment();
    }
}
class Experiment {
    void addMeasurement() { /* measurement algorithm */ }
}
```

### Creating objects — `new`
- `new ClassName()` creates an object (**instantiates** the class).
- `new` **allocates memory**, shaped by the class declaration: room for **every attribute** of the class.
- Each object has **its own** copy of the attributes.
```java
class Experiment {
    String description;
    int numberOfMeasurements;
}
new Experiment();   // object 1: its own description and numberOfMeasurements
new Experiment();   // object 2: its own description and numberOfMeasurements
```

### Default constructor
`new Experiment()` looks like calling a method with the class name and no parameters. That is exactly
what happens: it calls a special method, the **constructor**.
- Same name as the class, no parameters.
- Its job: **initialize the attributes** of the new object.
- By default **every class gets one automatically**, even if you don't write it.
```java
class Experiment {
    String description;
    int numberOfMeasurements;
    Experiment() { }        // the default constructor: added for you if you write no constructor
}
```
(Constructors in detail → 5.7.)

### ✏️ Esercizi — 5.3
1. **La prima classe.** Crea `Piatto.java` con gli attributi `String nome`, `double prezzo`,
   `boolean vegano`. Solo gli attributi, niente metodi.
2. **Un comportamento.** Aggiungi `void descrivi()` che stampa nome, prezzo e se è vegano.
3. **Creare oggetti.** In una classe `Ristorante` con `main` crea due `Piatto` con `new`. Assegna i valori
   agli attributi e chiama `descrivi()` su entrambi.
4. **Astrazione.** Negli appunti elenca 10 caratteristiche di un vero cuoco. Poi scegli le 3 che
   servirebbero a un programma per i turni di cucina. Questa scelta è l'astrazione.
5. **Nome file ≠ nome classe.** Rinomina `Piatto.java` in `piatto.java` (con `public class Piatto`) e
   compila. Leggi l'errore.

---

## 5.4 Work with Objects (15 min)

### References
- `new` returns a **reference** to the new object.
- The reference is kept in a variable of a **compatible type**.
- A reference variable can be declared first and initialized later, but must be initialized before use.
```java
Experiment e1 = new Experiment();
Experiment e2 = new Experiment();
Experiment e3;
e3 = new Experiment();
```
A reference is a **logical pointer** to the object. The JVM manages the real memory addresses and never
shows them to you.

### Accessing objects — the dot `.`
Use the reference + `.` to read/write **properties** and invoke **operations**.
```java
e1.description = "Measure Length";
e2.description = "Measure Weight";
e1.addMeasurement();
```
At runtime objects access each other's properties and invoke each other's operations: that is how the
program logic runs. References can also be **passed as parameters**, to tell a method which object to
work on.

### The null reference
A reference that points to **no object** has the special value **`null`**. You cannot access properties or
invoke methods through it (→ `NullPointerException`). Check first:
```java
Experiment e = null;
if (e != null) {
    e.description = "Measure Length";
    e.addMeasurement();
}
```

> ❌ SLIDE ERROR (important for the exam) — the slide writes `Experiment e; // e is null` and then
> uses `e`. For a **local** variable this does **not compile**: "variable e might not have been
> initialized". Local variables get **no default value** — not even `null`. Only **fields** (instance
> variables) and **array elements** default to `null`. Write `Experiment e = null;` explicitly.

### Object properties — instance variables
Attributes declared in the class are **instance variables**: every object (instance) has **its own value**.
"Object property", "instance variable", "object attribute" and "field" are synonyms.
```java
class Experiment {
    String description;
    String summary;
    int numberOfMeasurements;
}
Experiment e1 = new Experiment();
e1.description = "Measure Weight";  e1.summary = "It's heavy";  e1.numberOfMeasurements = 12;
Experiment e2 = new Experiment();
e2.description = "Measure Length";  e2.summary = "It's short";  e2.numberOfMeasurements = 7;
```

### Default values of instance variables
Unlike local variables, fields **are** initialized automatically:
- numeric primitives (`int`, `double`, `char`…) → **0**;
- `boolean` → **false**;
- object types (`String`…) → **null**.
You can set your own default in the declaration:
```java
class Experiment {
    String description = "Measure Things";   // explicit default
    String summary;                          // null
    int numberOfMeasurements;                // 0
}
```

### Accessing instance variables via methods
Methods can add logic around fields: **validate**, **transform**, perform extra actions.
```java
class Measurement {
    double value;
    void setValue(double newValue) {
        value = (newValue < 0) ? 0 : newValue;       // validate: no negatives
    }
    double getValue() {
        return Math.round(value * 100) / 100.0;      // transform: round to 2 decimals
    }
}
```

### Get/set methods (accessors and mutators)
Convention for a field called `something`:
- **`getSomething()`** returns a value of the field's type → **accessor** (getter);
- **`setSomething(value)`** takes an argument of the field's type → **mutator** (setter).
- They can return/assign as is, or validate/transform. A convention, not a language rule — but widely
  adopted. IDEs can generate them. (For a `boolean` the getter is often `isSomething()`.)
```java
class Measurement {
    double value;
    void setValue(double newValue) { value = newValue; }
    double getValue() { return value; }
}
```

### Reusing method logic
Duplicated logic is **bad practice**: put shared logic in a separate method and call it from the others.
```java
class Measurement {
    String unit;
    double value;
    void setValue(double newValue) { value = isValid(newValue) ? newValue : 0; }
    double getValue() { return isValid(value) ? value : 0; }
    boolean isValid(double v) { return "kg".equals(unit) && v > 0; }
}
```

> ❌ SLIDE ERROR — on the slide `isValid()` has **no parameter** but is called as `isValid(newValue)`:
> "method isValid cannot be applied to given types". The version above adds the parameter.
> (`"kg".equals(unit)` instead of `unit.equals("kg")` also avoids a `NullPointerException` when `unit` is null.)

### Variable shadowing
If a local variable or parameter has **the same name** as an instance variable, inside that method only the
local one is visible — it **shadows** the field.
```java
class Measurement {
    double value;
    void setValue(double value) {
        value = value;          // assigns the parameter to itself — the field is untouched!
    }
    double getValue() {
        double value = value / 2;   // does not compile: the local value is not initialized yet
        return value;
    }
}
```
Shadowing usually compiles but causes **confusing or wrong behavior** at runtime.
(The slide says shadowing "does not cause compilation errors"; the `getValue` line above actually does not
compile, because the new local `value` is used in its own initializer. `setValue` compiles and silently
does nothing.)

### The `this` reference
**`this`** = a reference to the **current object**. `this.value` means "the field of this object", even
when a local `value` exists.
```java
class Measurement {
    double value;
    void setValue(double value) { this.value = value; }     // field = parameter
    double getValue() {
        double value = this.value / 2;
        return value;
    }
}
```
```java
Measurement m1 = new Measurement();
Measurement m2 = new Measurement();
m1.setValue(42.7);     // inside setValue, this == m1
m2.setValue(12.45);    // inside setValue, this == m2
```
`this` is optional when there is no ambiguity: in `return value;` with no local `value`, it is the same as
`return this.value;`.

> ❌ SLIDE ERROR — the "Recursive Object Reference Example" writes `value = this.value;` inside
> `setValue(double value)`: that copies the **field into the parameter**. The field never changes, so
> `getValue()` would return 0.0, not 42.7. The correct line is `this.value = value;`.

### ✏️ Esercizi — 5.4
1. **Riferimenti.** `Piatto p1 = new Piatto(); Piatto p2 = p1; p2.nome = "Lasagna";` **Prevedi**
   `p1.nome`. Poi `p2 = new Piatto();` e di nuovo `p1.nome`: cosa cambia?
2. **null.** `Piatto p = null;` Chiama `p.descrivi()` e leggi l'eccezione. Proteggi la chiamata con
   `if (p != null)`.
3. **Variabile locale non inizializzata.** Scrivi `Piatto q;` e poi `q.descrivi();`. Leggi l'errore: è
   diverso da quello del punto 2? Perché?
4. **Default dei campi.** Crea un `Piatto` senza assegnare niente e stampa i tre attributi. Poi dai a
   `nome` il default `"Senza nome"` nella dichiarazione.
5. **Getter e setter.** Aggiungi a `Piatto` `getPrezzo()` e `setPrezzo(double prezzo)`. Il setter imposta
   0 se il prezzo è negativo. Il getter arrotonda a 2 decimali.
6. **Shadowing.** Scrivi il setter come `void setNome(String nome) { nome = nome; }`, assegna un nome e
   stampalo: cosa esce? Correggi con `this`.
7. **Logica riusata.** Aggiungi `boolean isPrezzoValido(double p)` e usalo sia nel setter sia in un metodo
   `applicaSconto(double percentuale)`.

---

## 5.5 Overload Methods (7 min)

In one class you can define **variants of a method with the same name but different parameters**:
- same **name**;
- different **number**, **types** or **order** of parameters.
```java
class Experiment {
    void addMeasurement(int value) { }
    void addMeasurement(double value) { }
    void addMeasurement(double value, String unit) { }
    void addMeasurement(String unit, double value) { }
}
Experiment e = new Experiment();
e.addMeasurement(42);            // int version
e.addMeasurement(2.71);          // double version
e.addMeasurement(14.2, "s");     // (double, String)
e.addMeasurement("s", 14.2);     // (String, double)
```
The caller doesn't need to learn different names: just pass different parameters.

**Not** valid overloading:
- differing **only in the parameter names**;
- differing **only in the return type**.
```java
class Experiment {            // does NOT compile
    void addMeasurement(int a) { }
    void addMeasurement(int b) { }        // same parameter types as above
    double addMeasurement(int c) { }      // only the return type differs
}
```

> ⚠️ EXAM — which overload is called? The compiler picks the **most specific** match: exact type first,
> then **widening** (`int` → `long` → `float` → `double`), then boxing (`int` → `Integer`), then var-args.
> With only `m(double)` available, `m(5)` works (5 widened to 5.0). With only `m(int)`, `m(5.0)` ❌.
> Access modifiers and return type don't matter for overloading, only the parameter list.

### ✏️ Esercizi — 5.5
1. In `Piatto` crea tre `aggiungiIngrediente`: `(String nome)`, `(String nome, int grammi)`,
   `(int grammi, String nome)`. Ognuno stampa cosa ha ricevuto. Chiamali tutti e tre.
2. Aggiungi `static double media(int a, int b)` e `static double media(double a, double b)`. Chiama
   `media(3, 4)` e `media(3.0, 4)`: quale versione parte in ciascun caso? Aggiungi una `println` in ogni
   versione per scoprirlo.
3. Prova due metodi che differiscono solo per il **nome del parametro**, poi solo per il **tipo di
   ritorno**. Leggi i due errori.

---

## 5.6 Practice 7-1: Working with Classes (39 min)

Goal (book): **develop the application in the IDE**; create the **`Experiment`** and **`Measurement`**
classes; add constants, variables and methods; **compile and run the Lab application**.
From here on the practices are real projects, no longer JShell snippets.

### ✏️ Esercizi — 5.6 (stile DukeLabs)
Crea in VS Code un package `labs` (una cartella `src\labs`, con `package labs;` in cima a ogni file):
1. `Measurement` con `String unit` e `double value`, getter e setter (il setter del valore rifiuta i
   negativi).
2. `Experiment` con `String description`, un array `Measurement[] measurements = new Measurement[10];` e un
   contatore `int count`.
3. In `Experiment`: `void addMeasurement(Measurement m)` (se c'è posto), un overload
   `addMeasurement(double value, String unit)` che crea la `Measurement` e chiama il primo, e
   `double getAverage()`.
4. Una classe `LabApp` con `main` che crea un esperimento, aggiunge 4 misure e stampa la media.
5. Compila ed esegui anche dal terminale: `javac -d bin src\labs\*.java` e poi `java -cp bin labs.LabApp`.

---

## 5.7 Design Encapsulation and Constructors (23 min)

Lesson objectives (book lesson 8): explain encapsulation · access modifiers · initialize instance variables ·
constructors · overload and reuse constructors · group classes into packages, use imports.

### Encapsulation
- **Protect** the internal implementation details of a class.
- **Restrict** access to some properties and operations; **expose** only some features.
- Other classes interact **only** with what is exposed, so they are **not affected** by changes to your
  class's internal workings.

**Car analogy.** A driver uses the steering wheel and brakes without knowing how the engine works. The
mechanic can replace engine parts and the driver does not have to learn to drive again, as long as the
controls stay the same.

### Access modifiers
- **`private`** — visible **only inside this class**.
- **`public`** — visible to **all** classes (applies to classes, variables and methods).
```java
public class Experiment {
    private double averageValue;                  // hidden: only Experiment can change it
    public void addMeasurement(Measurement m) {
        // add the measurement, recalculate averageValue
    }
    public void removeMeasurement(Measurement m) {
        // remove the measurement, recalculate averageValue
    }
}
// another class
Experiment e = new Experiment();
e.addMeasurement(new Measurement(22.2));
e.averageValue = 42.2;                            // ❌ does not compile: averageValue is private
```
Why: the average must be recalculated every time a measurement is added or removed. If outside code
could write it directly, you could not guarantee it is correct.

### Default (package) access
**No modifier** = "default": visible only to classes **in the same package**. It is **not strong enough**
to enforce encapsulation, because other classes in the package can still touch everything.

> ⚠️ EXAM — the four access levels, from most open to most closed:
>
> | Modifier | same class | same package | subclass (other package) | everywhere |
> |---|---|---|---|---|
> | `public` | ✔ | ✔ | ✔ | ✔ |
> | `protected` | ✔ | ✔ | ✔ | ✗ |
> | *(default)* | ✔ | ✔ | ✗ | ✗ |
> | `private` | ✔ | ✗ | ✗ | ✗ |
>
> A top-level class can only be `public` or default. **Only one `public` class per file**, and it must
> match the file name. Typical encapsulation: **private fields + public getters/setters**.

### Initializing instance variables
When an object is created its fields get: the explicit default in the declaration, otherwise 0 / false /
null.
```java
class Measurement {
    String unit = "kg";
    String summary;
    double value;
}
Measurement m = new Measurement();   // unit "kg", summary null, value 0.0
```

### The constructor
A special method that:
- has **the same name as the class**;
- has **no return type — not even `void`**;
- is invoked by **`new`** when the object is created.

The **no-arg** ("no arguments") **default constructor** is added automatically **only if you write no
constructor at all**.
```java
public class Measurement {
    public Measurement() { }      // what the compiler adds for you
}
Measurement m = new Measurement();
```

### Custom constructors
Parameters let you set the fields **right at creation**. A constructor can **validate or transform**
values before storing them.
```java
public class Measurement {
    private String unit;
    private double value;
    public Measurement(String newUnit, double newValue) {
        unit = newUnit.toUpperCase();     // transform
        value = newValue;
    }
}
Measurement m = new Measurement("kg", 42.7);   // unit "KG", value 42.7
```

### When the default constructor is no longer there
As soon as you write **any** constructor, the no-arg one is **not** added any more:
```java
Measurement m1 = new Measurement("kg", 42.7);   // ✔
Measurement m2 = new Measurement();             // ❌ does not compile
```

### Overloading constructors
Like any method, a constructor can be overloaded, to offer several ways of creating an object. You can
write your own no-arg constructor as one of the variants.
```java
public class Measurement {
    private String unit;
    private double value;
    public Measurement(String unit, double value) {
        this.unit = unit;
        this.value = value;
    }
    public Measurement(String unit) {
        this.unit = unit;
    }
    public Measurement() {
        unit = "s";
    }
}
Measurement m1 = new Measurement("kg", 42.7);   // "kg", 42.7
Measurement m2 = new Measurement("m");          // "m", 0.0
Measurement m3 = new Measurement();             // "s", 0.0
```
Duplicating logic across constructors is bad practice: change one and forget another, and objects end up
initialized inconsistently.

> ❌ SLIDE ERROR — on the slides these constructors are written `unit = this.unit;` and
> `value = this.value;`: **backwards**. That copies the (empty) fields into the parameters, so with the
> slide's code `m1` would have unit `null` and value `0.0`, not "kg" / 42.7. Verified by running it.
> The correct form is `this.unit = unit;`.

### Reusing constructor logic — `this(...)`
One constructor can call another with **`this(arguments)`**:
```java
public class Measurement {
    private String unit;
    private double value;
    public Measurement(String unit, double value) {
        this(unit);             // reuse the (String) constructor
        this.value = value;
    }
    public Measurement(String unit) {
        this.unit = unit;
    }
    public Measurement() {
        this("s");              // default unit
    }
}
```

### Erroneous constructor calls — the class does not compile if:
- constructors call each other **in a loop** (A calls B, B calls A → "recursive constructor invocation");
- `this(...)` is **not the first statement** of the constructor.
```java
public Measurement(String unit, double value) { this(unit); ... }
public Measurement(String unit) { this(unit, 0); ... }      // ❌ loop with the constructor above
public Measurement() {
    String unit = "s";
    this(unit);                                              // ❌ not the first line
}
```

> ⚠️ EXAM
> - A method with the class name **and a return type** (`public void Measurement() {}`) is **not** a
>   constructor, just an oddly named method. `new Measurement()` then uses the default constructor.
> - Constructors are **not inherited** and cannot be called like normal methods (`m.Measurement()` ❌).
> - The default constructor has the **same access modifier as the class**.
> - A `private` constructor stops other classes from using `new`.

### ✏️ Esercizi — 5.7
1. **Incapsulare.** Rendi `private` tutti i campi di `Piatto`. Dal `main` prova `p.prezzo = 5;` e leggi
   l'errore. Accedi solo con getter e setter.
2. **Il costruttore di default sparisce.** Aggiungi `public Piatto(String nome, double prezzo)`. Ora
   `new Piatto()` compila ancora? Perché?
3. **Validare nel costruttore.** Nel costruttore trasforma il nome in maiuscolo e metti il prezzo a 0 se
   è negativo.
4. **Overloading.** Aggiungi `Piatto(String nome)` (prezzo 10 di default) e `Piatto()` (nome
   `"Piatto del giorno"`). Crea un oggetto con ognuno dei tre e stampali.
5. **`this(...)`.** Riscrivi i costruttori del 4 in modo che quelli corti chiamino quello completo con
   `this(...)`. La logica deve essere scritta **una volta sola**.
6. **Errori.** Metti `this(...)` alla seconda riga; poi fai chiamare due costruttori a vicenda. Annota i
   due messaggi.
7. **Il bug delle slide.** Scrivi `unit = this.unit;` in un costruttore, crea un oggetto e stampa il campo.
   Cosa esce? Correggi.
8. **Falso costruttore.** Scrivi `public void Piatto() { System.out.println("creato"); }` al posto del
   costruttore senza parametri: `new Piatto()` stampa "creato"?

---

## 5.8 Java code Aggregations (17 min)

### Three levels of code aggregation
| Level | What |
|---|---|
| **Class** | the basic unit of code: data + logic |
| **Package** | intermediate, **logical** grouping of related classes |
| **Module** | high-level, **physical** grouping of related packages (out of scope) |

A simple program can be a single class. Packages are not required, but practically always used in any
non-trivial program.

### Packages
- Logically related classes go into the same **package**.
- Packages are stored **as folders** on disk: package `org.duke.labs` → folders `org/duke/labs/`.
- **No two classes with the same name** in the same package.
- The `package` statement is the **first line** of the file.
```java
package org.duke.labs;

public class Experiment {
    // variables, methods
}
```
- A class with no `package` statement belongs to the unnamed **default package** — not recommended:
  anybody could create another class with the same name and cause a conflict.
  (That is what your `App.java` in `src` is.)

### Naming classes and packages
- The same class name may exist in **different** packages.
- Package naming convention: **reverse DNS**. If your company owns the domain `duke.org`, packages start
  with `org.duke`, then your own structure: `org.duke.labs`.
- **Package + class name** = the **unique full name**: `org.duke.labs.Measurement` vs
  `com.acme.clothes.Measurement` → no conflict.
- Classes in the **same package** refer to each other by simple name.
- Package names are all **lowercase**.

### Using classes from other packages
Two ways:
1. **`import`** statements (after `package`, before the class):
```java
package my.app;

import org.duke.labs.Experiment;      // one class
import org.duke.labs.Measurement;
// or: import org.duke.labs.*;        // all classes of that package

public class MainApp {
    public static void main(String[] args) {
        Experiment e = new Experiment();
        Measurement m = e.getMeasurement();
    }
}
```
2. the **fully qualified name**, without imports:
```java
org.duke.labs.Experiment e = new org.duke.labs.Experiment();
```
Import one class, use `*`, or no import at all: only a matter of convenience, **no other difference**
(no performance difference).
(The slides spell `Measuremnt` in a few places — a typo, it would not compile.)

### JDK classes
The JDK provides **thousands of classes** in many packages: basic data types, system actions, errors,
collections, I/O, databases, concurrency, networking, transactions, security, logging, GUIs…
- A group of classes for one purpose is an **API** (Application Programming Interface): Collections API,
  I/O API, Concurrency API…
- All documented: docs.oracle.com/en/java/javase.

### The java.lang package
Contains the most used classes: **`String`, `System`, `Object`, `Exception`, `Math`**, the wrappers
(`Integer`, `Double`, `Character`…). **It is imported automatically**: `import java.lang.*;` is implicit
in every class.

> ⚠️ EXAM
> - Order in a file: `package` (at most one, first) → `import`s → class(es).
> - `import java.util.*;` imports the classes of `java.util` **only**, **not** sub-packages like
>   `java.util.function`.
> - `java.lang` needs no import; `java.util.ArrayList`, `java.util.Scanner`, `java.util.Random`,
>   `java.time.LocalDate` do.
> - Importing a class that doesn't exist → compile error. Importing the same class twice is allowed.
> - A class with the same name imported from two packages via two wildcards → ambiguity error when used.

### ✏️ Esercizi — 5.8
1. **Package.** Crea in `src` le cartelle `it\andrea\cucina` e dentro `Piatto.java` con
   `package it.andrea.cucina;`. Crea `src\it\andrea\app\Menu.java` (`package it.andrea.app;`) con un
   `main` che usa `Piatto`.
2. **import.** Fai compilare `Menu` in tre modi: `import it.andrea.cucina.Piatto;`, `import it.andrea.cucina.*;`
   e con il nome completo senza import.
3. **Visibilità di default.** Togli `public` dalla classe `Piatto`: `Menu` compila ancora? Perché?
4. **Package sbagliato.** Scrivi in `Piatto.java` un `package` diverso dalla cartella in cui si trova.
   Cosa succede in VS Code?
5. **java.lang.** Usa `Math.max(3, 7)` e `Integer.parseInt("42")` senza import. Poi usa `ArrayList`
   senza import e leggi l'errore.

---

## 5.9 Practice 8-1: Enhancing Class Design (24 min)

Goal (book): develop in the IDE; **encapsulate** the `Experiment` and `Measurement` designs; add
**constructors** and **get/set** methods; compile and run.

### ✏️ Esercizi — 5.9 (stile DukeLabs)
1. Sposta le classi della 5.6 nel package `org.duke.labs` (cartelle corrispondenti).
2. Rendi `private` tutti i campi di `Measurement` ed `Experiment`.
3. `Measurement(String unit, double value)` che valida (valore ≥ 0, unità in minuscolo) e
   `Measurement(double value)` con unità `"kg"`, che chiama l'altro con `this(...)`.
4. Solo i getter per `unit` e `value`: una misura non si cambia dopo la creazione.
5. `Experiment(String description)`. Il campo della media diventa privato e viene ricalcolato in
   `addMeasurement`.
6. Crea l'app in un altro package, `org.duke.app`, con `import org.duke.labs.*;`.

---

## 5.10 Use Class Context (16 min)

Lesson objectives (book lesson 9): describe class and instance contexts · define class (`static`) methods,
variables and constants · invoke them.

### Instance context vs class context
- **Instance (object) context** — each object has its own instance variables; instance methods work on
  one specific object. `m1.getUnit()` → "kg", `m2.getUnit()` → "s".
- **Class context** — belongs to the **class itself** and is **shared by all its objects**: things that
  concern all measurements, not one (a minimum value, a counter, a summary calculation).

### static — the class context
The keyword **`static`** puts a variable or method in the class context. You reach it **through the class
name**, no object needed.
```java
public class Measurement {
    private static double minValue = 0;                 // ONE copy, shared
    public static double checkValue(double value) {
        return (value >= minValue) ? value : 0;
    }
}
double v = Measurement.checkValue(42.7);                // 42.7 — called on the class
Measurement m1 = new Measurement("kg", v);
v = Measurement.checkValue(-12.1);                      // 0
Measurement m2 = new Measurement("s", v);
```

### Instance context CAN access class context
Instance methods can use static variables and methods directly: no ambiguity, all instances share them.
```java
public class Measurement {
    private static double minValue = 0;
    private double value;
    public void setValue(double value) {
        this.value = checkValue(value);                 // instance method calls a static method
    }
    public double getValue() { return value; }
    public static double checkValue(double value) {
        return (value >= minValue) ? value : 0;
    }
}
```
A static member can also be reached through **any reference** — `m1.checkValue(42.7)` works like
`Measurement.checkValue(42.7)` — but it is **confusing**: use the class name.

> ❌ SLIDE ERROR — the slides write `public setValue(double value)` without a return type:
> "invalid method declaration; return type required". It must be `public void setValue(...)`.

### Class context CANNOT access instance context
Inside a `static` method there is **no current object**:
- no `this`;
- no direct use of instance variables or instance methods — which object would they belong to?
```java
public static double checkValue() {
    return (value >= minValue) ? value : 0;   // ❌ value is an instance variable
}
Measurement.setValue(42.7);                   // ❌ setValue is an instance method
```
Error message: "non-static variable value cannot be referenced from a static context".
To use instance members from a static method you need an **object**: `Measurement m = new Measurement();
m.setValue(42.7);`. That is why `main`, which is static, creates objects.

### Global constants — static final
- `static final` = one shared, read-only value → a **global constant**.
- No need to make it `private`: it cannot be changed anyway.
- Convention: **UPPER_CASE** with `_`.
```java
public class Measurement {
    public static final int MIN_VALUE = 0;
}
double value = -12.1;
value = (value > Measurement.MIN_VALUE) ? value : 0;
```
`final` can also be used on instance or local variables (a different constant per object or per call);
`static final` when one value for everybody is enough.

### Static members you already use
- `System.out` — a static constant of `System` (the console).
- `Math.PI` — a static constant (π).
- `Math.random()` — a static method (random double between 0.0 included and 1.0 excluded).
- `main` — a static method: the entry point.
```java
public class Test {
    public static void main(String[] args) {
        System.out.println(Math.PI);        // 3.141592653589793
        System.out.println(Math.random());  // e.g. 0.7251...
    }
}
```

> ⚠️ EXAM — **three kinds of variables** (an explicit exam topic):
>
> | | declared | lives | default value | how to reach it |
> |---|---|---|---|---|
> | **local** | inside a method/block (and parameters) | during that method call / block | **none** — must initialize | by name, only in its scope |
> | **instance** | in the class, without `static` | as long as the object | 0 / false / null | `object.name` (or `this.name`) |
> | **class** (static) | in the class, with `static` | as long as the program (one copy) | 0 / false / null | `ClassName.name` |
>
> - A static counter shared by all objects: `private static int count = 0;` and `count++` in the constructor.
> - A static method **can** create objects and call their instance methods; it **cannot** use `this`.

### ✏️ Esercizi — 5.10
1. **Contatore condiviso.** In `Piatto` aggiungi `private static int piattiCreati = 0;`, incrementalo nel
   costruttore e crea `public static int getPiattiCreati()`. Crea 3 piatti e stampa il totale chiamando il
   metodo **sulla classe**.
2. **Costante globale.** Aggiungi `public static final double IVA = 0.10;` e usala in `getPrezzoConIva()`.
   Prova a riassegnarla dal `main`.
3. **Statico → istanza, vietato.** In un metodo `static` prova a usare `nome` e `this`. Leggi l'errore.
   Poi risolvi creando un oggetto dentro il metodo statico.
4. **Istanza → statico, permesso.** In un metodo d'istanza usa `piattiCreati` e `IVA`: compila?
5. **Tramite riferimento.** Chiama `getPiattiCreati()` su un oggetto (`p1.getPiattiCreati()`) e sulla
   classe: stesso risultato? Quale forma è più chiara?
6. **Tre variabili.** Scrivi una classe con una variabile locale, una d'istanza e una statica con lo stesso
   significato (per esempio un contatore). Crea due oggetti e mostra con delle `println` come si comportano.

---

## 5.11 Practice 9-1: Using Class Methods and Variables (14 min)

Goal (book): improve the application with **static constants, variables and methods**; compile and run.

### ✏️ Esercizi — 5.11 (stile DukeLabs)
1. In `Measurement`: `public static final double LB_TO_KG = 0.453592;` e `FT_TO_M = 0.3048;`.
2. `public static double convert(double value, String fromUnit)` che usa le costanti.
3. `private static int totalMeasurements` aumentato in ogni costruttore, più un getter statico.
4. In `Experiment`: `public static final int MAX_MEASUREMENTS = 10;` al posto del `10` scritto a mano.
5. Nel `main` usa solo `Measurement.convert(...)` e `Measurement.getTotalMeasurements()`, senza oggetti
   inutili.

---

# 6. MODULE 6 — Object-Oriented Approach to Code Reuse

## 6.1 Java Inheritance (19 min)

Lesson objectives (book lesson 10): principles of inheritance · create classes that extend other classes ·
override methods · use the methods of the `Object` class.

### The idea
Think of all living things. A top-level type (**living organism**) defines what all lifeforms have in
common: they eat, they reproduce. More specific **subtypes** (animal, plant) **inherit** all of that and add
their own abilities (swim, fly). There can be any number of levels, down to very specific types (dog, cat).
You define common properties and behaviors **once**, in the common type, and share them across all the
subtypes.

### Terms
| Parent | Child |
|---|---|
| **superclass** = supertype = parent type | **subclass** = subtype = child type |

Example: `Experiment` is the superclass of `PhysicsExperiment` (adds: record measurements) and
`ThoughtExperiment` (adds: record ideas). Both share what `Experiment` can do (record a summary).
**A subclass = everything it inherits from its parent + its own specific abilities.**

### Defining a superclass
```java
public class Experiment {
    private String summary;
    public void setSummary(String summary) { this.summary = summary; }
    public String getSummary() { return summary; }
}
```
> ❌ SLIDE ERROR — the slides write `setSummary(String sumary) { this.summary = summary; }` (parameter
> misspelled `sumary`). It compiles, but `summary` on the right is the **field**, so the field is assigned
> to itself and the summary **is never set**: `getSummary()` returns `null`. Verified.

### Defining subclasses — extends
```java
public class ThoughtExperiment extends Experiment {
    private String thoughts = "";                     // subclass-specific attribute
    public void addThought(String thought) {          // subclass-specific behavior
        thoughts += ". " + thought;
    }
    public String getThoughts() { return thoughts; }
}
```
- `extends Supertype` makes the class a subclass.
- The subclass **inherits all attributes and behaviors** of the superclass and can add more.
- **Many subclasses** can share the same superclass. A subclass can itself be the superclass of others:
  a subclass of `ThoughtExperiment` inherits from `ThoughtExperiment` **and** from `Experiment`.

> ❌ SLIDE ERROR (logic) — on the slides `thoughts` has no initial value, so it is `null` and the first
> `thoughts += ". " + thought` produces `"null. What if things?"`. Verified. Initialize it to `""`.

### Overriding methods
A subclass can define a method with **the same name, parameters and return type** as a superclass
method, and give it a **different implementation**:
```java
public class ThoughtExperiment extends Experiment {
    ...
    @Override
    public String getSummary() {       // replaces the superclass version for ThoughtExperiment objects
        return getThoughts();
    }
}
```

### Reusing the superclass logic — super
**`super`** is a reference to the superclass part of the object. When overriding you can **call the parent
version** and add to it, instead of replacing it:
```java
@Override
public String getSummary() {
    return super.getSummary() + getThoughts();
}
```
An override that does not call `super.method()` **disables** the parent logic for that class.

### The @Override annotation
**Optional**, but recommended. It asks the compiler to **check** that the method really overrides a
superclass method (same name, return type, parameters).
```java
class ThoughtExperiment extends Experiment {
    @Override public String getSummary() { ... }   // ✔ matches
}
class ThoughtExperiment extends Experiment {
    @Override public void summary() { ... }        // ❌ error: overrides nothing
}
class ThoughtExperiment extends Experiment {
    public void summary() { ... }                  // no error: just a new, unrelated method
}
```
It does not change how the code runs: it catches typos before compiling.

### The big picture
```java
ThoughtExperiment e = new ThoughtExperiment();
e.setSummary("Consider things");       // inherited from Experiment
e.addThought("What if things?");       // defined in ThoughtExperiment
e.getSummary();                        // the OVERRIDDEN version runs
```
An object of the subclass has the abilities of the superclass **plus** its own; an overridden method
**takes precedence** over the superclass version for all objects of the subclass.

> ⚠️ EXAM (and next-level topics you will meet in questions)
> - Java has **single inheritance** for classes: `extends` exactly **one** class.
> - `private` members are **not** accessible in the subclass (they exist in the object, but the subclass
>   code cannot touch them — use the public getters/setters).
> - Override rules: same signature; same or **covariant** (subtype) return type; access **not more
>   restrictive** (`public` in the parent → `public` in the child).
> - Overloading = same name, **different parameters**, same class. Overriding = **same signature**, in a
>   subclass.
> - A `final` method cannot be overridden; a `final` class cannot be extended (`String` is final).
> - `static` methods are not overridden (they are hidden).
> - "is-a": a `ThoughtExperiment` **is an** `Experiment` → `Experiment e = new ThoughtExperiment();` is
>   legal (polymorphism: the overridden method still runs).

### ✏️ Esercizi — 6.1
1. **Superclasse.** Crea `Piatto` con `private String nome`, `private double prezzo`, costruttore,
   getter e `String descrizione()` che restituisce `nome + " - " + prezzo + " €"`.
2. **Sottoclassi.** Crea `Primo extends Piatto` (aggiunge `String formatoPasta`) e
   `Dolce extends Piatto` (aggiunge `boolean senzaGlutine`).
3. **Ereditato.** Crea un `Primo` e chiama `getNome()` e `descrizione()` anche se non sono scritti in
   `Primo`.
4. **Override.** In `Primo` ridefinisci `descrizione()` con `@Override`, usando `super.descrizione()` e
   aggiungendo il formato della pasta.
5. **@Override che ti salva.** Scrivi per sbaglio `descrizone()` (errore di battitura) con `@Override`:
   leggi l'errore. Poi togli `@Override`: compila? Quale versione viene chiamata?
6. **private non si vede.** Da `Primo` prova a leggere direttamente `prezzo`. Leggi l'errore e usa il getter.
7. **Il bug delle slide.** Scrivi un setter con il parametro `sumary` e `this.summary = summary;`.
   Imposta un valore e stampalo. Poi correggi.

---

## 6.2 Extend the Object class (22 min)

### Object — the root of every class
A class without `extends` **implicitly extends `java.lang.Object`**. So `Object` is the **ultimate parent
of every class**.
```java
public class Experiment { }                  // exactly the same as
public class Experiment extends Object { }   // (legal, but unnecessary)
```

### Methods inherited from Object
- **`toString()`** — a **text representation** of the object;
- **`equals(Object o)`** — **compares** two objects;
- **`hashCode()`** — an **int identifier** (hash) for the object.
Every object has them, even if its class never defines them. (Object also has methods for cloning and
threads — out of scope.)
```java
Measurement m1 = new Measurement("kg", 42.7);
Measurement m2 = new Measurement("m", 12.5);
boolean same = m1.equals(m2);
String txt = m1.toString();
int code = m2.hashCode();
```

### The default toString
Returns **full class name + `@` + the hash code in hexadecimal**:
```java
// the actual code inside Object:
public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
// Measurement m = new Measurement("kg", 42.7);  m.toString()  →  duke.labs.Measurement@6e8dacdf
```

### Overriding toString
Give your class a **meaningful** text version, for example for log files:
```java
public class Measurement {
    private String unit;
    private double value;
    public Measurement(String unit, double value) { this.unit = unit; this.value = value; }
    @Override
    public String toString() { return value + " " + unit; }
}
new Measurement("kg", 42.7).toString();   // "42.7 kg"
```
`System.out.println(m)` and `"text" + m` call `toString()` automatically.

### The default equals
Compares **references**: true only if both variables point to **the same object**.
```java
// inside Object:
public boolean equals(Object obj) { return this == obj; }

Measurement m1 = new Measurement("kg", 42.7);
Measurement m2 = new Measurement("kg", 42.7);
Measurement m3 = m1;
m1.equals(m2);   // false — same values, but two different objects
m1.equals(m3);   // true  — the same object
```

### JDK classes override them — String
`String` overrides:
- `toString` → returns the text itself;
- `equals` → compares the text **character by character**;
- `hashCode` → calculated from the characters (equal texts → equal hash codes).
```java
String s1 = "Hello", s2 = "Hello", s3 = "HELLO";
s1.equals(s2);   // true
s1.equals(s3);   // false (case-sensitive)
s1.hashCode();   // 69609650  — same as s2
s3.hashCode();   // 68624562
```

### Comparing objects and primitives
- **Primitives** → compare with **`==`**: they are simple values. `42.0 == 42` → true.
- **Objects** → compare with **`equals`**: each class decides what "equal" means for its objects.
```java
String s1 = "Hello".toUpperCase();
String s2 = "HELLO";
s1.equals(s2);   // true
s1 == s2;        // false! two different objects (toUpperCase created a new one)
```

### Comparing values that may be null
- Give fields a **default** value when needed.
- **Check for null** before using a reference.
- **Encapsulate** fields so no unchecked value (like null) can be assigned from outside.
- Call `equals` **on the object you know is not null**: `x.equals(y)` is safe if `x` is not null, even when
  `y` is. `equals(null)` must return **false**.
```java
public class Experiment {
    private String summary;
    public Experiment(String text) {
        summary = (text != null) ? text : "Nothing yet";   // never null
    }
    public void addSummary(String text) {
        if (text != null) { summary += text; }
    }
    public boolean isSameText(String text) {
        return summary.equals(text);          // summary is never null → safe
    }
}
```
Reminder: an uninitialized primitive **field** is 0 or false, never null; an uninitialized object
**field** is null.

> ❌ SLIDE ERROR — the slide's `isSameText` has no `return` ("missing return statement"), and its
> constructor is `private`, which would stop other classes from creating the object. Fixed above.

### Initializing superclass and subclass objects — super(...)
- The **first line of every constructor** calls a superclass constructor with `super(...)`.
- If you don't write it, the compiler inserts **`super();`** (the no-arg one).
- If the superclass has **no no-arg constructor**, the subclass **must** call another one explicitly,
  otherwise it does not compile.
```java
public class Experiment {
    private String summary;
    public Experiment(String summary) {
        super();                  // implied anyway: calls Object()
        this.summary = summary;
    }
}
public class ThoughtExperiment extends Experiment {
    private String thoughts = "";
    public ThoughtExperiment(String summary, String thought) {
        super(summary);           // required: Experiment has no no-arg constructor
        thoughts += ". " + thought;
    }
}
```
Typical pattern: the subclass constructor takes the superclass parameters plus its own, passes the first
ones to `super(...)`, then initializes its own fields. Every level of the hierarchy is initialized, from
the top down.

> ⚠️ EXAM
> - `super(...)` and `this(...)` must be the **first** statement → you cannot use both in the same
>   constructor.
> - `equals` parameter type is `Object`: `public boolean equals(Measurement m)` **overloads** instead of
>   overriding (`@Override` would catch it).
> - If you override `equals`, override `hashCode` too (equal objects must have equal hash codes).
> - `==` between two String **literals** with the same text is `true` (String pool), but between a literal
>   and a computed or `new` String it is usually `false` — never rely on it.

### ✏️ Esercizi — 6.2
1. **toString di default.** Stampa un `Piatto` con `System.out.println(p)`. Cosa esce? Scomponi l'output
   (nome della classe, `@`, hash).
2. **Override di toString.** Ridefinisci `toString()` in `Piatto` perché restituisca
   `Carbonara (12.5 €)`. Stampa di nuovo e prova anche `"Oggi: " + p`.
3. **equals di default.** Crea due `Piatto` con gli stessi valori: `p1.equals(p2)`? E `p1.equals(p1)`?
4. **equals delle String.** `String a = "pesto"; String b = "PESTO".toLowerCase();` Stampa `a == b` e
   `a.equals(b)`. Spiega la differenza negli appunti.
5. **null sicuro.** `String s = null;` Confronta `s.equals("x")` e `"x".equals(s)`: quale lancia
   un'eccezione?
6. **super(...).** Dai a `Piatto` solo il costruttore `Piatto(String nome, double prezzo)`. In `Primo`
   scrivi un costruttore **senza** `super(...)` e leggi l'errore. Correggilo passando i parametri a `super`.
7. **Ordine dei costruttori.** Metti una `println` nel costruttore di `Piatto` e in quello di `Primo`.
   Crea un `Primo`: in che ordine appaiono?

---

## 6.3 Practice 10-1: Reusing Code Through Inheritance (11 min)

Goal (book): develop in the IDE; **override `toString` in `Experiment` and `Measurement`**; compile and run.

### ✏️ Esercizi — 6.3 (stile DukeLabs)
1. `Measurement.toString()` → `42.7 kg`.
2. `Experiment.toString()` → la descrizione più tutte le misure, una per riga (usa il `toString` delle
   misure).
3. Crea `ThoughtExperiment extends Experiment` con una lista di idee (un array di `String`) e un
   costruttore che chiama `super(description)`.
4. Ridefinisci `toString()` in `ThoughtExperiment` usando `super.toString()` e aggiungendo le idee.
5. Nel `main` stampa i due tipi di esperimento solo con `System.out.println(e)`.

---

# 7. MODULE 7 — Handling Exceptions

## 7.1 Handle Exceptions (21 min)

Lesson objectives (book lesson 11): principles of exception handling · types of exceptions · catch
exceptions · throw exceptions.

### What an exception is
An **exception** is an event that **disrupts the normal flow** of instructions.
- The program meets a problem that makes it impossible to go on normally.
- The JVM **throws** an exception, and the normal flow is **interrupted**.
- You can write code that **catches and handles** it, trying to fix the problem.
- If handled, the **normal flow resumes**. If not caught, the program **terminates**.
- For some exception types handling is **mandatory**: the compiler refuses to compile otherwise.

### Checked vs unchecked
| **Unchecked** | **Checked** |
|---|---|
| handling is **not required** | handling is **required** by the compiler |
| often **evidence of a bug** in your code | a genuine problem a correct program may meet |
| fix the logic so it can't happen | may be impossible to prevent (e.g. faulty hardware) |

### The exception class hierarchy
```
java.lang.Throwable
├── java.lang.Error                  → unchecked, unrecoverable (e.g. OutOfMemoryError)
└── java.lang.Exception              → CHECKED (e.g. IOException)
    └── java.lang.RuntimeException   → unchecked (e.g. ArithmeticException, NullPointerException)
```
- **`Error`** and subclasses: serious problems that don't let the program continue (the JVM runs out of
  memory). You fix them by changing the program or the JVM configuration, not by catching them.
- **`Exception`** and subclasses — **except** `RuntimeException` — are **checked**: must be handled; once
  handled, the program can continue.
- **`RuntimeException`** and subclasses are **unchecked**: fix the code. Often caused by missing or invalid
  data the logic did not anticipate.
- You can create your own exceptions by extending `Exception` (checked) or `RuntimeException` (unchecked).

### Common exceptions
| Exception | Cause | Prevention |
|---|---|---|
| `ArithmeticException` | integer division by 0 | check the value before dividing |
| `ArrayIndexOutOfBoundsException` | array index outside 0 … length−1 | check the index |
| `NullPointerException` | method/field used on a null reference | check `!= null` |
| `IOException` (**checked**) | error reading/writing data, e.g. files | often impossible (external causes) → must be handled |

### An unchecked exception interrupts the flow
```java
1  public class Test {
2      public static void main(String[] args) {
3          int x = 5;
4          int y = 0;
5          int z = divide(x, y);
6          System.out.println(z);      // never reached
7      }
8      public static int divide(int x, int y) {
9          int z = x / y;              // exception thrown here
10         return z;
11     }
12 }
```
```
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Test.divide(Test.java:9)
    at Test.main(Test.java:5)
```
Not caught → `divide` is interrupted, then `main`, and the program exits printing the **stack trace**
(exception type, message, and the chain of method calls with line numbers — read it bottom-up to see the
path, the top line is where it happened). No handler is required: `ArithmeticException` is a
`RuntimeException`.

### try / catch
- **`try`** block — code that may throw. An exception interrupts the **rest of the try block**.
- Control goes to the nearest matching **`catch`** block, which holds the handling logic.
- A try can be followed by **several** catch blocks, one per exception type.
```java
try {
    // actions that can produce exceptions
} catch (Exception e) {
    // generic handling for ANY exception
}

try {
    // actions that can produce exceptions
} catch (ExceptionA e) {
    // ExceptionA handling
} catch (ExceptionB e) {
    // ExceptionB handling
}
```
`catch (Exception e)` is a single generic handler for every exception type, runtime exceptions included,
because `Exception` is their common parent. The catch variable (`e`) exists **only inside its catch
block**: each catch can reuse the name `e`.

### Catch and handle
```java
public static int divide(int x, int y) {
    try {
        int z = x / y;
        return z;
    } catch (ArithmeticException e) {
        return 0;                      // handled: the program prints 0 and continues
    }
}
```
A matching catch is one for the exact exception type **or a parent**: here `ArithmeticException`,
`RuntimeException` or `Exception` would all work. (Checking `y == 0` beforehand would be even better.)

### Different exceptions in one try
Only **one** exception can happen at a time: the first one interrupts the try block.
```java
int x = 5, y = 0, z = 0, result;
String s = null;
try {
    z = x / y;                  // ArithmeticException happens first
    s.substring(z);             // (would be NullPointerException)
} catch (ArithmeticException e) {
    result = 0;
} catch (NullPointerException e) {
    s = "";
}
```
> ❌ SLIDE ERROR — the slide writes `int z = x/y;` inside the try although `z` is already declared (does not
> compile: "variable z is already defined"), uses an undeclared `result`, and spells
> `NullPointerExcepion`. Fixed above.

> ⚠️ EXAM
> - Catch blocks go from the **most specific to the most general**. `catch (Exception e)` before
>   `catch (ArithmeticException e)` → compile error: the second is unreachable.
> - **`finally`** block (not in the course): runs **always**, exception or not, even after `return` — used
>   to release resources. `try` must be followed by at least one `catch` **or** a `finally`.
> - Multi-catch: `catch (ArithmeticException | NullPointerException e)`.
> - Syntax error vs logic error vs runtime exception:
>   - **syntax (compile) error** — the code breaks the language rules → `javac` refuses it
>     (missing `;`, wrong type, undeclared variable);
>   - **runtime error / exception** — compiles, but fails while running (division by zero, bad index);
>   - **logic error** — compiles and runs without crashing, but gives the **wrong result**
>     (e.g. `9 / 5` in integer math, the `unit = this.unit` bug). Found with testing and debugging.
> - Other common runtime exceptions: `StringIndexOutOfBoundsException`, `NumberFormatException`
>   (`Integer.parseInt("abc")`), `ClassCastException`, `InputMismatchException` (`Scanner`).

### ✏️ Esercizi — 7.1
1. **Leggere lo stack trace.** Scrivi un metodo `static int porzioniATesta(int porzioni, int persone)` e
   chiamalo con `persone = 0`. Leggi lo stack trace: in quale riga e in quale metodo è successo?
2. **try/catch.** Rendi sicuro il metodo con `try/catch (ArithmeticException e)` che restituisce 0 e
   stampa un messaggio.
3. **Prevenire invece di catturare.** Riscrivilo **senza** try/catch, con un `if`. Quale versione è
   migliore per un'eccezione unchecked, e perché?
4. **Più catch.** In un solo `try` metti tre righe pericolose: una divisione per zero, `String s = null;
   s.length();` e `int[] a = new int[2]; a[5] = 1;`. Metti tre `catch` specifici. Quale scatta? Sposta le
   righe e riprova.
5. **Ordine dei catch.** Metti `catch (Exception e)` **prima** di `catch (ArithmeticException e)` e leggi
   l'errore del compilatore.
6. **NumberFormatException.** `Integer.parseInt("12a")` dentro un try/catch: stampa `e.getMessage()`.
7. **Tre tipi di errore.** Scrivi un esempio per ognuno: errore di sintassi, eccezione a runtime, errore
   logico. Spiega negli appunti come te ne accorgi in ciascun caso.

---

## 7.2 Throw Exceptions (11 min)

### throw
Create an exception object (optionally with a message) and throw it with **`throw`**: the normal flow
stops.
```java
throw new Exception();
throw new Exception("Things gone wrong");
throw new NullPointerException();
throw new NullPointerException("Object is not initialized");
```

### Propagation
If a method does not catch an exception, it is **passed to the method that invoked it**, and so on up the
calls, until a matching `try/catch` is found. That catch runs; the rest of that try block is skipped; the
program continues after the try/catch.
```java
public class Test {
    public static void main(String[] args) {
        int x = 5, y = 0, z = 0;
        try {
            z = divide(x, y);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());     // prints: Value is Zero
        }
        System.out.println(z);                      // 0 — normal flow resumed
    }
    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Value is Zero");   // no try/catch here
        }
        return x / y;
    }
}
```
`e.getMessage()` returns the message given to the constructor.

### throws — declaring what a method can throw
- **Unchecked** exceptions need not be declared.
- **Checked** exceptions must be **either caught** in the method **or declared** with **`throws`** in the
  method definition.
```java
public static int divide(int x, int y) throws Exception {   // Exception is checked
    if (y == 0) {
        throw new Exception("Value is Zero");
    }
    return x / y;
}
// the caller must now handle it:
try {
    z = divide(x, y);
} catch (Exception e) {
    System.err.println(e.getMessage());
}
```
**`throw`** (in the body) *throws* an exception; **`throws`** (in the signature) *declares* that the method
may throw one. Don't mix them up.

### A real checked exception — IOException
`System.in.read()` reads a character from the keyboard and can throw an `IOException` (checked). The code
does not compile unless you catch it or declare `throws IOException`:
```java
import java.io.IOException;       // IOException is NOT in java.lang

public class Echo {
    public static void main(String[] args) {
        try {
            char value = (char) System.in.read();   // read() returns an int character code
            System.out.print("You typed: " + value);
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
    }
}
```
(The slide omits the `import java.io.IOException;` line; without it, it does not compile.)

### Terminating the method — return
You caught the exception but don't want the method to continue: use **`return`** (with a value if the
method is not void).
```java
public void addMeasurement(double value) {
    try {
        // something goes wrong here
    } catch (Exception e) {
        return;          // leave the method; the caller continues normally
    }
    // rest of the method: skipped after an exception
}
```

### Terminating the JVM — System.exit
A problem so severe the whole program must stop: **`System.exit(status)`**. The int status goes to
whoever launched the program; by convention **0 = normal**, **non-zero = abnormal** termination.
```java
} catch (Exception e) {
    System.exit(1);      // the entire JVM stops, nothing else runs
}
```

> ⚠️ EXAM
> - `throw` needs an **object**: `throw new Exception();` ✔ · `throw Exception;` ❌.
> - A method may declare several: `throws IOException, SQLException`.
> - Declaring `throws Exception` on `main` passes the exception to the JVM (the program terminates with a
>   stack trace).
> - Code right after a `throw` in the same block → "unreachable statement".
> - Catching a checked exception that the try block can never throw → compile error
>   (except for `Exception` / `Throwable`, which are always allowed).

### ✏️ Esercizi — 7.2
1. **throw.** Scrivi `static void setTemperatura(double t)` che lancia
   `new IllegalArgumentException("Temperatura sotto lo zero assoluto")` se `t < -273.15`. Chiamalo con
   −300 senza try/catch e leggi l'output. Poi aggiungi un try/catch nel `main` e stampa `getMessage()`.
2. **Propagazione.** `main` → `a()` → `b()`, e `b()` lancia un'eccezione. Metti il try/catch solo nel
   `main`. Aggiungi delle `println` prima e dopo ogni chiamata: quali vengono stampate?
3. **Checked.** Fai lanciare a un metodo `new Exception("...")` **senza** `throws`: leggi l'errore.
   Aggiungi `throws Exception`: ora cosa succede nel chiamante? Risolvi in due modi (catturando, oppure
   con `throws` anche nel `main`).
4. **IOException.** Scrivi `Echo` che legge un carattere da tastiera con `System.in.read()`. Prova senza
   import, senza try/catch, e poi nella versione corretta.
5. **return vs System.exit.** In un catch usa prima `return` e poi `System.exit(1)`, con una `println`
   subito dopo la chiamata nel `main`. In quale caso viene stampata?

---

## 7.3 Practice 11-1: Handling Exceptions (15 min)

Goal (book): develop in the IDE; **throw exceptions that signal problems with measurements and
experiments**; handle them and **print error messages**; compile and run.

### ✏️ Esercizi — 7.3 (stile DukeLabs)
1. Il costruttore di `Measurement` lancia `IllegalArgumentException` se l'unità è `null` o sconosciuta, o
   se il valore è negativo.
2. `Experiment.addMeasurement` lancia `IllegalStateException("Experiment is full")` quando l'array è pieno.
3. Crea un'eccezione tua: `class InvalidMeasurementException extends Exception` (checked) con un
   costruttore che riceve il messaggio e lo passa a `super(message)`. Usala in un metodo
   `Measurement.parse(String text)` che interpreta `"42.7 kg"`.
4. Nel `main` crea misure valide e non valide dentro try/catch, stampa i messaggi su `System.err` e fai
   vedere che il programma continua.
5. Se il file di configurazione (simulalo con un `boolean`) manca, termina con `System.exit(2)`.

---

# 8. MODULE 8 — Continue Your Learning

## 8.1 What's Next? (6 min)

**Expand your Java knowledge** — this course covered only the fundamentals. Next ("Java SE Programming
Complete" series):
- better design with **interfaces, enums, records, abstract, final and sealed classes**;
- **polymorphism**;
- **functional style** with **lambda expressions**;
- APIs: **collections, streams, concurrency, input/output**;
- exceptions and resource closing with **try-with-resources** and **finally**.

**Apply your Java knowledge** ("Develop Web Services and Enterprise Applications" series):
application state and **databases**, **web** interactions, **security**.

## 8.2 Workshop — Word Guessing Game (optional, self-study)

**Requirements**
- The player guesses a word.
- The word is picked **at random from an array** of words.
- The player guesses **one letter at a time**.
- After each guess, the player is told the **outcome**.
- The current state is shown with unguessed letters **masked by `*`**:
```
*****      ← word APPLE, nothing guessed
***L*      ← guessed L
A**L*      ← guessed A
A**LE      ← guessed E
APPLE      ← guessed P → won
```
No step-by-step instructions: it consolidates everything (arrays, Strings, loops, conditions, methods,
classes, exceptions). The official hints are in the *Workshop* document (MyLearn → Guides).

### ✏️ Workshop — traccia (in italiano)
1. Classe `WordGame` con un array `String[] words`, un metodo `pickWord()` che ne sceglie una a caso (usa
   `Random.nextInt(words.length)` oppure `(int)(Math.random() * words.length)`).
2. Un array `boolean[] revealed` lungo come la parola.
3. `String mask()` che costruisce la parola con `*` al posto delle lettere non indovinate.
4. `boolean guess(char letter)` che scopre tutte le posizioni della lettera e dice se c'era.
5. Un ciclo nel `main` che legge una lettera alla volta con `Scanner` (capitolo 9), stampa l'esito e la
   maschera, e finisce quando la parola è scoperta. Bonus: numero massimo di errori, lettere già provate,
   input non valido gestito con eccezioni.

---

# 9. EXAM EXTRAS — 1Z0-811 topics the course does not cover

> These are in the official exam topics, but the course only mentions them or skips them. Study them all.

## 9.1 Components of OOP (topic "Java Basics")
- **Class** — a blueprint/type. **Object** — an instance with its own state.
- **State** = fields (attributes). **Behavior** = methods.
- **Encapsulation** — hide data (`private`), expose methods.
- **Inheritance** — a subclass reuses and extends a superclass (`extends`).
- **Polymorphism** — one reference type, many forms: `Experiment e = new ThoughtExperiment();` runs the
  subclass's overridden method; also overloading.
- **Abstraction** — model only what matters.

## 9.2 Comparing Strings: ==, equals, equalsIgnoreCase, compareTo
```java
String a = "Hello";
String b = "Hello";              // same literal → same pooled object
String c = new String("Hello");  // a new object
String d = "hel".concat("lo");   // computed at runtime → new object

a == b;                   // true  (same object — by luck of the pool)
a == c;                   // false (different objects)
a.equals(c);              // true  (same text)  ← ALWAYS use this for text
a.equals("hello");        // false (case-sensitive)
a.equalsIgnoreCase("hello");  // true
```
**`compareTo`** — alphabetical (Unicode) order, returns an **int**:
- **negative** → the first comes **before** the argument;
- **0** → equal;
- **positive** → the first comes **after**.
```java
"apple".compareTo("banana");   // negative ('a' < 'b')
"pear".compareTo("pear");      // 0
"pear".compareTo("apple");     // positive
"Zebra".compareTo("apple");    // negative! uppercase letters (65–90) come before lowercase (97–122)
"app".compareTo("apple");      // negative (a prefix comes first)
"b".compareToIgnoreCase("A");  // positive
```
Rule: `==` for **primitives**, `equals` for **objects**. `==` on objects compares **references**.

## 9.3 More String methods
```java
String s = "  Pasta al Pesto  ";
s.trim();                   // "Pasta al Pesto" (removes leading/trailing spaces)
s.strip();                  // same idea, Unicode-aware (Java 11+)
s.isEmpty();                // false — true only if length() == 0
"   ".isBlank();            // true (only whitespace; Java 11+)
"pesto".replace('e', 'a');  // "pasto"
"pesto".replace("st", "zz");// "pezzo"
"pesto".contains("est");    // true
"pesto".startsWith("pe");   // true
"pesto".endsWith("to");     // true
"banana".lastIndexOf('a');  // 5
"banana".indexOf('a', 2);   // 3 (search from index 2)
"a,b,c".split(",");         // array {"a","b","c"}
"ab".repeat(3);             // "ababab" (Java 11+)
String.valueOf(42);         // "42"
```
**Concatenation with `+` is evaluated left to right**:
```java
"Total: " + 2 + 3      // "Total: 23"   (String + int → String, then + 3)
"Total: " + (2 + 3)    // "Total: 5"
2 + 3 + " items"       // "5 items"     (int + int first)
'a' + 'b' + "c"        // "195c"        (char + char = int 97+98)
```

## 9.4 Formatting output — printf and String.format
```java
String name = "Duke";
int age = 30;
double price = 12.5;
System.out.printf("Name: %s, age: %d%n", name, age);   // Name: Duke, age: 30
System.out.printf("Price: %.2f%n", price);             // Price: 12.50
String line = String.format("%s costs %.1f", name, price);   // "Duke costs 12.5"
```
| Specifier | For |
|---|---|
| `%d` | integers (`int`, `long`) |
| `%f` | decimals; `%.2f` = 2 decimals (rounded) |
| `%s` | Strings (any object, via toString) |
| `%c` | a char |
| `%b` | a boolean |
| `%n` | a platform-independent **new line** |
| `%%` | a literal `%` |
| `%5d` / `%-10s` | width 5 right-aligned / width 10 left-aligned |

`printf("%d", 3.5)` → runtime `IllegalFormatConversionException` (wrong type for `%d`).

> On **your** PC (Windows in Italian) `printf("%.2f", 12.5)` prints **`12,50`** with a comma: `%f` follows
> the system **locale**. Exam answers assume the English format `12.50`. To force it:
> `System.out.printf(java.util.Locale.US, "%.2f%n", 12.5);`. (`println(12.5)` always prints `12.5`.)
Escape sequences: `\n` new line · `\t` tab · `\"` double quote · `\'` single quote · `\\` backslash.

## 9.5 The Math class (java.lang — no import)
All methods are **static**: `Math.xxx(...)`.
```java
Math.abs(-7);          // 7
Math.max(3, 9);        // 9
Math.min(3, 9);        // 3
Math.pow(2, 10);       // 1024.0   ← always a double
Math.sqrt(16);         // 4.0      ← double
Math.cbrt(27);         // 3.0
Math.round(2.5);       // 3   (long)   Math.round(-2.5) → -2 (rounds half up)
Math.round(2.4f);      // 2   (int, because of the float argument)
Math.ceil(2.1);        // 3.0  (up)
Math.floor(2.9);       // 2.0  (down)
Math.random();         // double in [0.0, 1.0)
Math.PI;  Math.E;      // constants
```
A random int between 1 and 6: `int die = (int)(Math.random() * 6) + 1;`

## 9.6 The Random class (java.util — needs an import)
```java
import java.util.Random;

Random r = new Random();
int a = r.nextInt();          // any int
int b = r.nextInt(10);        // 0 … 9   (bound EXCLUDED)
int die = r.nextInt(6) + 1;   // 1 … 6
double d = r.nextDouble();    // 0.0 … 1.0 (excluded)
boolean coin = r.nextBoolean();
Random seeded = new Random(42);   // same seed → same sequence every run (useful for tests)
```
`r.nextInt(0)` → `IllegalArgumentException` (the bound must be positive).
In Java 17+ there is also `r.nextInt(5, 11)` → 5 … 10.

## 9.7 ArrayList (java.util — needs an import)
An array has a **fixed** length; an **`ArrayList`** **grows and shrinks** automatically.
```java
import java.util.ArrayList;

ArrayList<String> dishes = new ArrayList<>();    // <String>: type of the elements (generics)
dishes.add("Carbonara");            // append          → [Carbonara]
dishes.add("Amatriciana");          //                 → [Carbonara, Amatriciana]
dishes.add(0, "Bruschetta");        // insert at index → [Bruschetta, Carbonara, Amatriciana]
dishes.get(1);                      // "Carbonara"
dishes.set(1, "Gricia");            // replace         → [Bruschetta, Gricia, Amatriciana]
dishes.size();                      // 3   (NOT length)
dishes.contains("Gricia");          // true
dishes.indexOf("Amatriciana");      // 2  (-1 if absent)
dishes.remove(0);                   // remove by index → [Gricia, Amatriciana]
dishes.remove("Gricia");            // remove by value → [Amatriciana]
dishes.isEmpty();                   // false
dishes.clear();                     // []
System.out.println(dishes);         // prints the contents: [...]
```
- Holds **objects only**: for numbers use the wrapper class, `ArrayList<Integer>`, `ArrayList<Double>`.
  **Autoboxing** converts automatically: `numbers.add(5);` (int → Integer).
- Trap: with `ArrayList<Integer> list`, `list.remove(1)` removes the element **at index 1**;
  `list.remove(Integer.valueOf(1))` removes the **value** 1.
- `get` with a bad index → `IndexOutOfBoundsException`.
- Declared as `List<String> dishes = new ArrayList<>();` (interface type) in real code.

**Iterating an ArrayList**
```java
for (int i = 0; i < dishes.size(); i++) {      // classic for
    System.out.println(dishes.get(i));
}
for (String d : dishes) {                      // enhanced for
    System.out.println(d);
}
import java.util.Iterator;
Iterator<String> it = dishes.iterator();       // iterator
while (it.hasNext()) {
    String d = it.next();
    if (d.startsWith("A")) {
        it.remove();                           // the ONLY safe way to remove while iterating
    }
}
dishes.forEach(d -> System.out.println(d));    // lambda (just recognize it)
```
Removing with `dishes.remove(...)` inside an enhanced for → **`ConcurrentModificationException`**.

**Array vs ArrayList**
| | Array | ArrayList |
|---|---|---|
| Size | fixed at creation | grows/shrinks |
| Element types | primitives **or** objects | **objects only** (wrappers for numbers) |
| Length | `a.length` (field) | `list.size()` (method) |
| Read / write | `a[i]` / `a[i] = x` | `list.get(i)` / `list.set(i, x)` |
| Add / remove | impossible (make a new array) | `add`, `remove` |
| Print | `Arrays.toString(a)` | `println(list)` directly |
| Package | built into the language | `java.util` (import needed) |

## 9.8 Wrapper classes and parsing
| Primitive | Wrapper |
|---|---|
| `byte` `short` `int` `long` | `Byte` `Short` `Integer` `Long` |
| `float` `double` | `Float` `Double` |
| `char` `boolean` | `Character` `Boolean` |
```java
int n = Integer.parseInt("42");         // String → int
double d = Double.parseDouble("3.14");  // String → double
String s = String.valueOf(42);          // int → String  (or "" + 42)
Integer boxed = 5;                      // autoboxing
int unboxed = boxed;                    // unboxing
Integer.MAX_VALUE;  Integer.MIN_VALUE;
Integer.parseInt("4.5");                // NumberFormatException
```

## 9.9 Reading keyboard input — Scanner (java.util)
```java
import java.util.Scanner;

Scanner in = new Scanner(System.in);
System.out.print("Your name: ");
String name = in.nextLine();       // whole line
System.out.print("Your age: ");
int age = in.nextInt();            // one int (InputMismatchException if you type letters)
double w = in.nextDouble();
String word = in.next();           // one word (up to a space)
```
Trap: after `nextInt()` the Enter is still in the buffer, so the next `nextLine()` returns an **empty**
string. Call an extra `in.nextLine()` to consume it.

## 9.10 Java naming conventions — summary
| Element | Convention | Example |
|---|---|---|
| class | PascalCase, a noun | `ThoughtExperiment` |
| variable | camelCase, a noun | `totalWeight` |
| method | camelCase, starts with a verb | `calculateDensity()` |
| constant | UPPER_SNAKE_CASE | `MAX_VALUE` |
| package | all lowercase, reverse DNS | `org.duke.labs` |

### ✏️ Esercizi — 9 (extra d'esame)
1. **Confronto di String.** Prevedi e poi verifica `==` ed `equals` per: due letterali uguali; un letterale
   e `new String` con lo stesso testo; un letterale e il risultato di `concat`.
2. **compareTo.** Metti in ordine alfabetico, a mano e poi con `compareTo`: `"pera"`, `"Mela"`,
   `"banana"`, `"mela"`. Perché `"Mela"` finisce prima di `"banana"`?
3. **Altri metodi.** Da `"  Risotto ai Funghi  "` ottieni: senza spazi ai lati, tutto minuscolo, `true` se
   contiene `"funghi"` (senza badare a maiuscole/minuscole), la parola `"Funghi"` sostituita da `"Asparagi"`.
4. **printf.** Stampa uno scontrino allineato:
   `Carbonara      x2   25.00 €` · `Tiramisu       x1    6.50 €` · `TOTALE              31.50 €`
   usando `%-15s`, `%d`, `%8.2f` e `%n`.
5. **Math.** Calcola l'ipotenusa di un triangolo 3–4 (`sqrt` e `pow`), arrotonda 7.5 e −7.5 con `round`,
   `ceil` e `floor` di 7.1.
6. **Random.** Simula 10 lanci di un dado con `Random` e conta quante volte esce il 6. Poi rifallo con il
   seme `new Random(7)` e fai girare il programma due volte: i risultati cambiano?
7. **ArrayList.** Crea la lista della spesa: aggiungi 5 prodotti, inseriscine uno in testa, sostituisci il
   terzo, rimuovine uno per indice e uno per valore, stampa `size()` e la lista.
8. **Iterare e rimuovere.** Da una `ArrayList<Integer>` di temperature togli tutte quelle sotto 0, prima
   con un for-each (leggi l'eccezione) e poi con un `Iterator`.
9. **remove(int) vs remove(Object).** `ArrayList<Integer> l` con 10, 20, 30. **Prevedi** `l.remove(1)` e
   poi `l.remove(Integer.valueOf(10))`.
10. **Array vs ArrayList.** Scrivi lo stesso programma (5 voti, media, aggiunta di un sesto voto) una volta
    con un array e una volta con un `ArrayList`. Annota le differenze.
11. **Scanner.** Chiedi nome ed età e stampa `Ciao Andrea, fra 10 anni avrai 45 anni`. Poi chiedi prima
    l'età e poi il nome, e scopri la trappola di `nextLine()`.
12. **Parsing.** Converti `"42"`, `"3.5"`, `"abc"` con `Integer.parseInt` / `Double.parseDouble` in un
    try/catch.

---

# 10. FINAL CHECKLIST AND MOCK EXAM

## 10.1 Before the exam — can you…
- [ ] explain JDK vs JRE vs JVM, bytecode and WORA?
- [ ] compile and run from the terminal, with and without arguments?
- [ ] write `main` in every valid form and spot the invalid ones?
- [ ] list the 8 primitive types, their defaults and the widening order?
- [ ] tell compile errors from runtime exceptions and logic errors?
- [ ] predict integer division, `%`, casts, `x++` vs `++x`, short-circuit, precedence?
- [ ] use `String` methods and know that Strings are immutable?
- [ ] compare Strings correctly (`equals`, `compareTo`) and explain why `==` is wrong?
- [ ] use `printf` with `%d %s %f %n`?
- [ ] use `Math` and `Random`?
- [ ] write `if/else`, all switch forms, and spot fall-through?
- [ ] choose between `for`, for-each, `while`, `do-while`; use `break`/`continue`?
- [ ] create, fill, iterate arrays and `ArrayList`s; compare them?
- [ ] write a class with private fields, constructors (overloaded, `this(...)`), getters/setters?
- [ ] explain local vs instance vs static variables and `static` methods?
- [ ] overload methods and know which overload is called?
- [ ] use packages and imports; know what `java.lang` contains?
- [ ] extend a class, override with `@Override`, use `super`?
- [ ] handle exceptions with try/catch, `throw`, `throws`; checked vs unchecked?

## 10.2 Mock exam — 30 questions
(Choose one answer unless stated otherwise. Answers in 10.3 — try first!)

1. Which component translates bytecode into machine code at runtime?
   A) javac B) the JVM C) the JDK installer D) JShell
2. What is needed to **compile** Java programs? A) JRE B) JVM C) JDK D) a browser
3. Which is a valid identifier? A) `2total` B) `total-2` C) `_total2` D) `class`
4. Which `main` declaration is a valid entry point? (choose 2)
   A) `public static void main(String... a)` B) `public void main(String[] args)`
   C) `static public void main(String[] x)` D) `public static int main(String[] args)`
5. `int a = 7 / 2 * 2;` → a is: A) 7 B) 6 C) 7.0 D) 8
6. `double d = 7 / 2;` → d is: A) 3.5 B) 3.0 C) 3 D) compile error
7. `int x = 5; int y = x++ + x;` → y is: A) 10 B) 11 C) 12 D) 6
8. Which line does NOT compile? A) `long l = 100;` B) `float f = 1.5;` C) `double d = 5;` D) `int i = 'A';`
9. `int i = (int) 9.99;` → i is: A) 10 B) 9 C) 9.99 D) compile error
10. Output of `System.out.println(1 + 2 + "3" + 4 + 5);`? A) 12345 B) 3345 C) 339 D) 15
11. `String s = "Java"; s.toUpperCase(); System.out.println(s);` prints: A) JAVA B) Java C) java D) error
12. `"Hello".substring(1, 3)` returns: A) "Hel" B) "el" C) "ell" D) "l"
13. `"banana".indexOf("n")` returns: A) 1 B) 2 C) 3 D) −1
14. Which compares the **text** of two Strings? A) `a == b` B) `a.equals(b)` C) `a = b` D) `a.compareTo(b) == 1`
15. `"apple".compareTo("banana")` returns: A) a positive int B) 0 C) a negative int D) true
16. `int[] a = new int[3]; System.out.println(a[3]);` A) prints 0 B) prints null
    C) throws ArrayIndexOutOfBoundsException D) does not compile
17. Default value of the elements of `new String[2]`: A) "" B) null C) "null" D) no default
18. How many times does the body run? `int i = 10; do { i++; } while (i < 5);` A) 0 B) 1 C) 5 D) infinite
19. Output: `for (int i = 0; i < 5; i++) { if (i == 2) continue; if (i == 4) break; System.out.print(i); }`
    A) 0134 B) 013 C) 01 D) 0123
20. `int k = 2; switch (k) { case 1: System.out.print("A"); case 2: System.out.print("B"); case 3: System.out.print("C"); break; default: System.out.print("D"); }`
    A) B B) BC C) BCD D) ABC
21. Which type can NOT be used in a classic switch? A) String B) char C) int D) double
22. After `ArrayList<String> l = new ArrayList<>(); l.add("a"); l.add("b"); l.add(0, "c");`, what is `l.get(1)`?
    A) "a" B) "b" C) "c" D) exception
23. How do you get the number of elements of an ArrayList `list`?
    A) `list.length` B) `list.length()` C) `list.size()` D) `list.count()`
24. `new Random().nextInt(5)` returns: A) 1…5 B) 0…5 C) 0…4 D) any int
25. `Math.round(4.5)` returns: A) 4 B) 5 C) 4.0 D) 5.0
26. A class declares only `public Car(String model) { ... }`. What about `new Car()`?
    A) it compiles B) compile error C) runtime exception D) it creates a Car with model null
27. Which is true about a `static` method? A) it can use `this` B) it can access instance variables
    directly C) it can be called with the class name D) it cannot be called from `main`
28. Two methods `int total(int a)` and `double total(int b)` in the same class:
    A) valid overloading B) valid overriding C) compile error D) runtime error
29. Which exception is **checked**? A) NullPointerException B) ArithmeticException C) IOException
    D) ArrayIndexOutOfBoundsException
30. Output: `try { int x = 5 / 0; System.out.print("A"); } catch (ArithmeticException e) { System.out.print("B"); } System.out.print("C");`
    A) AC B) BC C) ABC D) B

## 10.3 Answers
1 B · 2 C · 3 C · 4 A, C · 5 B (7/2 = 3, ×2 = 6) · 6 B (integer division, then widened) ·
7 B (5 + 6) · 8 B (1.5 is a double literal; needs `1.5f`) · 9 B (truncation) · 10 B (see note) ·
11 B (immutable, result discarded) · 12 B (indexes 1 and 2) · 13 B · 14 B · 15 C · 16 C (compiles, fails at
runtime) · 17 B · 18 B (do-while runs at least once) · 19 B (prints 0, 1, skips 2, prints 3, breaks at 4)
· 20 B (fall-through from case 2 into case 3, then break) · 21 D · 22 A (list is [c, a, b]) · 23 C ·
24 C · 25 B (returns the long 5) · 26 B (the default constructor is not added) · 27 C · 28 C (differ
only in return type) · 29 C · 30 B

> Note on 10: evaluation goes left to right: `1 + 2` = 3 (int), `3 + "3"` = "33", `"33" + 4` = "334",
> `"334" + 5` = **"3345"** → **B**.

---

*End of the guide. Fonti: il corso MyLearn "Oracle Java Foundations" (video, trascrizioni e Student Guide
S106334GC11) e gli argomenti pubblici dell'esame 1Z0-811. Errori delle slide verificati con `javac`
(JDK 25) il 25/09/2026.*
