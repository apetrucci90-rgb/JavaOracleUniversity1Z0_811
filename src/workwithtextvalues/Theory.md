1. CHAR VS STRING (char VS String)

Java has two separate ways to hold text:
    - char is a primitive type. It hold exactly one single charachter and it is written with single quotes ('')
    char letter = 'e';
    Because it is a primitive, it is just a raw value sitting in memory && it has no methods of its own

    - String is a class (an object type), not a primitive. It holds any amount of text; from empty to a whole paragraph, and is written in double quotes (" ")
    String text = "It's Magic!";

A String is internally a sequence of characters, and every character sits at a numbered position, called an Index. Indexing starts at 0, not 1.

 I  t  '  s     M  a  g  i  c  !
 0  1  2  3  4  5  6  7  8  9  10      length = 11, last valid index = 10

 The space (4) is a real characters and it counts. The quotes are only delimiters (the mark where the valude starts and ends).

2. ESCAPER CHARACTERS

Some characters can't be typed directly inside quotes. The backslash \ is an escape character: it tells the compiler "the next character is special, don't read it literally".

- \n new lines (moves to the next line)
- \t tab (horizontal indent)
- \"  double quotes inside a String
- \' a single quotes inside a char
\\ a literal backslash (I need two because one alone starts an escape)

String example = "Hi, \n\tHow are you?\nBye!";

Output:
Hi,
	How are you?
Bye!

This is why a path Windows need doubled backslashes:
"C: \\ricette\\dolci".

3. CREATING A STRING + IMMUTABILITY

String a = "Hi";  // reccomended: a String literal
String b = new String("Hi"); // works, but not reccomended

Avoid new String(...). Java keeps a shared area in memory called the String pool: when I write the literal "Hi" twice, both names point to the same single object, which saves memory. Writing new String("Hi) forces java to build a separate copy and throws that optimization away far no benefit.

This sharing is only safe because of a key proprerty: Strings are IMMUTABLE. Once a String object exists, it's content can never be changed. Every method that seems to modify a String actualy return a brand-new String and leaves the original untouched. So I must reassign the result, or it is lost:

String s = "magic";
s.toUpperCase(); // the new "MAGIC" is created, then thrown away -> s is still "magic"
s = s.toUpperCase(); // now s points to the new object "MAGIC"

4. THE STRING METHODS IN THIS COURSE

Using String 
    t = "It's Magic!";

- length() | how many characters | t.length() -> 11
- charAt(i) | the character at index  i | t.charAt(6) -> 'a'
- indexOf(x) | first position of a char or substring, -1 if not found | t.indexOf('i') -> 8
                | t.indexOf('z') -> -1
- substring(a, b) | the piece from a included to b excluded | t.subsstring(3, 7) -> "s Ma"
- substring(a) | from a to the end | t.substring(8) -> "ic!"
- concat(x) / + | join two Strings | "It's" + "Magic!" -> "It'sMagic!"
- toUpperCase()
  toLowerCase() | un upper/lower copy | to.toUpperCase() -> "IT'S MAGIC!"

- VALID INDEXES runs from 0 to length() - 1. Asking for anything outside does not fail when I compile; it blows up at run time with a StringIndexOutOfBoundsException. This "compiles fine, crashes when run" behavior is itself an exam point.
- With substring(a, b) the length of the result is exactly b - a, because the start is icluded and the end excluded. So substring(3, 7) takes indexes 3, 4, 5, 6 -> 4 characters.

5. WRAPPER CLASSES

Primitives are fast but bare: they have no methods. For each primitive Java provides a matching wrapper class that carries useful helper methods;

PRIMITIVE | WRAPPER 
- char | Character
- int | Integer
- double | Double
- boolean | Boolean

















