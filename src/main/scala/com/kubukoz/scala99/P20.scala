package com.kubukoz.scala99

import scala.annotation.tailrec

/**
  * P20 (*) Remove the Kth element from a list.
  * Return the list and the removed element in a Tuple. Elements are numbered from 0.
  * Example:
  * *
  * scala> removeAt(1, List('a, 'b, 'c, 'd))
  * res0: (List[Symbol], Option[Symbol]) = (List('a, 'c, 'd), Some('b))
  **/
object P20 {
  /**
    * I cannot stress enough how I love pattern matching in Scala.
    **/
  def removeAt[T](index: Int, list: List[T]): (List[T], Option[T]) = {
    @tailrec
    def go(l: List[T], i: Int, memLeft: List[T]): (List[T], Option[T]) = (l, i) match {
      case (Nil, _) => (memLeft.reverse, None)
      case (h :: t, 0) => (memLeft.reverse ::: t, Some(h))
      case (h :: t, _) => go(t, i - 1, h :: memLeft)
    }

    go(list, index, Nil)
  }
}