//Como Location paso a ser una subclase de Point, ahora esta pasa a ser una Superclass
class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("Point x location : " + x)
    println ("Point y location : " + y)
  }
}
