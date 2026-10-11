1.WHAT A LOOP EVEN IS

A loop is a block of code that runs again and again. I write the actions once, and Java keep doing as long as a certain condition is true. The moment it becomes false, Java stops repeating and continue with the line after the loop.ù

2. THE FOUR PART EVERY LOOP NEEDS

1 - ITERATOR DECLARATION -- a starting variable, usually a count like int i = 0. This is where I am now.
2 - TERMINATION CONDITION -- a boolean (i < 10); while it's true, keep looping and stop when false.
3 - ITERATOR UPDATE -- something that changes  the counter each round (++ ; --). without it the condition never changes and loop runs forever.
4 - LOOP BODY -- the action inside that get repeat.

3. while -- "keep going as long as..."

int i = 0;  // 1. start
while (i < 10) {    // 2. condition, checked BEFORE every round
    System.out.println(i) // 4. body
    i++;    // 3. update
}

    HOW JAVA RUNS IT, STEP BY STEP:
    - Checks i < 10 and if its true runs the body and print 0, then i becomes 1.
    - Checks again if 1 < 10, i becomes 2.
    - So on till 10.
    - 10 is not < 10, the body does not run this time.

THE CONDITION is checked BEFORE THE BODY. So if the condition is false right away
THE CONDITION doesn't have to be a counter. It can be anything that is true/false.

4. do / while --"do it once, then decide"

int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 20);

This is almost identical to while with a difference: the condition is checked after the body runs, not before.

The body is guaranteed to run at least once, even if the condition is false from the start.

int i = 99;
do {
    System.out.println("I ran anyway!");
} while (i < 10);

A plain while would have printed nothing. The do-while printed once. After while it's required ;.

5. for -- the same thing, tidied into one line

for does exactly what while does, in one line:

for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
"Start i at 0; keep going while i < 0; increase i after each round".

It behaves identically to the while -- print from 0 to 9. Looping over an array

double[] values = {22.1, 17.09, 42.7};
double sum = 0;
for (int i = 0; i < values.length; i++) {
    sum += values[i];
}
 The variables declared in the for header only exists inside the loop { }.

for-each -- "give me each element, I don't care about the index"

double[] values = {22.1, 17.09, 42.7};
double sum = 0;
for (double value : values) {     // read as "for each value in values"
    sum += value;
}

Each round, Java automatically takes the next element of the array and puts it in the first variable (value).
No counter, no i, no values.length. Cleanest way to read every element.

THE BIG CATCH -- values is a copy of the element, not the element itself:

for (double value : values) {
    value = value * 2;     // changes only the COPY
}
// values is STILL {22.1, 17.09, 42.7} — unchanged!

So for-each CANNOT MODIFY the array, CANNOT GO backwards and gives me no index. When I need to change elements or I know the position, I use a classic for.

6. break and continue -- interrupting a loop early




