package SparkExamples

import scala.io.Source

object ExampleMaps {
  def main(args: Array[String]): Unit = {
    val file  =  Source.fromFile("src/main/Resources/demographic.csv")

    for(line : String <- file.getLines()){
      val column : Array[String] = line.split(";")
        .map(_.trim)                            // .map(_.trim) == .map(p => p.trim)
      println(s"${column(0)} | ${column(1)}")
    }
  }
}
