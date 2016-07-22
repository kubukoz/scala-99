package com.kubukoz.scala99

import com.kubukoz.scala99.P15.duplicateN
import org.scalatest.{FlatSpec, Matchers}

class P15Tests extends FlatSpec with Matchers {
  "duplicateN" should "work for 3" in {
    duplicateN(3, List(1, 2, 3)) shouldBe List(1, 1, 1, 2, 2, 2, 3, 3, 3)
  }

  it should "work for 5" in {
    duplicateN(5, List(1, 2)) shouldBe List(1, 1, 1, 1, 1, 2, 2, 2, 2, 2)
  }

  it should "work for Nil" in {
    duplicateN(100000000, Nil) shouldBe Nil
  }

  it should "work for the supplied case" in {
    duplicateN(3, List('a, 'b, 'c, 'c, 'd)) shouldBe
      List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  }
}
