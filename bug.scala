```scala
class MyClass(val value: Int) {
  def this() = this(0) //this is the default constructor
  def printValue(): Unit = {
    println(value)
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myObj = new MyClass()
    myObj.printValue()
    val myObj2 = new MyClass(5)
    myObj2.printValue()
  }
}
```