package com.cloudwick.scala

object Day2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(109); 
  for (i <- 1 to 4)
    println("Welcome to the Scala worksheet");$skip(46); 

  // Greatest common Divisor

  var x = 36;System.out.println("""x  : Int = """ + $show(x ));$skip(13); 
  var y = 90;System.out.println("""y  : Int = """ + $show(y ));$skip(64); 
  if (x != 0) {
    val temp = x
    y = y % x
    y = temp
  };$skip(37); 
  println("Common Divisor is :" + y);$skip(75); 

  def maxnum(x: Long, y: Long): Long = {
    if (x > y) x
    else y
  };System.out.println("""maxnum: (x: Long, y: Long)Long""");$skip(26); 

  println(maxnum(8, 6));$skip(97); 

  def commondiv(x: Long, y: Long): Long = {
    if (y == 0) x
    else commondiv(y, x % y)
  };System.out.println("""commondiv: (x: Long, y: Long)Long""");$skip(23); val res$0 = 

  commondiv(80, 100)

  //Scala Everything is an object

  class User {

    var x = 34
    var y = 36
  };System.out.println("""res0: Long = """ + $show(res$0));$skip(110); 
  val obj = new User;System.out.println("""obj  : com.cloudwick.scala.Day2.User = """ + $show(obj ));$skip(13); 
  obj.x = 24;$skip(13); 
  obj.y = 11;$skip(24); 
  println(obj.x, obj.y)

  // Class with constructor

  class User2(inputx: Int, inputy: Int) {
    var x = inputx
    var y = inputy
  };$skip(149); 

  val obj2 = new User2(24, 20);System.out.println("""obj2  : com.cloudwick.scala.Day2.User2 = """ + $show(obj2 ));$skip(26); 
  println(obj2.x, obj2.y)

  //Vector Addition with constructor

  class User3(inputx: Int, inputy: Int) {
    var x = inputx
    var y = inputy

    def vecAddition(newobj: User3): User3 = {

      new User3(x + newobj.x, y + newobj.y)
    }
  };$skip(256); 

  val obj3 = new User3(3, 4);System.out.println("""obj3  : com.cloudwick.scala.Day2.User3 = """ + $show(obj3 ));$skip(29); 
  val obj4 = new User3(4, 7);System.out.println("""obj4  : com.cloudwick.scala.Day2.User3 = """ + $show(obj4 ));$skip(36); 
  val obj5 = obj3.vecAddition(obj4);System.out.println("""obj5  : com.cloudwick.scala.Day2.User3 = """ + $show(obj5 ));$skip(26); 
  println(obj5.x, obj5.y)

  class User4(inputx: Int, inputy: Int) {
    var x = inputx
    var y = inputy
    def +(newobj: User4): User4 = {
      new User4(x + newobj.x, y + newobj.y)
    }
    def -(newobj: User4): User4 = {
      new User4(x + newobj.x, y + newobj.y)
    }

  };$skip(290); 
  val obj7 = new User4(10, 8);System.out.println("""obj7  : com.cloudwick.scala.Day2.User4 = """ + $show(obj7 ));$skip(29); 
  val obj8 = new User4(6, 3);System.out.println("""obj8  : com.cloudwick.scala.Day2.User4 = """ + $show(obj8 ));$skip(25); 
  val obj9 = obj7 + obj8;System.out.println("""obj9  : com.cloudwick.scala.Day2.User4 = """ + $show(obj9 ));$skip(28); 

  println(obj9.x, obj9.y);$skip(26); 
  val obj10 = obj7 - obj8;System.out.println("""obj10  : com.cloudwick.scala.Day2.User4 = """ + $show(obj10 ));$skip(28); 
  println(obj10.x, obj10.y)

  //case Classes

  case class User5(inputx: Int, inputy: Int) {
    def +(newobj: User5) = User5(inputx + newobj.inputx, inputy + newobj.inputy)
    def -(newobj: User5) = User5(inputx - newobj.inputx, inputy - newobj.inputy)
    override def toString = "User object x =" + inputx + ":y:" + inputy
  };$skip(335); 
  val newobj5 = User5(20, 3);System.out.println("""newobj5  : com.cloudwick.scala.Day2.User5 = """ + $show(newobj5 ));$skip(29); 
  val newobj2 = User5(10, 8);System.out.println("""newobj2  : com.cloudwick.scala.Day2.User5 = """ + $show(newobj2 ));$skip(30); 

  val newobj3 = User5(6, 3);System.out.println("""newobj3  : com.cloudwick.scala.Day2.User5 = """ + $show(newobj3 ));$skip(36); 

  val newobj4 = newobj2 - newobj3;System.out.println("""newobj4  : com.cloudwick.scala.Day2.User5 = """ + $show(newobj4 ));$skip(30); val res$1 = 
  newobj5 + newobj2 - newobj3;System.out.println("""res1: com.cloudwick.scala.Day2.User5 = """ + $show(res$1));$skip(221); 

  // Switch case statement
  def decoding(i: Int) {
    i match {
      case 1 => println("One")
      case 2 => println("Two")
      case 3 => println("Three")
      case _ => println("No matching number")
    }

  };System.out.println("""decoding: (i: Int)Unit""");$skip(14); 
  decoding(9);$skip(197); 

  //Another way of Switch case
  def decoding2(i: Int) {
    println(i match {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case _ => "No matching number"
    })
  };System.out.println("""decoding2: (i: Int)Unit""");$skip(15); 
  decoding2(2)}
  
  
}




