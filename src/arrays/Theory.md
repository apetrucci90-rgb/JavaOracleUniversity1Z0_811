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

5. ACCESSING AND MODIFYING ELEMENTS

I reach one element with the variable name and an int index square brackets: arr[i]
- Read: int x = arr[0]; takes the value at index 0
- Write: arr[0] = 99; replaces the value at index 0. The array keeps the same size - I overwrite a slot, I don't add one
- the index can be any int expression, not just a literal:
arr[i], arr[i + 1], arr[a.length - 1] (the last element)

6. THE length FIELD

Every array carries its size in a built-in field called length.
- Array length is a FIELD,  no parentheses: arr.length
- String length is a METHOD, with parentheses: text.length()
- Mixing them up is a compile error, and it is a classic exam question. (array -> .length, String -> .length())
- length is read-only: it is fixed at creation and I can never assign to it

7. ArrayIndexOutOfBoundsException

Valid indexes run from 0 to length - 1. Asking for anything outside blows up.
- arr[arr.length] is always out of bounds (one past the last). Off-by-one is the usual cause
- A negative index (arr[-1]) also throws it - Java has no "from the end" index
- This compiles fine and crashes at run time (ArrayIndexOutOfBoundsException)

8. ITERATING OVER AN ARRAY

Two loops. Pick by whether I need the index.

    (a) Standard for - I have the index:
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

        - Condition is i < arr.length (strictly less): the last valid index is length 
           - 1. Using <= throws an ArrayIndexOutOfBoundsException
        - I need this form to modify elements, to go backwards, or to skip

    (b) Enhanced for / for-each - I only need the values:
    for (int value : arr) {
        System.out.println(value);
    }

        - Reat it as "for each value in arr". No index, no counter, no bound to get wrong
        - Key point (verified above): for a primitive array the loop variable is a COPY of each element. Assigning to it (value = 0;) does not change the array. To write into the array I must use the index form (a)
        - for-each is read-only in direction too: always start to end, one step, no skipping

9. MULTIDIMENSIONAL ARRAYS

A 2D array is "an array whose elements are themselves arrays" (a grid of rows and columns)

int[][] grid = new int[2][3]; // 2 rows, 3 columns
grid[0][0] = 5; // row 0, column 0

- grid.length = number of rows (2); grid[0].length = length of that row = number of columns (3)
- Default values apply here too: new int[2][3] is all 0
- Literal form: int[][] g = {{1,2,3},{4,5,6}};
- Nest two loops (outer = rows, inner = columns) to walk every cell























