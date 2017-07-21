# Working Hard to Keep It Simple

https://www.youtube.com/watch?v=3jg1AheF4n0

### The initial challenge
The challenge we are facing: "Core count is increasing at the same rate clock speed used to increase since 2005". Almost everybody will be affected by parallelism. Process isn' get any faster per core. We will have to adapt to the new way that hardware is evolving.

There is two trends quite different (both are very hard):
* Parallel programming: Execute programs faster on parallel hardware
* Concurrent programming: Managa concurrent execution  threads explicitly

They both are too hard to get right.

Fundamental problem: **Non-determinism** caused by concurrent threads accessing **shared mutable state**

You can encapsulate state in actors or transactions, but the fundamental problem stays the same. 
It leads to a lot of heisenbugs.

> `non-determinism = parallel processing + mutable state` 

### How to face this challenge?
To get deterministic processing, avoid mutable state. 
That's why there some sort of Renaissance of functional programming since middle 00's.
   
In imperative programming, we reason about the program in time. 
The computer does this, **then** does that, **then** does some other stuff. 
We have to initialize this variable before I can access it.

In functional programming we think about space. 
We construct this, then construct that and then arrange everything together like a Lego.

This time focused mindset leads to complicated entangled structures (things like deadlocks, race conditions, ...). 
What people do to avoid this is put control structures like locks, atomic regions or software transaction memories.

### Why Scala?
How Scala address this problem?
It does nothing especially focused on parallel programming. 
Scala is a language that combines more than any other language the functional way of thinking and the object-oriented way of thinking. 
It is important to emphasize that the objected-oriented way of thinking that is present in Scala isn't some sort of Java legacy thing.
The object-oriented programming is as important as the functional side of the language.

Who is using Scala?
* Web Platforms (Twitter, Foursquare, Groupon, Tumblr, ...);
* Trading Platforms (CoinTouch, ...)
* Financial Modeling
* Simulation

It is fast to first product, scalable afterwards.

### Scala's toolbox

What Scala offers to face the problems brought by concurrency and parallelism?

Parallelism:
* Collections: Parallel Collections and Distributed Collections

Concurrency:
* Actors
* Software transactional memory
* Future

time to continue: 10:00