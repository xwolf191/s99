package com.xwolf.s99

/**
  * @author xwolf
  */
object P20 {
  /**
    * P20 (*) Remove the Kth element from a list.
    * Return the list and the removed element in a Tuple. Elements are numbered from 0.
    *  Example:
    * scala> removeAt(1, List('a, 'b, 'c, 'd))
    * res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
    * @param a
    * @param b
    * @tparam A
    * @return
    */
  def removeAt[A] (a:List[A],b:Int):(List[A],A)= {
    if ( b > a.length ) throw new IllegalArgumentException
    (a.take(b) ::: a.drop(b).tail ,a(b))
  }


}
