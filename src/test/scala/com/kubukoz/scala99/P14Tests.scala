package com.kubukoz.scala99

import com.kubukoz.scala99.P14Tests.solutions
import org.scalatest.{FlatSpec, Matchers}

class P14Tests extends FlatSpec with Matchers {
  "duplicate" should "not duplicate Nil!" in {
    solutions.resultsFor(Nil) {
      _ shouldBe Nil
    }
  }

  it should "duplicate a list with one element" in {
    solutions.resultsFor(List(1)) {
      _ shouldBe List(1, 1)
    }
  }

  it should "duplicate the supplied case" in {
    solutions.resultsFor(List(1, 2, 3, 3, 4)) {
      _ shouldBe List(1, 1, 2, 2, 3, 3, 3, 3, 4, 4)
    }
  }
}

object P14Tests {
  val solutions = new SolutionTester {

    override protected def implementations: Seq[(List[Int]) => List[Int]] = List(P14.duplicate, P14.duplicateLonger)

    override type To = List[Int]
    override type From = List[Int]
  }
}