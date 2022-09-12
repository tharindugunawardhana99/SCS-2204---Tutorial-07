object Q2 extends App{
  //create objects
  val r1 = new Rational(3,4)
  val r2 = new Rational(5,8)
  val r3 = new Rational(2,7)
  println(" r1-r2-r3 : " + (r1-r2-r3))
}


class Rational(n:Int, d:Int){
  def numer = n
  def denom = d

  //function for get negative Rational number
  def neg = new Rational(-this.numer, this.denom)
  //function for add two rational numbrt
  def +(that:Rational) = new Rational(this.numer * that.denom + this.denom * that.numer, this.denom * that.denom)
  //function for subtract
  def -(that:Rational) = this + that.neg
  //print the string
  override def toString = numer + "/" + denom
}