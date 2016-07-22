package com.kubukoz.scala99

import com.kubukoz.scala99.P08.compress
import org.scalatest.{FlatSpec, Matchers}

class P08Tests extends FlatSpec with Matchers {
  "compress" should "not compress Nil" in {
    compress(Nil) shouldBe Nil
  }

  it should "not compress a list without consecutive duplicates" in {
    compress(List('a, 'b, 'c, 'a, 'd)) shouldBe List('a, 'b, 'c, 'a, 'd)
  }

  it should "compress a list with consecutive duplicates" in {
    compress(List('a, 'b, 'c, 'c, 'd, 'e, 'e, 'a, 'b, 'b)) shouldBe List('a, 'b, 'c, 'd, 'e, 'a, 'b)
  }

  it should "work for the provided case" in {
    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List('a, 'b, 'c, 'a, 'd, 'e)
  }
}
