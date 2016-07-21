package com.kubukoz.scala99

import com.kubukoz.scala99.P05Tests.solutions
import org.scalatest.{FlatSpec, Matchers}

import scala.language.postfixOps

class P05Tests extends FlatSpec with Matchers {
  "last" should "return the last element for a non-empty list" in {
    solutions.resultsFor(List(1, 2, 3, 4, 5)) {
      _ shouldBe List(5, 4, 3, 2, 1)
    }
  }

  it should "return None for an empty list" in {
    solutions.resultsFor(Nil) {
      _ shouldBe Nil
    }
  }

  it should "not stack overflow" in {
    solutions.resultsFor(1 to 100000 toList) {
      _ shouldBe (100000 to 1 by -1).toList
    }
  }
}

object P05Tests {
  val solutions = new SolutionTester {
    override type From = List[Int]

    override type To = List[Int]

    override protected def implementations: Seq[From => To] = List(P05.reverse _, P05.reverseBuiltIn _)
  }
}