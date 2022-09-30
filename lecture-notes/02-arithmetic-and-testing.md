# Arithmetic in Java

## Learning objectives

Students should be able to

- Identify the different types of loops available in Java and when each type is useful
- Discuss the limitations and affordances of arrays in Java
- Display comprehension of Java code that makes use of implicit or explicit declarations of Java arrays
- Have a high-level understanding of JUnit testing
- Type casting
- Arithmetic operators and operations, and their effects on variable types

## Lesson plan

Start with menti questions reviewing material from Monday

#### Strings

- Strings are **reference types**
- They *should* not be compared using the `==` operator
- Stop for menti questions about string equality

#### Arrays

Using `Demo.java`

- Arrays and lists
    - arrays are fixed length
    - no slicing
    - same type
    - declaring arrays
        - implicit vs. explicit size

Menti questions (peer instruction questions)

#### Loops

Using `Demo.java`

- Stop for menti question (what loops do you know about)
- For loops foreach loops
    - can’t foreach a String directly
- while loops

#### Intro to JUnit testing

- Open the `ArithmeticTest` file
- Show that right now there are errors because it doesn't know what the `@Test` annotation is
- Show the import of JUnit 5.7
- Write a basic test
- Talk about why this better than just printing out values
    - Creates a record of these expectations

#### Arithmetic operators

- operators
    - ++, but no ** or //
- Integer math
    - `int + - * / % int -> int`
    - `double + - * / % double -> double`
        - talk (briefly) about floating point operations and how they work in Java
    - `int + - * / % double -> double`
    - `8/3 = 2`, `8/2.0 = 2.666667`
    - Casting: same example but casting ints
    - Truncating values

## Lab 2

Show how to run tests in one file while other files have syntax errors
