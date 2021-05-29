package SparkExamples


import org.apache.log4j.{Level, Logger}
import org.apache.spark.rdd.RDD
import org.apache.spark.{SPARK_BRANCH, SparkContext}


object CreateRDDExample{
  def main(args: Array[String]): Unit = {
    System.setProperty("hadoop.home.dir", "C:\\hadoop")
    Logger.getRootLogger.setLevel(Level.INFO)
    val sc = new SparkContext("local[*]" , "StructureOptimization")

    val rdd: RDD[String]= sc.textFile("src/main/Resources/demographic.csv")
    val rdd2 : RDD[String] = rdd.flatMap(f => f.split(";"))

    val count = rdd.map(_ + 1)

    count.foreach(println(_))

  }
}