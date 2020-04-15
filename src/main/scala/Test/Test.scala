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
class Exam extends Teacher
{
  def details1: Unit =
  {
    println(" Listening Songs ")
  }
}

object Test extends App{
  val s= new Exam
  s.details
  s.details1

}