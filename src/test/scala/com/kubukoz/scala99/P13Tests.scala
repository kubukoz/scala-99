package com.kubukoz.scala99

import org.scalatest.{FlatSpec, Matchers}

import P13.encodeDirect

/**
  * These are copied from P10.
  **/
class P13Tests extends FlatSpec with Matchers {
  "encodeDirect" should "encode Nil" in {
    encodeDirect(Nil) shouldBe Nil
  }

  it should "encode a list with a single element" in {
    encodeDirect(List('a)) shouldBe List((1, 'a))
  }

  it should "encode the supplied case" in {
    encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
      List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  }
}