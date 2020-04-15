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
class door extends Exam
{
  def details2: Unit =
  {
    print(" this is door ")
  }
}
object mos extends App{
  val s= new door
  s.details
  s.details1
  s.details2
}