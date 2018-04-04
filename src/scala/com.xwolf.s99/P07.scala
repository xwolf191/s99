package com.xwolf.s99

/**
  * @author xwolf
  */
object P07 {
  /**
    * P07 (**) Flatten a nested list structure.
    * Example:
    * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
    * @param a
    * @return
    */
   def flatten(a:List[Any]):List[Any]= a flatMap {
     case ls: List[_] => flatten(ls)
     case h => List(h)
   }
}
