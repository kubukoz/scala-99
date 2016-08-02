package com.kubukoz.scala99

import org.scalatest.{FlatSpec, Matchers}
import P18._

class P18Tests extends FlatSpec with Matchers {
  "slice" should "work with the given sample" in {
    slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe List('d, 'e, 'f, 'g)
  }

  it should "work with Nil" in {
    slice(1, 10, Nil) shouldBe Nil
  }

  it should "work when the slice exceeds the list from both sides" in {
    slice(-2, 5, List(1, 2)) shouldBe List(1, 2)
  }

  it should "work when only the right side is exceeded" in {
    slice(2, 5, List(1, 2, 3, 4)) shouldBe List(3, 4)
  }

  it should "work when only the left side is exceeded" in {
    slice(-2, 1, List(1, 2, 3)) shouldBe List(1)
  }

  it should "return an empty list when end > start" in {
    slice(3, 2, List(1, 2, 3, 4, 5)) shouldBe Nil
  }

  it should "return an empty list when end == start" in {
    slice(3, 3, List(1, 2, 3, 4, 5)) shouldBe Nil
  }

}
