package com.kubukoz.scala99

/**
  * P11 (*) Modified run-length encoding.
  * Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
  * Example:
  * *
  * scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  **/
object P11 {
  /**
    * Again, something pretty straightforward once we have `encode` implemented.
    **/
  def encodeModified(list: List[Any]): List[Any] = P10.encode(list).map {
    case (1, elem) => elem
    case elems => elems
  }
}
