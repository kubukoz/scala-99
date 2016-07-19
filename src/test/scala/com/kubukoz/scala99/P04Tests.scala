package com.kubukoz.scala99

import com.kubukoz.scala99.P04Tests.solutions
import org.scalatest.{FlatSpec, Matchers}

import scala.language.postfixOps

class P04Tests extends FlatSpec with Matchers {
  "last" should "return the last element for a non-empty list" in {
    solutions.resultsFor(List(1, 2, 3, 4, 5)) {
      _ shouldBe 5
    }
  }

  it should "return None for an empty list" in {
    solutions.resultsFor(Nil) {
      _ shouldBe 0
    }
  }

  it should "not stack overflow" in {
    solutions.resultsFor(1 to 100000 toList) {
      _ shouldBe 100000
    }
  }
}

object P04Tests {
  val solutions = new SolutionTester {
    override type From = List[_]

    override type To = Int

    override protected def implementations: Seq[From => To] = List(P04.length _, P04.lengthBuiltin _)
  }
}