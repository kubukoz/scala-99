package com.kubukoz.scala99

import scala.annotation.tailrec

/**
  * P01 (*) Find the last element of a list.
  * Example:
  * scala> last(List(1, 1, 2, 3, 5, 8))
  * res0: Option[Int] = Some(8)
  **/
object P01 {
  /**
    * Built-in, inherited from `TraversableLike`.
    *
    * As of Scala 2.11.8 internally implemented in terms of
    * `isEmpty` and `last`.
    **/
  def lastBuiltin[T](list: List[T]): Option[T] = list.lastOption

  /**
    * Probably the most idiomatic implementation,
    * if you don't have the built-in `.last` method on `List`.
    *
    * Implemented with pattern matching.
    **/
  @tailrec
  def last[T](list: List[T]): Option[T] = list match {
    case Nil => None
    case h :: Nil => Some(h)
    case _ :: rest => last(rest)
  }
}