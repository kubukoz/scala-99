package com.kubukoz.scala99

/**
  * P13 (**) Run-length encoding of a list (direct solution).
  * Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.
  * Example:
  * *
  * scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  *
  **/
object P13 {
  /**
    * This is starting to get repetitive.mi
    **/
  def encodeDirect[T](l: List[T]): List[(Int, T)] = {
    def go(list: List[T], mem: List[(Int, T)]): List[(Int, T)] = list match {
      case h :: t =>
        val (same, others) = t.span(_ == h)

        go(others, (same.length + 1, h) :: mem)
      case Nil => mem
    }

    go(l, Nil).reverse
  }
}
