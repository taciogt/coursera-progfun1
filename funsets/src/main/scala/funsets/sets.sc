import funsets.FunSets._

def predicateSet(p: Int => Boolean): Set = x => p(x)

val pairs = predicateSet(x => x % 2 == 0)
val multiplesOfThree = predicateSet(x => x % 3 == 0)
pairs(0)
pairs(1)
pairs(2)
pairs(3)

val s = intersect(pairs, multiplesOfThree)
s(0)
s(1)
s(2)
s(3)
s(4)
s(5)
s(6)

exists(s, x => x == 6)
forall(pairs, x => x % 2 == 0)
forall(pairs, x => x % 3 == 0)
forall(pairs, x => x % 4 == 0)

forall(s, x => x % 6 == 0)

val s2 = map(pairs, x => x * 2)
forall(s2, x => x % 4 == 0)