# 21 – Lambda activity

(Basically the second part of lab 6)

```java
LongUnaryOperator func = x -> x + 1;

// **TODO:** Fill in the blank with the value that would pass this test.
assertEquals(___, func.applyAsLong(7));
```

---

```java
private LongSupplier getNumberGenerator() {
  int number[] = { 0 };
  return () -> number[0]++;
}

// **TODO:** Fill in the blanks with the values that would pass these tests.
final LongSupplier first = getNumberGenerator();
final LongSupplier second = getNumberGenerator();

assertEquals(___, first.getAsLong());
assertEquals(___, first.getAsLong());
assertEquals(___, second.getAsLong());
assertEquals(___, first.getAsLong());
assertEquals(___, second.getAsLong());
assertEquals(___, first.getAsLong());
assertEquals(___, second.getAsLong());
```

---

```java
private LongFunction<LongUnaryOperator> createAdder() {
  return x -> y -> x + y;
}

final LongFunction<LongUnaryOperator> curried = createAdder();
final LongUnaryOperator add7 = curried.apply(7);
final LongUnaryOperator add3 = curried.apply(3);

// **TODO:** Fill in the blanks with the values that would pass these tests.
assertEquals(___, add7.applyAsLong(2));
assertEquals(___, add3.applyAsLong(2));
assertEquals(___, add3.applyAsLong(10));
```

---

```java
/**
* A function that takes in a list and maps each item using
* the provided function. We don't actually care what type T
* will be at runtime.
*
* @param A List of type T
* @param A function whose input and output are of type T
*
* @return A List of type T
*/
private <T> List<T> mapIt(List<T> list, Function<T,T> func)
{
  final List<T> results = new LinkedList<>();
  for (final T value : list)
  {
     results.add(func.apply(value));
  }

  return results;
}

final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
final int n = 10;

final List<Integer> result = mapIt(numbers, x -> x + n);

// **TODO:** Populate this list with the values that would pass the test.
final List<Integer> expected = Arrays.asList(__, __, __, __, __);
assertEquals(expected, result);

```

---

```java
final List<String> strings = Arrays.asList(
   "hello",
   "Hello",
   "HeLLo",
   "helLo",
   "HELLO");

// See the mapIt function above.
final List<String> result = mapIt(strings, String::toLowerCase);

// **TODO:** Populate this array with the values that would pass the test.
final List<String> expected = Arrays.asList(
  _____,
  _____,
  _____,
  _____,
  _____
);
assertEquals(expected, result);
```

---

```java
/**
* A function that takes in a list and filters it using the 
* the provided predicate.
*
* Note: We don't actually care what type T will be at runtime.
* Note 2: A Predicate's output is always a Boolean.
*
* @param A List of type T
* @param A predicate whose input is type T
*
* @return A List of type T
*/
private <T> List<T> filterIt(List<T> list, Predicate<T> pred)
{
  final List<T> results = new LinkedList<>();
  for (final T value : list)
  {
     if (pred.test(value))
     {
        results.add(value);
     }
  }

  return results;
}

final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Hint: x & 1 produces a value that is either 1 or 0, depending on 
// the least significant bit of x: if the last bit is 1, the result
// of x & 1 is 1; otherwise, it is 0. This is a bitwise AND operation.
final List<Integer> result = filterIt(numbers, x -> (x & 1) == 0);

// **TODO:** Populate this array with the values that would pass this test.

final List<Integer> expected = Arrays.asList(__________________);
assertEquals(expected, result);
```

---

```java
final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

final List<Integer> result = mapIt(
   filterIt(numbers, x -> (x & 1) == 0),
   x -> x * x);

// **TODO:** Populate the expected array with the values that would pass this test.
final List<Integer> expected = Arrays.asList(__________________________);
assertEquals(expected, result);
```
