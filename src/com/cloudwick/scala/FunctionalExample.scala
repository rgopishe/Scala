package com.cloudwick.scala

import javax.security.auth.callback.Callback

object FunctionalExample {
  def main(args: Array[String]) {
    recursiveCall(printName)

  }
  def printName() {
    println("Rakesh")
  }
  def recursiveCall(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }

  }

}