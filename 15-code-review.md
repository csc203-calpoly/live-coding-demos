# 18—Code review

Code review of various examples from lab 4

Common "code smells" to look out for:

Just synthesised a few examples based on what I've seen walking around in the lab and poking around on GitHub.

## "God class"/"God object"

- A class that does too much work, that controls too much of the program
- An example is `Functions.java` in the original version of the project
    - For some of you, `WorldModel.java` became a bit of a "God class"

# Smelly code examples

## In example 1

- `numPeeps` (acknowledge that this came with the base code)
- in `CommunityLSim` — clever, but difficult to read
- Everything in `Game` is static—is this good or bad?
- `randomUniqIndx` → came with the a base code. Better to refactor to *return* the random indices

## In example 2

- `CommunityLSim` is kind of a "God class"
- `reDoWhoPlays` → Good use of a static method from `Player`
- in `CommunityLSim` → line 72: "stolen" from where? It's okay to use the internet, but cite your sources
- `Game` class → `lottoResults` method. How do we feel about the use of a for loop?
- `addPocketChange` → (ack from base code). Should probably be handled in the Player class

## In example 3

- `CommunityLSim.java` line 86—a lot happening in that if condition
- Instance variables: does the Community *object* need to maintain the list of players each year as part of its global state? Does who is playing that year *make* the community that community? The `Game`?
    - Re-initialising the game each time the simulation is being run—that's a really good hint that the game should NOT be an instance variable
- `reDoWhoPlays`—unnecessarily doing a $n^2$ operation
    - No use of a `HashSet` to ensure uniqueness
