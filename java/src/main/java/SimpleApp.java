import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;

public class SimpleApp {
  public static void main(String[] args) {
    System.out.println("\n---------------------hello spark----------------------- ");

    //String logFile = "/usr/local/README.md"; // Should be some file on your system
    String logFile = "/Users/h/Documents/spark/java/README.md"; // Should be some file on your system


    SparkSession spark = SparkSession.builder().appName("Simple Application").getOrCreate();
    Dataset<String> logData = spark.read().textFile(logFile).cache();

    //long numAs = logData.filter(s -> s.contains("a")).count();
    // long numBs = logData.filter(s -> s.contains("b")).count();

    // System.out.println("Lines with a: " + numAs + ", lines with b: " + numBs);

    // spark.stop();

    System.out.println("---------------------done-----------------------\n");

  }
}
