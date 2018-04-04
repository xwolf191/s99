package com.xwolf.s99

/**
  * @author xwolf
  */
object P09 {

  /**
    * P09 (**) Pack consecutive duplicates of list elements into sublists.
    * If a list contains repeated elements they should be placed in separate sublists.
    * Example:
    * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    * @param a
    * @tparam A
    * @return
    */
  def pack[A] (a:List[A]) :List[List[A]] ={

    def _pack(res: List[List[A]], rem: List[A]):List[List[A]] = rem match {
      case Nil => res
      case h::tail if (res.isEmpty || res.last.head != h) => _pack(res:::List(List(h)), tail)
      case h::tail => _pack(res.init:::List(res.last:::List(h)), tail)
    }
    _pack(List(),a)

  }

}
