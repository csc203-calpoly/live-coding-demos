# 08 — Interfaces Part 1

## Introduction to interfaces

Data structures lens: Talk about creating a list interface

What operations would we want to support?

We want to know *what* needs to be done, but not *how* it gets done

Show Finder vs. terminal as interfaces for manipulating the file system

# Return to the Nim example

We have different kinds of players, but they are all `Player` instances

Adding to `GreedyPlayer`

```java
this.sticksTaken = pile.sticks();
if (pile.sticks() > 3) {
    this.sticksTaken = 3;
}

pile.remove(sticksTaken);
```

Adding to `RandomPlayer`

```java
do {
	this.sticksTaken = rand.nextInt(3) + 1;
} while (sticksTaken > pile.sticks());

pile.remove(sticksTaken);
```

Add to play in `Game`

```java
if (p instanceof GreedyPlayer) {
	System.out.println(((GreedyPlayer) p).taunt());
```

# Static and dynamic types

- Show how assignments will work
- Show situations where a type check is required
- Show situations where the code will compile but will crash at runtime