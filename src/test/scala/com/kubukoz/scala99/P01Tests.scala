package com.kubukoz.scala99

import org.scalatest.{FlatSpec, Matchers}

import scala.language.postfixOps

class P01Tests extends FlatSpec with Matchers {
  "last" should "return the last element for a non-empty list" in {
    P01.last(List(1, 2, 3, 4, 5)) shouldBe Some(5)
  }

  it should "return None for an empty list" in {
    P01.last(Nil) shouldBe None
  }

  it should "not stack overflow" in {
    P01.last(1 to 100000 toList) shouldBe Some(100000)
  }
}
