package ClassesExamples

//Como ClassesExamples.Location paso a ser una subclase de ClassesExamples.Point, ahora esta pasa a ser una Superclass
class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("ClassesExamples.Point x location : " + x)
    println ("ClassesExamples.Point y location : " + y)
  }
}
