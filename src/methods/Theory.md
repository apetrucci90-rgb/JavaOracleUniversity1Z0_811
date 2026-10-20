
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















