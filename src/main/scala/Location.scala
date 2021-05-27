/*
  Location hereda todos los miembros no privados de la clase Point, y se convierte en una Subclass
Originalmente en la documentacion dice que se debe sobreescribir los valores de la Superclass, pero
en este caso resultaba en un error al no sobreescribir ningún valor

 */

//class Location(override val xc: Int,override val yc: Int, val zc :Int) extends Point(xc, yc){

class Location( val xc: Int,  val yc: Int, val zc :Int) extends Point(xc, yc){
    var z: Int = zc

    def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("Point x location : " + x)
      println ("Point y location : " + y)
      println ("Point z location : " + z)
    }
  }
