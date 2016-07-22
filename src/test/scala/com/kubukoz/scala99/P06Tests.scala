package com.kubukoz.scala99

import org.scalatest.{FlatSpec, Matchers}

class P06Tests extends FlatSpec with Matchers {
  "isPalindrome" should "return true for an empty list" in {
    P06.isPalindrome(Nil) shouldBe true
  }

  it should "return true for a singleton list" in {
    P06.isPalindrome(List(42)) shouldBe true
  }

  it should "return true for a two-element list with the same elements" in {
    P06.isPalindrome(List(10, 10)) shouldBe true
  }

  it should "support longer, odd-sized list" in {
    P06.isPalindrome(List(1, 2, 3, 4, 3, 2, 1)) shouldBe true
  }

  it should "support an evenly sized list" in {
    P06.isPalindrome(List(1, 2, 3, 4, 4, 3, 2, 1)) shouldBe true
  }

  it should "return false for non-matching lists" in {
    P06.isPalindrome(List(1, 2, 3, 4, 2, 1)) shouldBe false

  }

  it should "return false for oddly sized lists too" in {
    P06.isPalindrome(List(1, 2, 3, 3, 2)) shouldBe false
  }
}
