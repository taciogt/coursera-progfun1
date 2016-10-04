def sum(f: Int => Int): (Int, Int) => Int = {
  def sumF(a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sumF(a + 1, b)
  sumF
}
sum(x => x)(1,5)
val sumInts = sum(x => x)
sumInts(1,6)
sum(x => x * x)(1,5)

// Função produto definida de forma semelhando à função soma
def product(f: Int => Int): (Int, Int) => Int = {
  def productF(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * productF(a + 1, b)
  productF
}

product(x => x)(1,3)
product(x => x)(1,5)

// Função fatorial definida a partir da função produto
def factorial(n: Int) = product(x => x)(1, n)

factorial(2)
factorial(5)

// Combinação das funções soma e produto
def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
  if (a > b) zero
  else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
}

// Função produto definida a partir da mapReduce
def product2(f: Int => Int, a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)
product2(x => x, 1, 5)