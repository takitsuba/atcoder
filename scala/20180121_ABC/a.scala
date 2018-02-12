import scala.io.StdIn
object Main extends App {
  var numList = StdIn.readLine.split(" ")
  var a = numList(0).toInt
  var b = numList(1).toInt
  var isEven = (a * b) % 2 == 0
 
  if (isEven) {
    print("Even")
  } else {
    print("Odd")
  }
}
