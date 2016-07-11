import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.commons.MongoDBObject

/**
  * Created by spide on 2016/7/11.
  */

object UpdateMongo {
  com.mongodb.casbah.commons.conversions.scala.RegisterConversionHelpers()
  private val SERVER = "localhost"
  private val PORT   = 27017
  private val DATABASE = "local"
  private val COLLECTION = "stocks"
  val connection = MongoConnection(SERVER)
  val mongoDB = connection(DATABASE)(COLLECTION)

  def main(args: Array[String]) {
    val query = MongoDBObject("name"->"Zeal")
    val update = MongoDBObject("name"->"Zeal", "age" -> 29, "birthdate"->"May 26, 1988")
    mongoDB.update( query, update )
  }
}
