package com.xwolf.s99

/**
  * @author xwolf
  * @since 1.8
  */
object P06 {

  /**
    * 1.回文
    * P06 (*) Find out whether a list is a palindrome.
    * @param list
    * @return
    */
  def  isPalindrome01(list:List[Int]):Boolean=list match {
    case null => false
    case y => {
      val length = y.length
      list.take(length/2) == list.takeRight(length/2).reverse
    }
  }

  /**
    * 2.回文
    * @param list
    * @return
    */
  def  isPalindrome02(list:List[Int]):Boolean= list == list.reverse
}
