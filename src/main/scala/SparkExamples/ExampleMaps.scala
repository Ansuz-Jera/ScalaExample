package SparkExamples

import scala.io.Source

object ExampleMaps {
  def main(args: Array[String]): Unit = {
    val file  =  Source.fromFile("src/main/Resources/demographic.csv")

    val listOne : Vector[Int] = Vector(1, 2, 3, 5, 7, 11, 13)
    println(listOne.map(x => x + 2))  //.map recorre todos los elementos y ejecuta la función especificada

    val myMap : Map[Int, String] = Map(1 -> "Tom", 2 -> "Max", 3 -> "John")
    println(".mapValues[C](f: B => C): Map[A, C]")
    println(myMap.mapValues(x => "hi" + x)) //.mapValues hace lo mismo que map, pero solo a los valores

    println(" .map(_.toUpper))")
    println("hello".map(_.toUpper))

    println("Vector(vector[A],vector[B]).flatten")
    println(Vector(Vector(1,2,3), Vector(3,4,5)).flatten) //Une las dos listas en uno solo

    println(listOne.flatMap(x => List(x, x + 1))) //flatMap ejecuja un map y al mismo tiempo un flatten


    for(line : String <- file.getLines()){
      val column : Array[String] = line.split(";")
        .map(_.trim)                            // .map(_.trim) == .map(p => p.trim)
      println(s"${column(0)} | ${column(1)}")
    }
  }
}
