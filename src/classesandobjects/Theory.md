
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












