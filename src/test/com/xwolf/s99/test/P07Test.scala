package com.xwolf.s99.test

import com.xwolf.s99.P07
import org.scalatest.FunSuite

class P07Test extends FunSuite{

  test("P07 Flatten a nested list structure."){
    println(P07.flatten(List(1,4,List(33,List(4,5,4)))))
  }

  test("List map test"){
    val list = List(4,3,5,List(4,9))
    val b = list.map(m => List(m))
    println(b)
    val  a = list.flatMap(m => List(m))
    println(a)

  }

}
