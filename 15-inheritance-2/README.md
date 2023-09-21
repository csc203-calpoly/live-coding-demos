# 15 — Inheritance + Hashcode

# 10–15 minutes

- Inheritance worksheet activity

# Remaining time

## Equals

- Walk through the `equals` method as a reminder
- checking nullness
- `Objects.equals`

## Hashcode

- What is `hashcode` ?
    - Method that all objects have, like `equals`
    - What is it used for? `HashSet`, `HashMap`, etc.
- Rules for HashCode
    - If two objects are `equal`, they should have the same `hashcode`
    - If you override `equals`, you should override `hashcode`
    - It is NOT required that two unequal objects hash to same value, but good for performance
