package com.kubukoz.scala99

import org.scalatest.{FlatSpec, Matchers}
import P19._

class P19Tests extends FlatSpec with Matchers {
  "rotate" should "rotate Nil" in {
    rotate(5, Nil) shouldBe Nil
  }

  it should "not rotate when n = 0" in {
    rotate(0, List(1, 2, 3)) shouldBe List(1, 2, 3)
  }

  it should "work with the first given sample" in {
    rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
      List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  }

  it should "work with the second given sample" in {
    rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
      List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  }
}
