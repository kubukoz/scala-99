package com.kubukoz.scala99

import com.kubukoz.scala99.P10.encode
import org.scalatest.{FlatSpec, Matchers}

class P10Tests extends FlatSpec with Matchers {
  "encode" should "encode Nil" in {
    encode(Nil) shouldBe Nil
  }

  it should "encode a list with a single element" in {
    encode(List('a)) shouldBe List((1, 'a))
  }

  it should "encode the supplied case" in {
    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
      List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  }
}
