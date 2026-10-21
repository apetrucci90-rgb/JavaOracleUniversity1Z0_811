
1. WHAT A METHOD IS

A METHOD IS a named block of statements that I can call (run) on demand.

- it groups a piece of work under a name, So I can reuse it instead
of copy-pasting.
- I already USE methods (Arrays.toString(...), lista.add(...)); now 
I learn to WRITE them.
- main itself its a method: the one the JVM calls first to start
the program.

2. ANATOMY OF A METHOD

static int sum(int a, int b) {
    return a + b;
}

- static        -> modifier. For now: lets me call it from main without 
    creating an object.
- int       -> RETURN TYPE: what the method gives back (a value's type, 
    or void = nothing).
- sum       ->  NAME: how I call it (camelCase, verb-like).
- (int a, int b)        -> PARAMETER LIST: the inputs; each has a type and
    a name.
- {...}         ->  BODY: the work
- return a + b;     -> hands a value back AND exits the method.

3. CALLING A METHOD

int r = sum(3, 4); // r = 7
    - The values I pass (3, 4) are the ARGUMENTS.
    - The names inside the method (a, b) are the PARAMETERS.
    - Arguments are matched to parameters by POSITION and must
    fit the declared types.

4. RETURN TYPE AND return

- A method with a return type (int, String, boolean, ...) MUST return a 
    value of that type on every path.
- return does 2 things: give the value back and ENDS the method 
    immiediately (code after it does not run):
- void = the method returns nothing. A bare "return;" (optional),just   exits early

void greet(String name) {
    System.out.println("Hello " + name);
}

- A void method is a COMMAND (do something); a value-returning method
    is a QUESTION (give me an answer).
- Common error: "missing return statement" = a value method has a path
    that does not return.

5. PARAMETERS vs ARGUMENTS, and PASS-BY-VALUE

Java is ALWAYS pass-by-value: the method receives a COPY of what I pass.
    - primitive (int, double, ...) the value is copied. Changing the parameter inside does NOT change the caller's variable.
    - Object/array reference: the REFERENCE id copied, but it still points
    to the SAME object.
    - Reassigning the parameter does nothing outside; but mutating the 
    object (arr[0] = 9) is visible outside.

6. void METHODS

    - Return type void, used for actions (print, modify, save)-
    - Cannot be used as a value: "int x = greet(...);" is a compile error

7. static (for now)

    - main is static. A static method can call another static method in 
    the same class directly.
    - If a called method is NOT static, callin it from static main needs
    an object  -> error otherwise.
    - Keep helper methods static for now; the non-static (instance)
    story comes with objects.

8. METHOD SIGNATURE AND OVERLOADING

- SIGNATURE = method name + parameters types (NOT the return type).
- OVERLOADING : same name, DIFFERENT parameters lists, in the same class.
    Java picks by the arguments.

int max(int a, int b) {...}
double max(double a, double b) {...}

Changing ONLY the return type is NOT enough and is a compile error (same signature):

9. LOCAL VARIABLES AND SCOPE

- Variables declared inside a method (including parameters) are LOCAL: they
    exist only during the call.
- They are NOT auto-initialized (unlike array elements). Using a local 
    before assigningit is a compile error.
- A name inside a method does not clash with the same name in another
    method: separate scopes.

8.1 DEEP DIVE: METHODS

1. WHY METHODS EXIST

