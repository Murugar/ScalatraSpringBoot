package com.iqmsoft.scalatra.boot.calc

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.scalatest.junit.JUnitRunner
import com.iqmsoft.scalatra.boot.calc.Calc._


@RunWith(classOf[JUnitRunner])
class ScalatestTest extends FunSuite with BeforeAndAfter {
  test("add") {
    assert(3 == add(1, 2))
  }
}
