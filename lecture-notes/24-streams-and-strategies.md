# 24 — Streams and strategies

# Streams

- A way of operating on datasets
- A series of operations that can be chained together
- A stream can be built up with many operations, but the operations only kick in when a *terminating operation* is added to the stream

# Terminating operations

- No further stream operations can be called after a terminating operation
- Examples are
    - *collect*, which collects the results into a collection and returns the collection
    - *forEach*, which iterates over each item in the collection and doesn’t return anything
    - *sum*, which, assuming the stream is a `LongStream`, sums up the results
    - ...and many more

# Benefits and drawbacks of streams

### Benefits

- declarative style
- encourage less mutability
- looser coupling
- terse
- performance gains with parallelism
    - but this can also be a footgun

### Drawbacks

- for-loops are more lightweight
- people reading your code may be more familiar with imperative code like for loops
- cognitive overhead
- debugging
