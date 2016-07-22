package com.kubukoz.scala99

import com.kubukoz.scala99.P07.flatten
import org.scalatest.{FlatSpec, Matchers}

class P07Tests extends FlatSpec with Matchers {
  "flatten" should "flatten an empty list" in {
    flatten(Nil) shouldBe Nil
  }

  it should "flatten a list with an element" in {
    flatten(List(1)) shouldBe List(1)
  }

  it should "flatten a list with a few elements and a few lists" in {
    flatten(List(1, 2, List(3), List(4), Nil, List(List(5), List(List(6, 7))))) shouldBe List(1, 2, 3, 4, 5, 6, 7)
  }

  it should "support the supplied case" in {
    flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldBe List(1, 1, 2, 3, 5, 8)
  }
}
