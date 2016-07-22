package com.kubukoz.scala99

/**
  * P06 (*) Find out whether a list is a palindrome.
  * Example:
  * scala> isPalindrome(List(1, 2, 3, 2, 1))
  * res0: Boolean = true
  */
object P06 {
  /**
    * Simple and doesn't reverse the whole list but half of it.
    **/
  def isPalindrome(l: List[Any]): Boolean = {
    val len = l.length

    //@formatter: off
    l.splitAt(len / 2) match {
      case (first, second) if len % 2 == 0  => first == second.reverse
      case (first, second)                  => first == second.tail.reverse
    }
    //@formatter: on
  }
}
