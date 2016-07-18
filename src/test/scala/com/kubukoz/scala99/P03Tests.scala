package com.kubukoz.scala99

import org.scalatest.{FlatSpec, Matchers}

class P03Tests extends FlatSpec with Matchers {
  "kth" should "work for elements of a non-empty list" in {
    val list = List(2, 4, 6, 8, 10)

    P03.kth(0, list) shouldBe Some(2)
    P03.kth(1, list) shouldBe Some(4)
    P03.kth(2, list) shouldBe Some(6)
    P03.kth(3, list) shouldBe Some(8)
    P03.kth(4, list) shouldBe Some(10)
  }

  it should "return None for an index that's too big" in {
    val list = List(2, 4, 6, 8, 10)

    P03.kth(6, list) shouldBe None
  }

  it should "return None for an index that's below 0" in {
    val list = List(2, 4, 6, 8, 10)

    P03.kth(-1, list) shouldBe None
  }

  it should "return None for index 0 on Nil" in {
    P03.kth(0, Nil) shouldBe None
  }

}
