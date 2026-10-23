==================
METHOD OVERLOADING
==================

WHAT IT IS
Two or more methods in the same class can share the SAME NAME, as long
as their PARAMETERS LISTS ARE DIFFERENT. This is called OVERLOADING.

THE SIGNATURE
A method's SIGNATURE = its name + its parameter list (number, types, order of parameters). The compiler tells methods apart by signature.

WHAT MAKES A PARAMETER LIST DIFFERENT
At least ONE of these must change:
- different number of parameters
- different types
- different order of types

WHAT DOES NOT COUNT (WILL NOT COMPILE AS OVERLOAD)
- The return type alone. Same name + same parameters but different return
type is a compile error, not an overload.
- The parameter names. Renaming 'a' / 'b' to 'x' / 'y' changes nothing;
the types and their order are what matter.

HOW JAVA CHOOSES WHICH ONE TO CALL
-At compile time, Java looks at the ARGUMENTS you pass and matched them 
to the method whose parameter list fits best.

WHY IT IS USEFUL
One clear name for one idea, many input shapes. I already use it: System.out.println is overloaded- it accepts an int, a String, same name, many versions.

ATTENTION
Changing only the return type is not enough

=============================
print vs return
=============================

return = ridà un valore a chi ha chiamato il metodo. Quel valore può venire da dove voglio: un campo oppure un calcolo oppure un numero fisso.

- getter: return eta -> ridà un campo
- somma: return a + b -> ridà un calcolo, non un campo

println = scrive del testo a schermo. Un metodo può:
- restituire un valore (return)
- stampare (println)
- altro

REGOLA:
Usa return ogni volta che il metodo deve dare indietro un valore a chi lo chiama - campo o calcolo che sia. Usa println quando vuoi far comparire qualcosa a schermo. 









