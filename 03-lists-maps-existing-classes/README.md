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

- **No `public static void main`** — The `main` function is used as the starting point or entry point to a Java program. In the code above, we are not writing code that is meant to be "run". Instead, it is a *definition* that can be used in a `main` function in another file.
- **Instance variables** — The three variables `year`, `enrolled`, and `retainedPercent` are called *instance variables*. Just like *instance methods*, these are so called because, while each `CsCohort` object is guaranteed to have these variables, each `CsCohort` object will have its own values for these variables. 
  - `private` indicates that those variables are not visible in any other files. If a variable is `public`, it can be read and modified by other classes. We will see implications of this soon.
  - `final` indicates that that variable's value cannot be updated once the variable has been initialized.
- **Constructor** — The *constructor* is the part that starts with `public CsCohort(....)`. A constructor looks like a method without a name. Its job is to *construct* the object, using the inputted data as appropriate.
  - In this case, the constructor will be given, as parameters, a `year`, an `inEnroll`, and an `inPercent`. These parameters' values are then given to the instance variables, so that they can be used throughout the class.[^constructor-param-scope]
  - The `public` indicates that this constructor is visible in other classes, i.e., other classes can use this constructor to create `CsCohort` instances.
- **The `this` keyword** — Notice that one of the constructor parameters, `year`, has the same name as the `year` instance variable. So how do we know which one we are referring to when we're reading its value or assigning it a new value? That's where the `this` keyword comes in.
  - `this` is used when the object needs to refer to *itself*. That is, it needs to refer to *members* (instance variables or instance methods) that belong to the object. So when we say `this.year`, that tells the compiler that we mean to refer to the *instance variable* `year`, and not the *constructor parameter* `year`.
    - If we just said `year` in the constructor, the compiler would resolve that to the local variable `year` (the constructor parameter).
  - For the instance variables `enrolled` and `retainedPercent`, there is no ambiguity, i.e., no constructor parameter with the same name. So we *could* refer to them using just their names—but it is good practice to *always* use `this` when referring to instance variables or methods.
- **Instance methods** — We have already described the purpose of instance methods. Now let's look at some examples. These instance methods define the behaviours that each `CsCohort` is capable of, using with each one its own instance data. In the code example above, see the following methods:
  - `getYear` — Simply returns the value of `this.year`
  - `setYear` — Sets a new value for `this.year`
  - `getEnrolled` — Returns the value of `this.enrolled`
  - `getRetainedPercent` — Returns the value of `this.retainedPercent`
  - `setRetainedPercent` — Sets the value of `this.retainedPercent`, after doing some validity checks first
  - `retained` — Computes and returns the number of students in the cohort that were retained

[^constructor-param-scope]: The constructor parameters, like all parameters in Java, are *local* to the constructor. This means their values cannot be accessed by other parts of the class. That's why we taken in those values in the constructor, and give them to the instance variables, which are visible throughout the class.

### Encapsulation, or, information hiding

Consider the `getYear`, `setYear`, `getEnrolled`, `getRetainedPercent`, `setRetainedPercent` methods above.
They don't do much beyond getting or setting the values of the appropriate variables.
These are called *getter methods* (or *accessors*) and *setter methods* (or *mutators*).
Because they are marked as `public` methods, they are visible to other classes, which means other classes can *get* or *set* the cohort's `year` and so on.

This should raise the question: why did we make the `year` (and other instance variables) `private` if we were going to expose access to those variables via `public` instance methods?

The answer is *encapsulation*. When we make our instance variables `private`, we hide them from the outside world. We gain the following benefits:

- **We can prevent mutations for some variables**. For example, notice that `enrolled` does not have a setter method. We simply do not allow other classes to ever modify the `enrolled` value, which we could not have done if it was `public`.
- **We can control mutations for some variables.** In the `setRetainedPercent` method, we are able to perform some validity checks before accepting a new value for the retained percent. Specifically, because this is a percentage, we check that the input value is within the range 0–1.
- **Finally, we _decouple_ our class from other classes.** By hiding these bits of information (as opposed to giving unfettered access to the internals of how our `CsCohort` works), we reduce the potential for *coupling* between our `CsCohort` class and other classes in our program.

**What's coupling?** If classes are *tightly coupled*, they have to change together. Each time one of the classes changes, it will force changes in other classes to accommodate the changes in the first class. When classes are *loosely coupled*, they are mostly independent. This does not mean they don't work together to make things happen; it just means that internals of the either of the classes can change without the other ever knowing about it.

Encapsulation helps with this. By defaulting to making our instance variables `private`, we get a lot more control over the functionality that `CsCohort` presents to other classes.

## Existing classes in Java

### Lists

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
