package com.xwolf.s99

/**
  * @author xwolf
  */
object P21 {

  /**
    * P21 (*) Insert an element at a given position into a list.
    * Example:
    * scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
    * res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
    * @param a
    * @param b
    * @param c
    * @tparam A
    * @return
    */
  def insertAt [A] (a:A,b:Int,c:List[A]):List[A] = (c.take(b) :+ a) ::: c.drop(b)

}
