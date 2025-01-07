```scala
class MyClass(val value: Int) {
  def printValue(): Unit = {
    println(value)
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myObj = new MyClass(0) //Explicitly set value to 0 for clarity
    myObj.printValue()
    val myObj2 = new MyClass(5)
    myObj2.printValue() 
  }
}
```