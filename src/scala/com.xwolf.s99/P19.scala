package com.xwolf.s99

/**
  * @author xwolf
  *
  */
object P19 {

  /**
    * P19 (**) Rotate a list N places to the left.
    * Examples:
    * scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    * scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    * res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    */
  def rotate[A] (a:List[A],b:Int):List[A]={
    if( b >= 0) {
      a.takeRight(a.length-b) ::: a.take(b)
    } else {
      a.takeRight(-b) ::: a.take(a.length+b)
    }

  }

}
