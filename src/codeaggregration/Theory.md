CODE AGGREGATION (packages and imports)


THREE LEVELS OF CODE AGGREGATION

Java organizes code at three scales, from the smallest to the largest:
- A CLASS is the basic unit: it holds data and logic together.
- A PACKAGE is the middle level: a LOGICAL grouping of classes that belong together
  (for example, all the classes that handle the kitchen).
- A MODULE is the top level: a PHYSICAL grouping of packages. It is out of scope for the
  exam, I just need to know it exists.


WHAT A PACKAGE IS

A package is a drawer of related classes, and on disk it LITERALLY is a folder:
    package it.andrea.cucina;
forces that file to live inside the folders it/andrea/cucina/.

Rules:
- The package declaration must be the VERY FIRST LINE of the file, even before the imports.
- The name is always lowercase.
- The professional convention is reverse DNS (Domain Name System - the internet naming system
  behind domains like duke.org). It means I write my domain backwards: if I own duke.org, my
  packages start with org.duke. Putting the most general part first (org, com) gives a natural
  hierarchy, and since a domain has a single owner in the world, my packages never collide with
  another company's.

The purpose of all this: stop two classes with the same name, written by different people, from
clashing.


FULL NAME = PACKAGE + CLASS NAME

The real name of a class is not Piatto, it is it.andrea.cucina.Piatto: package plus name.
That is why the same simple name can live in different packages with no conflict
(it.andrea.cucina.Piatto and com.acme.Piatto are two distinct classes).
Classes that sit IN THE SAME package refer to each other by the simple name alone, with no
ceremony (no import needed).


USING CLASSES FROM OTHER PACKAGES

To use a class that lives in ANOTHER package I have three equivalent ways:
- import it singly:            import it.andrea.cucina.Piatto;
- import the whole package:    import it.andrea.cucina.*;      (wildcard)
- import nothing and write the full name every time:
                               it.andrea.cucina.Piatto p = new it.andrea.cucina.Piatto(...);

There is NO performance difference between them: the wildcard does NOT load useless classes,
it is only a WRITING SHORTCUT. Choosing one over another is pure convenience.

(Order inside the file: package -> import -> class. The imports go after the package line and
before the class.)


THE java.lang PACKAGE

java.lang contains the most used classes of all:
    String, System, Object, Math, Exception, and the wrappers (Integer, Double, Character...).
It is the ONLY package imported AUTOMATICALLY in every file. That is why I can write
System.out.println or Math.max without ever importing anything.

Everything else is NOT automatic: the classes in java.util (such as ArrayList, Scanner, Random)
and java.time.LocalDate must be imported by hand (as I already do in the array exercises).


ATTENTION (exam traps)

- The order inside a file is fixed: package (at most one, at the top) -> import -> class.
  Getting it wrong does not compile.
- import java.util.*; takes only the DIRECT classes of java.util, NOT sub-packages like
  java.util.function.
- Importing a class that does not exist is a compile error. Importing the same one twice is
  allowed.
- If two different wildcards offer a class with the same name, the ambiguity blows up at the
  POINT WHERE I USE it, not at the import line.
- A class with no package line ends up in the DEFAULT package - that is the case of my App.java,
  and in a serious project it is to be avoided.
