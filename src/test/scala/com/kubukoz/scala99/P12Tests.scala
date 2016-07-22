package com.kubukoz.scala99

import com.kubukoz.scala99.P12.decode
import org.scalatest.{FlatSpec, Matchers}

class P12Tests extends FlatSpec with Matchers {
  "decode" should "correctly decode Nil" in {
    decode(Nil) shouldBe Nil
  }

  it should "correctly decode the supplied case" in {
    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) shouldBe
      List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  }
}
