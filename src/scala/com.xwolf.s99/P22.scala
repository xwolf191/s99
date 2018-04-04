package com.xwolf.s99

/**
  * @author xwolf
  */
object P22 {

  /**
    *P22 (*) Create a list containing all integers within a given range.
    * Example:
    * scala> range(4, 9)
    * res0: List[Int] = List(4, 5, 6, 7, 8, 9)
    * @param a
    * @param b
    * @return
    */
  def range (a:Int,b:Int):List[Int] = (a to b).toList

}
