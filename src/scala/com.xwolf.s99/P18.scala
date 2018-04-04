package com.xwolf.s99

/**
  * @author xwolf
  */
object P18 {

  /**
    *
    * @param a
    * @param b
    * @param c
    * @tparam A
    * @return
    */
  def split[A] (a:Int,b:Int,c:List[A]):List[A] = {
    c.splitAt(a-1)._2.splitAt(b-a+1)._1
  }

}
