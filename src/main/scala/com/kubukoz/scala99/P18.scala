package com.kubukoz.scala99

import scala.annotation.tailrec

/**
  * P18 (**) Extract a slice from a list.
  * Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
  * Example:
  * *
  * scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g)
  **/
object P18 {
  /**
    * This one was quite a pain.
    * At first I had about 5 cases, but I managed to reduce that to three.
    * In the first `go` call (in `slice`) we make sure start is at least 0.
    *
    * Then, in the first case, we drop the elements that are before `from`, as long as we have a non-empty list.
    * The second case is basically a `take`.
    * The last one catches all non-matching results and returns what we've gathered already.
    *
    * In the end, we reverse the result, as usually.
    **/
  def slice[T](start: Int, end: Int, l: List[T]): List[T] = {
    @tailrec
    def go(from: Int, to: Int, list: List[T], mem: List[T]): List[T] = list match {
      case _ :: t if from > 0 => go(from - 1, to - 1, t, mem)
      case h :: t if to > 0 => go(0, to - 1, t, h :: mem)
      case _ => mem
    }

    go(start max 0, end, l, Nil).reverse
  }
}
