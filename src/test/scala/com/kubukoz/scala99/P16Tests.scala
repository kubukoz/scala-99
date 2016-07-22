package com.kubukoz.scala99

import com.kubukoz.scala99.P16Tests.solutions
import org.scalatest.{FlatSpec, Matchers}

class P16Tests extends FlatSpec with Matchers {
  "dropN" should "drop nothing from Nil" in {
    solutions.resultsFor(3, Nil) {
      _ shouldBe Nil
    }
  }

  it should "work for n bigger than the length of the list" in {
    solutions.resultsFor(5, List('a, 'b)) {
      _ shouldBe List('a, 'b)
    }
  }

  it should "work for the supplied case" in {
    solutions.resultsFor(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) {
      _ shouldBe List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    }
  }

  it should "drop everything when n = 1" in {
    solutions.resultsFor(1, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'l)) {
      _ shouldBe Nil
    }
  }
}

object P16Tests {
  val solutions = new SolutionTester {

    //this wasn't a good idea
    override protected def implementations: Seq[((Int, List[Symbol])) => List[Symbol]] =
    List((P16.dropN(_: Int, _: List[Symbol])).tupled, (P16.dropNLonger(_: Int, _: List[Symbol])).tupled)

    override type From = (Int, List[Symbol])
    override type To = List[Symbol]
  }
}
