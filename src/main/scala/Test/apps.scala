package Test

class Ram
{
  def details: Unit =
  {
    val s= " shivam"
    println(" the name which we are going to use is " + s)
  }

}
class Mohan extends Ram
{
  def details2: Unit =
  {
    println(" this code is awesome ")
  }
}
object apps  extends  App{

  val z= new Mohan
  z.details2
  z.details

}
