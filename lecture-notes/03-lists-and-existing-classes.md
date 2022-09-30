# Arithmetic and testing

## Arithmetic operators

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

## Classes and objects

- String class (show source)
- Show examples of String objects
- Go through `csCohorts`
    - Data and behaviour!
    - Doesn't start with `main`
    - Constructor
    - Getters and setters (why not just make the fields public?)

## Review of arrays

- Creating a new array
- Must use the `new` keyword

## ArrayLists

- ArrayList documentation
- Arrays vs. ArrayLists: Why use ArrayLists?
- Talk about the backing array
    - But aren't arrays fixed length
    - ArrayList manages the array
    - Array has an initial capacity
    - What happens when the capacity is exceeded?

## LinkedLists

LinkedList and ArrayList, and List interface

Show the main methods for lists

- add
- remove
- contains
- get
- size (why not "length")
- isEmpty

## HashMap

- Compare to dict in python
- Simple example of `HashMap<String, String>`
- Show methods
    - put(key, value)
    - get(key)
    - getOrDefault(key)
    - entrySet()
    - isEmpty
    - containsKey()

Show `csCohort` and `compareCohorts`
