# Arithmetic and Type-casting in Java

This brief lesson is about arithmetic in Java.
In the [previous lesson](../01-intro-to-java/README.md), we learned the different *primitive data types* in Java, including the numerical data types `short`, `int`, `long`, `float`, and `double`.

In this lesson we'll establish some rules of evaluation for expressions involving these types.

> Note: By *expression*, I might anything that evaluates to a value. For example `3 + 5` is an expression that evaluates to the value `8`. `"why are you yelling".toUpperCase()` is an expression that evaluates to the value `"WHY ARE YOU YELLING"`.

## Arithmetic operators

Ok, so. Arithmetic. We already know a few arithmetic operators:

* `+` for addition
* `-` for subtraction
* `*` for multiplication
* `/` for division 
* `%` for modulo division (to obtain the remainder from a division operation)

All of these are *binary operators*. This means that each operator works on two *operands*. So in the expression `3 + 5`, `3` and `5` are operands, and `+` is the operator.

Unlike Python, which you learned in CSC 101 and 202, there is no `**` (exponentiation) or `//` (floor division).

## Arithmetic involving operands of the same type 

**When both operands in binary expression are of the same type, then the result will also be of that type.**

In the examples below, remember from the [previous lesson](../01-intro-to-java/README.md) that when you simply use the literal values `5` and `2`, Java treats them as `int`. So the expressions below are all using `int` operands.

```java
int addResult = 5 + 2; // 7
int subResult = 5 - 2; // 3
int multResult = 5 * 2; // 10
int modResult = 5 % 2; // 1 
```

So far so good.

But what if we start playing with division? Consider the expression `5 / 2`. If we were in a math class, the answer would be `2.5`, which is certainly not an integer.

```java
int divResult = 5 / 2; // What's the value of divResult?
```

Open up a terminal window and type `jshell` and hit enter. This will place you in a Java shell, a place where you can run small Java programs, including testing out individual expressions.

Use `jshell` to evaluate the expression `5 / 2`.

```bash
jshell 
jshell> 5 / 2
$1 ==> 2
```

You got the result 2!

However, if we were to divide `5.0 / 2.0`, we'd get the expected answer. 

```bash
jshell> 5.0 / 2.0
$2 ==> 2.5
```

Remember that `5 / 2` is an `int / int` expression. Per our rule above, Java is going to therefore produce an `int` in return.
A `double / double` expression, on the other hand, will result in a value of type `double`.

When the result of an integer division in Java is a fractional number (i.e., it has a decimal point), Java simply omits or *truncates* everything after the decimal point. So `2.5` becomes `2`.

If you wanted the more precise answer `2.5`, at least one of the operands must be a `float` or a `double`.

Note that simply changing the type of our result variable won't help.

```java
double divResult = 5 / 2; // Answer 2.0
```

If you trace the code above, you would do the following steps:

* Evaluate `5 / 2` using the rules we talked about, getting the `int` result 2.
* See that `divResult` is declared as a `double`, so *implicitly convert* the result `2` into a double, getting the value `2.0`.

## Arithmetic involving operands of different types

If you used two different types in an arithmetic expression, the result takes the "more precise" type.

If, instead of dividing two `ints`, you divided an `int` and a `double`, you would get a `double` in return.
Because at least one operand is using the *more precise* type, the result will default to that more precise type.

```java
double mixedDiv = 1.2 / 4; // Answer: 0.3 
```

The same goes for using the different *whole number types*. Remember that both `int` and `long` are integer data types.
If you add an `int` and a `long` (or perform any operation between an `int` and a `long`), you'll get a `long` in return.
This is because the `long` is the more precise type (it takes up more memory, allowing for a larger range of numbers).

```java
long longAdd = 5 + 8L; // Will get the value 13 as a long
```

Attempting to store the result above in an `int` will result in a compiler error. And this makes sense. Suppose we evaluated the expression `5 + 2147483647L` (5 plus the maximum possible `int` value). We cannot possibly the store result in an `int` variable—it's too big!

## Type casting

Finally, you can tell your compiler to treat certain values as other types instead of their own types.
This is known as _type-casting_.
You are "casting" or converting a specific value into another type.

A type-cast is performed by typing the name of the type you want to convert *to* in parentheses before the value you want to convert.

```java
int basicInt = 5;
double nowItsADouble = (double) basicInt; // becomes 5.0
```

You can also lose data this way!

```java
double basicDouble = 5.2;
int nowItsAnInt = (int) basicDouble; // becomes 5; you lost the .2
```

Type-casting can be used when you have two integer values that you need to divide, but you need a precise result.

```java
int a = 132;
int b = 25
double result = (double) a / b;
```

In the example above, `a` was cast to a `double` before performing the division. So it became a `double / int` operation, giving a `double` back as a result. Note that the cast only applies to `a`, not to the entire division expression.
