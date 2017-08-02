# Week 1: Functions & Evaluation

## 1.1 Programming Paradigms
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

## 1.2 Elements of Programming

Every non-trivial programming language provides:
* primitive expressions;
* ways to combine expressions;
* ways to abstract expressions, which introduce a name for an expression by which it can be referenced to;

REPL (Read-Eval-Print-Loop): functional programming is a bit like using a calculator.

A non-primitive expression is evaluated as follows:
1. Take the leftmost operator;
2. Evaluate its operands (left before right);
3. Apply the operator to the operands;

A name is evaluated by replacing it with the right hand side of its definition
The evaluation process stops once it results in a value.
A value is a number (for the moment). Later on there will be other kinds of values.

Example:
```scala
scala> val pi = 3.14
scala> def radius = 10
scala> (2 * pi) * radius
// (2 * pi) * radius
// (2 * 3.14) * radius
// 6.28 * radius
// 6.28 * 10
// 62.8
62.8
```

Applications of parameterized functions are evaluated in a similar way as operators
1. Evaluate all function arguments, from left to right;
2. Replace the function application by function' right-hand side, and, at the same time;
3. Replace all formal parameters of the function by the actual arguments;

Example:
```scala
scala> def square(x: Double) = x * x
scala> def sumOfSquares(x: Double, y: Double) = square(x) + square(y)
scala> sumOfSquares(3, 2+2)
// sumOfSquares(3, 4)
// square(3) + square(4)
// 3 * 3 + square(4)
// 9 + square(4)
// 9 + 4 * 4
// 9 + 16
// 25
25
```

This scheme of expression is called substitution model, the underlying idea is that all evaluation does is reduce an expression to a value.
It can be applied to all expressions, as long as they have **no side effect**.
This model is formalized in the *λ-calculus*, which gives a foundation for functional programming.

What is a side effect? Side effects cannot be expressed by the substitution model.

Does every expression reduce to a value (in a finite number of steps)? No. Counter example: `def loop: Int = loop`  

### Evaluation strategies:
Changing the evaluation strategy: One can alternatively apply the function to unreduced arguments.

* *call-by-value*: evaluates every function argument only once;
* *call-by-value*: the function argument is not evaluated if the corresponding parameter is unused in the evaluation of the function body;