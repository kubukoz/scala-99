package com.kubukoz.scala99

/**
  * P10 (*) Run-length encoding of a list.
  * Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
  * Example:
  * *
  * scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  **/
object P10 {
  /**
    * I don't have words to describe how simple this is.
    *
    * .head is safe because we wouldn't get an empty group.
    **/
  def encode[T](l: List[T]): List[(Int, T)] = P09.pack(l).map(group => group.size -> group.head)
}
