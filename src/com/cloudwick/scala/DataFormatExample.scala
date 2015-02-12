package com.cloudwick.scala

//import java.util.Date
//import java.util.Locale
/* U can import in single line*/

import java.util.{Date,Locale}

import java.text.DateFormat._

object DataFormatExample {
def main(args : Array[String]){
  val now = new Date()
  val df = getDateInstance(LONG,Locale.FRANCE)
  println(df format now )  //This is called infix parameter and it also can be written as df.format(now)
  
}
}