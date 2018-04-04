
package com.xwolf.s99

/**
  * @author xwolf
  */
object P02{
  /**
    *  获取倒数第二个元素
    *  02. Find the last but one element of a list.
    *  solution:<a href="http://blog.thedigitalcatonline.com/blog/2015/04/07/99-scala-problems-02-find-last-nth/"></a>
    *
    * @param list
    * @return
    */
  def penultimate(list:List[Int]):Int={
    //1.init获取list除最后元素外的其他元素
    //list.init.last
    //2.取右边两个元素的第一个元素
    list.takeRight(2).head
  }
}