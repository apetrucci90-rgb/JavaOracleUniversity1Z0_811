1. WORK WITH ARRAYS

AN ARRAY IS a fixed-size collection that groups several values:
    - all elements have the same type
    - the LENGTH IS FIXED AT CREATION and can NEVER change.
    - I can reach an element with an int index starting at 0; the last valid index is length - 1. (ZERO-BASED INDEX)

2. TWO SEPARATE THINGS: THE VARIABLE AND THE OBJECT

An array variable does not hold the array . It holds a reference to an array object that lives on the HEAP.

int[] a; // declaration: a variable that can point to an int array. Points to nothing yet.

a = new int[3]; // creation: the array object is built on the heap; a now points to it.

- int[] a; -- the variable exists on the stack, value is null. No array yet 
- new int[3]; -- allocates the object on the heap and returns its reference.
- Touching an array through a null reference throws NullPointerException (I declared it but never created the object)

Consequences -- two variables can point to the same object:

int[] a = new int[3];
int[] b = a; // b does NOT copy the array. b points to the same object.
b[0] = 99; // a[0] is now 99 too - one object, two arrows.

= COPIES THE REFERENCE, NEVER THE CONTENTS

3. DECLARATION, CREATION, INITIALIZATION -- three distinct steps

int [] a;        // 1. declare
a = new int[3]; // 2. create (size fixed HERE, forever)
a[0] = 10; a [1] = 20; // initialize element by element

- The brackets belong to the TYPE, not the name.

int[] a; // preferred, read as "array-of-int a" 
int a[]; // legal , discooraged

- Array literal (initializer) -- declare + create + fill in one line

int[] a = {10, 20, 30}; // size inferred = 3
int[] b = new int[]{10, 20, 30}; // explicit form

The bare  {...} form works only on the same line as the declaration. This is a compile error:
    int[] a;
    a = {10, 20, 30}. // ERROR -- must use: a = new int[]{10, 20, 30}

4. DEFAULT VLUES -- arrays are always fully initialized

The core rule --------------------
The instant new runs, Java zeroes out the whole block of memory for that array. Every element is set to the "all-zero-bits" value for its type -- I never get leftover garbage.

- int[] a = new int[3]; // {0 , 0, 0}
- double[] d = new double[2]; // {0.0 , 0.0}
- boolean[] f = new boolean[2]; // {false, false}
- char[] c = new char[2]; // {'\u0000', '\u0000'} -- the null char, prints as nothing
- String[] s = new String[2]; // {null, null} -- object type -> null
