A program grows by repeating logic. Repetition is the enemy: the same
rule written in many places must be changed in many places, and one
forgotten copy becomes a bug. A method lets me write a rule ONCE,
gave it a name, and reuse it by calling it. FOUR paysoff:
    1. DRY (Don't Repeat Yourself): the logic live in one place.
    2. Single source of truth: change it once, every caller gets
    the change.
    3. Naming: conIva(10) reads better than 10 * 1.22; code explains itself.
    4. Abstraction: the caller needs the WHAT, not the HOW.

2. A METHOD IS A CONTRACT

Reading only the first line (the "header") I already know how to use it:
    static double conIva(double prezzo)
    - it needs one double (the price) -> INPUT
    - it gives back a double -> OUTPUT
    - its name says what it does -> INTENT

The body is the private part; the header is the public promise. Good 
methods have an honest header: name + parameters + return type 
tell the truth about the work.

3. THE CALL, STEP BY STEP   

    int r = cubo(4);

    1. the argument 4 is evaluated.
    2. a fresh parameter boc c is created and 4 is COPIED into it.
    3. the body runs with x = 4.
    4. return hands a value back AND ends the method immediately.
    5. the returned value replaces the call expression: r becomes 64.

Arguments bind to parameters BY POSITION and must fit declared types.

4. return SEMANTICS

- return does two things: produce the value and EXIT now. Code after a 
    reached return does not run
- A value method must return on EVERY path, or: "missing return statement"
- void returns nothing; a bare "return;" just exits early

5. PASS-BY-VALUE, PRECISELY

Java is ALWAYS pass-by-value: the method gets a COPY of the argument. What differs is WHAT sits in the variable:
- primitive (the 8: byte short int long float double char boolean): the BOX holds the VALUE itself -> the copy is indipendent -> changing the parameters does NOT affect the caller. 
- reference (array, String, any object): the box holds an ADDRESS that points to an object living elsewhere. The copy is a copy of the ADDRESS -> both names point to the SAME object.

primitive = copy the number;

reference = copy the address of the house, not the house.

6. SIGNATURE AND OVERLOADING

- SIGNATURE = method name + parameters types (NOT the return type)
- Overloading = same name, DIFFERENT parameter lists, same class; Java picks the match by the arguments.
- Changing ONLY the return type keeps the same signature  -> compile error

7. COMMON EXAM TRAPS    

 - using a void method as a value: int x = print(...) -> error.
 - a value method missing a return on some path -> "missing return".
 - two methods differing only by return type -> not overloading, error.
 - assuming an int argument changes after the call -> it never does.
 - confusing arguments (passed value) with parameters (receiving box).
 - a local variable used before assignment -> compile error.

============================
A&Q
============================

1. Come scelgo quali metodi creare.

Non li decido a tavolino, li scopro mentre guardo il problema. Tre segnali che qui serve un metodo:
    1) Ripetizione - sto per copiare incollare un pezzo, meglio farne un metodo
    2) Un commento che spiega un blocco - se devo scrivere // calcola il prezzo con IVA sopre 3 righe, quelle tre righe sono un metodo di nome conIva
    3) Un passo con un nome - se riesci a dire a voce "qui verifico il PIN", quello è verificaPin

UN METODO = UN LAVORO SOLO (una responsabilità); se nel nome mi viene un e (salvaEStampa) sono due metodi.

Come li scrivo bene:
- nome = verbo che dice cosa fa (verificaPin, calcolaResto).
- corto = se non ci sta sotto gli occhi, probabilmente fa troppo.
- pochi parametri (0-3): tanti parametri = il metodo sa troppe cose.
- domanda o comando: decido return o void

2. Li divido in CLASSI? Sì, ecco il criterio

Finora ho messo tutto in una classe con metodi static. In un programma vero la domanda diventa: questi metodi lavorano sugli stessi dati?

La risposta dipende da chi possiede il dato fra una chiamata e l'altra.
Due casi:

1) Metodo che prende input e ridà output, senza ricordare niente = distributore automatico. 
sum, isPari; conIva sono così : dato dentro -> risultato fuori -> dimenticato. Restano metodi static, NON serve creare una nuova classe.
2) Più metodi che leggono e scrivono lo STESSO dato = quel dato vuole diventare una classe, Il dato condiviso diventa un campo (lo stato); i metodi smettono di essere static e operano su quell'oggetto.

Il segnale pratico: se per non perdere un dato devo ripassarlo dentro e fuori a ogni metodo (passo saldo, torno saldo, ripasso saldo, ...), queln dato non è di passaggio: è lo stato di una classe.

ESEMPIO: un carrello a cui aggiungo articoli, tolgo articoli e chiedo il totale. I tre metodi toccano la stessa lista -> la lista è un campo, carrello è la classe. Invece conIva(prezzo) prende un prezzo e ridà un prezzo: niente da ricordare, resta static.

REGOLA SPICCIA: dato che gira fra più metodi -> campo di una classe. Dato che entra ed esce da un metodo solo -> parametro.









