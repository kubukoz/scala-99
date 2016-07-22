package com.kubukoz.scala99

import scala.annotation.tailrec

/**
  * P15 (**) Duplicate the elements of a list a given number of times.
  * Example:
  * scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  * res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  *
  **/
object P15 {
  /**
    * For this one, I decided to go the long way only.
    * I expect a lot of pattern matching.
    *
    * EDIT: yeah
    **/
  def duplicateN[T](n: Int, l: List[T]): List[T] = {

    /**
      * List.fill by hand
      **/
    @tailrec
    def addElemNTimes(elem: T, amount: Int, list: List[T]): List[T] = amount match {
      case 0 => list
      case _ => addElemNTimes(elem, amount - 1, elem :: list)
    }

    @tailrec
    def go(list: List[T], mem: List[T]): List[T] = list match {
      case h :: t => go(t, addElemNTimes(h, n, mem))
      case Nil => mem
    }

    go(l, Nil).reverse
  }
}
