package com.kubukoz.scala99

import com.kubukoz.scala99.P09.pack
import org.scalatest.{FlatSpec, Matchers}

class P09Tests extends FlatSpec with Matchers {
  "pack" should "pack Nil" in {
    pack(Nil) shouldBe Nil
  }

  it should "pack a single letter" in {
    pack(List('a)) shouldBe List(List('a))
  }

  it should "pack the given example" in {
    val symbols = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val result = List(
      List('a, 'a, 'a, 'a),
      List('b),
      List('c, 'c),
      List('a, 'a),
      List('d),
      List('e, 'e, 'e, 'e)
    )

    pack(symbols) shouldBe result
  }
}
