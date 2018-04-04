package com.xwolf.s99.test

import com.xwolf.s99.P08
import org.scalatest.FunSuite

class P08Test extends FunSuite{

  test("P08 Eliminate consecutive duplicates of list elements."){
    println(P08.compress02(List('a','a','a','b','c','c','a','a')))

    println((1 to 10).toList.foldLeft(10)(_+_))
    println((1 to 10).toList.foldLeft(1)((a,b) => {println((a,b)); a+b}))
  }

}
