
1. CLASS AND OBJECT

- A CLASS is the TYPE of a thing: the blueprint. It says HOW something
is made.
- An OBJECT is an INSTANCE: one concrete example built from that class. From one class I can make many objects, each with ITS OWN data.
- Classes are the fundamental building blocks: every variable and method lives inside a class.

2. CLASS STRUCTURE: ATTRIBUTES + METHODS

A class defines two things (same idea as "data + action on that data"):
- ATTRIBUTES (also: fields, properties): the DATA it stores.
- METHODS: the BEHAVIORS it can do

class Piatto {
    String nome;  // attribute(data)
    double prezzo;  // attribute(data)
    boolean vegano;  // attribute(data)
    void descrivi() {
        // method (behaviour)
        // ...
    }
}

- Class name: PascalCase (Piatto, ThoughtExperiment), file named like the
class + .java.

3. CREATING OBJECTS: new

- new Piatto() creates (INSTANTIATES) an object.
- newe allocates memory for EVERY attribute; each object gets its OWN copy.
- The object lives ont the HEAP; the variable holds a REFERENCE to it (an address), exactly like with arrays.

Piatto p1 = new Piatto(); // one object, own nome/prezzo/vegano
Piatto p2 = new Piatto(); // another object, indipendent data

4. THE CONSTRUCTOR (for now)

- new Piatto() looks like a method call with the class name: it IS one. It calls the CONSTRUCTOR, a special method with the SAME name as the class.
- Its job: INITIALIZE the attributes of the new object.
- Every class gets a DEFAULT (no-parameter) constructor for free if  I write none. 

<!-- sezioni 5-8 scritte da Claude il 21/10 -->

5. REFERENCES AND null

- new returns a REFERENCE to the object; the variable holds it (a logical
  pointer; the JVM hides the real address).
- Piatto p3 = p1;  -> NO new -> p3 and p1 are the SAME object (two names,
  one object). Changing via one is seen via the other (like arrays).
- null = a reference that points to NO object. Using it (p.descrivi())
  throws NullPointerException. Guard it: if (p != null) { ... }.
- A LOCAL reference has no default: "Piatto q; q.descrivi();" does NOT
  compile ("might not have been initialized"). Write "Piatto q = null;".

6. DEFAULT VALUES OF FIELDS

Fields (instance variables) are auto-initialized; local variables are NOT.
- numeric (int, double, char...) -> 0 / 0.0
- boolean -> false
- object types (String...) -> null
I can set my own default in the declaration: String nome = "Senza nome";

7. ACCESSING FIELDS VIA METHODS: getters and setters

Instead of touching a field directly (p1.prezzo = -5, no control), go
through methods that add logic (validate, transform).
Convention for a field "something":
- getSomething() -> returns the field (ACCESSOR / getter).
  For a boolean, often isSomething().
- setSomething(value) -> assigns the field (MUTATOR / setter), can validate.

    void setPrezzo(double prezzo) { this.prezzo = (prezzo < 0) ? 0 : prezzo; }
    double getPrezzo() { return prezzo; }

8. SHADOWING AND this

- If a parameter/local has the SAME name as a field, inside the method only
  the local is visible: it SHADOWS the field.
    void setPrezzo(double prezzo) { prezzo = prezzo; } // assigns the param
    to itself, the FIELD is untouched -> bug (compiles, does nothing).
- this = a reference to the CURRENT object (the one the method was called
  on: in p1.setPrezzo(20), this == p1).
- this.prezzo = the FIELD;  prezzo (bare) = the PARAMETER.
  this.prezzo = prezzo;  -> field = parameter. Fixes the shadowing.
- this is optional when there is no name clash (return prezzo; is the same
  as return this.prezzo;).. REFERENCES AND null












