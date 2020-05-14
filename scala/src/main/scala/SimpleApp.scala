import org.apache.spark.sql.SparkSession

object SimpleApp {
  def main(args: Array[String]) {
      println("\n---------------------hello spark scala----------------------- ")

      val logFile = "/Users/h/Documents/spark/scala/README.md" 
      val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
      val logData = spark.read.textFile(logFile).cache()
      // val numAs = logData.filter(line => line.contains("a")).count()
      // val numBs = logData.filter(line => line.contains("b")).count()
      // println(s"Lines with a: $numAs, Lines with b: $numBs")

      println("---------------------done1-----------------------\n");

  }
}

