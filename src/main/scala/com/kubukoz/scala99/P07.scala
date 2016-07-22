package com.kubukoz.scala99

import scala.annotation.tailrec

/**
  * P07 (**) Flatten a nested list structure.
  * Example:
  * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  **/
object P07 {
  /**
    * Quite complex with a lot of pattern matching,
    * but it's tail recursive.
    *
    * One of the most important cases is the second one,
    * where we have a list at the beginning, so we basically
    * prepend it (and its tail) to the rest of the long list.
    * Once it's Nil, we discard that list from the beginning (first case).
    *
    * The second important case is the third one, which ensures we have
    * a flat element in front and something afterwards, so it appends that element to mem.
    *
    * The last case simply returns mem, because there are no more elements to be flattened.
    **/
  def flatten(l: List[Any]): List[Any] = {
    @tailrec
    def go(list: List[Any], mem: List[Any]): List[Any] = list match {
      case Nil :: t => go(t, mem)
      case (h :: ht) :: t => go(h :: ht ::: t, mem)
      case h :: t => go(t, h :: mem)
      case Nil => mem
    }

    go(l, Nil).reverse
  }
}
