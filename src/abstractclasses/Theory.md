
================
ABSTRACT CLASSES
________________
WHAT IT IS
An abstract class is a class that CANNOT be instantiated: I cannot write new MezzoConsegna(...). It exists only to be a parent - a shared concept that other classes extend. Mark it with the keyword abstract. 

    abstract class MezzoConsegna(...)

________________
WHY IT EXISTS
Some parents are only a CONCEPT, not a real thing: a "generic delivery vehicle" does not exist - every real one is a Furgone, a Scooter, a Bicicletta. 
abstract stops me from creating the concept by mistake, and the compiler enforces it.

________________
ABSTRACT METHODS
An abstract method has NO body: just the signature and a semicolon.

    public abstract double costoRevisione();

It means: the parent does not know how to do this - every child MUST provide its own version". No more fake return placeholders. A class wi th even one abstract method must itself be abstract.

_______________
CONCRETE METHODS LIVE HERE TOO
An abstract class can also have normal methods with a real body.
So:
    - parent KNOWS how -> concrete method (has body)
    - parent does NOT know -> abstract method (no body), child fills it

_______________
THE RULE FOR CHILDREN
A concrete (normal) child MUST implement every abstract method it inherits, or it won't compile. If a child leaves one unimplemented, that child must itself be declared abstract

_______________
abstract vs the key I know
- final class = cannot be exrended.
- abstract class = MUST be extended.

They are opposites; a class can't be both.

































