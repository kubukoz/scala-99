package com.kubukoz.scala99

/**
  * P21 (*) Insert an element at a given position into a list.
  * Example:
  * scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
  * res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  **/
object P21 {

  /**
    * This one was quite a tough guy, but I finally realised that
    * the memory list (memLeft) should be reversed
    * every time it's returned itself or with other elements. That's it!
    **/
  def insertAt[T](item: T, index: Int, list: List[T]): List[T] = {
    def go(i: Int, l: List[T], memLeft: List[T]): List[T] = (i, l) match {
      case _ if i <= 0 => memLeft.reverse ::: (item :: l)
      case (_, Nil) => (item :: memLeft).reverse
      case (_, h :: t) => go(i - 1, t, h :: memLeft)
    }

    go(index, list, Nil)
  }
}
