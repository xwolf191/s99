package com.xwolf.s99

/**
  * @author xwolf
  */

object P08 {

  /**
    * P08(**) Eliminate consecutive duplicates of list elements.
    * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
    * Example:
    * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
    * @param a
    * @return
    */
  def compress[A](a:List[A]):List[A]= a match {
    case Nil => Nil
    case h::List() => List(h)
    case h::tail if (h == tail.head) => compress(tail)
    case h::tail =>  h :: compress(tail)
  }

  def compress02[A] (a:List[A]):List[A]= a./:(List[A]()){
    case (List(), e) =>  List(e)
    case (ls, e) if (ls.last == e) => ls
    case (ls, e) => ls ::: List(e)
  }


}
