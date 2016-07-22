package com.kubukoz.scala99

import scala.annotation.tailrec

/**
  * P14 (*) Duplicate the elements of a list.
  * Example:
  * scala> duplicate(List('a, 'b, 'c, 'c, 'd))
  * res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  **/
object P14 {
  /**
    * Typical approach I'd take
    **/
  def duplicate[T](l: List[T]): List[T] = l.flatMap(elem => List(elem, elem))

  /**
    * Something longer, again with pattern matching
    **/
  def duplicateLonger[T](l: List[T]): List[T] = {
    @tailrec
    def go(list: List[T], mem: List[T]): List[T] = list match {
      case h :: t => go(t, h :: h :: mem)
      case Nil => mem
    }

    go(l, Nil).reverse
  }
}
