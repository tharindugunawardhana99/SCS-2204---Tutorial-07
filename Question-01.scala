object Q1 extends App{
  //create a variable of Rational data type
  val r1 = new Rational(3,7)
  println(r1)
  //get negative
  println("Negative value of the rational number : " + r1.neg)

}

//Define Rational data type
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
