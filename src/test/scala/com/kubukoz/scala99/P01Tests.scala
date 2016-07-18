package com.kubukoz.scala99

import com.kubukoz.scala99.P01Tests.solutions
import org.scalatest.{FlatSpec, Matchers}

import scala.language.postfixOps

class P01Tests extends FlatSpec with Matchers {
  "last" should "return the last element for a non-empty list" in {
    solutions.resultsFor(List(1, 2, 3, 4, 5)) {
      _ shouldBe Some(5)
    }
  }

  it should "return None for an empty list" in {
    solutions.resultsFor(Nil) {
      _ shouldBe None
    }
  }

  it should "not stack overflow" in {
    solutions.resultsFor(1 to 100000 toList) {
      _ shouldBe Some(100000)
    }
  }
}

object P01Tests {
  val solutions = new SolutionTester {
    override type From = List[Int]

    override type To = Option[Int]

    override protected def implementations: Seq[From => To] = List(P01.lastBuiltin _, P01.last _)
  }
}