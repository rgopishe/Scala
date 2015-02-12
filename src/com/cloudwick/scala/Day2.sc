package com.cloudwick.scala

object Day2 {
  for (i <- 1 to 4)
    println("Welcome to the Scala worksheet")     //> Welcome to the Scala worksheet
                                                  //| Welcome to the Scala worksheet
                                                  //| Welcome to the Scala worksheet
                                                  //| Welcome to the Scala worksheet

  // Greatest common Divisor

  var x = 36                                      //> x  : Int = 36
  var y = 90                                      //> y  : Int = 90
  if (x != 0) {
    val temp = x
    y = y % x
    y = temp
  }
  println("Common Divisor is :" + y)              //> Common Divisor is :36

  def maxnum(x: Long, y: Long): Long = {
    if (x > y) x
    else y
  }                                               //> maxnum: (x: Long, y: Long)Long

  println(maxnum(8, 6))                           //> 8

  def commondiv(x: Long, y: Long): Long = {
    if (y == 0) x
    else commondiv(y, x % y)
  }                                               //> commondiv: (x: Long, y: Long)Long

  commondiv(80, 100)                              //> res0: Long = 20

  //Scala Everything is an object

  class User {

    var x = 34
    var y = 36
  }
  val obj = new User                              //> obj  : com.cloudwick.scala.Day2.User = com.cloudwick.scala.Day2$$anonfun$mai
                                                  //| n$1$User$1@736e788c
  obj.x = 24
  obj.y = 11
  println(obj.x, obj.y)                           //> (24,11)

  // Class with constructor

  class User2(inputx: Int, inputy: Int) {
    var x = inputx
    var y = inputy
  }

  val obj2 = new User2(24, 20)                    //> obj2  : com.cloudwick.scala.Day2.User2 = com.cloudwick.scala.Day2$$anonfun$m
                                                  //| ain$1$User2$1@1dbcf620
  println(obj2.x, obj2.y)                         //> (24,20)

  //Vector Addition with constructor

  class User3(inputx: Int, inputy: Int) {
    var x = inputx
    var y = inputy

    def vecAddition(newobj: User3): User3 = {

      new User3(x + newobj.x, y + newobj.y)
    }
  }

  val obj3 = new User3(3, 4)                      //> obj3  : com.cloudwick.scala.Day2.User3 = com.cloudwick.scala.Day2$$anonfun$
                                                  //| main$1$User3$1@31e28608
  val obj4 = new User3(4, 7)                      //> obj4  : com.cloudwick.scala.Day2.User3 = com.cloudwick.scala.Day2$$anonfun$
                                                  //| main$1$User3$1@ecd90ce
  val obj5 = obj3.vecAddition(obj4)               //> obj5  : com.cloudwick.scala.Day2.User3 = com.cloudwick.scala.Day2$$anonfun$
                                                  //| main$1$User3$1@59ddcbf9
  println(obj5.x, obj5.y)                         //> (7,11)

  class User4(inputx: Int, inputy: Int) {
    var x = inputx
    var y = inputy
    def +(newobj: User4): User4 = {
      new User4(x + newobj.x, y + newobj.y)
    }
    def -(newobj: User4): User4 = {
      new User4(x + newobj.x, y + newobj.y)
    }

  }
  val obj7 = new User4(10, 8)                     //> obj7  : com.cloudwick.scala.Day2.User4 = com.cloudwick.scala.Day2$$anonfun$
                                                  //| main$1$User4$1@77fb911a
  val obj8 = new User4(6, 3)                      //> obj8  : com.cloudwick.scala.Day2.User4 = com.cloudwick.scala.Day2$$anonfun$
                                                  //| main$1$User4$1@24f37f80
  val obj9 = obj7 + obj8                          //> obj9  : com.cloudwick.scala.Day2.User4 = com.cloudwick.scala.Day2$$anonfun$
                                                  //| main$1$User4$1@6e37bf73

  println(obj9.x, obj9.y)                         //> (16,11)
  val obj10 = obj7 - obj8                         //> obj10  : com.cloudwick.scala.Day2.User4 = com.cloudwick.scala.Day2$$anonfun
                                                  //| $main$1$User4$1@dfa4f8d
  println(obj10.x, obj10.y)                       //> (16,11)

  //case Classes

  case class User5(inputx: Int, inputy: Int) {
    def +(newobj: User5) = User5(inputx + newobj.inputx, inputy + newobj.inputy)
    def -(newobj: User5) = User5(inputx - newobj.inputx, inputy - newobj.inputy)
    override def toString = "User object x =" + inputx + ":y:" + inputy
  }
  val newobj5 = User5(20, 3)                      //> newobj5  : com.cloudwick.scala.Day2.User5 = User object x =20:y:3
  val newobj2 = User5(10, 8)                      //> newobj2  : com.cloudwick.scala.Day2.User5 = User object x =10:y:8

  val newobj3 = User5(6, 3)                       //> newobj3  : com.cloudwick.scala.Day2.User5 = User object x =6:y:3

  val newobj4 = newobj2 - newobj3                 //> newobj4  : com.cloudwick.scala.Day2.User5 = User object x =4:y:5
  newobj5 + newobj2 - newobj3                     //> res1: com.cloudwick.scala.Day2.User5 = User object x =24:y:8

  // Switch case statement
  def decoding(i: Int) {
    i match {
      case 1 => println("One")
      case 2 => println("Two")
      case 3 => println("Three")
      case _ => println("No matching number")
    }

  }                                               //> decoding: (i: Int)Unit
  decoding(9)                                     //> No matching number

  //Another way of Switch case
  def decoding2(i: Int) {
    println(i match {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case _ => "No matching number"
    })
  }                                               //> decoding2: (i: Int)Unit
  decoding2(2)                                    //> Two
  
  
}




