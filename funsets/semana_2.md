# Semana 2

### Aula 1: Funções de ordem superior
[higher_order_functions.sc](/funsets/src/main/scala/funsets/higher_orders_funcs.sc)


Funções são cidadãos de primeira classe, significa que podem ser passadas como parâmetros ou retornadas por outra função.

Funções sumInts e sumCubes são formas recursivas de fazer um cálculo parecido.

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

Essa ligeira diferença entre elas pode ser generalizada parametrizando o trecho que as difenrencia. (Strategy?) 

Exemplo:


## Aula 2: 

