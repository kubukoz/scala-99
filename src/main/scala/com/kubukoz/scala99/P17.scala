package com.kubukoz.scala99

import scala.annotation.tailrec

/**
  * P17 (*) Split a list into two parts.
  * The length of the first part is given. Use a Tuple for your result.
  * Example:
  * *
  * scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  **/
object P17 {
  /**
    * Pattern matching all the way.
    *
    * Basically when we don't need to go through `go` again,
    * we can just return what we've gathered already and the remaining elements intact.
    **/
  def split[T](n: Int, l: List[T]): (List[T], List[T]) = {
    @tailrec
    def go(left: Int, remaining: List[T], mem: List[T]): (List[T], List[T]) = remaining match {
      case _ if left < 1 => (mem.reverse, remaining)
      case Nil => (mem.reverse, Nil)
      case h :: t => go(left - 1, t, h :: mem)
    }

    go(n, l, Nil)
  }
}
