object Day1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val s = "Fremont"                               //> s  : String = Fremont
  val s2 = "fremont"                              //> s2  : String = fremont
  s ==s2                                          //> res0: Boolean = false
  s.toUpperCase()==s2.toUpperCase()               //> res1: Boolean = true
  val data = "I, live,            in, Fremont"    //> data  : String = I, live,            in, Fremont
  data.split(",")                                 //> res2: Array[String] = Array(I, " live", "            in", " Fremont")
  data.split(",").map(_.trim)                     //> res3: Array[String] = Array(I, live, in, Fremont)
  val name = "Rakesh"                             //> name  : String = Rakesh
  println(s"$name lives in $s2")                  //> Rakesh lives in fremont
  val num =30                                     //> num  : Int = 30
  println(s"result is ${num-1}")                  //> result is 29
  println(s"result is equal ${num == 37}")        //> result is equal false
  val data2 = "Hi there".map(c=>c.toUpper)        //> data2  : String = HI THERE
  for(c <-"Newark") println(c)                    //> N
                                                  //| e
                                                  //| w
                                                  //| a
                                                  //| r
                                                  //| k
  //Regular Expression
  val myPattern = "[0-9]+".r                      //> myPattern  : scala.util.matching.Regex = [0-9]+
  val address = "3145 Fremont 94536"              //> address  : String = 3145 Fremont 94536
  val matchingData = myPattern.findFirstIn(address)
                                                  //> matchingData  : Option[String] = Some(3145)
  val allmatches =myPattern.findAllMatchIn(address).toArray
                                                  //> allmatches  : Array[scala.util.matching.Regex.Match] = Array(3145, 94536)
  val allmatches1 =myPattern.findAllIn(address).toArray
                                                  //> allmatches1  : Array[String] = Array(3145, 94536)
  val charData = address.charAt(0)                //> charData  : Char = 3
  val  chardata1 = address(2)                     //> chardata1  : Char = 4
  
  implicit class StringImprovements(s3:String){
   def decrement =s3.map(c=> (c-1).toChar)
   def increment =s3.map(c=> (c+1).toChar)
  }
  val data4 = "DEF".decrement                     //> data4  : String = CDE
  val data5 = "DEF".increment                     //> data5  : String = EFG
 "200".toInt                                      //> res4: Int = 200
 "200".toDouble                                   //> res5: Double = 200.0
 val data7 = 24                                   //> data7  : Int = 24
 val data8 = 24f                                  //> data8  : Float = 24.0
 val data9 = 24d                                  //> data9  : Double = 24.0
  var d7 = 5                                      //> d7  : Int = 5
 d7+=2
 println(d7)                                      //> 7
 var x =16                                        //> x  : Int = 16
 x*=5
 println(x)                                       //> 80
 val datapi = scala.math.Pi                       //> datapi  : Double = 3.141592653589793
  val formatter = java.text.NumberFormat.getIntegerInstance
                                                  //> formatter  : java.text.NumberFormat = java.text.DecimalFormat@674dc
             formatter.format(20000)              //> res6: String = 20,000
             
   val locale = new java.util.Locale("de","DE")   //> locale  : java.util.Locale = de_DE
   var formatter1 = java.text.NumberFormat.getIntegerInstance(locale)
                                                  //> formatter1  : java.text.NumberFormat = java.text.DecimalFormat@674dc
     formatter1.format(20000)                     //> res7: String = 20.000
}