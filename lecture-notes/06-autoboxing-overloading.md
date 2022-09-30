# Autoboxing and Overloading 

## 10–15 minutes

Remind about primitive vs. reference types

Quick overview of autoboxing and unboxing

**Why does this exist?** Nice to hold convenience methods, constants, etc. somewhere.

ArrayLists, HashMaps, briefly mention generic types (but don't go into too much detail)

## Method overloading 10 minutes

First show the `Circle` class, quick overview to see the `toString` method

Look at `Reporter.java` and method invocations in `ReporterTest.java`

Show that we can't have two methods of the same name and parameter type.

## Type hierarchy — 10–15 minutes

- Java is statically typed—what does it mean to be statically typed or dynamically typed?
- This *typically* means that the type of an Object is figured out at compile time
- But this is not always the case
    - *Static types and dynamic types* in Java

The **static type** of an object is what the *compiler* thinks it is. The **dynamic type** of an object is what the *runtime* thinks it is.

But how can this be?

#### First mention of inheritance

All reference types are subtypes of `Object`

Draw a tree on the board showing how things "inherit" from Object

Show the JavaDoc for `Object` 

[Object (Java SE 17 & JDK 17)](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html)

So the question is: how to decide which method to call if an object can fall under multiple ones?

```java
/*Overload resolution:
1) Exact match
2) Closest Is-A relationship
3) Can it be converted?
Resolution done at compile time (based on static type)
*/
```

## Equals – 10-15 minutes

All objects get an `equals` from the Object

- check if they're pointing to the same thing
- check for nullness
- check for the same type
- check fields
