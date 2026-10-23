
WHAT A CONSTRUCTOR IS
A special method that runs when I create an object with 'new'. it:
- Has the same name as the class
- Has no return type - not even void
- Is called automatically by 'new', not by object.name()'

THE DEFAULT (no-arg) CONSTRUCTOR
If I write no constructor at all, Java adds an empty no-arg one for free:
    public Measurement() {}
That is why 'new Measurement()' works even when I write nothing

CUSTOM CONSTRUCTOR
Parameters let me set the fields at creation time, and I can validate or transform the value before storing it. Use 'this.field = field' to assign the parameter to the field: 

public Measurement(String unit, double value) {
    this.unit = unit;
    this.value = value;
}
new Measurement("kg", 42.7);

WRITING ANY CONSTRUCTOR REMOVES THE DEFAULT
As soon as I write oen constructor, Java stops adding the free no-arg

OVERLOADING CONSTRUCTORS
Same as overloading methods: several constructors, different parameter lists, to offer different ways of building the object. I may write my own no-arg version as one of them.

REUSING logic - this(...)
One constructor can call another with 'this(arguments)', to avoid repeating code. It must be the firs statement of the constructor.

public Measurement(String unit) {
    this(unit, 0);
}

ATTENTION
- public void Measurement() has a return type -> it is a normal method, not a constructor.
- Constructors are not inherited and cannot be called like m.Measurement()
- A private constructor blocks other classes from using new
- this(...) not first, or consctructors calling each other in a loop -> does not compile









