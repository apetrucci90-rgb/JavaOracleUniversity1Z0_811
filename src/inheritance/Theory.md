===========
INHERITANCE
___________
WHAT IT IS

INHERITANCE lets one class (the SUBCLASS / child) reuse the fields and methods of another class (the superclass / parent) using the KEYWORD extends. The child get EVERYTHING the parent exposes, and can add its own members or redefine the parent's. 
_____________
WHY IT EXISTS
To avoid repeating code: what is COMMON goes in the parent, what is specific goes in each child. Change the common part once, in the parent, and every child gets the change.
________________________________
WHEN TO USE IT - THE "is-a" TEST
Use inheritance only when the child is a kind of the parent: a Cuoco is a Dipendente -> class Cuoco extends Dipendente. If the relation is "has-a" (a Ristorante has Piatti), that is not inheritance, it's a field.

    extends
    Declares the parent: class Cuoco extends Dipendente. A class can extend only the parent (Java has no multiple inheritance of classes)
_______________________
WHAT THE CHILD INHERITS
All public and protected memebers of the parent. 
private memebers exist in the object but the child cannot touch them directly - only through the parent's public/protected methods.

    protected
    An acces level betwenn private and public: visible to the class itself and its subclasses (and to the same package). Use it for fields the children must read/write directly.

    super(...)
    In the child's constructor, super(...) calls the parent's constructor to initialize the inherited part. It must be the FIRST STATEMENT. If I don't write it, Java inserts a call to the parent's no-arg constructor automatically - which fails to compile if the parent has none.

    super.member
    super.metodo() / super.campo reaches the parent's version explicitly - useful when the child has OVERRIDEN a method but still wants to run the parent's one inside it.

    Overriding (next step)

    A child can REDIFINE an inherited method with the same signature: this is OVERRIDIN. Mark it with @Override so the compiler checks the signature matches. 

________________
THE OBJECT CLASS
Every class, if it extends nothing, implicitly extends Object - the root of all classes. That's why toString() already exists on every object: I've been OVERRIDING Object's toString() all along.


















