# 14 – Inheritance

# 10 minutes Intro

So far we've talked about `Interfaces`, which cannot have any behaviour implemented, nor can they have instance variables. They can only have static variables (why?)

These are just **blueprints** for other classes—parents that only specify *what* those child classes can do, but not *how* they are done. Remember the `List` example.

But sometimes we want **parent** classes that can have their own data and behaviour, with child classes that specialised versions of them.me

This is where **inheritance** comes in.

## `ClosedFigure.java`

- Just an example class
- `toString` and `equals` methods
    - in `equals`, talk about `getClass` vs. `instanceof` and `equals` vs. `==`
    - return to `getClass` vs. `instanceof` later

## `Circle.java`

- introduction the `extends` keyword
- type hierarchy picture—"superclass" and "subclass"
- calling the super constructor
- `toString` — if we didn't override it, it would call the `ClosedFigure` one
- same for `equals`
- same for variables
- re-use the `super`class `equals` method
    - What does it mean to invoke a method with the `super` keyword?

What happens if the two classes have instance variables that are called the same thing?
