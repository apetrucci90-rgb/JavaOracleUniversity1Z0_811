1. WHAT A VARIABLE IS

A variable is a labelled box that holds one piece of data. Every box has 2 things:
    - a type: what kind of data fits in it
    - a name: the identifier I choose

int coperti; // type int, name coperti
double prezzo; // type double, name prezzo
String piatto; // type String, name piatto
boolean vegano; // type boolean, name vegano

2. THE 5 TYPES OF THE COURSE

┌─────────┬──────────────┬─────────────┬─────────────────────┐
│  Type   │    Holds     │  Examples   │      Watch out      │
├─────────┼──────────────┼─────────────┼─────────────────────┤
│ int     │ whole        │ -10, 0, 42  │ no decimals         │
│         │ numbers      │             │                     │
├─────────┼──────────────┼─────────────┼─────────────────────┤
│ double  │ decimal      │ 2.5, 9.39   │ decimal point is ., │
│         │ numbers      │             │  never ,            │
├─────────┼──────────────┼─────────────┼─────────────────────┤
│ boolean │ yes/no       │ true, false │ only those two,     │
│         │              │             │ lowercase           │
├─────────┼──────────────┼─────────────┼─────────────────────┤
│ char    │ one          │ 'A', 'x'    │ single quotes       │
│         │ character    │             │                     │
├─────────┼──────────────┼─────────────┼─────────────────────┤
│ String  │ text         │ "Carbonara" │ double quotes,      │
│         │              │             │ capital S           │
└─────────┴──────────────┴─────────────┴─────────────────────┘

3. JAVA IS STRONGLY TYPED

- Every variable has a type, decided before compiling, and it never changes
- An int box stays an int box forever: cannot put 2.5 or "Hello" into an int box

4. PRIMITIVE TYPES VS OBJECT TYPES

There are two families of types:

┌─────────────────────────────┬──────────────────────────────┐
│          Primitive          │            Object            │
├─────────────────────────────┼──────────────────────────────┤
│ int, double, char, boolean  │ String, and every class:     │
│ (+ byte, short, long,       │ yours too, like Cucina       │
│ float)                      │                              │
├─────────────────────────────┼──────────────────────────────┤
│ hold one simple value       │ hold many values together    │
├─────────────────────────────┼──────────────────────────────┤
│ have no methods             │ have methods (actions):      │
│                             │ "ciao".length()              │
├─────────────────────────────┼──────────────────────────────┤
│ name lowercase              │ name starts Uppercase        │
└─────────────────────────────┴──────────────────────────────┘

That's why String has a capital S, it's a class, not a primitive.

5. HOW TO NAME VARIABLES (CONVENTION, NOT RULES)

