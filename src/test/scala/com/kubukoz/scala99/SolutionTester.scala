package com.kubukoz.scala99

trait SolutionTester{
  type From
  type To
  protected def implementations: Seq[From => To]

  def resultsFor(t: From)(test: To => Unit): Unit = implementations.map(_ apply t) foreach test
}
