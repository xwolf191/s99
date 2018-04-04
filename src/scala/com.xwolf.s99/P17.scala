package com.xwolf.s99

/**
  * @author xwolf
  */
object P17 {

  /**
    *P17 (*) Split a list into two parts.
    * The length of the first part is given. Use a Tuple for your result.
    * Example:
    * scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    * res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    * @param a
    * @param b
    * @tparam A
    * @return
    */
  def slice[A] (a:Int,b:List[A]):(List[A],List[A]) = (b.take(a),b.drop(a))

}
