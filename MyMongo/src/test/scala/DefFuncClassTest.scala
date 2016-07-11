import org.scalatest.FunSuite

/**
  * Created by spide on 2016/7/10.
  */
class DefFuncClassTest extends FunSuite {

  test("testAddNum") {
    val obj = new DefFuncClass
    var sum = obj.AddNum(11,22)
    if(sum === 2){
      info("it is correct")
    }else{
      info("it is error")
    }
  }

}
