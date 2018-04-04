package com.xwolf.s99

/**
  *@author xwolf
  *@see List
  **/
object P16 {
  /**
    * P16 (**) Drop every Nth element from a list.
    * Example:
    * scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    * res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    * @param a
    * @param b
    * @return
    */
  def  drop[A] (a:Int,b:List[A]):List[A]={
    b.grouped(a).flatMap(_.take(a-1)).toList
  }
}
