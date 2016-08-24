package com.kubukoz.scala99

import com.kubukoz.scala99.P20.removeAt
import org.scalatest.{FlatSpec, Matchers}

class P20Tests extends FlatSpec with Matchers {
  "removeAt" should "return (Nil, None) for an empty list" in {
    removeAt(5, Nil) shouldBe(Nil, None)
  }

  it should "drop the only element of the list for index = 0" in {
    removeAt(0, List(5)) shouldBe(Nil, Some(5))
  }

  it should "return (sameList, None) if the index is greater than the max index in the list" in {
    removeAt(3, List(1, 2, 3)) shouldBe(List(1, 2, 3), None)
  }
  it should "return (sameList, None) for index < 0" in {
    removeAt(-1, List(1, 2, 3)) shouldBe(List(1, 2, 3), None)
  }

  it should "properly remove an element from a normal list" in {
    removeAt(2, List(1, 2, 3, 4, 5)) shouldBe(List(1, 2, 4, 5), Some(3))
  }

  it should "work for the given case" in {
    removeAt(1, List('a, 'b, 'c, 'd)) shouldBe(List('a, 'c, 'd), Some('b))
  }
}
