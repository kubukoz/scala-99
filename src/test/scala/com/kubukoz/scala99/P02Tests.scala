package com.kubukoz.scala99

import com.kubukoz.scala99.P02.penultimate
import org.scalatest.{FlatSpec, Matchers}

class P02Tests extends FlatSpec with Matchers {
  "penultimate" should "return the penultimate element of a 2+ element list" in {
    penultimate(List(1, 2, 3, 4, 5)) shouldBe Some(4)
  }

  it should "return None for a singleton list" in {
    penultimate(List(1)) shouldBe None
  }

  it should "return None for an empty list" in {
    penultimate(Nil) shouldBe None
  }
}