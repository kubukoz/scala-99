package com.kubukoz.scala99

/**
  * P03 (*) Find the Kth element of a list.
  * By convention, the first element in the list is element 0.
  * Example:
  * *
  * scala> kth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Option[Int] = Some(2)
  **/
object P03 {
  /**
    * Again, pretty simple pattern matching, but with an additional guard on `k`.
    **/
  def kth[T](k: Int, list: List[T]): Option[T] = list match {
    case _ if k < 0 => None //for performance (O(1) instead of O(n) without this case)
    case h :: _ if k == 0 => Some(h)
    case _ :: t => kth(k - 1, t)
    case Nil => None
  }
}
