package com.xwolf.s99.test

import com.xwolf.s99.P20
import org.scalatest.FunSuite

class P20Test extends FunSuite{

  test("P20 Rotate a list N places to the left."){
    println(P20.removeAt(List('a','a','b','d','e','d','e'),3))
    println(List('a','a','b','d','e','d','e').drop(2))
    println(List('a','a','b','d','e','d','e').drop(2).tail)
  }



}
