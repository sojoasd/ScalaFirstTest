/**
  * Created by spide on 2016/7/10.
  */
import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.commons.MongoDBObject


object InsertMongo {
  private val SERVER = "localhost"
  private val PORT   = 27017
  private val DATABASE = "local"
  private val COLLECTION = "stocks"
  val connection = MongoConnection(SERVER)
  val mongoDB = connection(DATABASE)(COLLECTION)

  def main(args: Array[String]): Unit = {

    val builder = MongoDBObject.newBuilder
    builder += "name" -> "Zeal"
    builder += ("age" -> 15)
    builder += "birthdate" -> "May 26, 1988"

    val newObj = builder.result
    mongoDB.insert(newObj)
  }
}
