# Introduction

## Data types in Java

Since many of you are likely coming from a Python background, some of this discussion will refer back to commonalities and differences between Java and Python. If you have no Python experiences, that is fine. We do not assume Python knowledge.

We'll work through the `JavaSample.java` file in this lecture.
Due to some language features in Java, I will sometimes ask you to ignore certain keywords for the time being.
I only do this because I will explain what those mean later when we get to those topics.
By the end of the quarter, there won't be keywords we see in class that I'll ask you to ignore.

### Java is statically-typed 

**Java is a *statically typed* language.** What does this mean? It means that before you can *run* Java code, a *compiler* checks that variables are used in ways that are consistent with their declared types.
For example, you can't divide the text `"foobar"` by the integer `10` (i.e., `"foobar" / 10`).
If the code has type errors like this, the code will not execute at all.

You also can't do this division example in a language like Python or JavaScript, which are traditionally *dynamically typed*. However, your program containing the expression `"foobar" / 10` *will execute* right up until it reaches that expression, at which point it will crash.

A statically typed language like Java helps us catch these errors at compile time instead of at runtime.
There are many flame wars about whether statically-typed languages are better than dynamically-typed languages, and also what "better" means in this context.

Proponents of statically-typed languages argue that programming is less error-prone with static typing, particularly in large codebases or in codebases where the developer is unfamiliar with the code (i.e., they didn't write it themselves).

Proponents of dynamically-typed languages argue that programming becomes less verbose and more flexible.

### Declaring and initialising variables 

You already know what it means to *declare* and *initialize* variables using whatever language you're coming from. When you *declare* a variable, you are simply saying that there is now a variable with the given name. 
When you *initialize* a variable, you are giving that variable an initial value.

When you *declare* a variable in Java, you must also say what its data type is. That is, what kind of data will it hold.
For example:

```java
int z;
```

The variable `z` above can now *only* hold integer values. Its type also dictates that we can only perform "integer-friendly" operations using it, like math operations or printing. We can't do things like turn it to "upper case", because that doesn't make sense for an integer.

```java
z = "this isn't a number!"; // this code will not compile
z = 10; // this will be fine
```

You can also declare and initialize a variable in the same line.

```java
int z = 10; 
int y = -12;

z = 12; // you can update z's value, but only to other integers 
```

### Primitive types and reference types

There are eight basic or "primitive" data types in Java:

| Data type | Description | Allowed values |
| -- | -- | -- |
| `byte` | A 1-byte integer.<br>We will not use this type in this course. | -128 to 127 (inclusive) | 
| `short` | A 2-byte integer.<br>Use this when you need to save memory. | -32,768 to 32,767 (inclusive) |
| `int` | A 4-byte integer.<br>Simply using an integer value (e.g., `12` or `4305`) will default to using the `int` type. | $-2^{31}$ to $2^{31}-1$ (inclusive) |
| `long` | An 8-byte integer.<br>Use this when you need larger numbers than `int` provides.<br>An an `L` after a number to indicate that you mean for it to be a `long`, i.e., `256L` will be a `long` value and not an `int` value. | $-2^{63}$ to $2^{63}-1$ (inclusive) |
| `float` | A 4-byte floating point number.<br>To indicate that a decimal value is a `float`, add an `F` after it, i.e., `12.5F`. | Beyond the scope of this course. |
| `double` | An 8-byte floating point number.<br>Simply using a decimal value (e.g, `12.5`) will default to using the `double` type. | Beyond the scope of this course. |
| `boolean` | Track true/false conditions. | `true` or `false` |
| `char` | A single 2-byte character. | '\u0000' (or 0) to `\uffff` (or 65535) |

There are also types known as "reference" types, for example the `String` type.
Reference types are abstractions created for programming convenience. They are built using primitive types or other reference types as building blocks.

The most commonly used reference type in Java is the `String` type. It stores _text_. The `String` type "strings together" a bunch of `char`s to make a longer piece of text.

You can declare and initialise a `String` variable like below. Notice the double-quotes! Single-quotes are reserved for the `char` type. You must use double-quotes for `String`s.

```java
String thisCourse = "CSC 203"; 
```

### Reference types and equality

The value of a variable that is declared as a reference type is actually, well, a _reference_ to the data stored somewhere in memory.
You can have multiple references to the same data.

There are implications to this.

Consider the `==` operator ("double equals").

For the 8 primitive types mentioned above, the behaviour of the `==` operator is pretty much what you'd expect.

```java
int a = 10;
int b = 12;

System.out.println(a == b); // This will print false.
System.out.println(a == 10); // This will print true.


char theLetterA = 'a';
chat theLetterAAgain = 'b'; 

System.out.println(theLetterA == theLetterAAgain); // This will print true.
```

_However, for reference types, this operator's behaviour differs between Java and Python._

For reference types, the `==` operator checks whether the two operands are the _same_ (as in, physically the same item in memory), and not whether they are *equal* according to some logical rule for equality.

**Example**. Suppose we have two `Point` objects, representing two points in 2-dimensional space.

(We will get to those—but those details are less relevant for this example.)

```java
Point p1 = new Point(1, 2); // A point at coordinates (1, 2). The "new" keyword is used to create new objects in Java.
Point p2 = new Point(1, 2); // Another point at coordinates (1, 2).
```

**What would the expression `p1 == p2` result in? `true` or `false`?**

The answer is `false`, because the `==` operator checks *sameness*, not *equality*.

Because `p1` and `p2` are *reference types*, each of those variables is pointing to a different location in memory. Now, you and me and everyone else understands that if two points have the same `x` and `y` coordinates, they should be considered equal.

Therefore, for all reference types in Java, equality should be checked using the `.equals` function, which checks for *equality* instead of *sameness*. 

```java
Point p1 = new Point(1, 2);
Point p2 = new Point(1, 2);

Point p1Again = p1; // p1Again and p1 are both pointing to the same Point.

// This will print false.
System.out.println(p1 == p2);

// This will print true, because they're the same object.
System.out.println(p1 == p1Again);

// This will print true, as we would expect.
System.out.println(p1.equals(p2));
```

#### String equality

Strings are special type of reference type. They are so commonly used that Java provides a specialized syntax for creating a new String without having to use the `new` keyword.

```java
String make = "Santa Cruz";
String model = "Bronson";
```

Since they are reference types, you should compare Strings for equality using the `.equals` function, and _not_ the `==` operator.

However, the Java compiler is smart enough to SOMETIMES recognise when the same text is being used as the value for multiple `String` variables.
It will therefore _intern_ or cache the String value. Each additional variable with the same value will point to the same `String` in memory.

```java
String csc203 = "CSC 203";
String csc203Again = "CSC 203";

System.out.println(csc203.equals(csc203Again)); // This will print true, as expected.
System.out.println(csc203 == csc203Again); // This will also print true.
```  

This means that, sometimes, the `.equals` function and the `==` operator will have similar behaviour. However, this is a compiler optimisation, and should not be relied upon in all cases. You can't predict when `==` and `.equals` will behave the same for Strings, so you should still use `.equals` to compare Strings for equality.

### Arrays

To store a collection of items in Java, the simplest collection you use is an *array*. Two things are important to know about arrays:

* Their types are fixed. You can't mix types in an array.
* Their sizes are fixed. An array can't grow or shrink after its initial creation.

Here is how to declare and initialize an array with some data:

```java
int[] scores = {83, 43, 77, 92, 73, 95, 81, 42};
```

You can use box brackets to index into an array to look at its contents. Arrays are _0-indexed_, which means that the first item in the array is at position 0, the second is at position 1, etc.

You can also use the same syntax to _modify_ the contents of an array.

```java
int[] scores = {83, 43, 77, 92, 73, 95, 81, 42};

System.out.println(scores[0]); // This will print the value 83
System.out.println(scores[7]); // This will print the value 42

System.out.println(scores[1]); // This will print the value 43.
scores[1] = 37;
System.out.println(scores[1]); // This will now print 37.
```

However, if you try to look at a position that's beyond the bounds of the array's size, your program will crash.

```java
int[] scores = {83, 42, 77, 92, 73, 95, 81, 42};

System.out.println(scores[11]); // There is no position 11. This program will crash.
```

Remember that arrays sizes are fixed! You can't grow the array beyond its initial size.

```java
int[] scores = {83, 42, 77, 92, 73, 95, 81, 42};
scores[8] = 78; // There is no position 8. This program will crash.
```

Similar to variables, you can also declare an array without initializing it.

```java
int[] scores; // without initialization
```

You can also declare an array and *fix its size*, but not specify its contents.

```java
int[] scores = new int[4]; // A new array of size 4
```

The above line created an array `scores` of size 4. But we didn't specific the contents of this array.
However, the array is not "empty"—there is no such thing as an empty array in Java.
When you create an array, you're allocating that amount of contiguous space for its contents.
So, whether or not you declare the contents of the array, that space is allocated.
What's sitting in that space?

### Default values

Java has sort of "placeholder" values for all data types. They are referred to as their _default_ values. So if you create an array but don't declare its contents, Java places the default values for that type in the array.

Here are the default values for all the primitive types:

| Data type | Default value |
| -- | -- |
| `byte` | 0 |
| `short` | `0` |
| `int` | `0` |
| `long` | `0L` |
| `float` | `0.0F` |
| `double` | `0.0` |
| `boolean` | `false` |
| `char` | `\u000` (or 0) |

All reference types like `String` or `Point` or >others we learn about have the same default value. It is a special value in Java called `null`.
When a variable's "value" is `null`, it means that the variable is "pointing to nothing".

## Control flow

### Conditionals

Java uses `if`, `else if`, and `else` for conditional logic.

Unlike Python, Java does not use indentation to denote _scope_. We use curly braces to denote what happens inside each clause of the "if-else ladder" below.

```java
Point p1 = new Point(1, 2);
Point p2 = new Point(1, 2);

if (p1 == p2) { 
    // The above condition is false, so this line will not execute.
    System.out.println("Condition 1");
} else if (p1 == new Point(1, 2)) {
    // The above condition is also false, so this line will not execute, either.
    System.out.println("Condition 2");
} else {
    // This is the "otherwise" clause.
    System.out.println("Condition 3");
}
```

### Repetition ("looping")

There are 3 looping constructs in Java.

#### The `for` loop

Use this when you want to do something repeatedly a certain number of times.

The `for` loop has 3 main pieces:

* The counter variable: `int i = 0`  in the example below.
* The looping condition: `i < 10` in the example below. The loop will keep repeating as long as this condition is `true`.
* The counting step: `i++` in the example below. This is shorthand same as `i = i + 1`. This statement runs _after_ each iteration of the loop. 

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

The code above will print

```
0
1
2
3
4
```

You can use the `for` loop to step through (or _iterate over_) an array.

```java
int[] scores = {83, 43, 77, 92, 73, 95, 81, 42};

for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}
```

The code above would print

```
83
43
77
92
73
95
81
42
```

However, there is a lot of "surface area" for potential errors in these kinds of loops. You could mess up for starting value of `i` or the looping condition (should it be `i < scores.length`, `i <= scores.length`).

So for iteration, we use the `for-each` loop.

#### The `for-each` loop


```java
int[] scores = {83, 43, 77, 92, 73, 95, 81, 42};

for (int item : scores) {
    System.out.println(item);
}
```

In the loop above, the `item` variable steps through the `scores`  array and updates in each step, stopping when you run out of items.

It'll print:

```
83
43
77
92
73
95
81
42
```

#### The `while` loop

The "simplest" kind of loop. It simply keeps on running as long as the given condition is true.

You typically use this loop when you don't know how many times it's going to run beforehand. E.g., you're reading lines from a file, and you want to keep reading it line-by-line as long as there are more lines to be read.

```java
while (lineStillHasFiles) {
    // Get the next line. Assume this function exists for this example.
    String line = nextLine(); 
    System.out.println(line);
}
```

It's important to know that the looping condition will _eventually_ be `false`, otherwise your code will go into an infinite loop.

