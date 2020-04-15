package Test

class Student
{
  val art="shivam"
}
class Teacher extends Student
{
  def details: Unit =
  {
    println(" My name is " + art)
    println(" I am Teacher")
  }

}

object Test extends App{
  val s= new Teacher
  s.details

}
