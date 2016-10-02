// Higher order functions

// sums ints from a to b
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

// generalizes the functions above into one single function
def sum(f: Int => Int, a: Int, b: Int): Int =
if (a > b) 0
else f(a) + sum(f, a + 1, b)

// new sumInts
def id(x: Int): Int = x
sum(id, 1, 5)
def sumInts2(a: Int, b: Int): Int = sum(id, a, b)
sumInts2(1, 5)
// new sumCubes
sum(cube, 1, 3)
def sumCubes2(a: Int, b: Int): Int = sum(cube, a, b)
sumCubes2(1, 3)




// exercises
// productFunction
def prodInts(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 1
  else f(a) * prodInts(f, a + 1, b)

// factorial defined from productFunction
def factorial(a: Int, b: Int): Int = prodInts(id, a, b)

factorial(1, 4) // 1 * 2 * 3 * 4 = 24

// tail recursion version of sumInts:
def sumTail(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, acc + f(a))
  }
  loop(a, 0)
}

sumTail(id)(1, 5) // 1 + 2 + 3 + 4 + 5 = 15

