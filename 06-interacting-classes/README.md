# 05 – Interacting classes

Today we're going to talk about a program in which classes can interact with each other

We'll discuss requirements first and then move on with designing and implementing a solution

## 10 minutes — Review questions

- Questions about HashMaps
- Questions about static types (peer instruction)

## 5–10 minutes

Explain the Nim game

Play with a student on the board

## 20–30 minutes coding up the Nim game

- What Objects do we need?
- What attributes and behaviours do these objects have?
- `Player`
    - name
    - number of sticks they took
    - ability to remove 1–3 sticks
- `Pile`
    - number of sticks
    - ability to reduce its stick count

```java
public class Player {
	private String name;
	private int sticks; // sticks taken on most recent turn

  public Player(String name) {
		this.name = name;
		this.sticks = 0;
	}

	public String toString() {
		return this.name + " with " + this.sticks + " sticks.";
	}

	public int sticksTaken() {
    return this.sticks;
  }

  public void takeTurn(Pile pile) {
    pile.remove(1);
    this.sticks = 1;
  }
}
```

```java
public class Pile {
  private int sticks; // How many sticks are left

  public Pile(int sticks) {
    this.sticks = sticks;
  }
  
  public int sticks() {
    return this.sticks;
  }

  public void remove(int sticks) {
    this.sticks -= sticks;
  }
}
```

**Reminder about Quiz 1, opening on Friday at 9am and due by 9pm**

## If there's time at the end

A look at the Kaiju class
