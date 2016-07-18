package com.kubukoz.scala99

import scala.annotation.tailrec

/**
  * P02 (*) Find the last but one element of a list.
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Option[Int] = Some(5)
  **/
object P02 {
  /**
    * Implemented with pattern matching.
    * Pretty straightforward, similar to [[P01.last]].
    **/
  @tailrec
  def penultimate[T](list: List[T]): Option[T] = list match {
    case h :: t :: Nil => Some(h)
    case _ :: t => penultimate(t)
    case Nil => None
  }
}