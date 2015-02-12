package com.cloudwick.scala

object Absolute {

  def main(args: Array[String]) {
    println(abs(5))
     println(formatresult("Absolute", -48, abs))
  }

  def abs(x: Int): Int = {
    if (x > 0) x
    else (x * (-1))

  }
  def formatresult(name: String, num: Int,func: Int => Int)= {
    val msg = "The %s value of %d is %d"
    msg.format(name, num, func(num))

  }

}