package com.kubukoz.scala99

/**
  * P19 (**) Rotate a list N places to the left.
  * Examples:
  * scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  * *
  * scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  **/
object P19 {
  /**
    * I'm glad I managed to avoid pattern matching this time
    * and use a built-in I've implemented already (splitAt).
    *
    * The task basically consists of splitting the list
    * at some point and reordering the parts, so that's what we do.
    **/
  def rotate[T](n: Int, l: List[T]): List[T] = {
    val splittingPoint = if (n < 0) l.length + n else n

    val (left, right) = l.splitAt(splittingPoint)
    right ::: left
  }
}
