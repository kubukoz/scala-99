package com.kubukoz.scala99

import com.kubukoz.scala99.P21.insertAt
import org.scalatest.{FlatSpec, Matchers}

class P21Tests extends FlatSpec with Matchers {
  "insertAt" should "append to Nil" in {
    insertAt(1, 5, Nil) shouldBe List(1)
  }

  it should "insert items to the beginning of a list" in {
    insertAt(1, 0, List(2, 3, 4)) shouldBe List(1, 2, 3, 4)
  }

  it should "prepend to a list if i < 0" in {
    insertAt(1, -5, List(2, 3, 4)) shouldBe List(1, 2, 3, 4)
  }

  it should "append to a list" in {
    insertAt(4, 3, List(1, 2, 3)) shouldBe List(1, 2, 3, 4)
  }

  it should "append to a list even if the index is far beyond its size" in {
    insertAt(4, 10, List(1, 2, 3)) shouldBe List(1, 2, 3, 4)
  }

  it should "insert an item inside a list" in {
    insertAt(10, 2, List(1, 2, 3, 4, 5)) shouldBe List(1, 2, 10, 3, 4, 5)
  }
}
