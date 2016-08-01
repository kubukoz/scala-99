package com.kubukoz.scala99

import com.kubukoz.scala99.P17._
import org.scalatest.{FlatSpec, Matchers}

class P17Tests extends FlatSpec with Matchers {
  "split" should "split a normal list" in {
    split(3, List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) shouldBe(List(1, 2, 3), List(4, 5, 6, 7, 8, 9, 10))
  }

  it should "not split Nil" in {
    split(3, Nil) shouldBe(Nil, Nil)
  }

  it should "split a list without enough elements" in {
    split(2, List(1)) shouldBe(List(1), Nil)
  }

  it should "split a list when n > list.length" in {
    split(5, List(1, 2, 3)) shouldBe(List(1, 2, 3), Nil)
  }

  it should "split properly when n == 0" in {
    split(0, List(1, 2, 3)) shouldBe(Nil, List(1, 2, 3))
  }

  it should "split properly when n < 0" in {
    split(-2, List(1, 2, 3)) shouldBe(Nil, List(1, 2, 3))
  }
}
