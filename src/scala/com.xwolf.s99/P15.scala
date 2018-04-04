package com.xwolf.s99

/**
  * @author xwolf
  **/
object P15 {

  /**
    * 所有元素重复指定次数返回新的List
    * P15 (**) Duplicate the elements of a list a given number of times.
    * Example:
    * scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    * res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    * @param count
    * @param list
    * @tparam A
    * @return
    */
  def duplicateN[A] (count:Int,list:List[A]):List[A] ={
    list.flatMap( m => List.fill(count)(m))
  }
}
