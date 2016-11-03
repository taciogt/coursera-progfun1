class Rational(x: Int, y: Int){
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)

  def numer = x / g
  def denom = y / g

  def neg: Rational = new Rational(-numer, denom)

  def add(that: Rational) =
    new Rational(
      numer * that.denom + denom * that.numer,
      denom * that.denom
    )

  def sub(that: Rational) = add(that.neg)

  override def toString = numer + "/" + denom
}

val x = new Rational(1, 2)
x.numer
x.denom
x.neg

val y = new Rational(2, 3)

x.add(y)
x.sub(y)

new Rational(100, 70)