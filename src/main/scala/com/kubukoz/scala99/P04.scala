package com.kubukoz.scala99

/**
  * P04 (*) Find the number of elements of a list.
  * Example:
  * scala> length(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 6
  **/
object P04 {
  /**
    * Just a built-in implementation.
    **/
  def lengthBuiltin(l: List[_]): Int = l.size

  /**
    * Implemented with an inner tail-recursive function and pattern matching.
    * A bit more complicated than the previous solutions.
    **/
  def length(l: List[_]): Int = {
    def loop(list: List[_], mem: Int): Int = list match {
      case _ :: t => loop(t, mem + 1)
      case Nil => mem
    }

    loop(l, 0)
  }
}
