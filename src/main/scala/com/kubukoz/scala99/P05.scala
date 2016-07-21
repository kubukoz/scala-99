package com.kubukoz.scala99

import scala.annotation.tailrec
import scala.collection.immutable.Nil

/**
  * P05 (*) Reverse a list.
  * Example:
  * scala> reverse(List(1, 1, 2, 3, 5, 8))
  * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */
object P05 {
  /**
    * Just a built-in implementation.
    **/
  def reverseBuiltIn[T](l: List[T]): List[T] = l.reverse

  /**
    * Again, an implementation that depends on an inner
    * helper function that's tail recursive.
    *
    * Pattern matching is always a good idea!
    **/
  def reverse[T](l: List[T]): List[T] = {
    @tailrec
    def go(list: List[T], mem: List[T]): List[T] = list match {
      case h :: t => go(t, h :: mem)
      case Nil => mem
    }

    go(l, Nil)
  }
}
