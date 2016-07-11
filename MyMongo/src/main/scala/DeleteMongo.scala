import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.commons.MongoDBObject

/**
  * Created by spide on 2016/7/11.
  */
object DeleteMongo {
  com.mongodb.casbah.commons.conversions.scala.RegisterConversionHelpers()
  private val SERVER = "localhost"
  private val PORT   = 27017
  private val DATABASE = "local"
  private val COLLECTION = "stocks"
  val connection = MongoConnection(SERVER)
  val mongoDB = connection(DATABASE)(COLLECTION)

  def main(args: Array[String]) {
    val query = MongoDBObject("name"->"Zeal")
    val result = mongoDB.findAndRemove(query)
    println("result: " + result)
  }
}
