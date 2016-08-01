package com.kubukoz.scala99

import scala.annotation.tailrec

object P17 {
  /**
    * Pattern matching all the way.
    *
    * Basically when we don't need to go through `go` again,
    * we can just return what we've gathered already and the remaining elements intact.
    **/
  def split[T](n: Int, l: List[T]): (List[T], List[T]) = {
    @tailrec
    def go(left: Int, remaining: List[T], mem: List[T]): (List[T], List[T]) = (left, remaining) match {
      case (_, _) if left <= 0 || remaining.isEmpty => (mem.reverse, remaining)
      case (_, h :: t) => go(left - 1, t, h :: mem)
    }

    go(n, l, Nil)
  }
}
