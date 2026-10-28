
THE static KEYWORD

'static' means belong to the CLASS, not each object.
There is only one copy, shared by al objects of that class.

## static field vs instance field
- instance field (e.g. double prezzo;): ONE copy PER object. 100 objects = 100 values
static field (e.g. static int contaPiatti;): ONE copy for the whole class.
If one object changes  it, every object sees the new value.

## static method
- instance method: works on ONE object (uses its field / this). Call it on the object: p1.getPrezzo()
- static method: needs NO object. Call it ont the class name: Math.round(x)
, Piatto.quantiPiatti().
- a static method CANNOT use this and cannot read instance fields directly

## Why main is static
public static void main(String[] args)
The JVM must call main BEFORE any object exists, so it must be callable on the class, not on an object -> static

## static final = a shared constant
static final int MAX_COPERTI = 120; // same for all, cannot change. UPPER_CASE by convention.

## How to decide
- value differs per object / method uses 'this' -> NOT static

- value is the same for all / method touches no object -> static

ATTENTION
Put the '++' inside the CONSTRUCTOR, not among the field declarations



















