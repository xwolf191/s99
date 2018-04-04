package com.xwolf.s99

/**
  * @author xwolf
  */
object P14 {

  /**
    * 重复各个元素转化为新的List
    * P14 (*) Duplicate the elements of a list.
     * Example:
     * scala> duplicate(List('a, 'b, 'c, 'c, 'd))
     * res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    * @param a
    * @return
    */
  def duplicate(a:List[Char]):List[Char] = a.flatMap(m => List(m,m))

}
