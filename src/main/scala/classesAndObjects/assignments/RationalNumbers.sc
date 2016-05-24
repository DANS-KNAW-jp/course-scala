import scala.annotation.tailrec

case class Rational(num: Int, den: Int) {

  if (den == 0) throw new Exception("denominator should not be zero")

  @tailrec
  private def gcd(n: Int, d: Int): Int = {
    val mod = n % d
    if (mod == 0) d else gcd(d, mod)
  }

  def this(num: Int) = this(num, 1)

  private val gcdVal = gcd(num, den)
  val numerator = num / gcdVal
  val denominator = den / gcdVal

  override def toString =
    if (denominator == 1) numerator.toString
    else s"$numerator/$denominator"

  def eq(r: Rational): Boolean = {
    this.numerator == r.numerator && this.denominator == r.denominator
  }
}

object Rational {
  def apply(num: Int): Rational = {
    Rational(num, 1)
  }
}
Rational(48, 18)
Rational(48)
new Rational(18)
Rational(24, 9)

Rational(48, 18).eq(Rational(24, 9))
Rational(48, 18) == Rational(24, 9)

Rational(1, 0)



// 2. depends on point of view, for users object-apply is shorter
//    having both causes "needs result type" at runtime
//    making apply even longer
// 9. ???
