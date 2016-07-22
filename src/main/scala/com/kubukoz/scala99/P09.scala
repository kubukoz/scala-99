package com.kubukoz.scala99

import scala.annotation.tailrec

/**
  * P09 (**) Pack consecutive duplicates of list elements into sublists.
  * If a list contains repeated elements they should be placed in separate sublists.
  * Example:
  * *
  * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  *
  **/
object P09 {
  /**
    * This time we're not having an Option, because we can use a builtin (span / dropWhile)
    **/
  def pack[T](l: List[T]): List[List[T]] = {

    @tailrec
    def go(list: List[T], mem: List[List[T]]): List[List[T]] = list match {
      case h :: t =>
        val (same, others) = t.span(_ == h)
        go(others, (h :: same) :: mem)
      case Nil => mem
    }

    go(l, Nil).reverse
  }
}
