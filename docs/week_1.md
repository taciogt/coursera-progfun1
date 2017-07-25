# Week 1: Functions & Evaluation

## Programming Paradigms
Paradigm: distinct concepts or **thought patterns** in some scientific discipline.

Main programming paradigms: imperative (Java, C, ...), functional (Lisp, Haskell, Scala, ...) and logic (Prolog, ASP).

Object-oriented programming is a paradigm orthogonal to the above. 
Can be combined well to any other programming paradigm, most commonly with imperative programming. 

* Imperative Programming
    * Modifying **mutable variables** 
    * using **assignments**
    * and **control structures** (if-then-else, loops, breaks, continue, return, ...)
    
    Classic example: Von Neumann computer. Pure imperative programming is limited by "Von Neumann's bottleneck".
    
In mathematics a theory consists of:
* one or more **data types**
* **operations** on these data types
* **laws** that describe relationships between values and operations

Normally, it does **not describe mutations**. Mutations can destroy useful laws in theories.

What is Functional Programming?
* restricted sense: programming without mutable variables, assignments or imperative control structures;
* wider sense: programs that focus on functions;
* in particular: in FP, functions are first class citizens:
    * functions can be defined anywhere
    * can be passed as parameters or returned as results
    * as for any other value, there is a set of operator to compose functions
    
Recommended books:
* Structure and Interpretation of Computer Programs. 
Harold Abelson and Gerald J. Sussman. 2nd edition. MIT Press 1996.
* Programming in Scala. Martin Odersky, Lex Spoon and Bill Venners. 2nd edition. Artima 2010.
* Scala for the Impatient. Cuy Horstmann.

Some benefits of FP:
* simpler reasoning principles;
* better modularity
* good for exploiting parallelism in multicore and cloud computing

Extra content recommended: [Working Hard to Keep It Simple](/docs/working_hard_to_keep_it_simple.md)

    