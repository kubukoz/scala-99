package com.kubukoz.scala99

import com.kubukoz.scala99.P11.encodeModified
import org.scalatest.{FlatSpec, Matchers}

class P11Tests extends FlatSpec with Matchers {
  "encodeModified" should "correctly encode a list with non-repeating elements" in {
    encodeModified(List('a, 'b, 'c, 'a)) shouldBe List('a, 'b, 'c, 'a)
  }

  it should "correctly encode the given case" in {
    encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
      List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e))
  }
}
