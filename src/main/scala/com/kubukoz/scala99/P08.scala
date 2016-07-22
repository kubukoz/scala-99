package com.kubukoz.scala99

import scala.annotation.tailrec

/**
  * P08 (**) Eliminate consecutive duplicates of list elements.
  * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  * Example:
  * *
  * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  **/
object P08 {
  /**
    * Alternative: use .takeWhile on `t` and only have two cases.
    * I used such an approach in [[P09]].
    **/
  def compress[T](l: List[T]): List[T] = {
    @tailrec
    def go(list: List[T], previousOpt: Option[T], mem: List[T]): List[T] = list match {
      case h :: t if previousOpt.contains(h) => go(t, previousOpt, mem)
      case h :: t => go(t, Some(h), h :: mem)
      case Nil => mem
    }

    go(l, None, Nil).reverse
  }
}
