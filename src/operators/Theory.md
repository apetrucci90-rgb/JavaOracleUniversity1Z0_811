1. WHAT AN OPERATOR IS

An operator is a symbol that takes on or more values (its OPERANDS) and produces a new value
operands + operator is an EXPRESSION, and every expression evaluates down to ONE value of ONE type.

int total = 2 + 3; // "2 + 3" is an expression, its value 5 goes into total

Operators are grouped by how many operands they take:
    - unary : one operand (-x, x++, !done)
    - binary : two operands (a + b, a > b, a && b)
    - ternary : three operands (condition ? valueIfTrue : valueIfFalse)

2. ARITHMETIC OPERATORS

┌──────┬──────────────────┬──────────────┬────────────────────────────┐
│ Op   │ Meaning          │ Example      │ Watch out                  │
├──────┼──────────────────┼──────────────┼────────────────────────────┤
│  +   │ addition         │ 7 + 2  -> 9  │ with String = join (§7)    │
│  -   │ subtraction      │ 7 - 2  -> 5  │                            │
│  *   │ multiplication   │ 7 * 2  -> 14 │                            │
│  /   │ division         │ 7 / 2  -> 3  │ int/int THROWS AWAY the    │
│      │                  │              │ decimals (see §3)          │
│  %   │ remainder (mod)  │ 7 % 2  -> 1  │ what is LEFT after /       │
└──────┴──────────────────┴──────────────┴────────────────────────────┘

3. INTEGER DIVISION vs DECIMAL DIVISION

Java decides the result type from the OPERAND types.

- int / int -> int    : decimals are cut off, NOT rounded
    7 / 2 = 3 (not 3.5)
- double involved -> double : 7.0 / 2 = 3.5; 7 / 2.0 = 3.5
 
To get the decimals at least one operand must be a double:
    - double r = 7 / 2; // 3.0 : the / happened in int FIRST, then widened
    - double r = 7.0 / 2; // 3.5 correct

% follows the same idea and keeps the sign of the LEFT operand:
    - 7 % 3 -> 1
    - -7 & 3 -> -1
    - 7 % -3 -> 1

4. THE ASSIGNMENT OPERATOR  =

= is not "equals". It means "take the value in the RIGHT and store it in the variable in the LEFT". It always works right-to-left.

int x = 5; // store 5 in x
x = x + 1; // read x (5), add 1, store 6 back in x

Equality is == , a different operator

5. COMPOUND ASSIGNMENT += -= *= /= %=

"do the maths on myself, then store the result in myself"

    x += 3;   is the same as   x = x + 3;
    x -= 3;    ->  x = x - 3;
    x *= 2;    ->  x = x * 2;
    x /= 2;    ->  x = x / 2;
    x %= 2;    ->  x = x % 2;

Compound operators do a SILENT cast back to the variable's type
    int x = 5;
    x += 2.5; // compiles! result 7 : the double 7.5 is cut back to int
    x = x + 2.5; // does NOT compile: int = double is not allowed

6. INCREMENT ++ AND DECREMENT --

++ adds 1, -- substracts 1. WHERE I put it changes WHEN the +1 happens relative to the value the expression hands back:

    POST (x++) : hand back the OLD value first, THEN change x
    PRE (++x) : change x FIRST, the hand back the NEW value

    int x = 5;
    int a = x++; // a = 5 (old), then x becomes 6
    int b = ++x; // x becomes 7 first, then b = 7

If the result is not used (a statement on its own), pre and post are identical:
    x++; and ++x; both make x one bigger.

7. STRING CONCATENATION WITH +  

If EITHER side of + is a String, + means "glue text", not "add numbers".
Java evaluates left-to-right, so position matters:

    "n=" + 1 + 2    -> "n=12"   (text + 1 -> "n=1", then + 2 -> "n=12")
    1 + 2 + "=n"    -> "3=n"    (1 + 2 are both int -> 3, then + text)

8. RELATIONAL OPERATORS (compare -> always give a boolean)

┌──────┬───────────────────────┬─────────────┐
│  ==  │ equal to              │ 3 == 3 true │
│  !=  │ not equal to          │ 3 != 4 true │
│  >   │ greater than          │ 4 > 3  true │
│  <   │ less than             │ 3 < 4  true │
│  >=  │ greater than or equal │ 3 >= 3 true │
│  <=  │ less than or equal    │ 3 <= 4 true │
└──────┴───────────────────────┴─────────────┘

== on Strings compares IDENTITY (same box), not text
Use .equals() for text: "ciao".equals(name)

9. LOGICAL OPERATORS (combine booleans -> give a boolean)

    && AND : true only if BOTH sides are true
    || OR : true if AT LEAST ONE side is true
    !  NOT : flips a boolean (!true)

SHORT-CIRCUIT : Java stops as soon as the answer is certain. 
    - &&    : if the LEFT is false, the right is NEVER evaluated (returns FALSE)
    - ||    : if the LEFT is true, the right is NEVER evaluated (returns TRUE)
    - if (x != 0 && 10 / x > 1) if x==0, right side is skipped: no crash

10. THE TERNARY OPERATOR ? :

A compact if/else that PRODUCES A VALUE:

    condition ? valueIfTrue : valueIfFalse

    String s = (posti > 0) ? "liberi" : "pieno";
    int max = (a > b) ? a : b;

Both branches must give a compatible type, because the whole thing is one value.

11. OPERATOR PRECEDENCE (who goes first)

Like maths: higher rows happen before lower rows. Use ( ) to be sure and
to be readable.

    1. ++ -- (unary),  !,  unary -
    2. *  /  %
    3. +  -
    4. <  <=  >  >=
    5. ==  !=
    6. &&
    7. ||
    8. ? :
    9. =  +=  -=  *=  /=  %=   (lowest, right-to-left)

    2 + 3 * 4     -> 14   (* before +)
    (2 + 3) * 4   -> 20   (parentheses win)

Assignment is almost last, so  x = a + b  does a+b first, then stores.















