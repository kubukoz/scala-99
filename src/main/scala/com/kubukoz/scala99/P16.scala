package com.kubukoz.scala99

import scala.annotation.tailrec

/**
  * P16 (**) Drop every Nth element from a list.
  * Example:
  * scala> dropN(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  **/
object P16 {
  /**
    * Typical approach.
    **/
  def dropN[T](n: Int, l: List[T]): List[T] = l.indices.filterNot(i => (i + 1) % n == 0).map(l).toList

  /**
    * Significantly better performance.
    **/
  def dropNLonger[T](n: Int, l: List[T]): List[T] = {
    @tailrec
    def go(currentN: Int, list: List[T], mem: List[T]): List[T] = (currentN, list) match {
      case (1, h :: t) => go(n, t, mem)
      case (_, h :: t) => go(currentN - 1, t, h :: mem)
      case (_, Nil) => mem
    }

    go(n, l, Nil).reverse
  }
}
