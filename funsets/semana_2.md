# Semana 2

### Aula 1: Funções de ordem superior
[higher_order_functions.sc](/funsets/src/main/scala/funsets/higher_orders_funcs.sc)


Funções são cidadãos de primeira classe, significa que podem ser passadas como parâmetros ou retornadas por outra função.

Funções sumInts e sumCubes são formas recursivas de fazer um cálculo parecido: a soma dos inteiros entre a e b, ou a soma do cubo dos inteiros entre a e b.

```scala
def sumInts(a: Int, b: Int): Int =
  if (a > b) 0
  else a + sumInts(a + 1, b)

sumInts(1, 5) // 1 + 2 + 3 + 4 + 5 = 15

// sums cubes of the ints from a to b
def cube(x: Int): Int = x * x * x
cube(2)
cube(3)

def sumCubes(a: Int, b: Int): Int =
  if (a > b) 0
  else cube(a) + sumCubes(a + 1, b)

sumCubes(1, 3) // 1 + 8 + 27 = 36

```

Essa ligeira diferença entre elas pode ser generalizada parametrizando o trecho que as diferencia. Essa generalização lembra, de forma mais simples, o padrão de projeto [template method](https://sourcemaking.com/design_patterns/template_method).

Exemplo:
```scala
def sum(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 0
  else f(a) + sum(f, a + 1, b)
```

Tipos de funções:

**A => B** é o tipo de uma função, que recebe como entrada um parâmetro do tipo A e retorna uma variável do tipo B.

Funções anônimas:

Funções anônimas são "açúcar sintático" para evitar a definição de muitas funções muito simples apenas para serem passadas como parâmetro para outra função;

```scala
(x: Int) => x * x * x
(x: Int, y: Int) => x + y
```


### Aula 2: Currying
TODO: preencher a aula


### Class 3: Finding Fixed Points

[finding_fixed_points.sc](/funsets/src/main/scala/funsets/finding_fixed_points.sc)

x is a fixed point of a function f if ```f(x) = x```

For some functions, we can estimate the fixed points iterating this way:
> x, f(x), f(f(x)), f(f(f(x))), ...

Until the value does not vary or the change is small enough.

We can find this point in a given function _f_ this way:
  
```scala
import math.abs

val tolerance = 0.0001
def isCloseEnough(x: Double, y: Double) =
  abs((x - y) / x) / x < tolerance

def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  def iterate(guess: Double): Double = {
    val next = f(guess)
    if (isCloseEnough(guess, next)) next
    else iterate(next)
  }
  iterate(firstGuess)
}
```

Inspired by this definition of a fixed point, we can give a new specification  for the square root function.
sqrt(x) is the number y such that y * y = x.
sqrt(x) is the number y such that y = x / y.
sqrt(x) is the the fixed point of the function f(y) = x / y

 