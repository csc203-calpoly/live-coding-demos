# Objects, Lists, and Maps

In this lecture we will get a first look at *Classes and objects* in Java. Following this we'll look at some classes that are available in the Java standard library, specifically *Lists* and *Maps*.

## Objects and classes 

A *class* is the blueprint that defines data each object has and what behaviours it can perform.
You can create many individual objects using the same class.
These objects are called *instances* of the class.

*Objects* are "boxes" of related pieces of data and behaviours that use those bits of data.

For example, consider the [`String` class](https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/lang/String.java) in Java.
If you follow that link, you'll see a lot of comments and other things that will look unfamiliar (at least for these first few weeks).
But fundamentally, the `String` class defines the following

- All `String`s have an array of characters (data).
- All `String`s have a bunch of actions they can perform using that array of characters (behaviours). For example, they can turn the characters to upper case or lower case, search the array for a specific sub-string of characters, or remove and replace specific characters with other ones.

The `String` class, by defining the data and behaviours like the above, allows us to create `String` *objects*, each of which has its own array of characters, and its own behaviours it can perform using its array of characters.

In the figure below, the (super-simplified) `String` class defines the data (`value`) and behaviours that all `String`s should have.
Then we used that class to create two *instances* of `String`, i.e., two objects.
Each of those objects have their own bit of data called `value` (in this case, an array of characters), and can perform actions using that `value`.

![A simplified String class and two example instances](class-object.png)

See the example in code:

```java
String firstString = "csc 203";
String secondString = "Object-oriented Programming";
```

The two variables `firstString` and `secondString` are both made out of the same `String` class, but they are two different objects, i.e., two distinct *instances* of the `String` class.

### Instance methods

We can tell the objects to perform certain actions. This can be done by using the *dot operator* (`.`) and saying the name of the action we want to take.

```java
String firstString = "csc 203";
String secondString = "Object-oriented Programming";

String firstUpperCased = firstString.toUpperCase();
```

After the code above runs, the `firstUpperCased` variable will have the value `"CSC 203"`, because the `toUpperCase` action gives back the value of the `String` with its characters in upper-case.

These actions can each object can perform are called *instance methods*.
Instance methods act on particular objects, or *instances* of the class.
Notice that the expression `firstString.toUpperCase()` is totally unaffected by the value of `secondString`.
Hence the name.

**What do you think would be the value of the following expressions?**

- `secondString.toUpperCase()`
- `firstString.toUpperCase().toLowerCase()`

## A code example

Consider the following class definition. It defines a class that holds data representing a cohort of CS students, and some behaviours that each cohort object can perform using its own data.

Take some time to study the code below.

```java
public class CsCohort {
   // Instance variables 
   private int year;
   private final int enrolled; // final = value cannot change after it is set
   private double retainedPercent;

   // constructor
   public CsCohort(int year, int inEnroll, double inPercent) {
      this.year = year;
      this.enrolled = inEnroll;
      this.retainedPercent = inPercent;
   }

   public int getYear() {
      return this.year;
   }

   public void setYear(int year) {
      this.year = year;
   }
   public int getEnrolled() {
      return this.enrolled;
   }

   public double getPercent() {
      return this.retainedPercent;
   }

   public void setRetainedPercent(double newPercent) {
      if (newPercent >= 0 && newPercent <= 1) {
         this.retainedPercent = newPercent;
      } else {
         // newPercent is not a valid value; print an error message
         System.out.println("Expected a value between 0 and 1");
      }
   }

   public int retained() {
      return (int) (retainedPercent * enrolled);
   }
}
```

Here are some key items to note:

- Notice that, unlike the examples in our previous lecture, the code does not include a `public static void main` function. That is because this file is not meant to be "run"—it is not an entry point to an application. Instead, it is a *definition*, which we can (and will) use in a `public static void main` function in another file.
- The three variables `year`, `enrolled`, and `retainedPercent` are called *instance variables*. Just like *instance methods*, these are so called because, while each `CsCohort` object is guaranteed to have these variables, each `CsCohort` object will have its own values for these variables. 

A* *class* defines an object's data 

- String class (show source)
- Show examples of String objects
- Go through `csCohorts`
    - Data and behaviour!
    - Doesn't start with `main`
    - Constructor
    - Getters and setters (why not just make the fields public?)

## Lists

### Review of arrays

- Creating a new array
- Must use the `new` keyword

### ArrayLists

- ArrayList documentation
- Arrays vs. ArrayLists: Why use ArrayLists?
- Talk about the backing array
    - But aren't arrays fixed length
    - ArrayList manages the array
    - Array has an initial capacity
    - What happens when the capacity is exceeded?

### LinkedLists

LinkedList and ArrayList, and List interface

Show the main methods for lists

- add
- remove
- contains
- get
- size (why not "length")
- isEmpty

## Maps 

- Compare to dict in python
- Simple example of `HashMap<String, String>`
- Show methods
    - put(key, value)
    - get(key)
    - getOrDefault(key)
    - entrySet()
    - isEmpty
    - containsKey()
