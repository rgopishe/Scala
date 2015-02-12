object Day1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(20); 
  val s = "Fremont";System.out.println("""s  : String = """ + $show(s ));$skip(21); 
  val s2 = "fremont";System.out.println("""s2  : String = """ + $show(s2 ));$skip(9); val res$0 = 
  s ==s2;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(36); val res$1 = 
  s.toUpperCase()==s2.toUpperCase();System.out.println("""res1: Boolean = """ + $show(res$1));$skip(47); 
  val data = "I, live,            in, Fremont";System.out.println("""data  : String = """ + $show(data ));$skip(18); val res$2 = 
  data.split(",");System.out.println("""res2: Array[String] = """ + $show(res$2));$skip(30); val res$3 = 
  data.split(",").map(_.trim);System.out.println("""res3: Array[String] = """ + $show(res$3));$skip(22); 
  val name = "Rakesh";System.out.println("""name  : String = """ + $show(name ));$skip(33); 
  println(s"$name lives in $s2");$skip(14); 
  val num =30;System.out.println("""num  : Int = """ + $show(num ));$skip(33); 
  println(s"result is ${num-1}");$skip(43); 
  println(s"result is equal ${num == 37}");$skip(43); 
  val data2 = "Hi there".map(c=>c.toUpper);System.out.println("""data2  : String = """ + $show(data2 ));$skip(31); 
  for(c <-"Newark") println(c);$skip(52); 
  //Regular Expression
  val myPattern = "[0-9]+".r;System.out.println("""myPattern  : scala.util.matching.Regex = """ + $show(myPattern ));$skip(37); 
  val address = "3145 Fremont 94536";System.out.println("""address  : String = """ + $show(address ));$skip(52); 
  val matchingData = myPattern.findFirstIn(address);System.out.println("""matchingData  : Option[String] = """ + $show(matchingData ));$skip(60); 
  val allmatches =myPattern.findAllMatchIn(address).toArray;System.out.println("""allmatches  : Array[scala.util.matching.Regex.Match] = """ + $show(allmatches ));$skip(56); 
  val allmatches1 =myPattern.findAllIn(address).toArray;System.out.println("""allmatches1  : Array[String] = """ + $show(allmatches1 ));$skip(35); 
  val charData = address.charAt(0);System.out.println("""charData  : Char = """ + $show(charData ));$skip(30); 
  val  chardata1 = address(2)
  
  implicit class StringImprovements(s3:String){
   def decrement =s3.map(c=> (c-1).toChar)
   def increment =s3.map(c=> (c+1).toChar)
  };System.out.println("""chardata1  : Char = """ + $show(chardata1 ));$skip(171); 
  val data4 = "DEF".decrement;System.out.println("""data4  : String = """ + $show(data4 ));$skip(30); 
  val data5 = "DEF".increment;System.out.println("""data5  : String = """ + $show(data5 ));$skip(13); val res$4 = 
 "200".toInt;System.out.println("""res4: Int = """ + $show(res$4));$skip(16); val res$5 = 
 "200".toDouble;System.out.println("""res5: Double = """ + $show(res$5));$skip(16); 
 val data7 = 24;System.out.println("""data7  : Int = """ + $show(data7 ));$skip(17); 
 val data8 = 24f;System.out.println("""data8  : Float = """ + $show(data8 ));$skip(17); 
 val data9 = 24d;System.out.println("""data9  : Double = """ + $show(data9 ));$skip(13); 
  var d7 = 5;System.out.println("""d7  : Int = """ + $show(d7 ));$skip(7); 
 d7+=2;$skip(13); 
 println(d7);$skip(11); 
 var x =16;System.out.println("""x  : Int = """ + $show(x ));$skip(6); 
 x*=5;$skip(12); 
 println(x);$skip(28); 
 val datapi = scala.math.Pi;System.out.println("""datapi  : Double = """ + $show(datapi ));$skip(60); 
  val formatter = java.text.NumberFormat.getIntegerInstance;System.out.println("""formatter  : java.text.NumberFormat = """ + $show(formatter ));$skip(37); val res$6 = 
             formatter.format(20000);System.out.println("""res6: String = """ + $show(res$6));$skip(62); 
             
   val locale = new java.util.Locale("de","DE");System.out.println("""locale  : java.util.Locale = """ + $show(locale ));$skip(70); 
   var formatter1 = java.text.NumberFormat.getIntegerInstance(locale);System.out.println("""formatter1  : java.text.NumberFormat = """ + $show(formatter1 ));$skip(30); val res$7 = 
     formatter1.format(20000);System.out.println("""res7: String = """ + $show(res$7))}
}
