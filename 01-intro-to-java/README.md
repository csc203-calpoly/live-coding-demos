# Introduction

## 01 — Course intro + Intro to Java

## Course intro

- Self-introduction
- Learning objectives
- Syllabus

## A whirlwind introduction to basic Java syntax

Since many of you are likely coming from a Python background, some of this discussion will refer back to commonalities and differences between Java and Python. If you have no Python experiences, that is fine. We do not assume Python knowledge.

We'll work through the `JavaSample.java` file in this lecture.
Due to some language features in Java, I will sometimes ask you to ignore certain keywords for the time being.
I only do this because I will explain what those mean later when we get to those topics.
By the end of the quarter, there won't be keywords we see in class that I'll ask you to ignore.

### Basic data types

**Java is a *statically typed* language.** What does this mean? It means that before you can *run* Java code, a *compiler* checks that all values and variables are used correctly according to their types. For example, you can't divide the text `"foobar"` by the integer `10` (i.e., `"foobar" / 10`). If the code has type errors like this, the code will not execute at all.

You also can't do this division example in a language like Python or JavaScript, which are traditionally *dynamically typed*. However, your program containing the expression `foobar / 10` *will execute* right up until it reaches that expression, at which point it will crash.

A statically typed language like Java helps us catch these errors at compile time instead of at runtime.
There are many flame wars about whether statically-typed languages are better than dynamically-typed languages, and also what "better" means in this context.

Proponents of statically-typed languages argue that programming is less error-prone with static typing, particularly in large codebases or in codebases where the developer is unfamiliar with the code (i.e., they didn't write it themselves).

Proponents of dynamically-typed languages argue that programming becomes less verbose and more flexible.

You will get experience with both types of languages over your time here.

**Declaring and initializing variables.** You already know what it means to *declare* and *initialize* variables using whatever language you're coming from. When you *declare* a variable, you are simply saying that there is now a variable with the given name. When you *initialize* a variable, you are giving that variable an initial value.

When you *declare* a variable in Java, you must also say what its data type is. That is, what kind of data will it hold.
For example:

```java
int z;
```

The variable `z` above can now *only* hold integer values. Its type also dictates that we can only perform "integer friendly" operations to it, like math operations or printing. We can't do things like turn it to "upper case", because that doesn't make sense for an integer.

```java
z = "this isn't a number!"; // this code will not compile
z = 10; // this will be fine
```

You can also declare and initialize a variable in the same line.

```java
int z = 10; // you can change z's value, but only to other integers.
int y = -12;
```

**Primitive vs. reference types.**

There are eight basic or "primitive" data types in Java:

```java
short // 2-byte integers
int // 4-byte integers 
long // 16-byte integers
char // 1-byte characters
boolean // 1-bit true/false value
float // 4-byte fractional numbers
double // 8-byte fractional numbers
byte // 1-byte whole numbers; typically not used unless you're manually processing the data into some custom data type
```

There are also types known as "reference" types, for example the `String` type.
The value of a variable declared as one of these types is actually a *reference* to the data stored somewhere in memory. You might have multiple references to the same data floating around as your code runs. The `String` type is such a commonly used reference type that we tend to think about it in the same breath as primitive types in Java.

**Equality and reference types.** There are implications to what we just talked about.

Consider the `==` operator ("double equals"), which checks if two values are equal to each other.

```java
int a = 10;
int b = 12;

System.out.println(a == b); // This will print false.
System.out.println(a == 10); // This will print true.
```

However, note that the `==` operator checks whether the two operands are the *same* (as in, physically the same item in memory), and not whether they are *equal* according to some logical rule for equality.

So suppose we have two `Point` objects, representing two points in 2-dimensional space.

(I recognise we haven't talked about the `Point` type or the `new` keyword yet. We will get to those—but those details are less relevant for this example.)

```java
Point p1 = new Point(1, 2); // A point at coordinates (1, 2)
Point p2 = new Point(1, 2); // Another point at coordinates (1, 2)
```

What would the expression `p1 == p2` result in? `true` or `false`?

The answer is `false`, because the `==` operator checks *sameness*, not *equality*. Because `p1` and `p2` are *reference types*, each of those variables is pointing to a different location in memory. Now, you and me and everyone else understands that if two points have the same `x` and `y` coordinates, they should considered equal.

Therefore, for all reference types in Java, equality should be checked using the `.equals` function, which checks for *equality* instead of *sameness*. 

```java
System.out.println(p1 == p2); // This will print false.
System.out.println(p1.equals(p2)); // This will print true.
```

For primitive types, equality should be checked using the `==` operator, since it amounts to the same thing.

**String**. Strings are special type of reference type. They are so commonly used that Java provides a specialized syntax for creating a new String, without having to use the `new` keyword.

```java
String make = "Santa Cruz";
String model = "Bronson";
```

Under the hood, Strings are simply *arrays of characters.*

**Arrays.** Languages like Python and JavaScript provide much more flexible *collection* constructs than Java.

In Java, to store a collection of items, you use an *array*. Two things are important to know about arrays:

* Their types are fixed. You can't mix types in an array.
* Their sizes are fixed. An array can't grow or shrink after its initial creation.

Here is how to declare and initialize an array with some data:

```java
int[] scores = {83, 42, 77, 92, 73, 95, 81, 42}; // Size is fixed!
```

Similar to variables, you can also declare an array without initializing it.

```java
int[] scores; // without initialization
```

You can also declare an array and *fix its size*. The resulting array won't be "empty" for reasons we will talk about in a little bit.

```java
int[] scores = new int[4]; // A new array of size 4; what do you suppose are the contents of this array?
```

You can index into an array (read or write data at specific positions) using syntax that you're likely already familiar with.

If an array has 8 items in it, the items are accessible from positions 0–7. You can access it as follows:

```java
int[] scores = {83, 42, 77, 92, 73, 95, 81, 42};
scores[1]; // retrieves the item at position 1, which is 42
scores[1] = 43; // writes 43 into position 1, replacing whatever was there previously
scores[12]; // This will cause the program to crash, because there is no item at position 12
```


1. Walk through JavaSample.py
2. Cover these particulars
    - interactive mode
    - indentation
    - semi-colons
    - variables must be declared with types
        - primitive vs. object types
    - Stop for Menti questions (is this valid Java code)
    - Strings
        - [https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html)
    - Stop for Menti question (string equality questions)
    - if-statement syntax
    - other static method calling main
    - printing
- **compile and run a program**

## **Lab**

Show how to obtain the lab assignment from GitHub classroom
