1.WHAT A LOOP EVEN IS

A loop is a block of code that runs again and again. I write the actions once, and Java keep doing as long as a certain condition is true. The moment it becomes false, Java stops repeating and continue with the line after the loop.

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

THE CONDITION is checked BEFORE THE BODY. So if the condition is false right away the body never runs
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
"Start i at 0; keep going while i < 10; increase i after each round".

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

While the loop is still running, break and continue let me change it from inside the body. 

-- break - stop the whole loop right now
When Java hits break, it jumps straight out of the loop. The condition is not checked again.

for (int i = 0; i < 10; i++) {
    if (i == 3) {
        break; // leave the loop the instant i is 3
    }
    System.out.println(i); // prints 0, 1, 2
}

Typical use is searching. The moment I find what I want, there is no reason to keep scanning.

int[] numbers = {4, 8, 15, 16,23, 42};
int target = 15;
boolean found = false;
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == target) {
        found = true;
        break; // stops as soon as it's found
    }
}

-- continue - skip the rest of THIS round, go to the next one

continue abandons only the current round: it jumps to the end of the body and starts the next iteration, which is not the same in every loop:
    - in a for, continue still runs the UPDATE (i++) before checking the condition again
    - in a while / do-while there si no update in the header, so if the thing that changes the counter is AFTER the continue, it gets skipped too

for (int i = 0; i < 5; i++) {
    if ( i % 2 == 0) {
        continue; // even number: skip the print, jump  to i++ 
    }
    System.out.println(i); // prints 1, 3; even numbers are skipped, but loop keeps going to the end
} 

break = leave the loop completely
continue = skip to the next round of the SAME loop

    Only the INNERMOST loop

innermost loop:

    for (...) {          // OUTERMOST -- il più esterno
        for (...) {      // INNERMOST -- il più interno
            break;       // esce SOLO da questo
        }
    }

A plain break / continue affects only the loop that directly contains it. With nested loops, break gets me out of the inners loop only - outer loop carries on

for (int row = 0; row < 3; row++) {
    for (int col = 0; col < 3; col++) {
        if (col == 1) {
            break; // breaks the inner loop only
        }
        System.out.println(row + "," + col);
    }
} // 0,0    1,0     2,0 -- the outer loop still does all 3 rows

    LABELS -- breaking out of an OUTER loop

If I need break / continue to act an outer loop, I put a LABEL (a name + colon) in front of that loop and name it after break / continue

public class LabelDemo {
    public static void main (String[] args) {
        outer:
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (col == 1) {
                    break outer; // leaves both loops at once
                }
                System.out.println(row + "," + col);
            }
        }
        // prints only 0,0 -- then break outer quits everything
    }
}

- break outer -> exits the labeled loop entirely
- continue outer -> skips to the next round of the labeled loop

A label is just a name I choose followed by ':'. It is one of the few places in java where this syntax apppears.

7. UNREACHABLE CODE

- Any statement written AFTER a break or continue, in the same block, is UNREACHABLE and code DOES NOT COMPILE.
- A for header with ALL 3 parts empty is a legal infinite loop
- break and continue are also the normal way to run an intentional infinite loop safely: the loop is "forever", and a break inside ends it when some event happens.
- continue and break are statements, so the end with ;










