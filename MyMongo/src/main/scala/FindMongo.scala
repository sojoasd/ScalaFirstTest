import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.commons.MongoDBObject

/**
  * Created by spide on 2016/7/10.
  */
object FindMongo {
  com.mongodb.casbah.commons.conversions.scala.RegisterConversionHelpers()
  private val SERVER = "localhost"
  private val PORT   = 27017
  private val DATABASE = "local"
  private val COLLECTION = "stocks"
  val connection = MongoConnection(SERVER)
  val mongoDB = connection(DATABASE)(COLLECTION)

  def main(args: Array[String]) {
    val q  = MongoDBObject.empty
    val fields = MongoDBObject()
    for (x <- mongoDB.find()) println(x)
  }
}
